# What Is JavaScript

## Introduction

- **`JavaScript`** is a
  - **High Level**: It is a *`cross platform language`*, where you do not have to worry about the platform's configuration as such. Everything is taken care by the engine itself.
  - **Light Weight**: Uses less system resourses.
  - **Interpreted**: Executes code one line at a time. The code is executed directly by an interpreter without prior compilation.
  - **JIT Compiled (Just In Time)**: It is compiled at runtime.
  - **Multi Program**: Supporst different styles of writing code. You can either write *`OOP`* or *`Functional Programming`*.
  - **Prototype Based**: You can create objects without first defining the class.
  - **Synchronous**: Runs code in a sequence line by line.
  - **Single Threaded**: It executes one task at a a time. Which also means unless the previous task is not completed, the next task will not be executed.
  - **Dynamic Typed Language**: Capable of changing during runtime.

## History of JavaScript

- **1995**: **ECMAScript** was created.
- **1996**: **JavaScript** was released.

## Writing First JavaScript Code in the Browser

1. Go to any browser.
2. Open a new tab.
3. Right click on the page.
   - Select `Inspect` from the menu.
   - It will open the `console`.
4. Write `console.log("Hello World");` in the console.
5. Hit `Enter` to execute the code.

### Miscellanious

- try out these:

```javascript
alert("Hello World");
console.log("Hello World");
console.warn("Hello World");
console.error("Hello World");
console.info("Hello World");
console.table({name: "John", age: 30});
confirm("Are you sure?");
prompt("What is your name?");
```

### Control Flow

#### IF Statement

```javascript
if (condition) {
  // code to be executed if the condition is true
}
```

#### IF-ELSE Statement

```javascript
if (condition) {
  // code to be executed if the condition is true
} else {
  // code to be executed if the condition is false
}
```

#### IF-ELSE-IF Statement

```javascript
if (condition) {
  // code to be executed if the condition is true
} else if (condition) {
  // code to be executed if the condition is false
} else (condition) {
  // code to be executed if the condition is false
}
```

#### Switch Statement

```javascript
switch (condition) {
  case value1:
    // code to be executed if the condition is true
    break;
  case value2:
    // code to be executed if the condition is true
    break;
  default:
    // code to be executed if the condition is false
}
```

- here, even without `break`, the code will execute. But the problem is that even the other conditions after the true case will be executed. To avoid that we use `break` statement.

- Example

```javascript
let color = promt("Enter the color");

switch (color) {
  case "red":
    console.log("STOP!! The light is red");
    break;
  case "yellow":
    console.log("CAUTION!! The light is yellow");
    break;
  case "green":
    console.log("GO!! The light is green");
    break;
  default:
    console.log("Invalid color");
}
```

#### Ternary Operator

```javascript
let result = condition ? value1 /*this is the value if the condition is true*/ : value2 /*this is the value if the condition is false*/;
```

### Looping

#### For Loop

```javascript
for (let i = initialValue; i < condition; i++) {
  // code to be executed
}
```

#### While Loop

```javascript
while (condition) {
  // code to be executed
}
```

#### Do While Loop

- the difference between `while` loop and `do while` loop is that `while` loop will execute the code only if the **condition is true**, but `do while` loop will execute the code **at least once** and then check the condition.

```javascript
do {
  // code to be executed
} while (condition);
```

### Functions

#### Function Declaration

- one way to declare a function is using the `function` keyword.

```javascript
function functionName(param1, param2, param3 = 0 /*This is how to set a default value*/) { // can have any number of parameters
  // code to be executed
}
```

- another way to declare a function is using just the `()`.

```javascript
let functionName = (param1, param2, param3 = 0) => {
  // code to be executed
}
```

#### Function Calling

- calling a function is just like calling a variable.

```javascript
functionName();
```

#### Return Statement

- if you want to return a value from a function, you can use the `return` keyword.

```javascript
function functionName(param1, param2, param3 = 0) {
  // code to be executed
  return value;
}

let result = functionName(param1, param2, param3);
```

- here, the value is captured in a variable.

#### Function Expression

- these are `functions` without namesand are also called `anonymous functions`.
- we can use this method to avoid `function hoisting`.

```javascript
let functionName = function (param1, param2, param3 = 0) {
  return param1 + param2 + param3;
}

console.log(functionName); // prints the function itself
// calling
console.log(functionName(param1, param2, param3));
```

#### Arrow Functions

- this is another way to declare a function.
- it is a bit cleaner way to declare a function.

```javascript
const functionName = (param1, param2, param3 = 0) => {
  // code to be executed
}
functionName(param1, param2, param3);
```

#### IIFE

- IIFE is **Immediately Invoked Function Expression**.
- IIFE is a way to create a function without using the `function` keyword.

