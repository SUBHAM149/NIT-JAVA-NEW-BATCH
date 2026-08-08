// ==============================================
// Smart Bank - Create Account
// ==============================================

const BASE_URL = "http://localhost:8080/api/accounts";

const accountForm = document.getElementById("accountForm");
const message = document.getElementById("message");

// ==============================================
// Submit Form
// ==============================================

accountForm.addEventListener("submit", async function (event) {

    event.preventDefault();

    const account = {

        accountHolderName: document.getElementById("accountHolderName").value.trim(),

        email: document.getElementById("email").value.trim(),

        mobile: document.getElementById("mobile").value.trim(),

        accountType: document.getElementById("accountType").value,

        balance: Number(document.getElementById("balance").value)

    };

    // Validation

    if (account.accountHolderName === "") {

        showError("Account Holder Name is required.");

        return;

    }

    if (account.email === "") {

        showError("Email is required.");

        return;

    }

    if (account.mobile.length !== 10) {

        showError("Mobile Number must contain exactly 10 digits.");

        return;

    }

    if (account.accountType === "") {

        showError("Please select an Account Type.");

        return;

    }

    if (account.balance <= 0) {

        showError("Initial Balance must be greater than zero.");

        return;

    }

    try {

        const response = await fetch(BASE_URL, {

            method: "POST",

            headers: {

                "Content-Type": "application/json"

            },

            body: JSON.stringify(account)

        });

        if (!response.ok) {

            throw new Error("Unable to create account.");

        }

        const data = await response.json();

        showSuccess(

            "Account Created Successfully! Account ID : " + data.id

        );

        accountForm.reset();

    }

    catch (error) {

        console.error(error);

        showError(error.message);

    }

});


// ==============================================
// Success Message
// ==============================================

function showSuccess(msg) {

    message.innerHTML =

        `<div class="alert alert-success">

            <i class="fa-solid fa-circle-check"></i>

            ${msg}

        </div>`;

}


// ==============================================
// Error Message
// ==============================================

function showError(msg) {

    message.innerHTML =

        `<div class="alert alert-danger">

            <i class="fa-solid fa-circle-xmark"></i>

            ${msg}

        </div>`;

}


// ==============================================
// Auto Hide Message
// ==============================================

setInterval(() => {

    message.innerHTML = "";

}, 5000);
