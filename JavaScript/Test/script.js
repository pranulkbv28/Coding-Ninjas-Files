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

// const arr = [1, 2, 4, 3, 5];
// const find1 = arr.find((num) => num > 2);
// const find2 = arr.findIndex((num) => num > 10);
// console.log(find1);
// console.log(find2);
// console.log(Boolean(undefined));

// const productList = [
//   { id: "p1", name: "Apples", category: "Fruits", price: 2.5, inStock: true },
//   {
//     id: "p2",
//     name: "Oranges",
//     category: "Fruits",
//     price: 1.99,
//     inStock: false,
//   },
//   {
//     id: "p3",
//     name: "Blueberries",
//     category: "Fruits",
//     price: 4.99,
//     inStock: true,
//   },
//   {
//     id: "p4",
//     name: "Carrots",
//     category: "Vegetables",
//     price: 1.0,
//     inStock: true,
//   },
//   {
//     id: "p5",
//     name: "Tomatoes",
//     category: "Vegetables",
//     price: 1.5,
//     inStock: true,
//   },
// ];

// function searchAndBuyProduct(productList, productName) {
//   // Step 1: Find the product object with the matching name using the find method
//   // Step 2: Check if the product was found and if it's in stock

//   const product = productList.find((prod) => prod.name === productName);
//   console.log(this);

//   if (product && product.inStock) {
//     product.inStock = false;

//     return true;
//   } else if (product && !product.inStock) {
//     return false;
//   } else {
//     return false;
//   }
// }

// const result = searchAndBuyProduct(productList, "Oranges");
// console.log(result);

// const user = {
//   name: "Pranaav",
//   age: 21,
//   address: {
//     street: "123 Main St",
//     city: "New York",
//     state: "NY",
//     zip: "10001",
//   },
//   hobbies: ["reading", "coding", "gaming"],
//   fn: function () {
//     console.log(this);
//   },
// };

// user.fn();
// console.log(user);

// const orders = [
//   {
//     orderNumber: 1,
//     items: [
//       { name: "Cappuccino", price: 3.5 },
//       { name: "Chocolate Croissant", price: 2.5 },
//     ],
//   },
//   {
//     orderNumber: 2,
//     items: [
//       { name: "Latte", price: 4.0 },
//       { name: "Blueberry Muffin", price: 2.75 },
//     ],
//     discountCode: "COFFEELOVER",
//   },
// ];

// const priceArr = orders.map((order) => {
//   if (order.discountCode) {
//     const preTotal = order.items.reduce((total, item) => total + item.price, 0);

//     switch (order.discountCode) {
//       case "COFFEELOVER":
//         return Number((preTotal - preTotal * 0.1).toFixed(2));
//       case "TEALOVER":
//         return Number((preTotal - preTotal * 0.2).toFixed(2));
//       default:
//         return Number(preTotal.toFixed(2));
//     }
//   } else {
//     const total = order.items.reduce((total, item) => total + item.price, 0);
//     return total;
//   }
// });
// console.log(priceArr);
// const sumTotal = priceArr.reduce((total, price) => total + price, 0);
// console.log(sumTotal);

// Do not alter the starter code

// const orders = [
//   {
//     orderNumber: 1,
//     items: [
//       { name: "Cappuccino", price: 3.5 },
//       { name: "Chocolate Croissant", price: 2.5 },
//     ],
//   },
//   {
//     orderNumber: 2,
//     items: [
//       { name: "Latte", price: 4.0 },
//       { name: "Blueberry Muffin", price: 2.75 },
//     ],
//     discountCode: "COFFEELOVER",
//   },
// ];

// // Function to calculate the total value of all orders
// // Apply discounts if applicable
// function totalOrderValue(orders, applyDiscount) {
//   // Map over each order to calculate its total value
//   // Use the reduce method to sum the prices of all items in the order
//   // Check if a discountCode is present and apply the discount using the provided callback function

//   // Your implementation should:
//   // 1. Calculate the total value for each order
//   // 2. Apply the discount (if any) using the applyDiscount callback
//   // 3. Sum up the totals for all orders
//   // 4. Return the final grand total rounded to 2 decimal places

