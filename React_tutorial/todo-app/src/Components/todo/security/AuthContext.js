import { createContext, useContext, useState } from "react";
import { executeBasicAuthenticationService } from "../api/TodoApiService";
import { apiClient } from "../api/ApiClient";

//Create a context
export const AuthContext= createContext();

export const useAuth = () => useContext(AuthContext);
//If any other class wants to make use of Authentication context, it can use 'UseAuth' hook



//Share the created context with other components
export default function AuthProvider({children}){


    //Put some state in context

     const[isAuthenticated, setAuthenticated] = useState(false);
     const[usernameAuthContext, setUsernameAuthContext]= useState(null);
     const[token, setToken]= useState(null);



    async function login(Username, Password){
     
        const baToken = 'Basic ' + window.btoa(Username + ":" + Password);
       try{
       const response=  await executeBasicAuthenticationService(baToken)
        
        if (response.status==200) {
            setAuthenticated(true);
            setUsernameAuthContext(Username);
            setToken(baToken);

            apiClient.interceptors.request.use(
                (config)=>{
                    console.log('Intercepting and adding a token');
                    config.headers.Authorization=baToken
                    return config
                }
            )
              return true;
          } else {
            setAuthenticated(false);
            setUsernameAuthContext(null);
            setToken(null);
            return false;
          }

        }
        catch(error){
            setAuthenticated(false);
            setUsernameAuthContext(null);
            setToken(null);
            return false;
        }
    }



    function logout(){
          setAuthenticated(false);
          setToken(null);
    }

    return(
        <AuthContext.Provider value={{isAuthenticated, setAuthenticated, login, logout, usernameAuthContext, token}}>
            {children}
        </AuthContext.Provider>
    )
}

