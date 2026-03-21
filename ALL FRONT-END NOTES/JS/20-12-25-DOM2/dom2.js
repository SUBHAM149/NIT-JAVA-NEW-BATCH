console.log("working");

let mainHeading = document.getElementById("mainHeading");
console.log(mainHeading);
console.log(mainHeading.innerHTML);

let heading = document.getElementsByClassName("heading");
console.log(heading);

let subHeading = document.getElementsByTagName("h3");
console.log(subHeading);

let input = document.getElementsByName("username");
console.log(input);

// -------------------------------------------------------

console.clear();
let mainHeading2 = document.querySelector("#mainHeading");
console.log(mainHeading2);
console.log(mainHeading2.innerHTML);

console.clear();

let heading2 = document.querySelector(".heading");
console.log(heading2);
console.log(heading2.innerHTML);

console.clear();

let subHeading2 = document.querySelector("h3");
console.log(subHeading2);
console.log(subHeading2.innerHTML);

// ! html 1 < html 2 < html3 < html 4 < html 5

/* ! getElement_______   < querySelector { }

querySelector("#idName")
let document ={

querySelector : (str)=>{
    let prefix = str[0] { # }
    let remaining = str.slice(1,str.length)

    # : getElementById(remaining)
    . : getElementsByClassname(remaining)}
}
*/

console.clear();

let getElement = function (para) {
  return document.querySelector(para);
};

let h1 = getElement("#mainHeading");
let h2 = getElement(".heading");
let h3 = getElement("h3");

// ===================================

let getElement2 = function (para) {
  return document.querySelector(para);
};

let elements = ["#mainHeading", ".heading", "h3", "#mainHeading"];
for (let i = 0; i < elements.length; i++) {
  console.log(getElement2(elements[i]));
}
// -------------------

console.clear();
let h2_heading = document.querySelectorAll("h2");
console.log(h2_heading);

// --------------------------------------
console.clear();

// querySelector()
// querySelectorAll()

// ------------------------------------- html ------

console.clear();

// console.log(mainHeading.innerHTML);
// console.log(mainHeading.innerText);
// console.log(mainHeading.textContent);

/*
innerHTML : u can add the html code , text , content & it print hidden or visible both type of tags 

innerText : it print / add : only text  : only visible elements 

textContent : it print /add : only text : visible as well as hidden



! ----- html ------------
1. innerHTML 
2. innerText
3. textContent

innerHTML : u can add the html code , text , content & it print hidden or visible both type of tags 

innerText : it print / add : only text  : only visible elements 

textContent : it print /add : only text : visible as well as hidden


--------------------
createElement
`${username}`
`<h2>add the html code directly by using innerHTML</h2>`
parent.append(child) // indirect
parent.appendChild(child)
parent.removeChild(child)


! ------- CSS ---------------
1. style 
2. setAttribute
3. classList { add, remove , contains , toggle }

!--------- js -------------
1. querySelector
2. querySelectorAll
------------------------

3. getElementByID
4. getElementsByClassName
5. getElementsByTagName
6. getElementsByName


!------ events -------
1. click 
2. input 
3. submit 


let commonFunction = ()=>{}
!-------- how to add events ---------
1. targetedElement.addEventListener('eventName' , commonFunction)

2. html attributes : onclick="functionName()"
! inline js 
todo : <button onclick="functionName()">click</button>


!-------- how to remove events ---------
1. targetedElement.removeEventListener('eventName' , commonFunction)


*/