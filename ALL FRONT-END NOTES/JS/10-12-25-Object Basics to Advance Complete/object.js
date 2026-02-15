console.log("working ✅ ");

/*
1. why we need object 
2. what is object : it is a collection of key value pairs 
3. syntax 
4. how many ways we have to print the object and its key values : dot and square notation 
5. how to use dot notation -> print object & key values 
6. how to print all the keys 
7. how to print all the values
8. how to print all the keys & values together as an entries
9. crud operation 
    A. create 
    B. read
    C. update -> insertion & modification
    D. deletion

*/

// ? why we need objects ?

let userDetails = ["Aman", "singh", 12, 23, 35];

// ! if u want to store the data use array :
// ? if u want to store the user Details or any information about something

let userDetails_01 = {
  user_name: "aman",
  user_Surname: "singh",
  user_age: 35,
  user_YOE: 12,
  user_something: 23,
  user_isMarried: false,
  user_Salary: null,
  user_address: {
    street: "abc",
    city: "xyz",
  },
  user_skills: ["html", "css", "js"],
  user_nextCompanyName: undefined,
};

// ! syntax :
let objectName = {
  key1: "value1",
  key2: "value2",
  key3: "value3",
  identifier: "value of the identifier ",
};

// ? what is rules we have for the identifiers : same rules applied on keys in object
/*
1. it can't start with number it can contains the number 
2. we can't use symbols except dollar & underscore 
3. we can't give spaces 
4. keywords can't be an identifier 
5. useCamelCase 
6. descriptive names 
7. use _ to separate big words 


! ====>>> how your keys stores inside the jse or memory ::: in the form string 
*/

// ? values : what kind of dt we can use : primitive as well as non-primitive values i can use

// todo : key + value = property

// ! how to print object
console.log(objectName);
console.log(userDetails_01);

// ! how many ways we have to print the key values in object
// ?? 2 ways : dot notation . & square notation []

// ? dot notation : it is a way to access the keys value directly
// todo =>    syntax :  objectName.keyName
console.log(userDetails_01.user_isMarried);
console.log(userDetails_01.user_age);
console.log(userDetails_01.user_Salary);
console.log(userDetails_01.user_address);
console.log(userDetails_01.user_address.city);
console.log(userDetails_01.user_address.street);

console.clear();

// ? print all keys

// todo ==> syntax :  Object.keys(objectName)
let allKeys = Object.keys(userDetails_01);
console.log(allKeys); // array of keys

console.clear();
// ? print all values

// todo ==> syntax :  Object.values(objectName)
let allValues = Object.values(userDetails_01);
console.log(allValues); // array of values

console.clear();
// ? print all keys & values : entries
// todo ==> syntax :  Object.entries(objectName)

let entriesOfObj = Object.entries(userDetails_01);
console.log(entriesOfObj);

/*
[ array , array , array,....... ]

array = ["key" , "value"]

[
["key1" , "value1"],
["key2" , "value2"],
["key3" , "value3"],
["key4" , "value4"],
["key5" , "value5"],
]
*/
console.clear();

// ! crud operation

// ? how to create
let obj_01 = {
  obj_name: "Jhon",
  obj_age: 16,
};

// ? how to read => clg(objectName)
console.log(obj_01);
console.log(obj_01.obj_name);
console.log(obj_01.obj_age);

// ! how to update  =>
// todo : insertion , modification
/*
* syntax  : objectName.keyName = "value"
if key is already there inside the object key value is updated or modify 
else , means if key is not present , key will be created and inserted inside the object with value such as 
key : value , this property should be inserted inside the object 

*/

console.clear();
// ? modification : there is no duplicate  key will created , it just update the value of the existing key
obj_01.obj_name = "new name";
console.log(obj_01);

console.clear();

// ? insertion
obj_01.obj_NewKey = "obj_newKey_value";
console.log(obj_01);

// ! how to delete  : delete objectName.keyName

delete obj_01.obj_NewKey;
console.log(obj_01);

let obj2 = {
  key1: "vale1",
  key2: "vale2",
};

console.clear();

let obj3 = obj2;
console.log(obj2);
console.log(obj3);

obj2.key1 = "new value";
console.log(obj2);
console.log(obj3);

obj3.key1 = "again new value";
console.log(obj2);
console.log(obj3);

// let demo = obj2.key1;
// console.log(demo)

// obj2.key1 = "new value ";
// console.log(obj2);
// console.log(demo)

