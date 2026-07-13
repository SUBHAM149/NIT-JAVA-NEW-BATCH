Typescript
Sudhakar Sharma (Sudhakar Sharma Naresh IT)
•
Jul 8
Redux in To-Do Application

   

  1. Install 

           > npm  install   @reduxjs/toolkit   react-redux  --save 

   

  2. Add a new folder by name “slicers” into SRC



           src/slicers/task-slicer.jsx



import { createSlice } from "@reduxjs/toolkit"



let initialState = {

    appointments: [],

    appointmentsCount: 0

}



const TaskSlicer = createSlice({

    name: 'Task Slicer',

    initialState,

    reducers: {

        "addToShare": (state, action)=>{

            state.appointments.push(action.payload);

            state.appointmentsCount = state.appointments.length;

        }

    }

})



export const {addToShare} = TaskSlicer.actions;

export default TaskSlicer.reducer;





 3. Add “store” folder into SRC



           src/store/store.jsx



import { configureStore } from "@reduxjs/toolkit";

import TaskSlicer from '../slicers/task-slicer';





export default configureStore({

    reducer: TaskSlicer

})



 4. Go to “main.jsx”



   import { StrictMode } from 'react'

import { createRoot } from 'react-dom/client'

import './index.css'

import App from './App.jsx'

import '../node_modules/bootstrap/dist/css/bootstrap.css'

import '../node_modules/bootstrap-icons/font/bootstrap-icons.css'

import '../node_modules/bootstrap/dist/js/bootstrap.bundle.js'

import { CookiesProvider } from 'react-cookie'

import { RouterProvider } from 'react-router-dom'

import router from './routes/routes.jsx'

import { Provider } from 'react-redux'

import store from './store/store.jsx'





createRoot(document.getElementById('root')).render(

  <StrictMode>

     <CookiesProvider>

          <Provider store={store}>

            <RouterProvider router={router}></RouterProvider>

          </Provider>

     </CookiesProvider>

  </StrictMode>,

)





 5. Todo-dashboard.jsx



import axios from "axios";

import { useFormik } from "formik";

import { useCallback, useEffect, useMemo, useState } from "react";

import { useCookies } from "react-cookie";

import { useDispatch } from "react-redux";

import { data, Link, useNavigate } from "react-router-dom";

import { addToShare } from "../slicers/task-slicer";

import store from "../store/store";



