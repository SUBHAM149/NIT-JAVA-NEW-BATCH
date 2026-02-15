//  ! what do u mean by function  // ?
/*
  it is a block of code that we can re-use in the code.

  how many ways we have to use or re-use the function

  * create onces use multiple times
  1. we can create the function anywhere in the script file and we can use anywhere, u can use the function before and after declaration.
  2. u can create any function for printing statement
      eg : clg('hello')
  3. u can create any function that print or modify the user inputs
      eg : clg(`hello ${username}`)

  */

//  ! how to declare /create function in js

//  start with function keyword followed by functionName as an identifier after that we have (), inside that we have some variables that are optional at the end we have {} , that contains the body of the function

// function functionName(variable1, variable2) {
//   body of the function
// }

//  ! how to use the function or call the function
//  ? syntax
//  functionName()

//   functionName followed by (), inside the () input value that u are using in the function declaration , it is optional

//  1. if u are using the values in the function pass the values while calling the function
//  2. if u are  not using the values in the function don't pass the values while calling the function

//  3. if u are  using the values in the function and u are not passing the values while calling the function , u get the wrong output mostly , NaN  else undefined

//  4. if u are not using the values in the function and u are passing the values while calling the function then its not a problem , no error it works smoothly as it is ......

console.clear();
//  ! create one function that print hello
function printHello() {
  console.log("hello");
}
printHello();

//  ! create one function that print hello userName

console.clear();

// ? function statement : a normal function as a function declaration
function saYHello(userName) {
  console.log(`Hello ${userName}`);
}
saYHello();
saYHello("username");
saYHello("username2");

for (let i = 0; i < 10; i++) {
  saYHello(`username : ${i}`);
}

//  ! create a function that returns the sum of 2 numbers
// console.clear();

// ? function expression : whenever we store a function inside variable , that function is known as function expression

// !  =>  first citizen function : the function that u are using as a value of a variable
//  eg : in the given below function sumOfTwoNum is the first citizen function
//  and sum is the function expression
let sum = function sumOfTwoNum(num1, num2) {
  console.log(num1 + num2);
  num1 = undefined;
  num2 = undefined;
  undefined + undefined == NaN;
  2 + undefined == NaN;
  return num1 + num2;
};

//  ! this function name will not work
//   sumOfTwoNum();
//  sumOfTwoNum(2, 3);
//  sumOfTwoNum(2);

//  ! variable that holds the function
sum(2, 3); // no o/p in console
console.log(sum(2, 3));
// o / p in console;

//  ! parameters : the variable that u used while declaring the function

//  ! arguments : the values that u passed while calling the function
//  =================================

//  todo : categories of function
// ? function with parameters
// ? function without parameters

// ! functions that u can use before declaration
//  eg :  function statements
// ! functions that u can't use before declaration
//  eg : function expression

/*

  ! types of function
  1. function statement  : declaration ✅
  2. function expression : LHS == RHS  ✅
  3. >> named function  ✅
            >> use : normal function statements

  4. >> anonymous function  ✅
            >> use : function expression

  5. first citizen function ✅

  6. arrow function  ✅ : short hand way of writing the anonymous function,
      different types of arrow function
      that we can understand by the rules of the arrow function
  7. IIFE function  ✅: a function that execute just after the declaration syntax : (functionDeclaration)();
  8. nested function ✅ : function inside function

  function f1(){
  function f2(){

  }
  }

  this f1 function is in the intro.js file , that means u can call it only in intro.js  file
  this f2 function is inside the f1 function , that means u can call it only inside the f1 function

  HOF : higher order function
  >>> call back function
  recursive function
  generator function
  pure function

  !-----------------
   todo : >>> Interview topics
  currying
  function chaining
  lexical scope / scoping
  scope chaining
  closure

  */

//  ------------------------------

console.clear();

// ! function statement
function sayHii() {
  console.log("hii");
}
sayHii();

// ! function expression
let greet = function sayHey() {
  console.log("hey");
};

// sayHey(); // sayHey is a value of the greet variable it is not a variable , that means u can't use it like a variable.

// ! in function expression u need to use the variable name that holds the function for calling the function
greet();

// ! named function
//  >>>>> function with name

// ! anonymous function
//  >>>> function without name

//  todo : function expression with named function
let addition = function sum(num1, num2) {
  console.log(num1 + num2);
};
addition(); //NaN
addition(3, 4); //7

//  todo : function expression without named function  : anonymous function
let addition2 = function (num1, num2) {
  console.log(num1 + num2);
};
addition2(); // NaN
addition2(3, 4); // 7

// ! Anonymous function  : is used inside the function expression as a value
//  function (num1, num2) {
//    console.log(num1 + num2);
//  };

// ! IIFE :
//  * An Immediately Invoked Function Expression (IIFE) in JavaScript is a function that is defined and executed immediately after its creation

console.clear();

// ! in this we need to call the function and we can call this function many times as per the requirements
function demo() {
  console.log("demo Function ");
}
demo();
console.clear();

//  >>>>>>>>>>>> Key Notes <<<<<<<<<<<<

