// ===================================================
// Smart Bank Dashboard JavaScript
// ===================================================

const BASE_URL = "http://localhost:8080/api/accounts";

// ==========================================
// Load Dashboard
// ==========================================

document.addEventListener("DOMContentLoaded", () => {

    loadDashboard();

});

// ==========================================
// Load Dashboard Data
// ==========================================

async function loadDashboard() {

    try {

        showLoading();

        const response = await fetch(BASE_URL);

        if (!response.ok) {

            throw new Error("Unable to fetch account data.");

        }

        const accounts = await response.json();

        updateDashboard(accounts);

    }

    catch (error) {

        console.error(error);

        showError(error.message);

    }

}

// ==========================================
// Update Dashboard
// ==========================================

function updateDashboard(accounts) {

    document.getElementById("totalAccounts").innerHTML = accounts.length;

}

// ==========================================
// Show Loading
// ==========================================

function showLoading() {

    const total = document.getElementById("totalAccounts");

    if (total) {

        total.innerHTML = "...";

    }

}

// ==========================================
// Show Error
// ==========================================

function showError(message) {

    const total = document.getElementById("totalAccounts");

    if (total) {

        total.innerHTML = "0";

    }

    alert(message);

}

// ==========================================
// Auto Refresh Every 10 Seconds
// ==========================================

setInterval(() => {

    loadDashboard();

}, 10000);

// ==========================================
// Smooth Scroll for Back To Top Button
// ==========================================

document.addEventListener("click", function (event) {

    if (event.target.closest('a[href="#"]')) {

        event.preventDefault();

        window.scrollTo({

            top: 0,

            behavior: "smooth"

        });

    }

});
