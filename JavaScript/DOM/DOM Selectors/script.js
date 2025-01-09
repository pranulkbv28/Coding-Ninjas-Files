document.querySelector("h1").style.color = "red"; // this only effects the 1st instance of h1 in the document

const headingTag = "h1";
document.querySelectorAll(headingTag)[1].style.color = "blue"; // this effects the 2nd instance of h1 in the document
document.querySelector("#para").style.color = "green"; // this effects the element with the id of "para"
// if an unknown selector is used, it will return "null"

// selector exclusively for ids
document.getElementById("para").style.color = "purple"; // this effects the element with the id of "para"

// selector exclusively for classes
document.getElementsByClassName("container"); // this would give an array of all elements with the class of "container"

// selector exclusively for tags
document.getElementsByTagName("h1"); // this would give an array of all h1 elements in the document

// you can even store these in variables
const container = document.querySelector(".container");
console.log(container);
const containerHeading = container.querySelector("#containerHeading");
console.log(containerHeading);
