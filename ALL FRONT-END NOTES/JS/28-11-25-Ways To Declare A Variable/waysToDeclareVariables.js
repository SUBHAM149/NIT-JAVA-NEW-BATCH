console.log("working ✅ ");

// ! ways to declare the variables in js : 3 ways

// 1. let

// ? declaration of variable without init"  ✅
// let userName;

// ? init"
// userName = "gagan baghel"; //✅

// ? declaration + init" both together
let userName = "gagan baghel singh";

// ? re-init"
// userName = "gagan";  //✅

// ? re-decl"
// let userName; // ❌

// ?re-declaration + re-init"
// let userName = "gagan baghel "; // ❌

// ----------

// ! 2nd way : const : constant -> fixed value , dob , last working  company Name , TYSS+emp_no. = TYSS717114

// ? declaration ❌
// const userId ;

// ?declaration + initialization ✅
const userId = 717114;

// ? re- initialization ❌
userId = "gagan";
console.log(userId); // error :

// ? re-declaration  ❌
// ? re-declaration  + re - initialization❌

// ---------------------
// ! 3rd way : var

// ? declaration  ✅
var emp_no;

// ? re-declaration  ✅
var emp_no;

// ? initialization ✅
emp_no = 717114;
// ? re-initialization ✅
emp_no = 717114;

// ? declaration + initialization ✅
var emp_id = 717114;

// ? re-declaration + re-initialization ✅
var emp_id = 717114;