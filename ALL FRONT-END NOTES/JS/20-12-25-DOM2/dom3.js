console.log("working  ✅");

let mainHeading = document.querySelector("h1");
console.log(mainHeading); // object of h1
console.log(mainHeading.innerHTML); // text

let btn = document.querySelector("button");
console.log(btn); // object of button
console.log(btn.innerHTML); // text of the button

console.clear();

// ! when user click on the button , the color of the h1 should be changed to red

// function makeRedText() {
//   mainHeading.style.color = "red";
// }

// btn.addEventListener("click", makeRedText);

// if we click on the button , text contains the css yes , remove , else add

// ! learning the concept of the classList 
// function makeRedText() {
  //   mainHeading.style.color = "red";
  // mainHeading.classList.add = "makeTextRed"
  //   console.log(mainHeading.classList.contains("makeTextRed"));
  //   mainHeading.classList.add("makeTextRed");
  //   mainHeading.classList.remove("makeBgYellow");
  //   console.log(mainHeading.classList.contains("makeTextRed"));

  // ----------logic of toggle ----------------

  //   if (mainHeading.classList.contains("makeTextRed")) {
  //     mainHeading.classList.remove("makeTextRed");
  //     mainHeading.classList.remove("makeBgYellow");
  //   } else {
  //     mainHeading.classList.add("makeTextRed");
  //     mainHeading.classList.add("makeBgYellow");
  //   }

  // ---------- use default or predefined method of toggle -----

//   mainHeading.classList.toggle("makeTextRed");
//   mainHeading.classList.toggle("makeBgYellow");
// }

// btn.addEventListener("click", makeRedText);


// ---------------------------------------------------------


// ! direct use 
function toggleColor_BgColor(){
    mainHeading.classList.toggle("makeTextRed");
    mainHeading.classList.toggle("makeBgYellow");
}
btn.addEventListener("click", toggleColor_BgColor);