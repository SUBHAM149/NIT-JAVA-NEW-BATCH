console.log("working");
//  ? after 2seconds print hello

// setTimeout(() => {}, timeout);
// todo : it execute the callback function once after give time
// setTimeout(() => {
//   console.log("hello setTimeout");
// }, 2000);

// console.log("----------- setTimeout : once ------------------");

// ?? i want u print hello after every 2seconds

// setInterval(() => {}, interval);
// ! it executes the clf again and again after 2sec
// setInterval(() => console.log("hello setInterval"), 2000);

// console.log(
//   "------------ setInterval : print again and again every 2sec ------------------"
// );

// ! stop printing hello again and again after 11

// todo : it print hello every 2 sec
// let Interval_01 = setInterval(
//   () => console.log("stop me after 11seconds "),
//   2000
// );

// todo : it executes the clf after 11sec once
//  clf : clear the timeInterval
// setTimeout(() => {
//   clearInterval(Interval_01);
// }, 11000);

// ?

// let timeOut = setTimeout(() => {
//   console.log("remove or delete this timeout before 5seconds ");
// }, 5000);

// //  ? if we want to perform any task after give time , once
// setTimeout(() => {
//     clearTimeout(timeOut)
// }, 4000);


// 

let target = setTimeout(() => {
    console.log('plz login sir pop up ')
}, 5000);

setTimeout(() => {
    console.log("done with login , so now i am not getting any, plz login sir pop up")

    clearTimeout(target)
}, 4999);
