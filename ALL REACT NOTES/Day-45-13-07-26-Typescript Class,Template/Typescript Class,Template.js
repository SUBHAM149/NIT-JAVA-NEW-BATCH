Typescript Class, Template
Sudhakar Sharma (Sudhakar Sharma Naresh IT)
•
8:50 PM
Summary

   - Typescript Architecture

   - Variables & Data Types 

   - Primitive & Non Primitive 

   - Operators & Statements 

   

                                           Typescript Functions



   - Function in TS must be defined with return type or void. 

   - Function parameters must be defined with data type. 



   Syntax:

           function Name(param: Type) : void | type

           {

   

           }



   - You can defined optional parameters. 

   - Optional parameter must be last in formal list. 



         function Name(param1:type, param2?:type)

         {



         }



   EX:



function Print(name:string, price?:number) : void

{

    if(price){

        console.log(`Name=${name}\nPrice=${price}`);

    } else {

        console.log(`Name=${name}`);

    }

}

Print("TV");

Print("Mobile", 12000);



   - All function topics are same as in JS. 

   - A function can return function.



   Syntax:

           function Name(): Function

           {

                return function() { }

           }



   

                                               Typescript Contracts

       - It defines rules for component.

       - Rules are designed as “interface”.

       - It is easy to reuse and extend rules. 

       - It can have only rules not implementation. 

           

        Syntax:

           interface Name

           {

               property: type;

               method: type;

           }

   

       - You can define optional rules by using “?”.

       - You can define readonly rules. 

       - You can implement rules from other contracts. 

       - It allows extending multiple contracts 



       Syntax:

           interface Contract extends  Contract1, Contract2

           {



           }

 EX:

interface ICategory

{

    CategoryName:string;

}

interface IVendor

{

    VendorName: string;

}



interface IProduct extends ICategory, IVendor

{

    Name:string;

    readonly Price:number;

    Stock?:boolean;

}

let tv:IProduct = {

   Name:  'TV',

   Price: 23000,

   CategoryName: 'Electronics',

   VendorName : 'SONY'

}

tv.Name = "Samsung TV";



       

                                               Typescript Class

   - Class members are same as in JS.

       a) Property

       b) Accessor        

       c) Method

       d) Constructor 

   

   Syntax:

           class Name

           {

              property = value;



              get AliasName() {

                return property;

              }

              set AliasName(newValue) {

                    property = newValue;

               }

               method() {



               }



               constructor() { }

           }



  Ex:



class Product

{

    Name:string = "TV";

    Price:number = 45000;

    Qty:number = 2;

    Total():number {

        return this.Qty * this.Price;

    }

    Print():void {

        console.log(`${this.Name}\n${this.Price}\n${this.Qty}\n${this.Total()}`);

    }

}

let obj = new Product();

obj.Print();



  - Class can have static and non-static members.

  - Static for continuous memory and non-static for discrete memory. 

   

   Syntax:

       class Name

       {

         static property: type = value;        // static

         property: type = value;                 // non static

       }    



  - Static member is accessed within or outside class by using class name.

  - Non static member is access within class by using “this” keyword and outside class

   by using instance of class. 

Ex:



class Demo

{

     static s:number = 0;

     n:number = 0;

     Print():void {

        Demo.s = Demo.s + 1;

        this.n = this.n + 1;

        console.log(`s=${Demo.s} n=${this.n}`);

     }

}



let obj1 = new Demo();

obj1.Print();



let obj2 = new Demo();

obj2.Print();



let obj3 = new Demo();

obj3.Print();



   - Typescript class members are defined with access modifiers 



           a) public

           b) private

           c) protected 



   - Public is accessible from any location and by using any object.

   - Private is accessible only within the class. 

   - Protected is accessible with in the class and from derived class using only

     derived class reference. 



   Ex:



class Product

{

   public Name:string = "TV";

   private Price:number = 23000;

   protected Stock:boolean = true;

   Print():void {



   }

}

class Derived extends Product

{

    Print(): void {

        let obj = new Derived();

        obj.Stock;      // protected

    }

}



let obj = new Derived();

obj.Name; // public



   - A class implements contract and extends another class. 

   - You can’t ignore the mandatory rules.    - But you can add new member that are not defined in contract. 

     [because class is a program template]



 Ex:

interface IProduct

{

    Name:string;

    Price:number;

    Qty:number;

    Total():number;

    Print():void;

}



class Product implements IProduct

{

    Name = "TV";

    Price = 34000;

    Qty = 2;

    Stock:boolean = true;

    Total(){

        return this.Qty * this.Price;

    }

    Print(){

        console.log(`${this.Name}\n${this.Price}\n${this.Qty}\n${this.Total()}`);

    }

}



let obj = new Product();

obj.Print();



   - Class can implement multiple contracts but can’t extend multiple classes. 

   

                                           Typescript Templates

   

   - Template hides the structure and provided only functionality. 

   - The process of hiding and providing functions is known as “Abstraction”. 

   - Abstract class can defined members both implement and need to be implemented.

   - You can’t modify the structure in component. You can just use. 



   Ex:

interface IProduct

{

    Name:string;

    Price:number;

    Qty:number;

    Total():number;

    Print():void;

}

abstract class ProductTemplate implements IProduct

{

    public Name:string = "";

    public Price:number = 0;

    public Qty:number = 0;

    public abstract Total():number;

    public abstract Print():void; 

}

class ProductComponent extends ProductTemplate

{

    Name = "TV";

    Price = 45000;

    Qty= 2;

    Total(){

        return this.Qty * this.Price;

    }

    Print(){

        

    }

}



                                       Typescript Generics & Enum
