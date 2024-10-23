// There is no need to initalise a class, or anything as such for JavaScript. We can directrly start working as seen here.

console.log("Hello World");

// Variables in JavaScript
const x = 10; // this is dclaring and initialising
const y = 20;

let z; // this is declaring
z = x; // this is initialising
console.log(z);
z = y;
console.log(z);
z = x + y;
console.log(z);
// Differencxe between const and let:
/*
 * const is immutable -> cannot be changed. A value needs to assigned.
 * let is mutable -> can be changed. Can just be declared without initialsing.
 * there is another variable type called "var" -> can be changed, but it is not scope specific
 */

// Naming Conventions

/*
 * 1. camelCase
 * 2. PascalCase
 * 3. kebab-case
 * 4. snake_case
 * 5. UPPER_SNAKE_CASE
 * 6. UPPER_SNAKE_CASE
 */
// In js, we use camelCase or snake_case for naming variables.

// Wrapper Objects
let number = 10;
let str = "Hello";
let bool = true;
console.log(number.__proto__); //this isused to check all the properties of that variable
console.log(str.__proto__);
console.log(bool.__proto__);

//  Methods in String
/*
 * the indexing starts from 0
 * the length of a string is the number of characters
 * Functions:
 * charAt -> gives us the letter (character) at  that particucal index. => str.charAt(3)
 * if you try to access a value which is not present, it will give you an empty string.
 * concat -> merges two strings => str.concat("World")
 * length -> gives us the length of the string => str.length
 * indexOf -> it gives the index of the character. If there are multiple occurances, the 1st occurance will be returned. => str.indexOf("e")
 * you can also give get the starting index of a substring => str.indexOf("llo")
 * you can also get the index of a particular char, or substring after an index => str.indexOf("l", 2)
 */
