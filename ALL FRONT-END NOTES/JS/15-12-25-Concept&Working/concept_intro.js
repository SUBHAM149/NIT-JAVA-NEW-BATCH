/*

if order something : waiting : pending 
 waiter : to take the user request and responsible for the food update

 if food is not there -> msg  : out of stock , : rejected 

 else : u get the food : fulfilled 



 after giving an interview thats the next ? : waiting for the output / result : pending state 

 if u get the mail ? 

 cong"  : selected  => fulfilled 
 "better next time : " : learn something => rejected 

-------------------------------------------

currently , i am teaching something { promises } : pending state 

1 day  : 

u get it what is promises ?  : full filled 
else : nothing   => rejected 


---------------------------------

if u ask for referal , 

reply  : fulfilled 
  or not :  rejected 



  ---------------------------------------

  exam : waiting for the result : pending state 

  result out : pass { fulfilled } or fail { rejected }

  -----------------------------------------------
  i am asking for the example : waiting : pending state 

  if get the example : fulfilled 
  else : rejected 



  ---------------------------------
  
  atm : if i want money :  waiting for the money 

  if case is there : i get the cash 
  else : a msg : no case is in the atm , 


  next atm : ❌ 

  bank : 

  friend 
  brother / sister 
  father 
  loan 




  =====================================

  promises works just like : if & else 



  we request for data  => request : waiting for the response { pending state }

  we get response : data else msg  : fulfilled & rejected 


*/

/*
// ! callback hell :
if ("sortListed") {
  if ("screeningRound") {
    if ("uClearFirstTechnicalRound") {
      if ("uClearSecondTechnicalRound") {
        if ("uClearHrRound") {
          if ("uGetOfferLetter") {
            if ("joiningLetter") {
              if ("uPerformWell") {
                console.log("salary is credit");
              }
            }
          }
        }
      }
    }
  }
}

// ! solution

if ("sortListed") {
  "wait till u r not getting response , : first interview Round call mail ",
    "wait till u r not getting response , response for first interview  ",
    "wait till u r not getting response , second interview date",
    "wait till u r not getting response , second interview ";

  // await fetch("url")
  // await fetch("API_URL")
  // await fetch("address_where_u_have_data_in_dB")

  let response = await fetch("API_URL");
  let data = await response.json(); // it converts in understandable form
  console.log(data);
}

// ! for the error , .catch () : we use try&catch

*/

/*

 JS Code is divided into 3 parts :
1. sync code 
2. Async code 
3. Async + Promises 


 ! Async code : a code that executes at the last 
 ? how many ways we have to make async code : 
1. Timing function 
2. AJAX / https Request 
3. Async & await 

*/

// ------------- Question : 01 -------------------

// console.log("start");

// let a = 20;
// console.log(a);
// console.log(25);

// console.log("end");
// console.log("start");

// ------------- Question : 02 -------------------

// console.log("start");
// let demo = setInterval(() => console.log("hey"), 4000);

// setTimeout(() => {
//   console.log("setTimeOut1");
//   clearInterval(demo)
// }, 0);

// setTimeout(() => {
//   console.log("setTimeOut2");
// }, 2000);

// console.log("end");

// ------------- Question : 03 -------------------
// console.log("start");

// async function greet() {
//   console.log("hello everyone , i am greet async function ");
//   await fetch("api");
//   console.log("hello");
// }
// async function greet2() {
//   console.log("greet2 ");
//   await fetch("api2");
//   console.log("hello2");
// }
// console.log("middle");

// greet();
// greet2();
// console.log("end");

// let promise_01 = new Promise(resolve_clf);

// ! first parameter is always : resolve doesn't matters whats the name u give
// ! second parameter is always : reject doesn't matters whats the name u give

// function reject_clf(reject, resolve) {
//     reject(); // it resolve the promise
//   }

// function resolve_clf(resolve, reject) {
//   resolve("data");
// }

// console.log(promise_01);

// let promise_02 = new Promise(reject_clf);

// function reject_clf(resolve, reject) {
//   reject("the error msg");
// }

// console.log(promise_02);

// console.clear();

// let promise_03 = new Promise(conditional_clf);

// function conditional_clf(resolve, reject) {
//   let age = 15;
//   if (age > 18) {
//     resolve(age);
//   } else {
//     reject(`age is ${18 - age} less than 18 `);
//   }
// }

// console.log(promise_03);

// ! how to handle the promise : async & await

console.log("start");
let a = 20;

setTimeout(() => {
  console.log("setTimeout");
}, 0);

console.log("middle");
console.log(a);
console.log("end");