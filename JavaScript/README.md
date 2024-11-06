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
