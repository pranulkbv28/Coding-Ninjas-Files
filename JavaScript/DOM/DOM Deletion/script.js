const btn = document.createElement("button");
btn.textContent = "Click me!";
btn.setAttribute("class", "btn");
btn.addEventListener("click", function () {
  document.querySelector("h2").remove();
});

document.body.appendChild(btn);

// document.querySelector("h2").remove();

const pEle = document.querySelector("#id");
pEle.addEventListener("click", clickPara);
// or
// pEle.addEventListener("click", function () {clickPara()})

// console.log(pEle);

function clickPara() {
  console.log("Clicked on paragraph");
}
