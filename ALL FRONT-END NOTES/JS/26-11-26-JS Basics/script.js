console.log(
  "this is the way to print anything in the browser console GUI , this one is used as a printing statement in the js "
);
console.log(2 + 3);

/*
? 1 : if u want any text => "" 
? 2 : if u want to perform any operation => no need of ""
*/

console.clear();

console.error("this method is used to display the errors, in red bg ");
console.warn(
  "this is used to display the warning : pay attention in my class plz"
);

//  log , clear , error , warn

console.clear();

// ! operators

console.log(2 + 2);
console.log(3 - 1);
console.log(5 * 2);
console.log(6 / 2);
console.log(9 % 2);

console.log(8 ** 2);

console.log(9 - -3);

console.log(3 < 3);
console.log(10 > 9);
console.log(8 >= 8);
console.log(8 <= 9);

console.log("-----------------");
console.log(true && true);
console.log(true && false);
console.log(false && true);
console.log(false && false);

console.log("-----------------");
console.log(true || true);
console.log(true || false);
console.log(false || true);
console.log(false || false);

console.log(!true);
console.log(!false);
console.log(!(4 < 2));
//-   ! false => true

/*
1. uniary  => ! , ++ , -- 
2. binary 
3. ternary 

*/

console.log("===================");

let number = 20;
console.log(number++);
/*
number++ 
number & ++ 
print number & perform ++ 
number = number + 1


++ 
number = number + 1 
number += 1
number++

*/

console.log(number);
// 21

console.log(number--);
// 21
// perform the decrement
console.log(number);
// 20

console.log(number++);
// 20
// 20+1 = 21
console.log(number++);
// 21
// 21 + 1
