React Typescript Application
Sudhakar Sharma (Sudhakar Sharma Naresh IT)
•
8:39 PM
Typescript OOP

   - Contracts    

           interface

   - Templates

           abstract class

   - Components

           class 



                                                 Generics 

    - Generic refers to “type safe”. 

    - It is open for any type and strongly typed. 

    - You can define generic 

           a) function

           b) property

           c) method

           d) class 

   

    Syntax:

           function Name<type>(param : type)

           {



           }



           Name<number>(10);

           Name<string>(“A”);

           Name<number[]>([10, 20]);



 Ex:



interface IProduct

{

    Name:string;

    Price:number;

}

interface IEmployee

{

    FirstName: string;

    LastName: string;

}



function FetchData<T>(data:T)

{

    for(var property in data){

        console.log(`${property}: ${data[property]}`);

    }

}



FetchData<IProduct>({Name:'TV', Price:23000});

FetchData<IProduct[]>([{Name:'TV', Price:23000},{Name:'Mobile', Price:34000}]);





 Ex:

interface IOracle

{

    user:string;

    password:string;

    database:string;

}

interface IMongoDB

{

    url:string;

}



class Database<T>

{

    public ConnectionString:T|null = null;

    public Print(){

        for(var property in this.ConnectionString){

            console.log(`${property}: ${this.ConnectionString[property]}`);

        }

    }

}



let oracle = new Database<IOracle>();

oracle.ConnectionString = {user:'scott', password:'tiger', database:'empdb'};

oracle.Print();



let mongo = new Database<IMongoDB>();

mongo.ConnectionString = {url:'mongodb://127.0.0.1:27017'};

mongo.Print();

 

  Note: Operators are not allowed directly on generic type data. 

           You have to handle using functions. 



 Ex:

function Sum(a:any, b:any){

    return a + b;

}

function Demo<T>(a:T, b:T):T 

{

    return Sum(a,b);

}

Demo<number>(10, 20);



                                               Enumeration

   - Enum is a collection of constants. 

   - It can be a collection of number, string and expression. 

   - If enum is using number constants then it can implement auto based on previous 

     value. If there is no previous then it starts with “0”. 

   

    Syntax:

           enum  Name

           {

               Key = value,

               Key = value

           }

           Name.Key           // value 

           Name[value]       // key       reverse mapping 



   Ex:



enum StatusCodes

{

    Method = 199,

    OK,

    Notfound = 404,

    ServerError = 200,

}

console.log(`${StatusCodes.Notfound} : ${StatusCodes[404]}`);



Ex:



enum StatusCodes

{

    A = 10,

    B = 20,

    C = A + B

}

console.log(`Addition=${StatusCodes.C}`);



 Note: Module System is same. The latest version requires “type” for contract. 



 Syntax:

       export class Demo

       {

       }

       export interface IProduct

       {

       }



       import { Demo } from “module”;

       import { type IProduct } from “module”;





                                       React Typescript Project

   

       1. Open terminal 



       2. Run the command 

   

               > npm  create   vite@latest    react-ts-app



                        framework    : React

                        variant            : Typescript 



       3. Open project in VS code



       4. File system of React TS application comprises of new files 

   

                   a) tsconfig.app.json

                   b) tsconfig.node.json

                   c) tsconfig.json 



                   .tsx                    : components, hooks, routes, store, slicer

                   .ts                        : contracts, configuration files



       State

       - useState() is generic type. 



               const [uname, setUname] = useState<string>();                

       - If data is not initialized in state then it is designated as null type. 





               const [data] = useState<string[]>();

                       

               data?.map();

               data.map();           // invalid - not initialized hence it is null



               const [data] = useState<string[]>([ ]);



               data.map();

               data?map();       // valid 



 Ex: 

   src/contracts/FakestoreContract.ts





export interface FakestoreContract

{

    id:number;

    title:string;

    price:number;

    description:string;

    category:string;

    image:string;

    rating:{rate:number, count:number}

}



   src/app.tsx



import { useEffect, useState } from 'react'

import './App.css'

import { type FakestoreContract } from './contracts/FakestoreContract';

import axios from 'axios';



function App() {

   const [title] = useState<string>('React Typescript App');

   const [products, setProducts] = useState<FakestoreContract[]>([]);



   useEffect(()=>{

      axios.get(`https://fakestoreapi.com/products`)

      .then(response=>{

         setProducts(response.data);

      })

   },[])



  return (

   <div>

    <h2>{title}</h2>

    <ol>

       {

         products.map(product=> <li key={product.id}>{product.title}</li>)

       }

    </ol>

   </div>

  )

}



export default App





   - Data binding    

   - Style Binding 

   - Class Binding

   - Hooks  [tsx]

   - Routing  [tsx]

   - Redux [tsx]

   

   Event Binding:



       <button onClick={handleClick}>  Submit </button>

   

       function handleClick(e:BaseSyntheticEvent | any)

       {



       }



   

       Deployment & Testing     

       Next JS 

       React Native
