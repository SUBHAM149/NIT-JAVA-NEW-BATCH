React Class Components
Sudhakar Sharma (Sudhakar Sharma Naresh IT)
•
Yesterday
React Class Components 

 - Configuring component using class is not recommended in new code.

 - Class components are supported in new React but not recommended. 

 

 1. Class is configured with declaration or expression 



       class Name

       {



       }



 2. Class gets component behaviour by extending React.Component base 



       class  Login  extends React.Component / React.PureComponent

       {



       }



 3.  Configure a constructor for derived that calls super constructor. 



   

       {

           constructor() {

               super();

           }

       }



  4. Class must return JSX by using “render()” method. 



       export class Login extends React.Component

       {

           constructor() {

               super();

           }

           render() {

               return(

                       <div> </div>

                   )

           }

      }



 Ex: user-register.jsx



import React from "react";



export class UserRegister extends React.Component

{

     constructor(){

        super();

     }

     render(){

        return(

            <div className="container-fluid">

                <h3>User Register</h3>

            </div>

        )

     }

}



 State in Class:

   - Class is stateful.

   - It is having built-in state. 

   - State is configured while creating component object. 



       constructor() {



               this.state = { key: value }



       }



   - You can access using “this.state”



           { this.state.key } 



   - You set new value into state by using “this.setState()” method. 



           this.setState({  key: newValue })



   - Mount is defined by using the method 



           componentDidMount()

           {



           }



  Ex:

import React from "react";



export class UserRegister extends React.Component

{

     constructor(){

        super();

        this.state = {

            title : 'Class Demo',

            categories : ['All', 'Kids', 'Men']

        }

     }



     componentDidMount(){

        this.setState({title: 'Class Components in React'})

     }



     render(){

        return(

            <div className="container-fluid">

                <h3>{this.state.title}</h3>

                <select>

                    {

                        this.state.categories.map(category=><option key={category}>{category}</option>)

                    }

                </select>

            </div>

        )

     }

}



   - Style Binding, class binding, data binding all are same. 

   - AXIOS is same. 



 Ex:

import axios from "axios";

import React from "react";



export class UserRegister extends React.Component

{

     constructor(){

        super();

        this.state = {

            title : 'Class Demo',

            products: []

        }

     }



     LoadProducts(){

        axios.get(`https://fakestoreapi.com/products`)

        .then(response=>{

            this.setState({products: response.data});

        })

     }



     componentDidMount(){

        this.setState({title: 'Class Components in React'});

        this.LoadProducts();

     }



     render(){

        return(

            <div className="container-fluid">

                <h3>{this.state.title}</h3>

                <ol>

                    {

                        this.state.products.map(product=><li key={product.id}>{product.title}</li>)

                    }

                </ol>

            </div>

        )

     }

}



   Event Binding

   - Synthetic Events are same. 

   - Event subscriber is a method. 



               handleClick(e)

               {

               }



               <button onClick={this.handleClick} />

   - If event is using any state reference then it must bind with current class. 



            constructor() {

               this.handleClick = this.handleClick.bind(this);

           }



                           (or)

   

           <button onClick={this.handleClick.bind(this)} />



                           (or)



           <button onClick={ ()=> this.handleClick() } />



 Ex:

 import axios from "axios";

import React from "react";



export class UserRegister extends React.Component

{

     constructor(){

        super();

        this.state = {

            msg: ''

        }

        this.handleInsertClick = this.handleInsertClick.bind(this);

     }



     handleInsertClick(){

        this.setState({msg: 'Inserted'});

     }

     handleUpdateClick(){

        this.setState({msg: 'Updated..'});

     }

     handleDeleteClick(){

        this.setState({msg: 'Delete Successfully..'});

     }



     render(){

        return(

            <div className="container-fluid">

                <button onClick={this.handleInsertClick}>Insert</button>

                <button onClick={this.handleUpdateClick.bind(this)}>Update</button>

                <button onClick={()=>this.handleDeleteClick()}>Delete</button>

                <p>{this.state.msg}</p>

            </div>

        )

     }

}



   Forms:

       - You can’t use useFormik hook.

       - You can’t use React Hook Form Library 

       - You can use <Formik> component 



                   <Formik>

                   <Form>

                   <Field>

                   <ErrorMessage>



  Ex:

import axios from "axios";

import { Field, Form, Formik } from "formik";

import React from "react";



export class UserRegister extends React.Component

{

     constructor(){

        super();

        this.state = {

            

        }

     }



    

     render(){

        return(

            <div className="container-fluid">

                <h3>Register</h3>

                <Formik initialValues={{Name:'', Price:0}}  onSubmit={(data)=>{console.log(data)}}>

                    <Form>

                        <dl>

                            <dt>Name</dt>

                            <dd> <Field type="text" name="Name" /> </dd>

                             <dt>Price</dt>

                            <dd> <Field type="number" name="Price" /> </dd>

                        </dl>

                        <button type="submit">Submit</button>

                    </Form>

                </Formik>

            </div>

        )

     }

}



   Controlled Component

   - It is controlled by data from parent.

   - Class component has built-in Props. 

   - It is Object type.



   Syntax:

           <div> {this.props.key} </div>      Key is dynamic 

    

 Ex:

   controlled-components/side-bar.jsx



import React from "react";





export class SideBar extends React.Component

{

      constructor(){

         super();

      }

      render(){

        return(

            <nav style={{width:'200px'}}>

                <div>{this.props.brand}</div>

                <ul className="list-group">

                    {

                        this.props.items.map(item=><li className="list-group-item list-group-item-danger my-2" key={item}>{item}</li>)

                    }

                </ul>

            </nav>

        )

      }

}



  Class-components/user-register.jsx



import axios from "axios";

import { Field, Form, Formik } from "formik";

import React from "react";

import { SideBar } from "../controlled-components/side-bar";



export class UserRegister extends React.Component

{

     constructor(){

        super();

        this.state = {

            

        }

     }



    



     render(){

        return(

            <div className="container-fluid">

                <SideBar brand="Amazon" items={['Kids Fashion','Electronics', 'Footwear', 'Mobiles']} />

                <h3>Register</h3>

                <Formik initialValues={{Name:'', Price:0}}  onSubmit={(data)=>{console.log(data)}}>

                    <Form>

                        <dl>

                            <dt>Name</dt>

                            <dd> <Field type="text" name="Name" /> </dd>

                             <dt>Price</dt>

                            <dd> <Field type="number" name="Price" /> </dd>

                        </dl>

                        <button type="submit">Submit</button>

                    </Form>

                </Formik>

            </div>

        )

     }

}



                                               Unit Testing 



     - Testing is the process of verifying “AS-IS” with “TO-BE”.

   - “AS-IS” refers to what developer designed. 

   - “TO-BE” refers to what client wants.

   

               AS-IS === TO-BE    => Test Pass

               AS-IS !== TO-BE     => Test Fail 



   - There are various testing framework to test code and UI. 

           

               a) JEST

               b) Jasmine Karma

               c) Vitest
Class comments
