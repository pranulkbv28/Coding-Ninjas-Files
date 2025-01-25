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

// const text = document.getElementById("text");
// let seconds = 0;

// text.textContent = seconds;

// const timer = setInterval(() => {
//   seconds++;
//   text.textContent = seconds;

//   if (seconds >= 5) {
//     clearInterval(timer);
//   }
// }, 1000);

// let click = null;

// document.addEventListener("click", () => {
//   click = true;
//   console.log("clicked");
//   handleRequest();
// });

// document.addEventListener("contextmenu", (event) => {
//   event.preventDefault(); // Prevent the context menu from appearing
//   click = false;
//   console.log("right clicked");
//   handleRequest();
// });

// function handleRequest() {
//   console.log("Promise is pending..."); // this is to show that the promise is pending

//   const request = new Promise((resolve, reject) => {
//     setTimeout(() => {
//       if (click) {
//         resolve({
//           message: "Promise resolved",
//           value: "Left Click",
//           name: "Pranaav BV",
//         });
//       } else {
//         reject({
//           message: "Promise rejected",
//           value: "Right Click",
//           name: undefined,
//         });
//       }
//     }, 1000);
//   });

//   request
//     .then((value) => {
//       console.log(value);
//     }) // This is the resolved value
//     .catch((error) => {
//       console.log(error);
//     }) // This is the rejected value
//     .finally(() => {
//       setTimeout(() => {
//         console.log("Promise is settled");
//       }, 2000);
//     }); // This is the settled value
// }

// console.log(request);

// function getUserData(userId) {
//   return new Promise((resolve, reject) => {
//     // simulate an API call
//     setTimeout(() => {
//       if (userId === 123) {
//         resolve({
//           message: "User found!",
//           user: {
//             id: 123,
//             name: "Pranaav BV",
//             age: 20,
//           },
//           status: 200,
//         });
//       } else {
//         reject({
//           message: "User not found!",
//           status: 404,
//         });
//       }
//     }, 2000);
//   });
// }

// function displayUserData(userId) {
//   getUserData(userId)
//     .then((response) =>
//       console.log(`User: ${response.user.name}, Age: ${response.user.age}`)
//     )
//     .catch((error) => console.log(error.message))
//     .finally(() => console.log("Promise settled"));
// }

// displayUserData(123);

// const promise1 = new Promise((resolve) => setTimeout(() => resolve(1), 1000));
// const promise2 = new Promise((resolve) => setTimeout(() => resolve(2), 500));

// Promise.all([promise1, promise2]).then((results) => console.log(results));
// Promise.race([promise1, promise2]).then((results) => console.log(results));
