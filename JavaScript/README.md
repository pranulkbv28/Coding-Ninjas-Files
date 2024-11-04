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