//   const priceArr = orders.map((order) => {
//     if (order.discountCode) {
//       const preTotal = order.items.reduce(
//         (total, item) => total + item.price,
//         0
//       );

//       const sumTotal = applyDiscount(order.discountCode, preTotal);

//       return sumTotal;
//     } else {
//       const total = order.items.reduce((total, item) => total + item.price, 0);
//       return total;
//     }
//   });

//   const sumTotal = priceArr.reduce((total, price) => total + price, 0);

//   return sumTotal;
// }

// //Below is the callback function to calculate the discount
// const applyDiscount = (discountCode, total) => {
//   // Implement discount logic here
//   switch (discountCode) {
//     case "COFFEELOVER":
//       return Number((total - total * 0.1).toFixed(2));
//     case "TEALOVER":
//       return Number((total - total * 0.2).toFixed(2));
//     default:
//       return Number(total.toFixed(2));
//   }
// };

// const grandTotal = totalOrderValue(orders, applyDiscount);
// console.log(grandTotal);

// Complete the function calculateAverage
// const weather = [
//   { city: "New York", temperature: 50, pressure: 1015 },
//   { city: "Los Angeles", temperature: 70, pressure: 1010 },
//   { city: "Chicago", temperature: 40, pressure: 1012 },
//   { city: "Houston", temperature: 75, pressure: 1020 },
//   { city: "Miami", temperature: 80, pressure: 1017 },
// ];
// const pressureThreshold = 1015;
// function calculateAverage(pressureThreshold) {
//   //Implement your function here
//   const filteredWeather = weather.filter(
//     (item) => item.pressure >= pressureThreshold
//   );
//   const totalTemp = filteredWeather.reduce(
//     (total, item) => total + item.temperature,
//     0
//   );
//   const avgTemp = totalTemp / filteredWeather.length;
//   return avgTemp.toFixed(1);
// }
// console.log(calculateAverage(pressureThreshold));
// //Output : 68.3

// const movie = {
//   title: "The Avengers",
//   year: 2012,
//   director: "Joss Whedon",
//   cast: [
//     "Robert Downey Jr.",
//     "Chris Evans",
//     "Chris Hemsworth",
//     "Mark Ruffalo",
//     "Scarlett Johansson",
//     "Jeremy Renner",
//     "Tom Hiddleston",
//     "Samuel L. Jackson",
//   ],
//   plot: "Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity.",
//   poster:
//     "https://m.media-amazon.com/images/M/MV5BNDYxNjQyMjAtNTdiOS00NGYwLWFmNTAtNThmYjU5ZGI2YTI1XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg",
//   getDetails: function () {
//     console.log(`Title: ${movie.title}`);
//     console.log(`Year: ${this.year}`);
//     console.log(`Director: ${this.director}`);
//     console.log(`Actors: ${this.cast.join(", ")}`);
//     console.log(`Plot: ${this.plot}`);
//     console.log(`Poster: ${this.poster}`);
//   },
//   getMovieDetails (detail) {
//     console.log(this[detail]);
//   },
// };

// movie.getDetails();
// movie.getMovieDetails("cast");

// const userProfile = {
//   name: "John Doe",
//   email: "john.doe@example.com",
//   address: {
//     city: "New York",
//     street: "123 Main St",
//     zipCode: "10001",
//   },
// };
// const userProfile2 = {
//   name: "Marry Jane",
//   email: "marry.jane@example.com",
//   address: {
//     city: "L.A",
//     street: "154, washington road",
//     block: "0101",
//     zipCode: "10011",
//   },
// };

// const keys = ["address", "city"];

// console.log(userProfile[keys[0]][keys[1]]);

// const userProfile = {
//   name: "John Doe",
//   email: "john.doe@example.com",
//   address: {
//     city: "New York",
//     street: "123 Main St",
//     zipCode: "10001",
//   },
// };
// const userProfile2 = {
//   name: "Marry Jane",
//   email: "marry.jane@example.com",
//   address: {
//     city: "L.A",
//     street: "154, washington road",
//     block: "0101",
//     zipCode: "10011",
//   },
// };

