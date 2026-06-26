React Routing
Sudhakar Sharma (Sudhakar Sharma Naresh IT)
•
Jun 23
Form Library

   - Formik

   - React Hook Form 



                                                      Routing



  - Routing is a technique used in web application for configuring user and SEO friendly 

   URL’s. 

  - User friendly URL allows to query any content directly from address bar. 



   without route:

    http://www.amazon.in/products.jsp?category=electronics&product=mobile&brand=apple



   with route:

   http://www.amazon.in/electronics/mobile/apple 



  - SEO friendly URL allows the search engine crawlers to identify the exact location    in page.



  - Routing can be configure both 



       a) Client Side 

       b) Server Side 



  - Server side routing is used to configure API requests. 



           https://dummyjson.com/products 

           https://dummyjson.com/products/2

           https://dummyjson.com/products?id=2

           

  - Client side routing is used to access pages and components. 

  - Routing in SPA uses implicit AJAX. 

  - It allows to load new content into page without reloading the page. 

  - In SPA user can stay on one page and can access everything using Route.             

  Route Flow

  

   Client => Request => Server => Http Handler => Routing Engine => Route Table 



 

  React Router DOM 

  - It is a library for configuring routes in React application. 

  - It provides built in components and hooks for managing navigation in SPA. 

  - React Router DOM latest is “8” version. It is a complete rewrite of its previous    versions [V5, V6].

  - Non Breaking changes when compared to V7. 



  1. Install React Router DOM

 

           > npm install react-router-dom --save





  2. You can build a route table using following components 



           <BrowserRouter>        Translates the virtual routes into actual DOM navigation.

           <Routes>                        Collection of routes [ ]

           <Route>                        It configures individual route in a collection 

           <Link>                            It is used for navigation in route 

           <Outlet>                        It is used to render child routes
Class comments
