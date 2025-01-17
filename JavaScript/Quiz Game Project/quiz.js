const questionDiv = document.getElementById("question");
const optionsDiv = document.getElementById("options");
const scoreDiv = document.getElementById("score");
const nextBtn = document.getElementById("next");

const queestionJson = [
  {
    category: "Food & Drink",
    id: "qa-1",
    correctAnswer: "Three",
    options: ["Two", "Three", "Four", "Five"],
    question: "How many pieces of bun are in a McDonald's Big Mac?",
  },
  {
    category: "Food & Drink",
    id: "qa-2",
    correctAnswer: "Tomato",
    options: ["Tomato", "Potato", "Carrot", "Cucumber"],
    question: "Which vegetable is used to make ketchup?",
  },
  {
    category: "Food & Drink",
    id: "qa-3",
    correctAnswer: "Italy",
    options: ["France", "Spain", "Italy", "Greece"],
    question: "Where did pizza originate?",
  },
  {
    category: "Food & Drink",
    id: "qa-4",
    correctAnswer: "Cocoa",
    options: ["Vanilla", "Cocoa", "Strawberry", "Mint"],
    question: "What is the main ingredient in chocolate?",
  },
  {
    category: "Food & Drink",
    id: "qa-5",
    correctAnswer: "Green",
    options: ["Red", "Yellow", "Green", "Blue"],
    question: "What color is a Granny Smith apple?",
  },
  {
    category: "Food & Drink",
    id: "qa-6",
    correctAnswer: "Japan",
    options: ["China", "Japan", "Korea", "Thailand"],
    question: "Where did sushi originate?",
  },
  {
    category: "Food & Drink",
    id: "qa-7",
    correctAnswer: "Honey",
    options: ["Sugar", "Honey", "Maple Syrup", "Molasses"],
    question: "What is the main ingredient in baklava?",
  },
  {
    category: "Food & Drink",
    id: "qa-8",
    correctAnswer: "Cucumber",
    options: ["Cucumber", "Zucchini", "Pepper", "Tomato"],
    question: "What vegetable is used to make pickles?",
  },
  {
    category: "Food & Drink",
    id: "qa-9",
    correctAnswer: "India",
    options: ["India", "China", "Mexico", "Italy"],
    question: "Where did curry originate?",
  },
  {
    category: "Food & Drink",
    id: "qa-10",
    correctAnswer: "Cheese",
    options: ["Butter", "Cheese", "Cream", "Yogurt"],
    question: "What is the main ingredient in a cheesecake?",
  },
];

// const questionObj = {
//   category: "Food & Drink",
//   id: "qa-1",
//   correctAnswer: "Three",
//   options: ["Two", "Three", "Four", "Five"],
//   question: "How many pieces of bun are in a Mcdonald's Big Mac?",
// };
function shuffleArray(array) {
  for (let i = array.length - 1; i > 0; i--) {
    const j = Math.floor(Math.random() * (i + 1));
    [array[i], array[j]] = [array[j], array[i]];
  }
}

let score = 0;
let questionNumber = 0;
const totalScore = queestionJson.length;

function renderQuestion(qNum) {
  optionsDiv.textContent = "";

  console.log("This is qNum: ", qNum);

  if (qNum >= queestionJson.length) {
    questionDiv.textContent = "Game Over!";
    if (scoreDiv.textContent === "") {
      scoreDiv.textContent = `Score: ${score} / ${totalScore}`;
    }
    nextBtn.remove();
    return;
  }

  const { correctAnswer, options, question } = queestionJson[qNum];
  questionDiv.textContent = question;

  shuffleArray(options);
  options.forEach((option) => {
    const optionButton = document.createElement("button");
    optionButton.textContent = option;
    optionsDiv.appendChild(optionButton);

    optionButton.addEventListener("click", () => {
      console.log("This is option: ", typeof option);
      console.log("This is correct answer: ", typeof correctAnswer);
      // debugger;
      if (option == correctAnswer) {
        score++;
      } else {
        score = score - 0.25;
      }

      scoreDiv.textContent = `Score: ${score} / ${totalScore}`;
      // questionDiv.textContent = "Question Completed!";

      renderQuestion(qNum + 1);
    });
  });
}
renderQuestion(questionNumber);

nextBtn.addEventListener("click", () => {
  questionNumber++; // Increment questionNumber when the "Next" button is clicked
  renderQuestion(questionNumber);
});
