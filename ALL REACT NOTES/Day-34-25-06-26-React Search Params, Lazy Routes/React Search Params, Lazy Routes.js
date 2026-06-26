Yesterday
Routes

   - Route Components

   - Route Parameters 

   

   Child Routes:

    - You can configure relative routes for any parent.    

           <Routes>

               <Route  path=“/parent”  element={ <ParentElement /> }



                      <Route path=“child” element={ <ChildElement /> } />

                   

               </Route>

           </Routes>



    - Child route requires <Outlet> 

    - Outlet defines the location where the child content is rendered .  

    - It is configured in parent component. 

   

   Search Parameters 

   - Search parameter refers to Query String. 

   - It is key and value collection appended to URL. 



               ?key=value&key=value 



   - Form submits data to any route path as Query String. 

   - You can access the query string by using React Router Hook “useSearchParams()”.

       

               let [params] = useSearchParams();

           

               params.get(key)



   - “useSearchParams()” is an array type with getter and setter. 



 Ex: 

  Fakestrore-search.jsx







export function FakestoreSearch(){

    return(

        <div>

            <h3>Search</h3>

            <form action='/results'>

                <div className="input-group w-25">

                    <input type="text" name="searchString" placeholder="eg: electronics, jewelery" className="form-control" />

                    <button type="submit" className="btn btn-warning">Search</button>

                </div>

            </form>

        </div>

    )

}



   fakestore-results.jsx



import axios from "axios";

import { useEffect, useState } from "react";

import { useSearchParams } from "react-router-dom"





export function FakestoreResults(){



    let [params] = useSearchParams();

    const [products, setProducts] = useState([]);



    useEffect(()=>{

        axios.get(`https://fakestoreapi.com/products/category/${params.get('searchString')}`)

        .then(response=>{

            setProducts(response.data);

        })

    },[])



    return(

        <div>

            <h3>Results</h3>

            <div>

                {

                    products.map(product=>

                        <img className="mx-3" width="50" height="50" src={product.image} />

                    )

                }

            </div>

        </div>

    )

}



    fakestore-index.jsx



import { BrowserRouter, Link, Route, Routes } from "react-router-dom";

import { FakestoreHome } from "./fakestore-home";

import { FakestoreProducts } from "./fakestore-products";

import { FakestoreDetails } from "./fakestore-details";

import { FakestoreSearch } from "./fakestore-search";

import { FakestoreResults } from "./fakestore-results";



export function FakestoreIndex(){

    return(

        <div className="container-fluid">

             <BrowserRouter>

                <header className="bg-light p-2 d-flex align-items-center justify-content-between">

                    <span className="bi bi-cart4 fs-2 fw-bold"> Fakestore</span>

                    <div>

                        <span className="mx-2">Home</span>

                        <span className="mx-2">Electronics</span>

                        <span className="mx-2">Men Fashion</span>

                        <span className="mx-2">Women Fashion</span>

                        <span className="mx-3">

                            <Link to="/search">Search</Link>

                        </span>

                    </div>

                    <button className="btn btn-warning bi bi-person"> Signin</button>

                </header>

                <section className="mt-4 p-4">

                    <Routes>

                        <Route path="/" element={<FakestoreHome />} />

                        <Route path="/products/:category" element={<FakestoreProducts/>}>

                            <Route path="details/:id" element={<FakestoreDetails />} />

                        </Route>

                        <Route path="/search" element={<FakestoreSearch />} />

                        <Route path="/results" element={<FakestoreResults />} />

                    </Routes>

                </section>

             </BrowserRouter>

        </div>

    )

}



    Lazy Routes & Suspense 

    - Routes always load eagerly. 

    - All route components are loaded into memory before requested. 

    - Lazy loading is the process of loading the component only on request. 

    

    1. Make sure that component is configured as default export.



            export default function Login()

            {

                   return (<> </>)

            }

   

    2. Import using React “lazy()” method. 



           const Login = lazy( ()=> import(‘./Login’) );



           <Route path=“login”  element={<Login />} />



    3. If lazy routes are configured in component then you need suspense with fallback. 



           <Suspense fallback={ <div> Loading.. </div> }>

                   <Routes>



                   </Routes>

           </Suspense>

   

    Authenticating Routes

    - Web applications can sure accessibility by using 

           a) Authorization 

           b) Authentication 



    - Authorization is the process of restricting access to resources. 

    - Authentication is the process of verifying credentials of user. 

    - You can authenticate using 

           a) Security Tokens 

           b) Certificate 

           c) Cookies etc. 



    React Cookie Library
Class comments
