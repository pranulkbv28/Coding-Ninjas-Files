// Create eventListener to all the button
// All button should be able to play a different sound.
// Function to play sound
function playSound(key) {
  const audio = new Audio(`./assets/${key}.mp3`);
  audio.play();
}

// Add event listeners to all buttons
const buttons = document.querySelectorAll(".drum");
buttons.forEach((button) => {
  button.addEventListener("click", () => {
    const key = button.textContent;
    playSound(key);
  });
});
