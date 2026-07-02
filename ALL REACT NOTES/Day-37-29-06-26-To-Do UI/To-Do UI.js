To-Do UI
Sudhakar Sharma (Sudhakar Sharma Naresh IT)
•
Jun 29
Summary

   - Configured JSON Server for API

   - Tested API Requests for handling CRUD operations.

   - Postman API debugger 

   

 Build UI

     

   1. Install following libraries into project



           > npm install  bootstrap   bootstrap-icons  --save

           > npm install  axios   formik    yup   moment --save

           > npm install  react-cookie  react-router-dom --save 



   2. Clean up the styles from following CSS files



           a) app.css

           b) index.css 



   3. Import bootstrap & icons into main.jsx 



          import '../node_modules/bootstrap/dist/css/bootstrap.css'

         import '../node_modules/bootstrap-icons/font/bootstrap-icons.css'

       import '../node_modules/bootstrap/dist/js/bootstrap.bundle.js'



   

   4. Add following folder structure into “src”



                   src

                   |_ routes                 

                   |    |_routes.jsx

                   |

                   |_components

                   |   |_ todo-home.jsx

                   |   |_ todo-login.jsx

                   |   |_ todo-register.jsx

                   |   |_ user-dashboard.jsx

                   |

                   |_ app.jsx
Class comments
