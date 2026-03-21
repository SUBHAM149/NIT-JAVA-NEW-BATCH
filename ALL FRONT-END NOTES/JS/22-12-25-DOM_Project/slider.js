console.log("working");

/*
requirements 

prevBtn 
nextBtn 
slider
*/

let prevBtn = document.querySelector(".prevBtn");
let nextBtn = document.querySelector(".nextBtn");
let slider = document.querySelector(".slider");

let bgImgs = [
  "./Destinations/azhimala.webp",
  "./Destinations/kedarnath-temple.webp",
  "./Destinations/marinaBeach.jpg",
  "./Destinations/meghalaya.jpg",
  "./Destinations/rameshwaram.jpeg",
];

// ----- build the logic -------------------------
// console.log(bgImgs[0]);
// console.log(bgImgs[1]);
// console.log(bgImgs[2]);
// console.log(bgImgs[3]);
// console.log(bgImgs[4]);

// // -----------
// console.log("----------------------------------");

// for (let index = 0; index < bgImgs.length; index++) {
//   const element = bgImgs[index];
//   console.log(element);

//   //   we can't use thi directly in dom , because we want manual changes
// }

console.clear();



// ! main code or logic of the slider that is infinite slider 
function addBg(index) {
  slider.style.backgroundImage = `url(${bgImgs[index]})`;
}
let currentBgImgIndex = 0;

addBg(currentBgImgIndex);

function setNextBgImg() {
  currentBgImgIndex++;

  if (currentBgImgIndex < bgImgs.length) {
    addBg(currentBgImgIndex);
  } else {
    currentBgImgIndex = 0;
    addBg(currentBgImgIndex);
  }
}
function setPrevBgImg() {
  currentBgImgIndex--;
  if (currentBgImgIndex > 0) {
    addBg(currentBgImgIndex);
  } else {
    currentBgImgIndex = bgImgs.length - 1;
    addBg(currentBgImgIndex);
  }
}

nextBtn.addEventListener("click", setNextBgImg);
prevBtn.addEventListener("click", setPrevBgImg);
