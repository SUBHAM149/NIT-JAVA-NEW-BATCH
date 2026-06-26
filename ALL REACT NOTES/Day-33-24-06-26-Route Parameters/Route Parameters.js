Sudhakar Sharma (Sudhakar Sharma Naresh IT)
•
Jun 24
Routing 

React Router DOM library

 <BrowserRouter>

 <Routes>

 <Route>

 <Link>

 <Outlet> 



   Syntax:

               <BrowserRouter>

                   <Routes>

                       <Route  path={ }   element={ } />

                        …

                   </Routes>

               </BrowserRouter>



                 path                    : It refers to client request.

               element            : It refers to component or element or render on request.



   Wild Card Routes:



               path: “/“            : It refers to the component that will render when client

                                         request is not for any specific. 



               path: “*”            : It renders the component when request is not matching or

                                         requested path not found. 



   Route Parameters:

       - A route parameter allows to query content directly from URL.

       - Parameter allows to transport data from one component to another. 

       - You have to configure route to access parameters



           <Route   path=“name/:param1/:param2/:param3”   element={ } />



       - Parameters require actual values. 

       - Actual values are passed in the URL. 

       - Every parameter is a required parameter. 



           http://server.com/name/val1/val2/val3



       - You can access route parameters in any component by using the hook

         “useParams()”

           

               let params = useParams();

               

               params = {

                               param1: val1,

                               param2: val2,

                               param2: val3

                   }



               params.param1;       returns val1



   Ex: https://fakestoreapi.com



        Route Path                            Description 

       /products                                returns all products [ { } ]

       /products/id                            returns specific product { }

       /products/category/electronics    returns all products of specific category [{}]

       /products/categories            returns all categories [ ‘ ’ ]



   

        FAQ: What is difference between absolute and relative path?

       

                           http://server.com/python



                           <Link to=“java”> Java </Link>       Relative Path

   

                           http://server.com/python/java



                            <Link to=“/java”> Java </Link>     Absolute Path



                           http://server.com/java
Class comments