/*
1. why we need object 
2. what is object : it is a collection of key value pairs 
3. syntax 
4. how many ways we have to print the object and its key values : dot and square notation 
5. how to use dot notation -> print object & key values 
6. how to print all the keys 
7. how to print all the values
8. how to print all the keys & values together as an entries
9. crud operation 
    A. create 
    B. read
    C. update -> insertion & modification
    D. deletion

*/

console.clear();
// ! how to create an object :  other ways

// ! object literals : {}
let obj4 = {
  demoKey: "demoValue",
};

console.log(obj4);

// ! object constructor : Object()
let obj5 = new Object();
console.log(obj5); // blank object : {}

let obj6 = new Object({
  demoKey1: "demoValue1",
});
console.log(obj6);
// ! output : new creates blank object and the value that u pass , it store inside the blank object
// blank object : {
// demoKey1: "demoValue1",
// }

console.clear();
let obj7 = new Object({ demoKey3: "demoValue3" });
console.log(obj7);

console.clear();
// i want to merger obj4 , obj6 & obj7 and wants single obj8

// let obj8 = obj4 + obj6 + obj7;

// let obj8 = new Object()

// let obj8 = { obj4, obj6, obj7 };

// ! spread operator :it gives u key value pairs of the object
let obj8 = { ...obj4, ...obj6, ...obj7 };

// console.log(obj8);

console.log(obj4);

let newObjFromObj4 = { ...obj4 };
// we give key value pairs of obj4 then u take this inside one object literals that is {}
let newObjFromObj4_02 = obj4; // we give the complete object obj4

console.log(newObjFromObj4);
console.log(newObjFromObj4_02);

// !============================

console.clear();

let obj9 = {
  demoKey4: "demoValue4",
};
let obj10 = {
  demoKey42: "demoValue4_of_obj10",
};

let obj11;
obj11 = { ...obj9, ...obj10 };
console.log(obj11);

console.clear();
// ! can we use spread operator only in object ?? no

let arr1 = [1, 2, 3, 4, 6, 78];
let arr2 = [12, 13, 14, 15, 16, 17];

let arr3 = arr1.concat(arr2);
console.log(arr3);

let arr4 = [...arr1, ...arr2];
console.log(arr4);

console.clear();

// !====================================================

// ! Object.assign()

let obj12 = {
  key12: "value12",
  key12: "value12",
};
let obj13 = {
  key13: "value13",
  key13: "value13",
};

// ! syntax :  Object.assign(targetedObject , object_That_U_want_merge1 , object_That_U_want_merge2, .... , object_That_U_want_merge_N)
let obj14 = Object.assign({}, obj12, obj13);
console.log(obj14);

console.clear();

// !  what is for loop and how it works

// for (let i = 0; i < 10; i++) {
//   // body
// }

// ? how to reduce the syntax of for loop as well as how we can iterate on array and object and string as well

let arr5 = [2, 3, 5, 6, 8, 9, 30];
// for (let i = 0; i <arr5.length; i++) {
//   // body
//   console.log(arr5[i]);
// }

// ! for of loop
// let i = 0 ; i <arr5.length; i++
// u need to give me the items of the arr5 from 0th index to last index

// for (let i = 0; i <arr5.length; i++) {
//   // body
//   console.log(arr5[i]);
// }

for (let i of arr5) {
  console.log(i);
}

console.clear();

let obj15 = {
  key1: "value1",
  key2: "value2",
  key3: "value3",
  key4: "value4",
  key5: "value5",
  key6: "value6",
  key7: "value7",
};

let allKeysOfObj15 = Object.keys(obj15);
console.log(allKeysOfObj15);

for (let i = 0; i < allKeysOfObj15.length; i++) {
  console.log(allKeysOfObj15[i]);
}

console.clear();

// ! in object for of loop will not work because object are not iterables
// In JavaScript, plain objects are not iterable by default. This means you cannot directly use constructs like for...of loops or the spread operator (...) with them to iterate over their properties.

for (let anyNameYouCanPassHere in obj15) {
  console.log(anyNameYouCanPassHere);
}

console.clear();

//  how to print values : objectName[keyName]
for (let anyNameYouCanPassHere in obj15) {
  console.log(obj15[anyNameYouCanPassHere]);
}

// ! how to create dynamic key value

console.clear();
let obj17 = {
  key1: "value1",
  "string key": "this key is string by default",
};

console.log(obj17);
console.log(obj17.key1);
console.log(obj17["string key"]);

// let dynamicKey = "Dynamic_key";

// obj17["Dynamic_key"] = "this is the value of the dynamic key";
// console.log(obj17);