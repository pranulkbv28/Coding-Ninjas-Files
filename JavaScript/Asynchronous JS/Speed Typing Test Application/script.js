const sentences = `The quick brown fox jumps over the lazy dog.
  Sphinx of black quartz, judge my vow.
  Pack my box with five dozen liquor jugs.
  How vexingly quick daft zebras jump!`;

const startButton = document.getElementById("start-btn");
const inputField = document.getElementById("input");
const sentenceElement = document.getElementById("sentence");
const timerElement = document.getElementById("timer");
const resultElement = document.getElementById("result");
const speedSpanElement = document.getElementById("speed");
const accuracySpanElement = document.getElementById("accuracy");
const retryButton = document.getElementById("retry-btn");
retryButton.addEventListener("click", () => {
  inputField.value = "";
  inputField.disabled = true;
  sentenceElement.textContent = "";
  resultElement.style.display = "none";
  startButton.disabled = false;
  time = 30;
  timerElement.textContent = "";
  clearInterval(timer);
});

let time = 30;
let timer;
let spaceClickCounter = 0;

startButton.addEventListener("click", () => {
  startButton.disabled = true;
  inputField.disabled = false;
  inputField.focus();
  sentenceElement.textContent = sentences;
  startTimer();
  timerElement.textContent = time;
});

function startTimer() {
  timer = setInterval(() => {
    time--;
    timerElement.textContent = time;

    if (time === 0) {
      clearInterval(timer);
      showResult();
    }
  }, 1000);
}

function showResult() {
  clearInterval(timer);
  inputField.disabled = true;
  resultElement.style.display = "block";

  const finalAnswer = inputField.value.trim();
  const words = finalAnswer === "" ? 0 : finalAnswer.split(" ").length;
  const writtenWords = sentences.slice(0, finalAnswer.length);
  let accuracy = calculateAccuracy(finalAnswer, writtenWords);
  const wpm = Math.round((words / 30) * 60);

  speedSpanElement.textContent = `${wpm}`;
  accuracySpanElement.textContent = `${accuracy}`;
}

function calculateAccuracy(finalAnswer, writtenWords) {
  if (finalAnswer.length === 0 || writtenWords === 0) {
    return 0;
  }
  let correctCharCount = 0;
  for (let i = 0; i < finalAnswer.length; i++) {
    if (finalAnswer[i] === writtenWords[i]) {
      correctCharCount++;
    }
  }
  return Math.round((correctCharCount / finalAnswer.length) * 100);
}
