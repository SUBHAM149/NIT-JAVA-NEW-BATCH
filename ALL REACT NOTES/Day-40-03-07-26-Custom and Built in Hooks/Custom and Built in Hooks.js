Custom and Built in Hooks
Sudhakar Sharma (Sudhakar Sharma Naresh IT)
•
Jul 3
Custom Hooks:

     - Hook must be a function.

   - Its name must start with prefix “use”.

   - It is recommended to use camel case for hook name.



               function useName()

               {

               }



   - It must return a value or function.

   - It can’t be void type. 

   - It can be parameterized or parameter less. 

   - It can use existing React libraries like formik, axios, yup, moment etc.

   - It can have a life cycle phases like mount, unmount, update etc.

   - It must be always configured at higher level in a function. 

   - You can’t configure in closure. 



               {

                   // component outer block

                   function Name()

                   {

                   let n = useNavigate(); // invalid 

                   }

               }

   - Hook is a function defined in “.jsx” file. 

   

  Ex:  

   src/hooks/captcha.jsx





export function useCaptcha(){

    return `${Math.round(Math.random()*10)} ${Math.round(Math.random()*10)} ${Math.round(Math.random()*10)} ${Math.round(Math.random()*10)} ${Math.round(Math.random()*10)} ${Math.round(Math.random()*10)}`

}



   src/hooks/fetchdata.jsx



import axios from "axios";

import { useEffect, useState } from "react";





export function useFetchData(url){

    const [data, setData] = useState([]);

    useEffect(()=>{

        axios.get(url)

        .then(response=>{

            setData(response.data);

        })

    },[url])

    return data;

}



     components/shop-home.jsx



import { Link } from "react-router-dom";

import { useCaptcha } from "../hooks/captcha";

import { useFetchData } from "../hooks/fetchdata";





export function ShopHome(){

    const code = useCaptcha();

    let categories = useFetchData('https://fakestoreapi.com/products/categories&#39;);

    return(

        <div className="container-fluid">

            <h3>Shop Home</h3>

            <dl>

                <dt>User Name</dt>

                <dd><input type="text"/></dd>

                <dt>Verify Code</dt>

                <dd>{code}</dd>

            </dl>

            <h3>Categories</h3>

            <ol>

                {

                    categories.map(item=><li key={item}>{item}</li>)

                }

            </ol>

            <Link to="/products">Go to products</Link>

        </div>

    )

}



   Task: Create a hook for filtering data



             - useFilter(data, searchString)

             - return only the data that matches searchString



Ex:

     Src/hooks/filterdata.jsx







export function useFilterData(data, searchString){



    if(searchString===''){

        return data;

    } else {

        return data.filter(item=> item.toLowerCase().includes(searchString.toLowerCase()));

    }

    

}



   components/shop-home.jsx



import { Link } from "react-router-dom";

import { useCaptcha } from "../hooks/captcha";

import { useFetchData } from "../hooks/fetchdata";

import { useState } from "react";

import { useFilterData } from "../hooks/filterdata";





export function ShopHome(){

   

    const [topics] = useState(['JS Examples', 'React Projects', 'CSS Examples', 'JS Projects', 'React Examples']);

    const [searchStr, setSearchStr] = useState('');



    function handleSearchChange(e){ 

        setSearchStr(e.target.value);

    }



    const filteredTopics = useFilterData(topics, searchStr);



    return(

        <div className="container-fluid">

            <h3>Shop Home</h3>

            <input type="text" onChange={handleSearchChange} placeholder="search topic" />

            <ol>

                {

                    filteredTopics.map(topic=><li key={topic} >{topic}</li>)

                }

            </ol>

           

        </div>

    )

}









   Task: Create a hook for sorting data

           

               - useSort(data, reverse:boolean)

               - return the data in descending order if reverse is true. 

               

               Syntax:

                       useSort([ ], false);



   React Built-in Hooks:

   

   1. useEffect()

       - It is used to configure side-effects.

       - Side-Effects refers to actions performed while mounting and unmounting.

       - Component mounts only once. It mounts on first request. 

       - It requires the dependencies to mount again. 

       

       Syntax:

               useEffect(()=>{



                       // actions on mount;



                       return()=>{

                           // actions on unmount;

                       }



               }, [ dependencies ])



       - Component unmounts when user navigates from one component to another. 

       - Unmount is mostly used to cleanup memory. 



 Ex: UseEffect



import { useEffect, useState } from "react"



export function Login(){



    useEffect(()=>{

        console.log('Login Component Mounted');

        return()=>{

            console.log('Login Component Unmounted');

        }

    },[])



    return(

        <div>

            <h3>Login</h3>

        </div>

    )

}



export function Register(){

     useEffect(()=>{

        console.log('Register Component Mounted');

        return()=>{

            console.log('Register Component Unmounted');

        }

    },[])

    return(

        <div>

            <h3>Register</h3>

        </div>

    )

}





export function ShopHome(){

   

    const [view, setView] = useState('');



    function handleLoginClick(){

        setView(<Login />);

    }

    function handleRegisterClick(){

        setView(<Register />);

    }

    

    return(

        <div className="container-fluid">

            <h1>Shop Home</h1>

            <button onClick={handleLoginClick}>Login</button>           

            <button onClick={handleRegisterClick}>Register</button>

            <hr />

            {view}

        </div>

    )

}



   2. useLayoutEffect()

       - It used to configure actions at the time of generating layout. 

       - Actions relative to DOM or BOM are defined in Layout Effects. 

       - BOM interactions include window, history, location, navigator etc.

       

       Syntax:

           useLayoutEffect(()=>{





           },[ dependencies ])    

   

   3. useInsertionEffect()

       - It is used to configure actions at the time of painting.

       - It executes after layout.

       - It is used to inject various external libraries into page. 



   Syntax:

           useInsertionEffect(()=>{



           },[dependencies])

 

  Ex: shop-home.jsx



import { useEffect, useInsertionEffect, useLayoutEffect, useState } from "react"



export function Login(){



    useLayoutEffect(()=>{

        console.log('DOM Interactions Exectued');

    },[])



    useInsertionEffect(()=>{

        console.log('New Library Injected');

        const style = document.createElement('style');

        style.innerHTML = `

           h3 {

             color:red;

             background-color:yellow;

           }

        `;

        document.querySelector("head").appendChild(style);

    },[])



    useEffect(()=>{

        console.log('Login Component Mounted');

        return()=>{

            console.log('Login Component Unmounted');

        }

    },[])



    



    return(

        <div>

            <h3>Login</h3>

        </div>

    )

}



export function Register(){

     useEffect(()=>{

        console.log('Register Component Mounted');

        return()=>{

            console.log('Register Component Unmounted');

        }

    },[])

    return(

        <div>

            <h3>Register</h3>

        </div>

    )

}





export function ShopHome(){

   

    const [view, setView] = useState('');



    function handleLoginClick(){

        setView(<Login />);

    }

    function handleRegisterClick(){

        setView(<Register />);

    }

    

    return(

        <div className="container-fluid">

            <h1>Shop Home</h1>

            <button onClick={handleLoginClick}>Login</button>           

            <button onClick={handleRegisterClick}>Register</button>

            <hr />

            {view}

        </div>

    )

}