export function ToDoDashboard(){

    const [cookies, setCookie, removeCookie] = useCookies(['userid', 'username']);

    const [appointments, setAppointments] = useState([{id:'', title:'', description:'', date:'', user_id:''}]);

    const [editAppointment, setEditAppointment] = useState({id:'', title:'', description:'', date:'', user_id:''});



    const [searchString, setSearchString] = useState('');



    let navigate = useNavigate();



    let dispatch = useDispatch();



    const formikAdd = useFormik({

        initialValues: {

            title: '',

            description:'',

            date:'',

            user_id: cookies['userid']

        },

        onSubmit:(appointment)=>{

            axios.post('http://localhost:3000/appointments&#39;, appointment)

            .then(()=>{

                LoadAppointments();

            })

        },

        enableReinitialize: true

    })



    const formikEdit = useFormik({

        initialValues : {

            id: editAppointment.id,

            title: editAppointment.title,

            description: editAppointment.description,

            date: editAppointment.date,

            user_id:editAppointment.user_id,

        },

        onSubmit : (appointment)=>{

            axios.put(`http://localhost:3000/appointments/${appointment.id}`, appointment)

            .then(()=>{

                LoadAppointments();

            })

        },

        enableReinitialize: true

    })



    /*

    function LoadAppointments(){

         axios.get('http://localhost:3000/appointments&#39;)

        .then(response=>{

             let userAppointments = response.data.filter(appointment=> appointment.user_id===cookies['userid']);

             setAppointments(userAppointments);

        })

    }*/





    const LoadAppointments = useCallback(()=>{



         axios.get('http://localhost:3000/appointments&#39;)

        .then(response=>{

             let userAppointments = response.data.filter(appointment=> appointment.user_id===cookies['userid']);

             setAppointments(userAppointments);

        })



    },[cookies])



    useEffect(()=>{



       LoadAppointments();



    },[])



    function handleSignout(){

        removeCookie('userid');

        removeCookie('username');

        navigate('/login');   

    }





    /*

    function handleEditClick(id){

       

        axios.get(`http://localhost:3000/appointments/${id}`)

        .then(response=>{

            setEditAppointment(response.data);

        })

    

    }

    */



    const handleEditClick = useCallback((id)=>{

        axios.get(`http://localhost:3000/appointments/${id}`)

        .then(response=>{

            setEditAppointment(response.data);

        })

    },[appointments, cookies])



    function handleDeleteClick(id){

        let choice = confirm('Are you sure?\nWant to Delete');

        if(choice===true){

            axios.delete(`http://localhost:3000/appointments/${id}`)

            .then(response=>{

                LoadAppointments();

            })

        }

    }



    function handleSearchChange(e){

        setSearchString(e.target.value);

        console.log(e.target.value);

    }



    const filteredAppointments = useMemo(()=>{



            if(searchString===''){

                return appointments;

            } else {

                return appointments.filter(appointment=> appointment.title.toLowerCase().includes(searchString.toLowerCase()));

            }  



    },[searchString, appointments])



    function handleShareClick(appointment){

        alert('appointment shared');

        dispatch(addToShare(appointment));

    }





    return(

        <div className="row p-2">

            <div className="col-2 d-flex flex-column justify-content-between bg-light" style={{height:'600px'}}>

              <div>        

              <h3 className="mt-4">Task Manager</h3>

              <div className="fs-6 fw-bold mt-2">

                Hello ! {cookies['username']}

              </div>

              <div className="my-4">

                 <Link className="bi bi-pencil-square text-decoration-none"> Tasks</Link>

              </div>

               <div className="my-4">

                 <Link className="bi bi-calendar-date text-decoration-none"> Date</Link>

              </div>

               <div className="my-4">

                 <Link className="bi bi-gear-fill text-decoration-none"> Settings</Link>

              </div>

              </div>

              <div>

                <button onClick={handleSignout} className="btn btn-danger w-100">Signout</button>

              </div>

            </div>

            <div className="col-10">

                <div className="bg-light mt-1 p-3">

                    <div className="input-group">

                        <input type="text" onChange={handleSearchChange} placeholder="search appointments" className="form-control" />

                        <button className="bi bi-search btn btn-dark"></button>

                    </div>

                </div>

                 <div className="bg-light d-flex flex-row justify-content-between  flex-row mt-1 p-3">

                   <div className="d-flex flex-row">

                     <div>

                        <select className="form-select">

                            <option>Filter</option>

                        </select>

                    </div>

                    <div>

                        <select className="form-select mx-2">

                            <option>Sort</option>

                        </select>

                    </div>

                   </div>

                   <div>

                    <button data-bs-target="#shared" data-bs-toggle="offcanvas" className="btn btn-dark bi bi-share mx-2 position-relative"> <span className="badge bg-danger rounded rounded-circle position-absolute">{store.getState().appointmentsCount}</span> </button>

                    <div className="offcanvas offcanvas-end" id="shared">

                        <div className="offcanvas-header">

                            <h3>Shared Appointments</h3>

                            <button className="btn btn-close" data-bs-dismiss="offcanvas"></button>

                        </div>

                        <div className="offcanvas-body">

                            {

                                store.getState().appointments.map(appointment=><div className="my-3 fw-bold" key={appointment.id}> {appointment.title} [{appointment.user_id}] </div>)

                            }

                        </div>

                    </div>

                    <button data-bs-toggle="modal" data-bs-target="#newAppointment" className="btn btn-primary bi bi-plus-circle"> New Appointment</button>

                   </div>

                   

                   <div className="modal fade" id="newAppointment">

                        <div className="modal-dialog modal-dialog-centered">

                            <div className="modal-content">

                                <form onSubmit={formikAdd.handleSubmit}>

                                <div className="modal-header">

                                    <h3>New Appointment</h3>

                                </div>

                                <div className="modal-body">

                                        <input type="hidden" name="user_id" value={cookies['userid']} />

                                        <dl>

                                            <dt>Title</dt>

                                            <dd><input type="text" name="title" onChange={formikAdd.handleChange} className="form-control" /></dd>

                                            <dt>Description</dt>

                                            <dd>

                                                <textarea rows="4" name="description" onChange={formikAdd.handleChange} cols="40" className="form-control"></textarea>

                                            </dd>

                                            <dt>Date</dt>

                                            <dd>

                                                <input type="date" name="date" onChange={formikAdd.handleChange} className="form-control"/>

                                            </dd>

                                        </dl>

                                    

                                </div>

                                <div className="modal-footer">

                                    <button data-bs-dismiss="modal" type="submit" className="btn btn-primary">Add</button>

                                    <button data-bs-dismiss="modal" type="button" className="btn btn-danger mx-2">Cancel</button>

                                </div>

                                </form>

                            </div>

                        </div>

                   </div>

                </div>

                <div className="mt-4 d-flex flex-wrap">

                    {

                        (filteredAppointments.length===0)?<span>No Records Found</span>:

                        filteredAppointments.map(appointment=>

                            <div key={appointment.id} className="card w-25  p-2 m-2">

                                <div className="card-header fw-bold"> 

                                    {appointment.title.toUpperCase()}

                                </div>

                                <div className="card-body">

                                    <div>

                                        {appointment.description}

                                    </div>

                                    <div>

                                         {appointment.date}

                                    </div>

                                </div>

                                <div className="card-footer">

                                    <button onClick={()=> {handleEditClick(appointment.id)} } data-bs-toggle="modal" data-bs-target="#editAppointment" className="btn btn-warning mx-2 bi bi-pen-fill"></button>

                                   

                                    <button onClick={()=>{ handleDeleteClick(appointment.id)}} className="btn btn-danger bi bi-trash-fill"></button>

                                    <button  onClick={()=>{ handleShareClick(appointment) }} className="btn btn-dark bi bi-share mx-2"></button>

                                </div>

                                 <div className="modal fade" id="editAppointment">

                                            <div className="modal-dialog modal-dialog-centered">

                                                <div className="modal-content">

                                                    <form onSubmit={formikEdit.handleSubmit}>

                                                    <div className="modal-header">

                                                        <h3>Edit Appointment</h3>

                                                    </div>

                                                    <div className="modal-body">

                                                            <dl>

                                                                <dt>Title</dt>

                                                                <dd><input type="text" value={formikEdit.values.title} name="title" onChange={formikEdit.handleChange} className="form-control" /></dd>

                                                                <dt>Description</dt>

                                                                <dd>

                                                                    <textarea rows="4" value={formikEdit.values.description} name="description" onChange={formikEdit.handleChange} cols="40" className="form-control"></textarea>

                                                                </dd>

                                                                <dt>Date</dt>

                                                                <dd>

                                                                    <input type="date" value={formikEdit.values.date} name="date" onChange={formikEdit.handleChange} className="form-control"/>

                                                                </dd>

                                                            </dl>

                                                        

                                                    </div>

                                                    <div className="modal-footer">

                                                        <button data-bs-dismiss="modal" type="submit" className="btn btn-success">Save</button>

                                                        <button data-bs-dismiss="modal" type="button" className="btn btn-danger mx-2">Cancel</button>

                                                    </div>

                                                    </form>

                                                </div>

                                            </div>

                                    </div>

                            </div>



                            



                        )

                    }

                </div>

            </div>

        </div>

    )

}



 Toolkit Components

   a) createSlice()

   b) configureStore()

   c) useDispatch()

   d) getState()

   e) Provider 





   Issues with Javascript 

   - It is not strongly typed.

   - It is not implicitly strictly typed.

   - It is not an OOP language.

   - It provides limited extensibility and code level security. 





                                               Typescript Language

    - It is strongly typed language.

   - It is strictly typed language. 

   - It supports OOP features. 

   - It is used in building large scale applications. 

   - It is built with typescript. 

   - It is cross platform can run on any device and OS service. 

   - It can directly interact with hardware services. 

   - Anders Hejlberg is the architect of Typescript. He is known for C#, which is a 

     Microsoft OOP language.

   - It is not native to browser, It is trans compiled into Javascript. 



       Developer => Typescript => Trans compiled => Javascript => Browser

   

   Typescript Architecture 



