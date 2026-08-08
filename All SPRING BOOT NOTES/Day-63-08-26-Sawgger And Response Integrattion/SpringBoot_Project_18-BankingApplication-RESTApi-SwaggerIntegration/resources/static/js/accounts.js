// =====================================================
// Smart Bank - Accounts Management JavaScript
// =====================================================


const BASE_URL = "http://localhost:8080/api/accounts";


// Elements

const tableBody = document.getElementById("accountTableBody");

const totalAccounts = document.getElementById("totalAccounts");

const searchBtn = document.getElementById("searchBtn");

const refreshBtn = document.getElementById("refreshBtn");

const loadBtn = document.getElementById("loadAccountsBtn");



// =====================================================
// Load Accounts When Page Opens
// =====================================================

document.addEventListener("DOMContentLoaded",()=>{

    loadAccounts();

});



// =====================================================
// GET ALL ACCOUNTS
// =====================================================

async function loadAccounts(){

    try{

        showLoading();


        const response = await fetch(BASE_URL);


        if(!response.ok){

            throw new Error("Unable to load accounts");

        }


        const accounts = await response.json();


        displayAccounts(accounts);


        updateCount(accounts.length);


    }

    catch(error){

        console.error(error);

        showError(error.message);

    }

}



// =====================================================
// DISPLAY DATA IN TABLE
// =====================================================

function displayAccounts(accounts){


    tableBody.innerHTML="";


    if(accounts.length===0){


        tableBody.innerHTML=`

        <tr>

            <td colspan="7"
                class="text-center text-muted">

                No Accounts Found

            </td>

        </tr>

        `;


        return;

    }



    accounts.forEach(account=>{


        tableBody.innerHTML += `


        <tr>


            <td>${account.accountId}</td>


            <td>${account.accountHolderName}</td>


            <td>${account.email}</td>


            <td>${account.mobile}</td>


            <td>

                <span class="badge bg-primary">

                    ${account.accountType}

                </span>

            </td>


            <td>

                ₹ ${account.balance}

            </td>



            <td>


                <button class="btn btn-info btn-sm"
                    onclick="viewAccount(${account.accountId})">

                    <i class="fa-solid fa-eye"></i>

                </button>



                <button class="btn btn-danger btn-sm"
                    onclick="deleteAccount(${account.accountId})">

                    <i class="fa-solid fa-trash"></i>

                </button>


            </td>



        </tr>


        `;


    });


}



// =====================================================
// SEARCH ACCOUNT BY ID
// =====================================================


if(searchBtn){


searchBtn.addEventListener("click", async function(){


    const id = document
        .getElementById("searchId")
        .value;



    if(id === ""){


        alert("Please enter Account ID");

        return;

    }



    try{


        const response = await fetch(
            `${BASE_URL}/${id}`
        );



        console.log(
            "API STATUS:",
            response.status
        );



        if(!response.ok){


            throw new Error(
                "Account not found"
            );

        }




        const account =
            await response.json();



        console.log(
            "SEARCH ACCOUNT:",
            account
        );



        displayAccounts([account]);



    }


    catch(error){


        console.log(
            "SEARCH ERROR:",
            error
        );


        alert(error.message);


    }



});


}

// =====================================================
// VIEW ACCOUNT DETAILS
// =====================================================


async function viewAccount(id){


    try{


        const response =
            await fetch(`${BASE_URL}/${id}`);



        if(!response.ok){

            throw new Error("Account not found");

        }



        const account =
            await response.json();



        console.log(account);



        document.getElementById("viewId").innerHTML =
            account.accountId;



        document.getElementById("viewName").innerHTML =
            account.accountHolderName;



        document.getElementById("viewEmail").innerHTML =
            account.email;



        document.getElementById("viewMobile").innerHTML =
            account.mobile;



        document.getElementById("viewType").innerHTML =
            account.accountType;



        document.getElementById("viewBalance").innerHTML =
            "₹ " + account.balance;




        const modal =
            new bootstrap.Modal(
                document.getElementById("viewAccountModal")
            );



        modal.show();



    }


    catch(error){


        console.log("Error loading account:", error);


        alert(error.message);


    }


}



// =====================================================
// DELETE ACCOUNT
// =====================================================


async function deleteAccount(id){



    let confirmDelete =
        confirm(
            "Are you sure you want to delete this account?"
        );



    if(!confirmDelete){

        return;

    }



    try{


        const response =
            await fetch(`${BASE_URL}/${id}`,{

                method:"DELETE"

            });



        if(!response.ok){

            throw new Error("Delete failed");

        }



        alert("Account Deleted Successfully");


        loadAccounts();



    }

    catch(error){


        alert(error.message);


    }


}



// =====================================================
// REFRESH BUTTON
// =====================================================


if(refreshBtn){

refreshBtn.addEventListener("click",()=>{


    loadAccounts();


});

}



// =====================================================
// LOAD BUTTON
// =====================================================


if(loadBtn){

loadBtn.addEventListener("click",()=>{


    loadAccounts();


});

}



// =====================================================
// UPDATE COUNT
// =====================================================


function updateCount(count){


    if(totalAccounts){

        totalAccounts.innerHTML=count;

    }


}



// =====================================================
// LOADING MESSAGE
// =====================================================


function showLoading(){


    tableBody.innerHTML=`

    <tr>

        <td colspan="7"
            class="text-center">

            <i class="fa-solid fa-spinner fa-spin"></i>

            Loading...

        </td>

    </tr>

    `;


}



// =====================================================
// ERROR MESSAGE
// =====================================================


function showError(message){


    tableBody.innerHTML=`

    <tr>

        <td colspan="7"
            class="text-danger text-center">

            ${message}

        </td>

    </tr>

    `;


}