//  1. there is no need to call by name or normal calling statement
//  2. u can use or call it just after the declaration
//  3. how to call IIFE : (function declaration)();

(function demo2() {
  console.log("demo 2 function");
})();

// !---------

console.clear();

// ? nested : something inside something
// ? nested function : function inside function,

// ! how to create nested function/ declaration of the nested function

//  >>>>> Key Notes <<<<<<
/*
  1. u need to create one inner function inside the outer function
  2. u need to call the inner function inside the outer function such that u can't call inner function outside the outer function
  */

function outer() {
  console.log("i am outer function");

  // ! declare the inner function ,  or nested function
  function inner() {
    console.log("inner function");
  }

  inner();
}

outer();

// ! Arrow function : short hand way to write the anonymous function

console.clear();

// ! function expression with anonymous function as a value

let demo3 = function () {
  console.log("demo3");
};

demo3();

/*
  1. remove the function keyword
  2. ^^ remove the function name if u are using named function

  3. add the => , fat arrow symbol just after the ()
  */

//  function expression with arrow function

let demo4 = () => {
  console.log("demo4");
};
demo4();

function demo5() {
  console.log("demo5");
}

let demo6 = (para1) => {
  console.log("only 1 statement");
  return "something ";
};

// ! rules for arrow function
/*
  1. if u have only 1 parameter, u can remove the () that u are using just before the fat arrow symbol =>,
    eg :
          (para1)=>{}
      <<< para1=>{}

  2. if u have only one return or normal statement , u can remove the {} as well that u are using just after the fat arrow symbol
      eg :
           para1 => {clg('demo')}
     <<<<  para1 => clg('demo)

  3. if u have multiple statement in the body , u need to use the return keyword explicitly as well as {} are mandatory
  */

console.clear();

let UnderStandArrowFunction = (para1) => {
  console.log("what if we have one parameter in arrow function");
  console.log(">>> u can remove the ()");
};
UnderStandArrowFunction();

// ! updated arrow function

let UnderStandArrowFunction2 = (para1) => {
  console.log("what if we have one parameter in arrow function");
  console.log(">>> u can remove the ()");
};

UnderStandArrowFunction2();

// !===== understand the 2nd point

let UnderStandArrowFunction3 = (para1) => {
  console.log(
    "if u have only one line in the body , then u can remove the {} "
  );
};

UnderStandArrowFunction3();

let UnderStandArrowFunction4 = (para1) =>
  console.log(
    "if u have only one line in the body , then u can remove the {} "
  );

UnderStandArrowFunction4();

let UnderStandArrowFunction5 = (para1, para2) => {
  console.log("line 1 ");
  console.log("line 2 ");
  console.log("line 3 ");
  return true;
};

UnderStandArrowFunction5();
// ?>>>> if u have this type of function that contains multiple lines in the body and return something as well , then u need to use return keyword as well as everything should be inside the {}

// !-----------------------------------------------

console.clear();

// ? hof : higher ordered function
// ! nested function

function calculator(para1, para2) {
  function sum(num1, num2) {
    console.log(num1 + num2);
  }

  sum(para1, para2);
}
calculator(2, 4);
calculator(3, 5);

console.clear();

// ! 1. create the main function
function calculator2(para1, para2, operatorFunction) {
  operatorFunction(para1, para2);
}

// ! 2. create the first operatorFunction
function sum2(num1, num2) {
  console.log(num1 + num2);
}

// ! 3. create the second operatorFunction
function sub(num1, num2) {
  console.log(num1 - num2);
}

// ! 4. call the main function with 3 argument ,
//  1st : value
//  2nd : value
//  3rd : operatorFunction  , which operation u want to perform for that we have function for eg : sum , sub just pass it as it is
//  calculator2(4, 3, sum);

// !------------------------

console.clear();

// ! 1. create the main function - calculator with ->  HOF
// >>>> operator Function replace with the name CallBackFunction
function HOF(para1, para2, CallBackFunction) {
  CallBackFunction(para1, para2);
}

// ! 2. create the first operatorFunction
function sum1(num1, num2) {
  console.log(num1 + num2);
}

// ! 3. create the second operatorFunction
function sub1(num1, num2) {
  console.log(num1 - num2);
}

// ! 4. call the main function that is HOF with 3 argument ,
//   1st : value
//   2nd : value
//   3rd : operatorFunction  , which operation u want to perform for that we have function for eg : sum , sub just pass it as it is
//  HOF(4, 6, sum1);

// ? HOF : it is a function that takes another function {callbackFunction} as an argument
// ? callbackFunction :  it is a function that we pass  while calling the HOF

HOF(5, 3, sub1);

console.clear();
// !==============================================

// ? pure function => same input => same output

function multiple(num1, num2) {
  console.log(num1 * num2);
}
multiple(2, 3);
multiple(2, 3);
multiple(2, 3);
multiple(2, 3);
multiple(2, 3);
multiple(2, 3);
multiple(2, 3);

// ? normal or impure function
function callApi(apiURL) {
  // ! call the api and give me the data
  // ? apiURL call => get 20 data
  // ? apiURL call => get 10 data
  // ? apiURL call => get 1 data
}