```javascript
(function (param1, param2, param3 = 0) {
  console.log(param1, param2, param3);
})(param1, param2, param3);
```

- by using `IIFE`, we can perform **data abstraction**, [example](./Test/script.js) -> line number 124
- `IIFE` are also used to encapsulate code and avoid global namespace pollution.

#### Pure Functions

- a pure function is a function that does not have any side effects.
- it is a function that returns the same output for the same set of inputs.

```javascript
function calculation(a, b) {
  return a*b;
}

console.log(calculation(2, 3));
// this is a pure function because it returns the same output for the same set of inputs.

const discount = 25;

const calcDiscount = (price) => {
  return price - (price * discount / 100);
}

console.log(calcDiscount(100));
// here, the output is dependent on the input and also an external factor, so therefore it is an impure function.

```

- a function is called pure only if:
  - it returns the same output for the same set of inputs.
  - it does not modify any external state. For example, in the above example, `discount` is an external state. and if the function has a line saying `discount = 50` or anything else that changes its original state, then it is not pure.
  - it does not have any side effects.

#### Callback Functions

- this is when we use a function as a parameter that is passed to another function.

```javascript
function greet(wish) {
  console.log(`${wish()}, Pranaav`)
}

function sayHi() {
  return "Hi";
}

greet(sayHi); // this is a callback function
// Output: Hi, Pranaav
```

#### Higher Order Functions

- it is a function that accepts a function as an argument or a function that returns a function.

```javascript
function square (num) {
  return num * num;
}

function cube (num) {
  return num * num * num;
}

const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const higherOrderFunc = (inputs, fn) => {
  const output = [];
  for (let ele of inputs) {
    output.push(fn(ele));
  }

  return output;
}

console.log(higherOrderFunc(arr, square));
// Output: [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
console.log(higherOrderFunc(arr, cube));
// Output: [1, 8, 27, 64, 125, 216, 343, 512, 729, 1000]
```

### Arrays

- Arrays in `JavaScript` are **heterogenous**. This means, an array can store elements of different data types.
- Arrays in `JavaScript` are **zero-indexed**. This means, the first element of an array is at index 0.
- Arrays in `JavaScript` are **mutable**. This means, an array can be modified after it is created.
- Arrays in `JavaScript` are **dynamic**. This means, the number of elements in an array can be changed at runtime.

```javascript
let arr = [1, "Hello", true, {name: "John", age: 30}];
```

#### Methods in Arrays

- **length** returns the number of elements in an array.
- **push** adds an element to the end of an array.
- **unshift** adds an element to the beginning of an array.
- **pop** removes the last element from an array.
- **shift** removes the first element from an array.
- **indexOf** returns the index of an element in an array.
- **includes** returns a boolean value indicating whether an element is present in an array.
- **reverse** reverses the order of elements in an array.
- **sort** sorts the elements of an array in ascending or descending order.
- **toString** returns a string representation of an array.
- **splice** and **slice** removes elements from an array. The `splice` method removes elements from an array, while the `slice` method creates a new array with the removed elements.

```javascript
const teams = ["CSK", "MI", "RCB", "LSG"];

// Adding elements in an Array
teams.push("KKR"); // if you log this, you will get the legnth of the array
teams.unshift("DC"); // if you log this, you will get the legnth of the array

// Removing elements from an Array
teams.pop(); // if you log this, you will get the last element
teams.shift(); // if you log this, you will get the first element

// Searching elements in an Array
teams.indexOf("MI"); // if you log this, you will get the index of the element. If the element is not present, it will return -1
teams.includes("RCB"); // if you log this, you will get a boolean value

// Modifying elements in an Array
teams.slice(startIndex, endIndex); // if you log this, you will get a new array with the removed elements
// if you were to log the "teams" array after using the "slice" method, you will see that the "teams" arrray is not modified

teams.splice(startIndex, deleteCount /*if you do not want to delete, you can set this to "0"*/, element1, element2, element3); // if you log this, you will get a new array with the removed elements and added elements
// this method affects the "teams" array
```

#### Loops in Arrays

- Normal Loops
  - **forof** executes a function once for each element in an array.
  - **forin** executes a function once for each index in an array.

```javascript
const teams = ["CSK", "MI", "RCB", "LSG"];

for (let i in teams) {
  console.log(teams[i]); // prints the elements of the array
  /*
  CSK
  MI
  RCB
  LSG
  */
}

for (let team of teams) {
  console.log(team); // prints the elements of the array
  /*
  CSK
  MI
  RCB
  LSG
  */
}
```

- Special Loops
  - **forEach** executes a function for each element in an array.
  - **map** creates a new array by applying a function to each element in an array.
  - **filter** creates a new array by keeping only the elements that pass a test in an array.
  - **reduce** reduces an array to a single value.

