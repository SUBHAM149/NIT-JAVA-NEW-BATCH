// ! how to get the element by using the class name 
// let identifier = document.querySelector('tagName')
// let identifier2 = document.querySelector('.className')
// let identifier3 = document.querySelector('#idName')


//  ----------------- project code ----------


// ------- select the element for toggle the hero section --------------

let toggle = document.querySelector(".toggle")
let formSection = document.querySelector(".formSection")
let userSection = document.querySelector(".userSection")


//  ------ attach or add the event in the toggle button -------

toggle.addEventListener('click', function () {
    formSection.classList.toggle('toggleForm')
    userSection.classList.toggle('toggleUserSection')
})

// -------  select element for toggle theme -----------
let theme = document.querySelector('.themeMode')
let mainContainer = document.querySelector('main')

// ------- add event on theme button , click & toggle theme --------
theme.addEventListener('click', function () {
    console.log('click')
    mainContainer.classList.toggle('theme')
})



// ------ select the element for form handling --------------

let userName = document.querySelector('.userName')
let password = document.querySelector('.password')
let form = document.querySelector('form')
let usersSection = document.querySelector('.users')

let userDetail = {}
let usersData = []

//  ------ add the input event to get updated values -----
userName.addEventListener('input', function () {
    userDetail.userName = userName.value
})

password.addEventListener('input', function () {
    userDetail.password = password.value
})



form.addEventListener('submit', function (event) {
    event.preventDefault()
    let startingIndexValue = usersData.length
    usersData.push(userDetail)

    // ! rest form code 
    userName.value = ''
    password.value = ''
    userDetail = {}
    for (let i = startingIndexValue; i < usersData.length; i++) {
        // ! create the element 
        let userCard = document.createElement('section')
        // ! add the content 
        userCard.innerHTML = `<h2> user number : ${i + 1} </h2> <p>
        <b>userName : </b> ${usersData[i].userName} <br>
        <b>password : </> ${usersData[i].password}
        </p>`
        // ! add this as a child in the  usersSection 
        usersSection.appendChild(userCard)
    }


})

