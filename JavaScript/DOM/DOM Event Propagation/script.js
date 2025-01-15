// Register event listeners in the order of the DOM hierarchy
document.querySelector("h3").addEventListener("click", (event) => {
  event.stopPropagation();
  console.log("Heading 3 Clicked");
});

document.getElementById("innerDiv").addEventListener("click", () => {
  console.log("Inner Div Clicked");
});

document.getElementsByTagName("div")[0].addEventListener("click", () => {
  console.log("Outer Div Clicked");
});

document.body.addEventListener("click", () => {
  console.log("Body Clicked");
});
