console.log("working");

let heroSection = document.querySelector(".hero-section");
let fetchUserBtn = document.querySelector(".fetchUser");
let fetchQuotesBtn = document.querySelector(".fetchQuotes");

let User_api_url = "https://dummyjson.com/users";
let Quotes_api_url = "https://dummyjson.com/quotes";
async function fetchUsersData(url) {
  try {
    let response = await fetch(url);
    let data = await response.json();
    console.log(data.users);

    heroSection.innerHTML = "";
    
    data.users.map((user) => {
      let card = document.createElement("section");
      card.classList.add("card");
      card.innerHTML = `<h1>${user.firstName}</h1>`;

      //   !img
      let img = document.createElement("img");
      img.setAttribute("src", `${user.image}`);

      card.append(img);
      heroSection.append(card);
    });
  } catch (error) {
    console.log(error);
  }
}

fetchUserBtn.addEventListener("click", () => {
  fetchUsersData(User_api_url);
});

async function fetchQuotes(url) {
  try {
    let response = await fetch(url);
    let data = await response.json();
    console.log(data.quotes);

    heroSection.innerHTML = "";

    data.quotes.map((quote) => {
      let card = document.createElement("section");
      card.classList.add("card");
      card.innerHTML = `
            <p>${quote.quote}</p>
            <h2>${quote.author}</h2>
            `;
      heroSection.append(card);
    });
  } catch (error) {
    console.log(error);
  }
}

fetchQuotesBtn.addEventListener("click", () => {
  fetchQuotes(Quotes_api_url);
});