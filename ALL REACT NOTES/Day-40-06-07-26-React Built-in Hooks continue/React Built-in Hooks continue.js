React Built-in Hooks continue
Sudhakar Sharma (Sudhakar Sharma Naresh IT)
•
Jul 6
React Hooks

 - Custom Hooks

 - Built-in Hooks

   1. useEffect()

   2. useLayoutEffect()

   3. useInsertionEffect()



   4. useState()

       - It configures local state.

       - It is accessible from any location in the same component.

       - It is not accessible to child components. 

       - It returns a getter & setter



       Syntax:

         const [get, set] = useState();



   5. useRef()

       - It configures reference memory.

       - It can store data or function and use across requests.

       - It prevents round-trip by accessing function and data from cache. 



       Syntax:

           const  ref = useRef();

           ref.current = value / function;



           <input type=“text”  ref={ref} />

   

   6. useContext()

       - It can use context memory.

       - Context is created by using createContext().

       - It is used to avoid Props Drilling. 

       - It requires a context scope. 



       Syntax:

         let context = createContext(null);

   

         <context>

                   <child />

         </context>    



         let data = useContext(context);



       

   7. useMemo()

       - It can memoize the data.

       - Data is kept in a cache.

       - It is provided across multiple requests and avoids re-render. 

       - It can have dependencies.        - Data is updated into cache whenever dependency changes. 



       Syntax:

           let data = useMemo(()=>{ 

       

                   return data;



           },[dependency])

       

   8. useCallback()

       - It can memoize a function. 

       - Entire functionality is cached. 

       - You can use the function across multiple requests without re-render.

       - It improves performance of any function that is used across multiple requests. 



       Syntax:

           const ref = useCallBack(()=>{



                       // use a function ..



           },[ dependency ])



   9. useReducer()
