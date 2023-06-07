import axios from "axios";



export const retrieveHelloWorldBean= ()=>{
    return axios.get('http://localhost:8080/hello-world-bean');
}

export const retrieveHelloWorldPathVariable= (username)=>{
    return axios.get(`http://localhost:8080/hello-world/path-variable/${username}`);
}