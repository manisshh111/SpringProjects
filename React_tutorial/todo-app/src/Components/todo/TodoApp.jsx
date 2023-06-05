import { useState } from "react";
import {BrowserRouter, Routes, Route, useNavigate, Navigate, useParams} from 'react-router-dom';
import "./TodoApp.css";

export default function TodoApp() {
  return (
    <div className="TodoApp">
     
     <BrowserRouter>
       <Routes>
        <Route path="/" element={<LoginComponent/>}></Route>
        <Route path="/welcome/:username1" element={<WelcomeComponent/>}></Route>
        <Route path="*" element={<ErrorComponent/>}></Route>
       </Routes>

     </BrowserRouter>

    </div>
  );
}

function LoginComponent() {
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

  const navigate= useNavigate();



  function handleSubmit() {
    if (Username === "manish" && Password === "password") {
      setShowSuccessMessage(true);
      setShowErrorMessage(false);
      navigate(`/welcome/${Username}`)
      
    } else {
      setShowSuccessMessage(false);
      setShowErrorMessage(true);
    }
  }

  return (
    <div className="login">
      {showSuccessMessage && <div className="successMessage"> Authenticated Successfully </div>}
      {/* the div will be shown only if showSuccessMessage is true  */}
      {showErrorMessage && <div className="errorMessage"> Bad credentials, Please check your username and password </div>}
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

function WelcomeComponent() {
  const {username1} = useParams();
  console.log(username1);
  return <div className="welcome">Welcome {username1}</div>;
}

function ErrorComponent() {
  return <div className="ErrorComponent">
    <h2>We are working really hard!</h2>
    <div>Appologies for the 404, Reach out to our team at ABC-DEF-GHI</div>
    </div>;
}

