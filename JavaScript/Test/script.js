// for (let i = 0; ; i++) {
//   console.log(i);
//   i < 5;
// }

// let sum = 0;

// for (let i = 1; i <= 50; i++) {
//   for (let j = 2; j < 50; j++) {
//     if (i % j == 0) {
//       sum += i;
//     }
//   }
// }

// console.log(sum);

// let count = 0;
// let num = 1234;

// while (num > 0) {
//   num = Math.floor(num / 10);
//   count++;
// }

// console.log(count);

// let arr = [4, 2, 34, 4, 1, 12, 1, 4];
// function findDuplicate(arr) {
//   //Implement your function here
//   for (let i = 0; i < arr.length; i++) {
//     for (let j = i + 1; j < arr.length; j++) {
//         if (arr[i] == arr[j]) {

//         }
//     }
//   }
// }
// console.log(findDuplicate(arr));

// let arr = [4, 2, 34, 4, 1, 12, 1, 4];
// function findDuplicate(arr) {
//   //Implement your function here
//   let dupliArr = [];
//   for (let i = 0; i < arr.length; i++) {
//     for (let j = i + 1; j < arr.length; j++) {
//       if (arr[i] === arr[j]) {
//         dupliArr = dupliArr.concat(arr.splice(j - 1, j));
//         return dupliArr;
//       }
//     }
//   }
// }
// console.log(findDuplicate(arr));

// function sumOfArray(arr) {
//   let sum = 0;
//   for (let i of arr) {
//     sum += i;
//   }

//   return sum;
// }

// console.log(sumOfArray([1, 2, 3, 4, 5]));

// let a = "Global";

// function outerPrint() {
//   let b = "outerPrint";

//   return function innerPrint() {
//     let c = "innerPrint";
//     return `${a} -> ${b} -> ${c}`;
//   };

//   // return innerPrint;

//   // console.log(show);
// }

// console.log(outerPrint());

// const show = outerPrint();

// console.log(show());

// // Complete the genrateID function
// //Do not alter the starter code
// function generateID(x) {
//   //Implement Your function here
//   return function increment() {
//     return `A_2023_${x++}`;
//   };
// }

// const func = generateID(99);
// console.log(func()); //Output : A_2023_99
// console.log(func()); // Output: A_2023_100

// let result = (() => {
//   let x = 5;
//   return () => {
//     x += 1;
//     return x;
//   };
// })();

// console.log(result);

// const func1 = (a, b, c) => {
//   console.log(arguments[0]);
//   // Expected output: 1

//   console.log(arguments[1]);
//   // Expected output: 2

//   console.log(arguments[2]);
//   // Expected output: 3
// };

// func1(1, 2, 3);

// const user = (function () {
//   const userData = {
//     userName: "John",
//     userAge: 23,
//   };

//   function getName() {
//     console.log(userData.userName);
//   }

//   function updateAge(age) {
//     console.log(userData.userAge + age);
//   }

//   return { getName, updateAge };
// })();

// console.log(user);
// user.getName();
// user.updateAge(2);

// function main() {
//   return (function () {
//     console.log("Hello User");
//   })();
// }

// const result = main();

// const userData = [];
// const userName = "Pranaav";
// const password = "pranaavBV28*";

// userData.push({ userName, password });

// console.log(userData);

// console.log(Math.floor(Math.random() * 6) + 1);

// let fruits = ["banana", "apple", "orange", "mango", "grapes"];

// let mapArray = fruits.map((item, ind) => {
//   return { [ind]: item.length };
// });

// console.log(mapArray);

// let data = [2, 3, 4, 5];
// let newData = data.map(function (item) {
//   item * 2;
// });
// console.log(newData);

// const ids = [1, 2, 3];
// const names = ["John", "Jane", "Alice"];
// const images = ["john.jpg", "jane.jpg", "alice.jpg"];

