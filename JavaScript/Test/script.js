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

function sumOfArray(arr) {
  let sum = 0;
  for (let i of arr) {
    sum += i;
  }

  return sum;
}

console.log(sumOfArray([1, 2, 3, 4, 5]));