// // console.log(userProfile.address.name);

// function getUserDetail(profile, keys) {
//   // Implement your function here
//   if (Array.isArray(keys)) {
//     if (keys.length >= 2) {
//       const result = profile[keys[0]][keys[1]];
//       if (!result) {
//         return "Not available";
//       } else {
//         return result;
//       }
//     } else if (keys.length === 1) {
//       const result = profile[keys[0]];
//       if (!result) {
//         return "Not available";
//       } else {
//         return result;
//       }
//     }
//   } else {
//     const result = profile[keys];
//     if (!result) {
//       return "Not available";
//     } else {
//       return result;
//     }
//   }
// }

// console.log(getUserDetail(userProfile, "email"));

// class ObjectName {
//   constructor(param1, param2) {
//     this.param1 = param1;
//     this.param2 = param2;

//     this.print = function () {
//       console.log(`Param1: ${this.param1}, Param2: ${this.param2}`);
//     };
//   }
// }

// const obj = new ObjectName(1, 2);
// obj.print();

// function Movie(title) {
//   this.title = title;
// }

// const movie1 = new Movie("The Avengers");
// movie1.year = 2012;

// console.log(movie1);

// const movie2 = new Movie("Avatar");

// console.log(movie2);
// console.log(movie2.__proto__);
// console.log(movie1.__proto__.__proto__.__proto__);

// const movie = {
//   title: "The Avengers",
//   year: 2012,
//   director: "Joss Whedon",
//   cast: [
//     "Robert Downey Jr.",
//     "Chris Evans",
//     "Chris Hemsworth",
//     "Mark Ruffalo",
//     "Scarlett Johansson",
//     "Jeremy Renner",
//     "Tom Hiddleston",
//     "Samuel L. Jackson",
//   ],
//   plot: "Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity.",
//   poster:
//     "https://m.media-amazon.com/images/M/MV5BNDYxNjQyMjAtNTdiOS00NGYwLWFmNTAtNThmYjU5ZGI2YTI1XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg",
//   getDetails: function () {
//     console.log(`Title: ${movie.title}`);
//     console.log(`Year: ${this.year}`);
//     console.log(`Director: ${this.director}`);
//     console.log(`Actors: ${this.cast.join(", ")}`);
//     console.log(`Plot: ${this.plot}`);
//     console.log(`Poster: ${this.poster}`);
//   },
//   getMovieDetails(detail) {
//     console.log(this[detail]);
//   },
// };

// console.log(movie.__proto__);

// function Movie(title) {
//   this.title = title;
//   // this.getDetails = function () {
//   //   console.log(`Title: ${this.title}`);
//   // };
// }

// Movie.prototype.getDetails = function () {
//   console.log(`Title: ${this.title}`);
// };

// const movie1 = new Movie("The Avengers");
// movie1.year = 2012;

// console.log(movie1);
// console.log(movie1.__proto__);

// const movie2 = new Movie("Avatar");

// console.log(movie2);
// console.log(movie2.__proto__);
// console.log(movie1.__proto__.__proto__.__proto__);

// function Person(name) {
//   this.name = name;
// }

// Person.prototype.age = 30;

// const john = new Person("John");

// john.__proto__.age = 40;
// console.log(john.age);
// console.log(Person.prototype.age);

// const inputs = [];
// console.log(inputs.__proto__);

// const car = {
//   name: "car",
//   color: "black",
//   getDetails: function (brand, seats) {
//     console.log(
//       `This is a ${this.color} ${this.name} of ${brand} company. It has ${seats} seats.`
//     );
//   },
// };

// car.getDetails("Audi", 5);

// const bus = {
//   name: "bus",
//   color: "blue",
// };

// car.getDetails.call(bus, "Volvo", 30);

// car.getDetails.apply(bus, ["Tata", 25]);

// const veh1 = car.getDetails.bind(bus);
// veh1("Mahindra", 20);

function introduce(city, country) {
  console.log(this.name + " is from " + city + ", " + country);
}

let person = { name: "Alice" };

introduce.bind(person, "New York", "USA");
