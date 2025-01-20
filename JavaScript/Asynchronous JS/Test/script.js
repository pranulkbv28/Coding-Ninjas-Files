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

for (var i = 0; i < 5; i++) {
  setTimeout(() => {
    console.log(i);
  }, 1000);
}
for (let i = 0; i < 5; i++) {
  setTimeout(() => {
    console.log(i);
  }, 1000);
}
