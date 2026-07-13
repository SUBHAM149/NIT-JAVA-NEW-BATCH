useReducer and Redux
Sudhakar Sharma (Sudhakar Sharma Naresh IT)
•
Jul 7
useReducer

   - It is used to handle global application state.

   - Every application comprises of 



                       Application_Start



                               Session_Start





                               Session_End

                               …

                               …



                       Application_End

   

   - It can store data and use across all components in application. 

   - It is available from application start to application end. 

   - It is accessible across multiple sessions. 

   - Application level state is managed my using following components



           1. Store

           2. State

           3. Reducer 

           4. Dispatcher 



   - Store    is the location where data is kept. 

   - State is responsible for accessing data from store and providing to application.

   - Reducer defines actions and handles data.

   - Dispatcher is responsible for carrying payload [data] from component to store

     using a reducer. 



   Syntax:

    1. Create a reference to store data globally. [Initial State]

   

               let  initialState = {

                       key : value, 

                       key : value          // any type of data

               }

       

     2. Create a reducer method 



               function reducer(state, action)

               {

                       switch(action.type)

                       {

                            case “A”:    

                                   data to update;

                            case “B”:

                                   data to update;

                       }

               }

   

    3. Configure dispatch in your component 



            let [state, dispatch] = useReducer(reducer, initialState);

           

            dispatch({ type: “A” });

            dispatch({ type: “B” });



           state.data





  Ex:  shop-home.jsx

import { useReducer } from "react"



let initialState = {

    shares : 0

}



function reducer(state, action){

    switch(action.type){

        case "share": 

        return {shares: state.shares + 1 }

    }

}



export function ShopHome(){

   

   

    let [state, dispatch] = useReducer(reducer, initialState);



    function handleShareClick(){

        dispatch({type:'share'});

    }



    return(

        <div className="container-fluid p-4">

            <img src="iphone-marine.webp" width="200" height="300" />

            <br/>

            <span className="fw-bold"> {state.shares} Shares</span> <button onClick={handleShareClick} className="btn mt-2 btn-warning bi bi-share"> </button>

        </div>

    )

}



   Issues:

   - Global application state is not predictable.

   - It is not easy to track.

   - It is difficult for developer to debug the application state. 

   - Not easy to reuse, maintain and test. 

   

                                               Redux Toolkit 

   - It is a Javascript library for global state management. 

   - It is predictable, scalable, debuggable, testable & maintainable. 

   - Toolkit provides end to end solution from building to debugging, testing & deploying.

   

   1. Download and Install Redux Toolkit for project



           > npm install  @reduxjs/toolkit   react-redux --save 



   2. Download and Install “Redux Dev Tools” extension for your browser 

   

   Setup Global State using Redux:



   1. Create a slicer

       - Slicer is a toolkit component.

       - It defines the initial state. 

       - It specifies the data to be stored in global application state.

       - It defines reducer.

       - Reducer defines the actions to perform.

       - Every reducer actions triggers a functionality, collects data [payload] and updates

         into global store. 

   

       Syntax:

         let initialState = { 

                   key : value

           }

        const  slicerName = createSlice({

               name : “name”,

               initialState,

               reducers: { 

                    actionName: (state, action)=>{

                            state.initialdata = action.payload;

                       }

               }

       })

      export const {actionName} = slicerName.actions;

      export default slicerName.reducer;

   

   2. Create Store



       - You have to create store to handle data from reducer. 

       - You can define store by using

               a) createStore [deprecated]

               b) configureStore [latest]