Pasted Graphic.png



   1. Core Compiler 

       - It is responsible for compiling the TS code.

       - It checks for issues in code and reports the errors.        - It comprises of 

               a) core.ts

               b) program.ts

               c) scanner.ts

               d) emitter.ts

               e) checker.ts

               f) parser.ts 

   

   2. Standalone Compiler [tsc.ts]

       - It translates the TS code into Javascript. 

       

   3. Language Service [service.ts] 

       - Service is a set of factories.

       - Factory is a set of value and functions. 

       - Language Service provides all values and function required for TS. 



   4. TS Server [server.ts]

       - Server is required to host application.

       - To handle request and response. 

       

   5. VS Shim 

       - It makes TS platform independent.

       - You can run on any OS and device. 



   6. Managed Language Service 

       - Language code is compiled into            a) Un Managed 

           b) Managed 

       

       - Managed Language service provides set of values and function which are 

         cross platform. 



   Setup Environment for Typescript:

   1. Install Typescript for your PC

   

           C:\> npm install -g typescript 



   2. Check the version



           > tsc -v 

   

   3. Create a new folder for typescript project 

   

           D:\ts-project



   4. Open project folder in VS Code



   5. Run following commands from terminal

   

           > npm init -y             => generates package.json

           > tsc -init                    => generates tsconfig.json 



       tsconfig.json                => Typescript language analysis and configuration 



   6. Typescript program must have extension “.ts”



                       index.ts

   

   7. Trans compile into JS

   

                   > tsc   index.ts   --ignoreConfig  

                   > node index.js



   Typescript language concepts 

   1. Variables 

   2. Data Types

   3. Statements

   4. Operators 

   5. Functions 

   6. TS OOP
