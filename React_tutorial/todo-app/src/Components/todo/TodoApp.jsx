import { useState } from "react";
import {BrowserRouter, Routes, Route, useNavigate, Navigate, useParams, Link} from "react-router-dom";
import "./TodoApp.css";
import LogoutComponent from './LogoutComponent'
import FooterComponent from "./FooterComponent";
import HeaderComponent from "./HeaderComponent";
import ListTodosComponent from "./ListTodosComponent";
import ErrorComponent from "./ErrorComponent";
import WelcomeComponent from "./WelcomeComponent";
import LoginComponent from "./LoginComponent";
import AuthProvider from './security/AuthContext'


export default function TodoApp() {
  return (
    <div className="TodoApp">
     
     <AuthProvider>

      <BrowserRouter>
      <HeaderComponent/>
        <Routes>
          <Route path="/" element={<LoginComponent />} />
          <Route path="/welcome/:username1" element={<WelcomeComponent />} />
          <Route path="*" element={<ErrorComponent />}></Route>
          <Route path="/todos" element={<ListTodosComponent />} />
          <Route path="/logout" element={<LogoutComponent />} />

        </Routes>
        <FooterComponent/>
      </BrowserRouter>

      </AuthProvider>

    </div>
  );
}






