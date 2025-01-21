const emojiDetails = [
  { description: "Smiling Face", emoji: "😊" },
  { description: "Thumbs Up", emoji: "👍" },
  { description: "Red Heart", emoji: "❤️" },
  { description: "Crying Face", emoji: "😢" },
  { description: "Fire", emoji: "🔥" },
  { description: "Clapping Hands", emoji: "👏" },
  { description: "Thinking Face", emoji: "🤔" },
  { description: "Party Popper", emoji: "🎉" },
  { description: "Winking Face", emoji: "😉" },
  { description: "Star", emoji: "⭐" },
];

let currentEmojiIndex = 0;
let score = 0;
let seconds = 30;
let timer;

const guessInput = document.getElementById("guessInput");
const result = document.getElementById("result");
const scoreElement = document.getElementById("score");
const timerElement = document.getElementById("timer");

function displayEmoji() {
  const descriptionElement = document.getElementById("description");
  descriptionElement.textContent = emojiDetails[currentEmojiIndex].emoji;
  timerElement.textContent = `Time: ${seconds}s`;
}

function checkGuess() {
  const guess = guessInput.value.trim().toLowerCase();
  const correctEmoji = emojiDetails[currentEmojiIndex].description
    .trim()
    .toLowerCase();

  if (guess === correctEmoji) {
    result.textContent = "Correct!";
    score++;
  } else {
    result.textContent = "Wrong";
  }

  scoreElement.textContent = `Score: ${score}`;
  guessInput.value = "";
  guessInput.focus();
  nextEmoji();
}

function startTimer() {
  timer = setInterval(() => {
    seconds--;
    timerElement.textContent = `Time: ${seconds}s`;

    if (seconds <= 0) {
      endGame();
    }
  }, 1000);
}

function endGame() {
  clearInterval(timer);
  guessInput.disabled = true;
  timerElement.textContent = "";
}

function nextEmoji() {
  currentEmojiIndex++;

  setTimeout(() => {
    result.textContent = "";
  }, 2000);

  if (currentEmojiIndex === emojiDetails.length) {
    currentEmojiIndex = 0;
  }

  displayEmoji();
}

guessInput.addEventListener("keydown", (e) => {
  if (event.key === "Enter") {
    checkGuess();
  }
});

document.addEventListener("DOMContentLoaded", () => {
  displayEmoji();
  startTimer();
});
