React Hook Form
Sudhakar Sharma (Sudhakar Sharma Naresh IT)
•
Jun 22
React Hook Form

  Features:

  - Performant     

       * Light weight 

       * Uses less memory

       * Faster rendering 

       * Faster interactions 

  - Flexible & Extensible 

       * Loosely coupled 

       * Easy to add or remove elements dynamically 

       * Form can change dynamically. 

  - Easy to validate 

       * Uses HTML validations

       * You can validate using implicit HTML properties. 



  Issues 

   - Hook form uses all hooks for configuration, which are not allowed for class 

     components.

   - HTML validation doesn’t match requirements every time. 

   

   Exploring a library 

   1. Visit the official resource location 



           https://react-hook-form.com/

  

   2. Go to “API” to get an overview of concepts available 

   

   3. API may contain all features provided by library. Developer need to identify the 

       required for situation. 

   

   4. After exploring the required components you can choose “Get Started”.



   

   Configuring Hook Form

   

   1. Install hook form for project



               > npm   install   react-hook-form --save



   2. Import useForm hook 



               import { useForm } from “react-hook-form”



   3. Configure form reference 



               const { register, handleSubmit, formState: { errors } } = useForm();



               register                : can access all form field properties and event 

               handleSubmit    : defines the action to execute on submit.

               formState            : it returns all form state services, isValid, isDirty, touched,

                                         errors. 



   4. Bind events and properties with form element 



               <input   {…register(“fieldName”, { required, minLength:4 }) />



               <form onSubmit={ handleSubmit(submit_subscriber) }>



   5. Displaying errors 



               { (errors.fieldName?.type===“errorType”) ? <> onvalid </> : <> on Invalid </> }



 Ex: hook-form-demo.jsx



import { useForm } from "react-hook-form"



export function HookFormDemo(){



     const {register, handleSubmit, formState:{errors}} = useForm();



     const submit = (values)=>{

        console.log(values)

     }



    return(

        <div className="container">

            <form onSubmit={handleSubmit(submit)}>

                <h3>Register User</h3>

                <dl>

                    <dt>User Name</dt>

                    <dd><input type="text" {...register("UserName",{required:true, minLength:4})} name="UserName" /></dd>

                    <dd className="text-danger">

                        {

                        (errors.UserName?.type==="required")?<span>User Name Required</span>:<span></span>

                         &&

                         (errors.UserName?.type==="minLength")?<span>Name too short</span>:<span></span>

                        }

                    </dd>

                    <dt>Mobile</dt>

                    <dd><input type="text" {...register("Mobile", {required:true, pattern:/^\+91\d{10}$/})} name="Mobile" /></dd>

                    <dd className="text-danger">

                         {

                        (errors.Mobile?.type==="required")?<span>Mobile Required</span>:<span></span>

                         &&

                         (errors.Mobile?.type==="pattern")?<span>Invalid Mobile</span>:<span></span>

                        }

                    </dd>

                </dl>

                <button type="submit">Submit</button>

            </form>

        </div>

    )

}





                                               Routing
Class comments
