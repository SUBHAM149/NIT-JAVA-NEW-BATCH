console.log("working");

let arr = [1, 2, 4, 5, 6];
// console.log(arr);

// console.log(typeof arr); // object

// console.log(Array.isArray(arr)); // with the help of this syntax we can check anything is an array or not

if (Array.isArray(22)) {
  // it convert the array into string
  console.log(`${arr} : is an Array `);

  console.log(arr, "is an array "); // we get array + string
} else {
  console.log("it is not an array ");
  console.log(typeof 22);
}

let obj = {
  key: "value",
};
// console.log(typeof obj); // object

function demo() {}
// console.log(typeof demo); // function

console.clear();

// ? how to create an methods in the object
let obj2 = {
  key2: "value2",
  key3: function greet() {
    console.log("hello everyone, i am method of an obj2 object");
    // here we don't have any return value,
    // by default functions return undefined in this case because we are not returning anything
  },
};

console.log(obj2.key2);

// ! a function declared inside an object as key value pair is known as method
console.log(obj2.key3());

// ! IN Js everything is Object

console.log([1, 2, 4, 5]);

console.clear();
// !

// ! what is arr2 : array that contains objects as an items is known as array like object
let arr2 = [{ key1: "value1", key11: function () {} }, { key2: "value2" }];
console.log(arr2[0]);

// --------------------------------------------
const instaUsers = [
  {
    id: 1,
    username: "gaganbaghel393",
    fullName: "gagan baghel",
    age: 24,
    isVerified: false,
    followers: 1203,
    following: 345,
    posts: 89,
    bio: "Tech enthusiast | React Developer",
    interests: ["coding", "gadgets", "travel"],
    address: {
      city: "Bangalore",
      country: "India",
    },
  },
  {
    id: 2,
    username: "ga hfbsdhjfdsh",
    fullName: "Riya Sharma",
    age: 21,
    isVerified: true,
    followers: 9830,
    following: 210,
    posts: 152,
    bio: "Fitness | Yoga | Nutrition",
    interests: ["yoga", "workout", "health"],
    address: {
      city: "Mumbai",
      country: "India",
    },
  },
  {
    id: 3,
    username: "travel_with_adi",
    fullName: "Aditya Verma",
    age: 28,
    isVerified: false,
    followers: 5320,
    following: 498,
    posts: 201,
    bio: "Travel Blogger ✈️",
    interests: ["travel", "hiking", "photography"],
    address: {
      city: "Delhi",
      country: "India",
    },
  },
  {
    id: 4,
    username: "foodie_queen",
    fullName: "Nisha Patel",
    age: 26,
    isVerified: false,
    followers: 7530,
    following: 320,
    posts: 178,
    bio: "Food lover | Exploring plates",
    interests: ["food", "cooking", "street-food"],
    address: {
      city: "Ahmedabad",
      country: "India",
    },
  },
  {
    id: 5,
    username: "coder_boy_raj",
    fullName: "Raj Malhotra",
    age: 23,
    isVerified: true,
    followers: 15000,
    following: 120,
    posts: 99,
    bio: "Full Stack Dev | MERN ⚡",
    interests: ["coding", "open-source", "AI"],
    address: {
      city: "Pune",
      country: "India",
    },
  },
  {
    id: 6,
    username: "artistic_soul",
    fullName: "Maya Singh",
    age: 29,
    isVerified: false,
    followers: 6800,
    following: 540,
    posts: 265,
    bio: "Sketch • Paint • Digital Art 🎨",
    interests: ["art", "design", "illustrations"],
    address: {
      city: "Kolkata",
      country: "India",
    },
  },
  {
    id: 7,
    username: "music_vibes_",
    fullName: "Kabir Khan",
    age: 27,
    isVerified: true,
    followers: 11200,
    following: 310,
    posts: 190,
    bio: "Musician | Producer | Guitarist 🎸",
    interests: ["music", "guitar", "production"],
    address: {
      city: "Chennai",
      country: "India",
    },
  },
  {
    id: 8,
    username: "fashion_diva",
    fullName: "Sara Ali",
    age: 22,
    isVerified: false,
    followers: 4500,
    following: 690,
    posts: 143,
    bio: "Fashion · Style · Trends 👗",
    interests: ["fashion", "makeup", "shoots"],
    address: {
      city: "Hyderabad",
      country: "India",
    },
  },
  {
    id: 9,
    username: "gamer_x_pro",
    fullName: "Yash Raj",
    age: 20,
    isVerified: false,
    followers: 8900,
    following: 410,
    posts: 132,
    bio: "Gamer | Streamer 🎮",
    interests: ["gaming", "streaming", "esports"],
    address: {
      city: "Lucknow",
      country: "India",
    },
  },
  {
    id: 10,
    username: "peaceful_mind",
    fullName: "Ananya Joshi",
    age: 30,
    isVerified: true,
    followers: 17000,
    following: 230,
    posts: 300,
    bio: "Mindfulness • Meditation • Positivity",
    interests: ["meditation", "books", "blogging"],
    address: {
      city: "Jaipur",
      country: "India",
    },
  },
];

// for (let i = 0; i < instaUsers.length; i++) {
//   const element = instaUsers[i];
//   console.log(element.username.includes("ga"));
// }
console.clear();

// ! if i want to find one  use the find method
let targetedUser = instaUsers.find((user) => {
  return user.username.includes("ga");
});

console.log(targetedUser);

// ! if i want to find more than one use the filter method

let targetedUsers = instaUsers.filter((user) => {
  return user.username.startsWith("ga");
});

console.log(targetedUsers);

console.clear();
let arr4 = [1, 3, 4, 6, 10];

console.log(arr4.filter((value) => value > 2));
console.clear();

console.log(arr4.find((value) => value == 10));
// !if arr4 item is greater than 5 , subtract 5
//  [1,3,4,1,5]

console.log(
  arr4.map((number) => {
    return number > 5 ? number - 5 : number;
  })
);

console.clear();

// ! find , filter  , map -> return new array , no changes in the main array
console.log(arr4.map((number) => (number > 5 ? number - 3 : number)));
console.log(arr4);