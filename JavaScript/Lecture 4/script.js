let email = prompt("Enter your email");
let success = false;

if (
  email.length > 11 &&
  email.includes("@") &&
  email.lastIndexOf(".") - email.indexOf("@") > 3 &&
  email.length - email.lastIndexOf(".") >= 2 &&
  email.length - email.lastIndexOf(".") <= 4
) {
  success = true;
}

console.log(success);

{
  let num = 10;
  const name = "Pranaav";
  var age = 20;
}
// console.log(num);
console.log(age); // this is block scoped
