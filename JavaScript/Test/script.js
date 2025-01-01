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

// function introduce(city, country) {
//   console.log(this.name + " is from " + city + ", " + country);
// }

// let person = { name: "Alice" };

// introduce.bind(person, "New York", "USA");

// function User(displayName) {
//   this.displayName = displayName;
// }

// const systemCredentials = {
//   username: "system",
//   password: "pass123",
// };

// User.prototype.login = function (username, password) {
//   if (
//     username === systemCredentials.username &&
//     password === systemCredentials.password
//   ) {
//     console.log("Login Successful");
//   } else {
//     console.log("Login Failed");
//   }
// };

// const user = new User("Pranaav");

// const loginFunction = user.login.bind(systemCredentials);

// loginFunction("system", "pass123");
// loginFunction("system", "pass1234");

// function Shipment(id, location, destination, status, resources) {
//   this.id = id;
//   this.location = location;
//   this.destination = destination;
//   this.status = status;
//   this.resources = resources;
// }

// Shipment.prototype.updateStatusAndResources = function (status, resources) {
//   this.status = status;
//   this.resources = resources;
// };

// Shipment.prototype.assignResources = function (...resources) {
//   resources.forEach((resource) => this.resources.push(resource));
// };

// const TrackingSystem = {
//   shipments: [],
//   updateStatus: function (id, status) {
//     const shipment = this.shipments.find((shipment) => shipment.id === id);
//     if (shipment) {
//       shipment.status = status;
//     } else {
//       console.log("Shipment not found");
//     }
//   },
//   viewShipment: function (id) {
//     const shipment = this.shipments.find((shipment) => shipment.id === id);
//     if (shipment) {
//       const { id, status, resources, location, destination } = shipment;
//       console.log(`Shipment ID: ${id}`);
//       console.log(`Status: ${status}`);
//       console.log(`Resources: ${resources.join(", ")}`);
//       console.log(`Location: ${location}`);
//       console.log(`Destination: ${destination}`);
//     } else {
//       console.log("Shipment not found");
//     }
//   },
// };

// function Vehicle(name, color, wheels) {
//   this.name = name;
//   this.color = color;
//   this.wheels = wheels;

//   //   this.getDetails = function () {
//   //     console.log(`The ${this.color} ${this.name} has ${this.wheels} wheels.`);
//   //   };
// }

// Vehicle.prototype.getDetails = function () {
//   console.log(`The ${this.color} ${this.name} has ${this.wheels} wheels.`);
// };

// class VehicleCl {
//   /** Structure of a class
//    * Properties
//    * Constructor to initialize the vehicle object
//    * methods
//    */

//   // properties
//   name;
//   color;
//   wheels;

//   // constructor
//   constructor(name, color, wheels) {
//     this.name = name;
//     this.color = color;
//     this.wheels = wheels;
//   }

//   // methods
//   getDetails() {
//     console.log(`The ${this.color} ${this.name} has ${this.wheels} wheels.`);
//   }
// }

// const car = new VehicleCl("Car", "Black", 4);
// car.getDetails();
// console.log(car.hasOwnProperty("name")); // true
// console.log(car.hasOwnProperty("getDetails")); // false

// class Person {
//   name;
//   age;
//   gender;

//   constructor(name, age, gender) {
//     this.name = name;
//     this.age = age;
//     this.gender = gender;
//   }

//   speak() {
//     console.log(
//       `Hello, my name is ${this.name} and I am ${this.age} years old.`
//     );
//   }
// }

// const Student = class {
//   person;
//   major;
//   gpa;

//   constructor(person, major, gpa) {
//     this.person = person;
//     this.major = major;
//     this.gpa = gpa;
//   }

//   study() {
//     console.log(`I am studying ${this.major} and my GPA is ${this.gpa}.`);
//   }

//   speak() {
//     console.log(
//       `Hello, my name is ${this.person.name} and I am ${this.person.age} years old. I am also a student studying ${this.major}.`
//     );
//   }
// };

// const person1 = new Person("John", 20, "M");
// person1.speak();
// const stud1 = new Student(person1, "CS", 9);

