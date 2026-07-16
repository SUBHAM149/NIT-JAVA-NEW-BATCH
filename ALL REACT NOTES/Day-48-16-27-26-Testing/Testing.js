Testing
Sudhakar Sharma (Sudhakar Sharma Naresh IT)
•
8:32 PM
Testing React App







    - Testing is the process of verifying AS-IS with TO-BE.



   - AS-IS refers to developer design. 



   - TO-BE refers to the client requirement. 







               AS-IS === TO-BE          Test Pass



               AS-IS !== TO-BE           Test Fail 







   - React testing includes components, hooks, store, services, slicers etc.



   - Testing React application requires various frameworks like



           a) Jasmine Karma



           b) Vitest 



           c) JEST 



   



   Setup Environment for Vitest in React







     1. Install Testing framework for project 







      > npm install  vitest @testing-library/react @testing-library/jest-dom  jsdom --save-dev











           vitest                            : installs the core testing library



           testing-library/react        : enables testing for react 



           jest-dom                        : provides access to virtual DOM



           jsdom                            : provides access to actual DOM



         







   2. Create a new file and add into “src” folder   







                           “setupTests.js”







                   import '@testing-library/jest-dom';











    3. Go to "vite.config.js" in SRC folder and add the following properties







       test: {



            globals: true,



            environment: 'jsdom',



            setupFiles: ['./src/setupTests.js']



         },







           https://vitest.dev/config/







    4. Go to “package.json”







           scripts {



               “test” : “vitest” 



           }







   5. Go to your “login” component folder and add 



   



                   “login.test.jsx”







import { render, screen } from "@testing-library/react";



import { expect, test } from "vitest";



import { UserLogin } from "./user-login";











test('Login Title Test',()=>{







      render(<UserLogin />);







      let title = screen.getByTestId("title");



      expect(title).toHaveTextContent("Customer Login");







})







test('Forgot Password Link Test',()=>{







    render(<UserLogin />);







    let link = screen.getByText(/Forgot Password/);



    expect(link).toBeInTheDocument();



    expect(link).toHaveAttribute('href','/forgot');







})











           > npm run test
Class comments
