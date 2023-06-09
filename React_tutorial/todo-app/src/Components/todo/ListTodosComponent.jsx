import { useEffect, useState } from "react";
import {retrieveAllTodosForUsernameApi, deleteTodoApi} from './api/TodoApiService';
import { useContext } from "react";
import {useAuth} from "./security/AuthContext";
import { useNavigate } from "react-router-dom";


export default function ListTodosComponent() {
    const today = new Date();
    const targetDate = new Date(
      today.getFullYear() + 12,
      today.getMonth(),
      today.getDay()


    );
     
    
    const authContext= useAuth();
    const usernameFromAuthContext= authContext.usernameAuthContext.toString();
    console.log('username from auth context is :'+{usernameFromAuthContext});



    const[todos ,setTodos] = useState([]);

    // const todos = [
    //   { id: 1, description: "Learn AWS", done: false, targetDate: targetDate },
    //   { id: 2, description: "Learn Full stack dev", done: false, targetDate: targetDate},
    //   {id: 3, description: "Learn React and spring boot", done: false, targetDate: targetDate},
    // ];

    useEffect(()=> refreshTodos(), []);
    //useEffect hook is used to handle side effects, such as fetching data, manipulating the DOM, or subscribing to events.
    //The purpose of this callback is to execute the refreshTodos function whenever the component is rendered or re-rendered.
    //The useEffect hook takes two arguments: a callback function and a dependency array.

    const[message ,setMessage] = useState();

    const navigate= useNavigate();



  function refreshTodos(){

      retrieveAllTodosForUsernameApi(usernameFromAuthContext)
    .then((response)=>{
      console.log(response)
      setTodos(response.data)
    } 
    )
    .catch(error=>console.log(error))
    .finally(()=>console.log('CleanUp'));

    }
    


  function deleteTodo(TodoUsername, TodoId){
  deleteTodoApi(TodoUsername, TodoId)
    .then(()=>{
      setMessage(`Delete of todo with id= ${TodoId} successful`);
      refreshTodos()
    } 
    )
    .catch(error=>console.log(error))
    .finally(()=>console.log('CleanUp'));

    }

    function updateTodo(TodoUsername, TodoId){
       console.log(`Update with id = ${TodoId} clicked`);
       navigate(`/todo/${TodoId}`);
    
        }
  

  
    return (
      <div className="container">
        <h2>Things you want to do</h2>
        {message && <div className="alert alert-warning">{message}</div>}
        <div>
          <table className="table">
            <thead>
              <tr>
                <th>ID</th>
                <th>Description</th>
                <th>Done?</th>
                <th>Target Date</th>
                <th>Delete</th>
                <th>Update</th>
              </tr>
            </thead>
  
            <tbody>
              {todos.map((todo) => (
                <tr key={todo.id}>
                  <td>{todo.id}</td>
                  <td>{todo.description}</td>
                  <td>{todo.done.toString()}</td>
                  <td>{todo.targetDate}</td>
                  <td><button className="btn btn-warning" onClick={()=>deleteTodo(todo.username, todo.id)} >Delete</button></td>
                  <td><button className="btn btn-primary" onClick={()=>updateTodo(todo.username, todo.id)}>Update</button></td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>
    );
  }
  