// stud1.speak();

// stud1.study();

// class Car {
//   constructor(make, model, year, color, mileage) {
//     this.make = make;
//     this.model = model;
//     this.year = year;
//     this.color = color;
//     this.mileage = mileage;
//     this.getMake = function () {
//       return this.make;
//     };
//   }
// }

// Car.prototype.getModel = function () {
//   return this.model;
// };

// Car.prototype.getYear = function () {
//   return this.year;
// };

// Car.prototype.getColor = function () {
//   return this.color;
// };

// Car.prototype.getMileage = function () {
//   return this.mileage;
// };

// class ExpenseTracker {
//   //Create your private properites here
//   #expenses;
//   #income;

//   //Create a constructor function
//   constructor(income) {
//     this.#expenses = [];
//     this.#income = income;
//   }

//   //create your private properties to calculate expenses
//   #calculateTotalExpenses() {
//     const totalAmount = this.#expenses.reduce(
//       (total, expense) => total + expense.amount,
//       0
//     );
//     return totalAmount;
//   }

//   //Create your public properties here
//   addExpense(name, amount, date) {
//     const expense = { name, amount, date };
//     this.#expenses.push(expense);
//   }

//   calculateBalance() {
//     const balance = this.#income - this.#calculateTotalExpenses();
//     return balance;
//   }
// }

// const tracker = new ExpenseTracker(5000);
// tracker.addExpense("Rent", 1000, "2021-10-01");
// tracker.addExpense("Groceries", 500, "2021-10-02");
// console.log(tracker.calculateBalance()); // should output 3500

// class Vehicle {
//   // constructor
//   constructor(name, color, wheels, number) {
//     this.name = name;
//     this.color = color;
//     this.wheels = wheels;
//   }

//   // methods
//   getDetails() {
//     console.log(
//       `The ${this.name} is ${this.color}. It has ${this.wheels} wheels.`
//     );
//   }
// }

// class Car extends Vehicle {
//   // constructor
//   constructor(color, brand, purpose) {
//     super("Car", color, 4);
//     this.brand = brand;
//     this.purpose = purpose;
//   }

//   // methods
//   //   getDetails() {
//   //     console.log(
//   //       `The ${this.name} is ${this.color}. It has ${this.wheels} wheels.`
//   //     );
//   //   } // we don't need this method as it is already present in the parent class

//   // another feature is method overriding
//   getDetails() {
//     console.log(
//       `The ${this.color} ${this.brand} ${this.name} is used for ${this.purpose}.`
//     );
//   } // this method will override the getDetails method in the parent class
// }

// const car1 = new Car("Black", "Audi", "Luxury Travelling");
// car1.getDetails();
// console.log(car1.__proto__);
// console.log(car1);

// class Vehicle {
//   wheels = 4;
//   constructor(brand) {
//     this.brand = brand;
//   }

//   startEngine() {
//     console.log("Engine Started");
//   }
// }

// class Car extends Vehicle {
//   constructor(brand, model) {
//     super(brand);
//     this.model = model;
//   }
//   getWheels() {
//     return this.wheels;
//   }
// }

// const car1 = new Car("Audi", "A6");
// const wheelNum = car1.getWheels();
// console.log(wheelNum);

class Media {
  // constructor
  constructor(title, artist, duration) {
    this.title = title;
    this.artist = artist;
    this.duration = duration;
  }

  // methods
  getTitle() {
    return this.title;
  }
  getArtist() {
    return this.artist;
  }
  getDuration() {
    return this.duration;
  }
}

class Song extends Media {
  // constructor
  constructor(title, artist, duration, album, genre) {
    super(title, artist, duration);
    this.album = album;
    this.genre = genre;
  }

  // methods
  getAlbum() {
    return this.album;
  }
  getGenre() {
    return this.genre;
  }
}

class PopSong extends Song {
  // constructor
  constructor(title, artist, duration, album, genre, danceability, energy) {
    super(title, artist, duration, album, genre);
    this.danceability = danceability;
    this.energy = energy;
  }

