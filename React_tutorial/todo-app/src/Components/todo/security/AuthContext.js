import { createContext, useContext, useState } from "react";

//Create a context
export const AuthContext= createContext();

export const useAuth = () => useContext(AuthContext);
//If any other class wants to make use of Authentication context, it can use 'UseAuth' hook



//Share the created context with other components
export default function AuthProvider({children}){


    //Put some state in context
    const [number, setNumber]= useState(10);
     const[isAuthenticated, setAuthenticated] = useState(false);
    //  setInterval(
    //     ()=>setNumber(number+1),
    //     10000
    //  )
      
     const ValueToBeShared={number, isAuthenticated, setAuthenticated};

    return(
        <AuthContext.Provider value={ValueToBeShared}>
            {children}
        </AuthContext.Provider>
    )
}

