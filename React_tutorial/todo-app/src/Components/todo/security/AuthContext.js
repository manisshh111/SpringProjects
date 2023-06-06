import { createContext, useState } from "react";

//Create a context
export const AuthContext= createContext();




//Share the created context with other components
export default function AuthProvider({children}){

    //Put some state in context
     const[number, setNumber] = useState(0);
     setInterval(
        ()=>setNumber(number+1),
        10000
     )

    return(
        <AuthContext.Provider value={{number}}>
            {children}
        </AuthContext.Provider>
    )
}