  // methods
  getDanceability() {
    return this.danceability;
  }
  getEnergy() {
    return this.energy;
  }
}

class RockSong extends Song {
  // constructor
  constructor(title, artist, duration, album, genre, distortion, tempo) {
    super(title, artist, duration, album, genre);
    this.distortion = distortion;
    this.tempo = tempo;
  }

  // methods
  getDistortion() {
    return this.distortion;
  }
  getTempo() {
    return this.tempo;
  }
}

class Podcast extends Media {
  // constructor
  constructor(title, artist, duration, host, topic) {
    super(title, artist, duration);
    this.host = host;
    this.topic = topic;
  }

  // methods
  getHost() {
    return this.host;
  }
  getTopic() {
    return this.topic;
  }
}

class NewsPodcast extends Podcast {
  // constructor
  constructor(title, artist, duration, host, topic, source) {
    super(title, artist, duration, host, topic);
    this.source = source;
  }

  // methods
  getSource() {
    return this.source;
  }
  getDuration() {
    return this.duration;
  }
}

class ComedyPodcast extends Podcast {
  // constructor
  constructor(title, artist, duration, host, topic, comedian, rating) {
    super(title, artist, duration, host, topic);
    this.comedian = comedian;
    this.rating = rating;
  }

  // methods
  getComedian() {
    return this.comedian;
  }
  getRating() {
    return this.rating;
  }
}

const popSong = new PopSong(
  "Shape of You",
  "Ed Sheeran",
  235,
  "÷",
  "Pop",
  0.825,
  0.652
);
console.log(popSong.getTitle()); // should output 'Shape of You'
console.log(popSong.getArtist()); // should output 'Ed Sheeran'
console.log(popSong.getDuration()); // should output 235

console.log(popSong.getAlbum()); // should output '÷'
console.log(popSong.getGenre()); // should output 'Pop'
console.log(popSong.getDanceability()); // should output 0.825
console.log(popSong.getEnergy()); // should output 0.652

const rockSong = new RockSong(
  "Stairway to Heaven",
  "Led Zeppelin",
  482,
  "Led Zeppelin IV",
  "Rock",
  0.056,
  63.5
);
console.log(rockSong.getTitle()); // should output 'Stairway to Heaven'
console.log(rockSong.getArtist()); // should output 'Led Zeppelin'
console.log(rockSong.getDuration()); // should output 482
console.log(rockSong.getAlbum()); // should output 'Led Zeppelin IV'
console.log(rockSong.getGenre()); // should output 'Rock'
console.log(rockSong.getDistortion()); // should output 0.056
console.log(rockSong.getTempo()); // should output 63.5

const newsPodcast = new NewsPodcast(
  "The Daily",
  "The New York Times",
  30,
  "Michael Barbaro",
  "News",
  "The New York Times"
);
console.log(newsPodcast.getTitle()); // should
// output 'The Daily'
console.log(newsPodcast.getArtist()); // should output 'The New York Times'
console.log(newsPodcast.getDuration()); // should output 30
console.log(newsPodcast.getHost()); // should output 'Michael Barbaro'
console.log(newsPodcast.getTopic()); // should output 'News'
console.log(newsPodcast.getSource()); // should output 'The New York Times'

const comedyPodcast = new ComedyPodcast(
  "My Favorite Murder",
  "Karen Kilgariff and Georgia Hardstark",
  60,
  "Karen Kilgariff and Georgia Hardstark",
  "Comedy",
  "Karen Kilgariff and Georgia Hardstark",
  4.8
);
console.log(comedyPodcast.getTitle()); // should output 'My Favorite Murder'
console.log(comedyPodcast.getArtist()); // should output 'Karen Kilgariff and Georgia Hardstark'
console.log(comedyPodcast.getDuration()); // should output 60
console.log(comedyPodcast.getHost()); // should output 'Karen Kilgariff and Georgia Hardstark'
console.log(comedyPodcast.getTopic()); // should output 'Comedy'
console.log(comedyPodcast.getComedian()); // should output 'Karen Kilgariff and Georgia Hardstark'

console.log(comedyPodcast.getRating()); // should output 4.8