// const users = ids.map((ele, index) => {
//   return {
//     id: ele,
//     name: names[index],
//     image: images[index],
//   };
// });

// console.log(users);

// const employees = [
//   { id: 1, name: "Alice", department: "sales", salary: 40000 },
//   { id: 2, name: "Bob", department: "engineering", salary: 50000 },
//   { id: 3, name: "Charlie", department: "marketing", salary: 45000 },
//   { id: 4, name: "David", department: "sales", salary: 35000 },
//   { id: 5, name: "Emily", department: "engineering", salary: 55000 },
// ];

// console.log(employees[0].salary);

// const employees = [
//   { id: 1, name: "Alice", department: "sales", salary: 40000 },
//   { id: 2, name: "Bob", department: "engineering", salary: 50000 },
//   { id: 3, name: "Charlie", department: "marketing", salary: 45000 },
//   { id: 4, name: "David", department: "sales", salary: 35000 },
//   { id: 5, name: "Emily", department: "engineering", salary: 55000 },
// ];

// // Function to increase salaries based on the department
// function increaseSalaries(employees) {
//   // Use the map function to iterate over each employee in the array
//   const newEmployees = employees.map((employee) => {
//     // Use a switch statement to determine the salary increase based on department
//     switch (employee.department) {
//       case "sales":
//         employee.salary = (
//           employee.salary +
//           (10 * employee.salary) / 100
//         ).toFixed(1);
//         break;
//       case "engineering":
//         employee.salary = (
//           employee.salary +
//           (15 * employee.salary) / 100
//         ).toFixed(1);
//         break;
//       default:
//         employee.salary = (
//           employee.salary +
//           (5 * employee.salary) / 100
//         ).toFixed(1);
//         break;
//     }

//     // Return a new employee object with the updated salary
//     return {
//       ...employee, // Convert back to number
//     };
//   });

//   // Return the new array of employees with updated salaries
//   return newEmployees;
// }

// // You can call the function and log the result to check if the implementation is correct
// console.log(increaseSalaries(employees));

// const arr = [1, 2, 3, 4, 5];
// const average = arr.reduce(
//   (acc, curr, _, { length }) => acc + curr / length,
//   0
// );

// console.log(average);

// const songs = [
//   { title: "All of Me", artist: "John Legend", genre: "Pop", duration: 248 },
//   { title: "Despacito", artist: "Luis Fonsi", genre: "Pop", duration: 279 },
//   { title: "Someone Like You", artist: "Adele", genre: "Pop", duration: 285 },
//   { title: "Thriller", artist: "Michael Jackson", genre: "Pop", duration: 357 },
//   { title: "Bohemian Rhapsody", artist: "Queen", genre: "Rock", duration: 354 },
//   {
//     title: "Stairway to Heaven",
//     artist: "Led Zeppelin",
//     genre: "Rock",
//     duration: 480,
//   },
//   {
//     title: "Sweet Child O' Mine",
//     artist: "Guns N' Roses",
//     genre: "Rock",
//     duration: 355,
//   },
//   {
//     title: "Smells Like Teen Spirit",
//     artist: "Nirvana",
//     genre: "Rock",
//     duration: 302,
//   },
//   { title: "Hotel California", artist: "Eagles", genre: "Rock", duration: 390 },
//   {
//     title: "Thrash Unreal",
//     artist: "Against Me!",
//     genre: "Punk",
//     duration: 292,
//   },
//   {
//     title: "London Calling",
//     artist: "The Clash",
//     genre: "Punk",
//     duration: 189,
//   },
// ];

// const filteredSongs = songs.filter((song) => {
//   return song.genre === "Rock" && song.duration >= 350;
// });

// console.log(filteredSongs);

const arr = [1, 2, 4, 3, 5];
const find1 = arr.find((num) => num > 2);
const find2 = arr.findIndex((num) => num > 10);
console.log(find1);
console.log(find2);
console.log(Boolean(undefined));