```javascript
const teams = ["CSK", "MI", "RCB", "LSG"];

teams.forEach((team) => console.log(team)); // prints the elements of the array
teams.map((team) => console.log(team)); // prints the elements of the array
teams.filter((team) => console.log(team)); // prints the elements of the array
teams.reduce((team) => console.log(team)); // prints the elements of the array
```

### Rest Operator and Spread Operator

- `...` operator is used to spread an array into individual elements as well as to spread an object into individual properties.

```javascript
function functionName(...params) {
  for (let param of params) {
    console.log(param); // prints the elements of the array
  }
}

functionName("CSK", "MI", "RCB", "LSG");
```

```javascript
const arr1 = ["KKR", "LSG"];
const arr2 = ["RCB", "MI"];

const mergedArr = [...arr1, ...arr2];

console.log(mergedArr); // prints ["KKR", "LSG", "RCB", "MI"]
```

```javascript
const arr1 = [1, 2, 3];
const arr2 = arr1

arr2.push(4);

console.log(arr2); // prints [1, 2, 3, 4]
console.log(arr1); // prints [1, 2, 3, 4]
```

- to avaoid  this, we can use the `spread` operator.

```javascript
const arr1 = [1, 2, 3];
const arr2 = [...arr1];

arr2.push(4);

console.log(arr2); // prints [1, 2, 3, 4]
console.log(arr1); // prints [1, 2, 3]
```

### Strings

- Strings in `JavaScript` are **immutable**. This means, a string cannot be modified after it is created.
- Strings in `JavaScript` are **zero-indexed**. This means, the first character of a string is at index 0.
- Strings in `JavaScript` are **dynamic**. This means, the length of a string can be changed at runtime.

#### String Methods

- `length` returns the length of a string.
- `charAt` returns the character at a given index in a string.
- `charCodeAt` returns the Unicode code point of a character at a given index in a string.
- `indexOf` returns the index of a substring in a string.
- `lastIndexOf` returns the index of the last occurrence of a substring in a string.
- `includes` returns a boolean value indicating whether a substring is present in a string.
- `replace` replaces a substring with another substring in a string.
- `replaceAl` replaces all occurrences of a substring with another substring in a string.
- `trim` removes leading and trailing whitespace from a string.
- `split` splits a string into an array of substrings.
- `slice` returns a substring of a string.
- `substring` returns a substring of a string.

### Objects

- Objects in `JavaScript` are **mutable**. This means, an object can be modified after it is created.
- Objects in `JavaScript` are **dynamic**. This means, the number of properties in an object can be changed at runtime.
- Objects in `JavaScript` are **key-value pairs**. This means, each property in an object is a key-value pair.

```javascript
const myObj = {
  name:  "Alexa",
  age: 10,
  hobby: "Daancing",
  100: "hundred",
  show: function () {
    console.log("Hello World")
  } // these are called anonymous functions as there is no name assigned to them
}
```

- to access the properties of an object, we use the `dot notation`.
- to access the properties of an object, we use the `bracket notation`.

```javascript
const myObj = {
  name:  "Alexa",
  age: 10,
  hobby: "Daancing",
  100: "hundred",
  show: function () {
    console.log("Hello World")
  }
}

console.log(myObj.name); // prints Alexa
console.log(myObj["age"]); // prints 10
```

## Execution Context

### Phases

- Creation Phase: This is the phase where the `JavaScript Engine` initiates the variables, functions, and objects defined in the code. The values are not assigned yet.

- Execution Phase: This is the phase where the `JavaScript Engine` assigns the values to the variables and executes the code.
  - There are twio types:
    - Global Execution Context: This is the execution context of the **entire code**.
    - Local Execution Context: This is the execution context of a **function** or a **block**.

- Example:

```javascript
var userName = "Tom";
var userAge = 30;

console.log(`userName: ${userName}`); // prints "userName: Tom"
console.log(`userAge: ${userAge}`); // prints "userAge: 30"

function greetUser (name) {
  var greet = "I hope you are doing fine.";
  console.log(`Hello ${name}, ${greet}`);

  var currentYeatr = 2030;
  const year = currentYeatr - userAge;
  return `Your birth year is ${year}`
}

const birthYear = greetUser(userName);
console.log(birthYear);
```

- Explanation:
  - **Phase 1: Creation Phase**
    - All the variables and functions are created but not assigned any value, so essentially they will be `undefined`.
    - Only the **global execution context** is created, they are: `userName`, `userAge`, `greetUser`, and `birthYear`.
  - **Phase 2: Execution Phase**
    - The values are assigned to the variables.
    - The `greetUser` function is executed.
    - The `currentYeatr` variable is created and assigned the value `2030`.

