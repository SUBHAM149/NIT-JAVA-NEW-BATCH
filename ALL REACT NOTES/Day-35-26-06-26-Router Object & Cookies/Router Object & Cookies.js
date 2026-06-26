Router Object & Cookies
Sudhakar Sharma (Sudhakar Sharma Naresh IT)
•
8:36 PM
Route Authentication with Cookies



   1. Install cookie library for project



           > npm  install  react-cookie --save



   2. Configure cookie in any component using the hook “useCookies()”



           const [cookies, setCookie, removeCookie] = useCookies([ ‘cookie-name’ ]);



           setCookie(‘cookie-name’, value, { expires: new Date() });



           cookies[‘cookie-name];

       

           removeCookie(‘cookie-name’);



   3. Make sure that cookies are accessed using a Cookie Provider 

           main.jsx



           <CookiesProvider>

                   <App />

           </CookiesProvider>

       

   Dynamic Navigation

   - It is the process of navigate from one route to another dynamically according to

     state and situation. 

   - React Router DOM provides “useNavigate()” hook. 

   

           let navigate = useNavigate();

           navigate(“/path”);

           

   Object Based Routing:

   - You can configure routes in a separate router file. 

   - It is good for reusability and extensibility. 

   - It is cleanly separated for design. 



   1. Go to “src” folder and add a new folder by name “routes”. 



   2. Add a new file into routes folder by name “routes.jsx”



   3. Routes are created by using “createBrowserRouter()” object. 



           const router = createBrowserRouter([

                   {

                       path: ‘name’,

                       element: < >,

                       errorElement: <NotFound />

                   },

                   {

                       path: ‘parent’,

                       element: <Parent>,

                       children: [ 

                               { path: ‘child’, element: <Child /> },

                               …

                           ]

                   }

           ])

           export default router;



   4. Go to Main.jsx 



         import router  from “../routes/routes.jsx”;

        <StrictMode>

           <RouterProvider router={ router } />

       </StrictMode>



                                               TO-DO Application
Class comments
