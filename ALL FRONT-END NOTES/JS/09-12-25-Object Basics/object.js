console.log("working ✅ ");

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
["key6" , "value6"],
["key7" , "value7"],
["key8" , "value8"],
["key9" , "value9"],
["key10" , "value10"],
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
// ? modification
obj_01.obj_name = "new name";
console.log(obj_01);

console.clear();

// ? insertion
obj_01.obj_NewKey = "obj_newKey_value";
console.log(obj_01);

// ! how to delete  : delete objectName.keyName

delete obj_01.obj_NewKey;
console.log(obj_01);