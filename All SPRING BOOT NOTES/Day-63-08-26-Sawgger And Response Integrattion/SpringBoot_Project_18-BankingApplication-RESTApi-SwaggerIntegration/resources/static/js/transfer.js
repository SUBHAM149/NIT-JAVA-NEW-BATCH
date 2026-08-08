// =====================================================
// Smart Bank - Money Transfer JavaScript
// =====================================================


const BASE_URL = "http://localhost:8080/api/accounts";


// Get Form Elements

const transferForm = document.getElementById("transferForm");

const message = document.getElementById("message");



// =====================================================
// SUBMIT TRANSFER FORM
// =====================================================


if(transferForm){


transferForm.addEventListener("submit", async function(event){


    event.preventDefault();



    const senderId =
        document.getElementById("senderId").value.trim();



    const receiverId =
        document.getElementById("receiverId").value.trim();



    const amount =
        document.getElementById("amount").value.trim();





    // ==============================
    // VALIDATION
    // ==============================


    if(senderId === ""){

        showError("Sender Account ID is required.");

        return;

    }



    if(receiverId === ""){

        showError("Receiver Account ID is required.");

        return;

    }



    if(senderId === receiverId){


        showError(
            "Sender and Receiver account cannot be same."
        );


        return;

    }




    if(amount === "" || Number(amount) <= 0){


        showError(
            "Transfer amount must be greater than zero."
        );


        return;

    }






    try{



        // ==============================
        // TRANSFER API CALL
        // ==============================


        const response = await fetch(

            `${BASE_URL}/transfer`,

            {


                method:"PUT",


                headers:{


                    "Content-Type":"application/json"


                },


                body: JSON.stringify({


                    senderId:Number(senderId),


                    receiverId:Number(receiverId),


                    amount:Number(amount)


                })


            }


        );






        const result = await response.text();






        if(!response.ok){


            throw new Error(result);


        }






        showSuccess(

            result || "Money transferred successfully"

        );



        transferForm.reset();




    }



    catch(error){


        console.error(

            "Transfer Error:",

            error

        );



        showError(

            error.message

        );



    }



});


}




// =====================================================
// SUCCESS MESSAGE
// =====================================================


function showSuccess(msg){



    if(message){


        message.innerHTML = `


        <div class="alert alert-success">


            <i class="fa-solid fa-circle-check"></i>


            ${msg}


        </div>


        `;


    }



}





// =====================================================
// ERROR MESSAGE
// =====================================================


function showError(msg){



    if(message){


        message.innerHTML = `


        <div class="alert alert-danger">


            <i class="fa-solid fa-circle-xmark"></i>


            ${msg}


        </div>


        `;


    }



}




// =====================================================
// AUTO CLEAR MESSAGE
// =====================================================


setTimeout(()=>{


    if(message){


        message.innerHTML="";


    }


},5000);
