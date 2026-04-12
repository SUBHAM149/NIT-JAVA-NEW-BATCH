console.log("js file is linked ✅ ");

// ! what is variable & identifier

// ? variables in js 

// ! how to declare the variable - let 
let name = "gagan Baghel";
/*
! types of tokens 
let    - keyword 
name   - identifier 
=      - assignment operator 
"gagan baghel" - value == literals
;  - 
{} , [] , () = 

comments - // 

*/

/*
? 1. keyword : predefined words in a language - 60+ 
eg : let , var , const, if ,else, for , while , do , forEach , map , filter, reduce, sort, switch, alert, get, Set, Map, etc...

? 2. identifiers : user defined words 
! rules : 
todo : Do's
1. use simple and short name such as name that have some meaning 
eg: 
name username ,number , toke, id , user_id ✅ 
n1, a1, b2, ab3, aaaa2, ❌ 

2. you can use only 2 symbols that are  $ and _ , in starting , ending or middle 
eg : 
1. username$01   ✅ 
2.  username_01  ✅ 
3.  _username    ✅ 
4.  $username    ✅ 
5.  $_username   ✅ 


3. camelCasing => from the 2nd word first letter should be capital 
eg : thisIsTheExampleOfCamelCasing 

if u want to use big names as an identifiers
4. use _ b/w the words
eg : this_is_the_example_of_camel_casing

user_id
USERID
USER_ID 
name = "gagan "
my_first_user_name_is = "gagan"
myFirstUserNameIs = 


userName1 = 
userName2 = 
userName3 = 

userName_01
userName_02
userName_03

! Don't
1. don't use any keyword as an identifier 
2. u can't start the name with number but u can use the numbers 
eg : 
1.  01_username  ❌ 
2.  username_01  ✅ 
3.  _username    ✅ 
4.  $username    ✅ 
5.  $_username   ✅ 

3. no space is allowed b/w the identifiers 
eg : 
1.   user name  ❌ 
2.   userName   ✅ -
2.   user_Name  ✅ 


? 3. literals == values or data that u assign to the identifiers 
eg : let userID = 717114

! types of literals == types of data type 
2 types : primitive & non-primitive 

todo : if u want to store single value inside the  variable  - primitive data type
todo : we cant change the values  - non-mutable  
let name = "demo name value "
let age = 16 ; 
let isPass = true 
note : 
1. number  - all types of numbers 
2. bigInt  - if any number is less than or more than (2^53) - 1
eg : 1234567890123456n , we will use the n as suffix 
! u can't perform any operation b/w the number & bigInt data type 
3. string - anything inside 'single quotation' , "double quotation" , `back ticks`
eg : 'atoz' , "0123456789DFGHJKL#$%^&*()" , "anything"


4. null  = 
5. boolean 
6. undefined
7. symbol

todo : if u want to store multiple values inside the  variable  - non-primitive data type
todo : we can change the value  - mutable 
let hobbies = hobby_01 , hobby_02 

*/

// ! boolean  - true [1] and false [0] 
// let isMarried = true ;
// let isMarried = false ;

// ! null ==  intentional absence of the value : i don't want to tell or give my personal info or data 
let isMarried = null;


// ! undefined ==  value is not defined / future stuff
let myNextCompany = undefined;


// ! symbols : it always give u unique value 
