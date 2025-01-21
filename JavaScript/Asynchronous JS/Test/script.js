// const btn = document.getElementById("btn");
// btn.addEventListener("click", () => {
//   console.log("Button Clicked");
//   const heading3 = document.createElement("h3");
//   heading3.textContent = "Button is clicked";
//   document.body.appendChild(heading3);

//   setTimeout(() => {
//     heading3.remove();
//   });
// });

// for (var i = 0; i < 5; i++) {
//   setTimeout(() => {
//     console.log(i);
//   }, 1000);
// }
// for (let i = 0; i < 5; i++) {
//   setTimeout(() => {
//     console.log(i);
//   }, 1000);
// }

// function timer() {
//   for (let i = 1; i <= 5; i++) {
//     setTimeout(function () {
//       console.log(i);
//     }, i * 1000);
//     console.log("Hello ninjas!");
//   }
// }
// timer();

// // Do not edit the rest of the code

const text = document.getElementById("text");
let seconds = 0;

text.textContent = seconds;

const timer = setInterval(() => {
  seconds++;
  text.textContent = seconds;

  if (seconds >= 5) {
    clearInterval(timer);
  }
}, 1000);
