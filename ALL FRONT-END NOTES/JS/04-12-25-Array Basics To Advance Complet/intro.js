console.log("working ✅");

/*
primitive data type : 
number
bigInt
boolean 
null 
undefined
symbol 
string 
NaN - o/p 

non-primitive : () , {} , [ ] => object 
internally : we have one that is object
externally : we have 3 that are , array , function and object 

*/

// ! Array :
/*
>>> frontend , UI , Browser , 
>>> DNS , Ip address & URL 
>>> Server , API 
>>> Database 
?? in which form we get the data form the database - html , css & js 
?? in which form we get the data of the js in sort, the raw data! 
! in the form of array 

? what is Array 
1. it is a DS {data structure : structure of the data }
2. is is a collection of data , any kind of data , same or different 
3. in js arrays are the heterogeneous array by default 


! syntax : 
let identifierName = [element1, element2, ....., elementN]

*/

// heterogeneous boolean array
let booleanArr = [true, false];

// heterogeneous string  array
let stringArr = ["str1", "str2"];

// ? homogeneous array
// ? there is a restriction like, whatever the first data type , it follows that data type only .
// ! without restriction heterogeneous

let heterogeneousArr = ["string", true, false, null, undefined, [2, 2, 34]];

// ======================================

console.clear();
// ! crud operation

// ? create
let arrayName = ["item1", "item2"];

// ? read
console.log(arrayName);
console.log(arrayName.length);

// ? how we can read the items
let indexValueOfTheTargetedItem = 0;
// ! syntax
// arrayName[indexValueOfTheTargetedItem]

console.log(arrayName[0]); // item 1
console.log(arrayName[1]); // item 2

console.log(typeof arrayName[0]); // item 1
console.log(typeof arrayName[1]); // item 2

// ! update
// 1. add the value in the starting
// 2. add the value in the ending
// 3. remove the value from the starting
// 4. remove the value from the ending
// 5. add the value in the middle
// 6. remove the value in the middle
// 7. replace the value in the starting
// 8. replace the value in the middle
// 9. replace the value in the ending

console.clear();
//?  1. add the value in the starting : unshift("value")

// o/p : of the unshift
// 1. return the updated length of the array
// 2. it update the original array
console.log(arrayName.unshift("add item in the 0th index"));
console.log(arrayName);

// !===========================================

//?  2. add the value in the ending
// o/p : of the push
// 1. return the updated length of the array
// 2. it update the original array
console.log(
  arrayName.push("add the value in the ending , array.length-1 index value ")
);
console.log(arrayName);

console.clear();

// !===========================================

//?  3. remove the value from the starting

// o/p : of the shift()
// 1. return the deleted value of the array
// 2. it update the original array

// console.log(arrayName.shift())
let zeroThValue = arrayName.shift();
console.log(zeroThValue);
console.log(arrayName);

console.clear();

// !===========================================

//?  4. remove the value from the ending

// o/p : of the pop()
// 1. return the deleted value of the array
// 2. it update the original array
console.log(arrayName.pop());
console.log(arrayName);

// !===========================================

console.clear();

// todo : syntax
// arrayName.splice(
//   "startingIndex",
//   " how many item u want to delete tell me the count ",
//   "what u want to add ,1 or 10 give me all one by one "
// );
//? 5. add the value in the middle

// ! splice

// it updates the original array

console.log("before", arrayName);
console.log(arrayName.splice(1, 0, "middle item", "second middle item"));
console.log("after", arrayName);

// 6. remove the value in the middle

console.log(arrayName.splice(2, 1));
console.log(arrayName);
// 7. replace the value in the starting

arrayName.splice(0, 1, "new item");
console.log(arrayName);

// 8. replace the value in the middle
arrayName.splice(1, 1, "new middle item");
console.log(arrayName);
// 9. replace the value in the ending
arrayName.splice(arrayName.length - 1, 1, "new ending item");
console.log(arrayName);

// !==========================================================================

console.clear();

let arr1 = [10, 12, 14, 29];
console.log(arr1);

// indexOf()
// includes()
// slice()
console.log(arr1.indexOf(14)); // index value
console.log(arr1.indexOf(141)); // -1

console.log(arr1.includes(14)); // true
console.log(arr1.includes(13)); // false

console.log(arr1);
console.clear();

// arr1.slice(startingIndex, endingIndex);

let slicedArray = arr1.slice(2, arr1.length);
console.log(slicedArray);
console.log(arr1);

console.clear();

// ! we have a string , u need to print a reverse of the  string
// eg : string => gnirts

// string => [ s,t,r,i,n,g ] => [ g,n,i,r,t,s] => gnirts
// 1. string to array
// 2. reverse the array
// 3. array to string

// let str = "string is the demo text for the str";
// let strArray = str.split("condition");
// let strArray = str.split("emptyString");
// ? for letters the condition is "", empty string
// ? for words the condition is " ", string with one space

let str = "string";
// 1. string to array
let strArray = str.split("");
console.log(strArray);

// 2. reverse the array
let reversedArray = strArray.reverse();
console.log(reversedArray);

// 3. array to string
let reversedStr = reversedArray.join("");
console.log(reversedStr);

console.clear();

// ! method chaining : using multiple methods together on after another
console.log(str.split("").reverse().join(""));

console.clear();

// ! manual way to reverse the string
let newReversedStr = "";
for (let i = str.length - 1; i >= 0; i--) {
  // console.log(str[i]);
  newReversedStr = newReversedStr + str[i];
}
console.log(newReversedStr);

console.clear();

// ! reverse the array
let demoArr = [10, 23, 43, 24];
let reverseDemoArr = [];
// for (let i = demoArr.length - 1; i >= 0; i--) {
//   // console.log(demoArr[i]);
//   reverseDemoArr.push(demoArr[i]);
// }
// console.log(demoArr)
// console.log(reverseDemoArr)

// !---------
for (let i = 0; i < demoArr.length; i++) {
  // console.log(demoArr[i]);
  reverseDemoArr.unshift(demoArr[i]);
}

console.log(reverseDemoArr);

console.clear();

console.log(demoArr.reverse());

/*
.length
shift()
pop()
unshift(value)
push(value)
splice(startingIndex, delete count, add values)
indexOf()
includes()
slice()
split('condition')
reverse()
join('condition')

*/

console.clear();

// !-----------------------------------------------------