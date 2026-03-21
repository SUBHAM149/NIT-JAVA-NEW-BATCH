console.log("working");

// let heading = <h1>today we are going to learn DOM</h1>;


// let document = {
//     querySelector: () => {},
//   };
  
//   console.log(document.querySelector())


let mainHeading = document.querySelector('h1');
// ! h1 tag object 
console.log(mainHeading)


let heading = document.querySelector('h2')
// ! h2 tag object 
console.log(heading)


// ? the text of the h1
console.log(mainHeading.innerHTML)


// ? the text of the h2 
console.log(heading.innerHTML)

// ! how to update the key value in the object 
// todo : objName.keyName = "new value"
heading.innerHTML = " now we know how to change the text of the elements"

console.log(heading.innerHTML)


// ! style 

heading.style.color = 'red'
