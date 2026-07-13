Typescript Types
Sudhakar Sharma (Sudhakar Sharma Naresh IT)
•
Jul 9
Summary

   - Typescript 

   - Architecture 

   - Setup 



  1. Variables 

       - Configuration is same as in JS.

       - It uses var, let & const. 

       - It requires data type to configure. 



       Syntax:

               let variableName : dataType;



       - Variable rules are same.



  2. Data Type

       - Types are same as in JS.

       - Primitive Types

           a) number 

           b) string 

           c) boolean 

           d) null 

           e) undefined 

           f) symbol 

           g) big int 

       - If data type is not defined then the type is “any”.

       - It supports type inference.

       - According to the value you initialized the data will be determined. 

       

           Syntax:

                   let  name;         // any 

                   name = 10;      // valid 

                   name = “A”;     // valid 

   

                   let price = 0;     // number 

                   price = 30;       // valid 

                   price = “A”;     // invalid 



   - Typescript supports UNION of types.



           Syntax:

                   let value:number | string | boolean;   

                   let name:string | null = prompt();



   - Number type and its methods are same. 

   - String type and its methods are same. 

   - Boolean can handle only “true or false” keywords. 



           Syntax:

               let stock:boolean = true;

               stock = false;      // valid 

               stock = 1;           // invalid 



   - Null and undefined are same. 

   - “bigint” requires “n” suffix. 

   - “symbol” is the type and memory is configured using “Symbol” constructor. 



           Syntax:

               let  id:symbol = Symbol();



   

   3. Non Primitive Types



   Array

   - It can be designed to handle various types as in JS.

   - It can be for same data type, which is strongly typed. 

   

   Syntax:

           let data:string[]; 

           let data:any[];



   - Memory is allocated using “[ ]” or “Array()”.

   - Array() constructor will not allow to initialize various types even when the data type

     is “any”. It will not allow to initialize but allow to assign. 

   

    Syntax:

           let  data:any[]   = [10, “A”, true];            // valid 

           let  data:any[]   = new Array(10, “A”);    // “A” is not valid all must be number 

           let data:any[] = new Array(“A”, 10);      // 10 is not valid all must be string 



           let data:any[] = new Array();

           data[0] = 10;

           data[1] = “A”;         // valid 

   

   - You can define union for array type. 

   - Union will not allow initialization of multiple types. It allows assignment. 



           let data:string[] | number[] = [10, “A”] ;       // invalid 

           data[0] = 10;

           data[1] = “A”;     // valid 



    - All array methods are same as in JS.

   

   Object

   - You can configure a schema for object. 

   - Schema refers to specified structure. 

   - Schema uses key and its type. 



    Syntax:

           let obj : { key:dataType } = {



           }



   - Every key is mandatory.

   - You can’t add new keys dynamically into data. 

   - You can configure optional keys by using “?” Null reference character. 



           let obj : { key?:dataType } = { }



   - You can configure “readonly” keys. 

   - It will not allow to assign after initialization. 



           let obj : { readonly key:dataType } = { }



   EX:

   

let product:{readonly Name:string, Price:number, Rating?:number} = {

    Name : "TV",

    Price : 45000

}

product.Price = 50000;

product.Name = "Samsung TV";             // Invalid - Name is “read-only”

console.log(`Price=${product.Price}`);



 Ex:



let product:{id:number, title:string, vendors:string[], rating:{rate:number}} = {



    id: 1,

    title: 'TV',

    vendors: ['A', 'B'],

    rating : {rate: 3.5}

}



   - All object manipulations are same as in JS.

   

   Array of Objects:

   - You can configure an array that handles multiple objects.

   - Every object requires a schema. 



   Syntax:

           let data : { } [] = [ { }, { } ];

Ex:



let data:{id:number, title:string}[] = [

    {id: 1, title: 'TV'},

    {id: 2, title: 'Mobile'}

]



   Date Type

   - It is defined by using Date constructor.

   - Data manipulation is same.

   - All date and time getter or setter methods are same. 



   Syntax:

           let today:Date = new Date(‘yy-mm-dd hrs:min:sec’);



           today.toDateString()

           today.getHours();

           etc..



   Map Type

   - It is a key and value collection. 

   - It can be used same as in JS where key can be any and value can be any.

   - It can be restricted to specified type of keys and values.

   - It is a generic type.



   Syntax:

       let data:Map<KeyT, valueT> = new Map();

       let data:Map<string, number> = new Map();

       data.set(“A”, 4000);        

       data.get(“A”)



   Ex:



let data:Map<number, string[]> = new Map();

data.set(1, ['A', 'B']);

data.set(2, ["C", "D"]);



   - All manipulations are same as in JS. 



   Regular Expression Type

   - It is a set of meta characters and quantifies enclosed in “/ /“

   - It is defined using “RegExp” interface. 



   Syntax:

       let pattern:RegExp = /^  $/;



 Ex:



let pattern:RegExp = /^\d{10}$/;

let mobile:string = "987654321";

if(mobile.match(pattern)){



}

   

   - Operators & Statements are same. 



                                                  Typescript Functions
