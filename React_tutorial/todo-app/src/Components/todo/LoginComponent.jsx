import {BrowserRouter, Routes, Route, useNavigate, Navigate, useParams, Link} from "react-router-dom";
import { useState } from "react";
export default function LoginComponent() {
    const [Username, setUsername] = useState("manish");
  
    function handleUsernameChange(event) {
      setUsername(event.target.value);
    }
  
    const [Password, setPassword] = useState("password");
  
    function handlePasswordChange(event) {
      setPassword(event.target.value);
    }
  
    const [showSuccessMessage, setShowSuccessMessage] = useState(false);
    const [showErrorMessage, setShowErrorMessage] = useState(false);
  
    const navigate = useNavigate();
  
    function handleSubmit() {
      if (Username === "manish" && Password === "password") {
        setShowSuccessMessage(true);
        setShowErrorMessage(false);
        navigate(`/welcome/${Username}`);
      } else {
        setShowSuccessMessage(false);
        setShowErrorMessage(true);
      }
    }
  
    return (
      <div className="login">
        {showSuccessMessage && (
          <div className="successMessage"> Authenticated Successfully </div>
        )}
        {/* the div will be shown only if showSuccessMessage is true  */}
        {showErrorMessage && (
          <div className="errorMessage">
            {" "}
            Bad credentials, Please check your username and password{" "}
          </div>
        )}
        <div className="LoginForm">
          <div>
            <label>User Name</label>
            <input
              type="text"
              name="username"
              value={Username}
              onChange={handleUsernameChange}
            />
          </div>
  
          <div>
            <label>Password</label>
            <input
              type="password"
              name="password"
              value={Password}
              onChange={handlePasswordChange}
            />
          </div>
  
          <div>
            <button type="button" name="login" onClick={handleSubmit}>
              {" "}
              Login{" "}
            </button>
          </div>
        </div>
      </div>
    );
  }
  