// =====================================================
// Smart Bank - Deposit Money JavaScript
// =====================================================


const BASE_URL = "http://localhost:8080/api/accounts";


// Get Form Elements

const depositForm = document.getElementById("depositForm");

const message = document.getElementById("message");



// =====================================================
// SUBMIT DEPOSIT FORM
// =====================================================


depositForm.addEventListener("submit", async function(event){


    event.preventDefault();



    const accountId =
        document.getElementById("accountId").value;



    const amount =
        document.getElementById("amount").value;




    // Validation


    if(accountId === ""){


        showError("Account ID is required.");

        return;

    }



    if(amount <= 0){


        showError("Deposit amount must be greater than zero.");

        return;

    }





    try{


        const response = await fetch(

            `${BASE_URL}/deposit/${accountId}/${amount}`,

            {

                method:"PUT"

            }

        );





        if(!response.ok){


            throw new Error(
                "Deposit failed. Please check Account ID."
            );

        }





        const data = await response.json();





        showSuccess(

            "Money Deposited Successfully! Updated Balance : ₹ "
            + data.balance

        );



        depositForm.reset();



    }

    catch(error){


        console.error(error);


        showError(error.message);


    }



});




// =====================================================
// SUCCESS MESSAGE
// =====================================================


function showSuccess(msg){


    message.innerHTML = `


    <div class="alert alert-success">


        <i class="fa-solid fa-circle-check"></i>


        ${msg}


    </div>


    `;


}



// =====================================================
// ERROR MESSAGE
// =====================================================


function showError(msg){


    message.innerHTML = `


    <div class="alert alert-danger">


        <i class="fa-solid fa-circle-xmark"></i>


        ${msg}


    </div>


    `;


}



// =====================================================
// AUTO CLEAR MESSAGE
// =====================================================


setTimeout(()=>{


    if(message){

        message.innerHTML="";

    }


},5000);