## Hoisting

- Hoisting is a mechanism in `JavaScript` where the variables and functions are moved to the top of the current scope before the code is executed.

- Example:

```javascript

console.log(`userName: ${userName}`); // prints "userName: Tom"
console.log(`userAge: ${userAge}`); // prints "userAge: 30"

greetUser(userName);

var userName = "Tom";
var userAge = 30;
console.log(`userName: ${userName}`);
console.log(`userAge: ${userAge}`);

function greetUser (name) {
  var greet = "I hope you are doing fine.";
  console.log(`Hello ${name}, ${greet}`);

  var currentYeatr = 2030;
  const year = currentYeatr - userAge;
  return `Your birth year is ${year}`
}

const birthYear = greetUser(userName);
console.log(birthYear);
```

- Outptut:

```console
userName: undefined
userAge: undefined
hello undefined, I hope you are doing fine.
userName: Tom
userAge: 30
hello Tom, I hope you are doing fine.
Your birth year is 2000
```

- Explanation:
  - here, the `userName` and the `userAge` is **undefined** in the first two lines becaue, the variable is created but not assigned any value.

## Call Stack

- The call stack is a list of functions that are currently executing.

## Scope

### Types

- Global
- Function (Local)
- Block -> [example](./Lecture%204/script.js) --- `check line 22`

### Scope Chianing

```javascript
var a = 10;
let b = 20;
const c = 30;

function print() {
  var a = 'ten'
  let b = 'twenty';


  console.log('***Inside Function Print***');
  console.log(a, b, c);
  console.log('*******');

  function innerPrint() {
    var a = 'inner10';
    console.log('***Inside Inner Function Print***');
    console.log(a, b, c);
  }

  innerPrint();
}
console.log(a, b, c);
print();
```

#### Result

```bash
10 20 30
***Inside Function Print***
ten twenty 30
*******
***Inside Inner Function Print***
inner10 twenty 30
```

### Lexical Environment

- In `JavaScript`, the `Lexical Environment` is essentially the scope of a `variable`. It governs how variables are accessed and managed during code execution. It's determined by the position of variables within the source code, specifically where they are defined.

### Life Cycle of Variables

#### Life Cycle of Variables in the TDZ: `let`, `const`, and `var`

- In JavaScript, the life cycle of variables varies depending on their type and presence in the Temporal Dead Zone (TDZ is the period between the creation and declaration of a `let` or `const` variable).
- A brief overview of how `let`, `const`, and `var` declarations go through different stages, including TDZ, initialization, and usability is described below:
  1. `let` and `const`
      - **Creation**: Variables are created during the creation phase but unlike var it is not initialized with “undefined” rather it remain uninitialized.
      - **TDZ (Temporal Dead Zone)**: Variables enter the TDZ until they are formally declared.
      - **TDZ Reference Error**: Accessing or assigning values during the TDZ results in a `ReferenceError`.
      - **Declaration**: Variables are declared,initializing them with the assigned value.
      - **Usable**: Once declared, variables can be accessed and assigned new values.
  2. `var`
      - **Hoisting**: `var` variables are hoisted during the creation phase to the top of their scope.
      - **Initialization**: `var` variables are initialized with the value `undefined` during hoisting.
      - **Usable**: `var` variables can be accessed and assigned values throughout their scope, even before their actual declaration in the code.

## Strict Mode

- Using `Strict Mode` in `JavaScript` does not allow JavaScript be in its original brittle, sloppy maner.
- It also helps with managing small and simple errors which would otherwise take a long time to debug.

## Closures

- A closure is a combination of a function bundled together with the lexical environment in which it was created.

- A **closure** in `JavaScript` is a feature where an inner function has access to its outer enclosing function's variables. This allows the inner function to remember and access these variables even after the outer function has finished executing.

```javascript
function outerFunction() {
  let counter = 0;
  return function innerFunction() {
    counter++;
    console.log(counter);
  }
}

const increment = outerFunction();

increment(); // 1
increment(); // 2
```

- Also check [example](Test/script.js) -> line 88

## Currying

- It is a way of transforming a function that takes multiple arguments into a sequence of functions that each take a single argument.

```javascript
function add1(a, b, c) {
  return a + b + c;
}
console.log(add(1, 2, 3)); // 6

function add2(a) {
  return function (b) {
    return function (c) {
      return a + b + c;
    }
  }
}

console.log(add2(1)(2)(3)); // 6
```

## This Keyword

- The `this` keyword refers to the **object** that is currently executing the code.
- It is a `pointer` to the **object** that is currently being executed.
- If we were to `console.log(this)` in a webpage, it would print the **window** object.
