import { createContext, useContext, useState } from "react";

//Create a context
export const AuthContext= createContext();

export const useAuth = () => useContext(AuthContext);
//If any other class wants to make use of Authentication context, it can use 'UseAuth' hook



//Share the created context with other components
export default function AuthProvider({children}){


    //Put some state in context

     const[isAuthenticated, setAuthenticated] = useState(false);
    //  setInterval(
    //     ()=>setNumber(number+1),
    //     10000
    //  )
      

    function login(Username, Password){
        if (Username === "manish" && Password === "password") {
            setAuthenticated(true);
              return true;
          } else {
            setAuthenticated(false);
            return false;
          }
    }

    function logout(){
          setAuthenticated(false);
    }

    return(
        <AuthContext.Provider value={{isAuthenticated, setAuthenticated, login, logout}}>
            {children}
        </AuthContext.Provider>
    )
}

