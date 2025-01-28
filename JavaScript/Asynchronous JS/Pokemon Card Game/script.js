const api = "https://pokeapi.co/api/v2/pokemon/"; // URL to get at least 100 pokemons
const container = document.getElementById("container");
const fightButton = document.getElementById("fight");
fightButton.addEventListener("click", fightButtonHandler);

// Player 1
const card1 = document.getElementById("card1");
const p1_name = document.getElementById("p1_name");
const p1_score = document.getElementById("p1_score");
const cardOneImg = document.querySelector("#card1 #img");
const cardOneName = document.querySelector("#card1 #name");
const cardOneExperience = document.querySelector("#card1 #experience");
const cardOneAbilities = document.querySelector("#card1 #abilities");

// Player 2
const card2 = document.getElementById("card2");
const p2_name = document.getElementById("p2_name");
const p2_score = document.getElementById("p2_score");
const cardTwoImg = document.querySelector("#card2 #img");
const cardTwoName = document.querySelector("#card2 #name");
const cardTwoExperience = document.querySelector("#card2 #experience");
const cardTwoAbilities = document.querySelector("#card2 #abilities");

let playerOneScore = 0;
let playerTwoScore = 0;

let playerOneBaseExperience = 0;
let playerTwoBaseExperience = 0;

function setCardData(
  card,
  data,
  playerName,
  playerScore,
  cardImg,
  cardName,
  cardExperience,
  cardAbilities
) {
  const img = document.createElement("img");
  playerScore.textContent =
    playerName === p1_name ? playerOneScore : playerTwoScore;
  img.src = data.sprites.front_default;
  cardName.textContent = data.name;
  cardExperience.textContent = data.base_experience;
  card === card1
    ? (playerOneBaseExperience = data.base_experience)
    : (playerTwoBaseExperience = data.base_experience);

  let pokeAbilities = data.abilities
    .map((ability) => ability.ability.name)
    .join(", ");
  cardAbilities.textContent = pokeAbilities;

  cardImg.appendChild(img);
}

async function getPokemon(id) {
  try {
    const response = await fetch(api + id);
    if (!response.ok) {
      throw new Error(`HTTP error! status: ${response.status}`);
    }
    return await response.json();
  } catch (error) {
    console.error("Error fetching Pokemon data:", error);
  }
}

function generateRandomNumber() {
  return Math.floor(Math.random() * 100) + 1; // Adjusted to get a valid Pokemon ID
}

async function fightButtonHandler() {
  cardOneImg.innerHTML = "";
  cardTwoImg.innerHTML = "";

  p1_name.textContent = "Pranaav BV";
  p2_name.textContent = "Vaisnavi";

  let playerOnePokemonId = generateRandomNumber();
  let playerTwoPokemonId = generateRandomNumber();

  while (playerOnePokemonId === playerTwoPokemonId) {
    playerTwoPokemonId = generateRandomNumber();
  }

  try {
    const [playerOnePokemon, playerTwoPokemon] = await Promise.all([
      getPokemon(playerOnePokemonId),
      getPokemon(playerTwoPokemonId),
    ]);

    if (playerOnePokemon && playerTwoPokemon) {
      setCardData(
        card1,
        playerOnePokemon,
        p1_name,
        p1_score,
        cardOneImg,
        cardOneName,
        cardOneExperience,
        cardOneAbilities
      );
      setCardData(
        card2,
        playerTwoPokemon,
        p2_name,
        p2_score,
        cardTwoImg,
        cardTwoName,
        cardTwoExperience,
        cardTwoAbilities
      );
    }

    if (playerOneBaseExperience > playerTwoBaseExperience) {
      playerOneScore++;
    } else {
      playerTwoScore++;
    }

    p1_score.textContent = playerOneScore;
    p2_score.textContent = playerTwoScore;
  } catch (error) {
    console.error("Error during fight:", error);
  }
}
