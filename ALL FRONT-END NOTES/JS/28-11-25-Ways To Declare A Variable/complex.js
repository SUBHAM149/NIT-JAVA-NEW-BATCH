console.log("working ✅");

let age = 20;

// ! if
if (age < 18) {
  console.log("less than 18");
}

// ! if else
if (age < 18) {
  console.log("less than 18");
} else {
  console.log("not less than 18 ");
}

// ! if else ladder
if (age < 18) {
  console.log("less than 18");
} else if (age > 18) {
  console.log("greater than 18");
} else {
  console.log("equal to 18 ");
}

// -------------------

console.clear();
// ! for loop

// for (let i = 0; i < 10; i++) {
//   console.log(i);
// }

/*
declaration of i 
condition of i 
{} : body executes 
updation of i 


*/

// while(condition){
//statement

// increment / decrement
// }
let num = 0;
// while(num<10){
//     console.log(num);
//     num++;
// }

// ! do-while
do {
  console.log(num);
  num++;
} while (num < 10);
{
  console.log("anything");
}

// switch

let batch_num = 54;
switch (batch_num) {
  case 53:
    console.log("batch number not matched ");
    break;
  case 54:
    console.log("batch number matched ");
    break;

  default:
    console.log("batch number is not matched with any case");
    break;
}

// ! ----------------------
// ? ternary: it is short hand way of if-else

if (2 < 10) {
  console.log("less than 10 ");
} else {
  console.log("not less than 10 ");
}

// condition
//   ? "statement u need to print when condition is true"
//   : "statement u need to print when condition is false";

//   condition ? "true statement" : 'false statement'

// eg
2 < 4 ? "yes" : "no";
