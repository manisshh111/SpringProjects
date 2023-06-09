import axios from "axios";
import { apiClient } from "./ApiClient";


// /users/{username}/todos
export const retrieveAllTodosForUsernameApi = (username, token)=> apiClient.get(`/users/${username}/todos`);

export const deleteTodoApi = (username, id)=> apiClient.delete(`/users/${username}/todos/${id}`)

export const retrieveTodoApi = (username, id)=> apiClient.get(`/users/${username}/todos/${id}`)

export const updateTodoApi = (username, id, todo)=> apiClient.put(`/users/${username}/todos/${id}`, todo)

export const createTodoApi = (username, todo)=> apiClient.post(`/users/${username}/todos`, todo)

export const executeBasicAuthenticationService= (token) => apiClient.get(`/basicauth`, {
    headers: {
        Authorization: token
    }

})