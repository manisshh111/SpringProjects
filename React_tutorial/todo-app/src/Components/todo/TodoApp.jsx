import { useState } from "react";
import {
  BrowserRouter,
  Routes,
  Route,
  useNavigate,
  Navigate,
  useParams,
  Link
} from "react-router-dom";
import "./TodoApp.css";

export default function TodoApp() {
  return (
    <div className="TodoApp">
     
    

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

function WelcomeComponent() {
  const { username1 } = useParams();
  return (
    <>
      <div className="welcome">Welcome {username1}</div>
      <div>
        Manage Your Todos here:- <Link to="/todos">Go Here...</Link>
      </div>
    </>
  );
}

function ErrorComponent() {
  return (
    <div className="ErrorComponent">
      <h2>We are working really hard!</h2>
      <div>Appologies for the 404, Reach out to our team at ABC-DEF-GHI</div>
    </div>
  );
}

function ListTodosComponent() {
  const today = new Date();
  const targetDate = new Date(
    today.getFullYear() + 12,
    today.getMonth(),
    today.getDay()
  );
  const todos = [
    { id: 1, description: "Learn AWS", done: false, targetDate: targetDate },
    {
      id: 2,
      description: "Learn Full stack dev",
      done: false,
      targetDate: targetDate,
    },
    {
      id: 3,
      description: "Learn React and spring boot",
      done: false,
      targetDate: targetDate,
    },
  ];

  return (
    <div className="container">
      <h2>Things you want to do</h2>
      <div>
        <table className="table">
          <thead>
            <tr>
              <td>ID</td>
              <td>Description</td>
              <td>Done?</td>
              <td>Target Date</td>
            </tr>
          </thead>

          <tbody>
            {todos.map((todo) => (
              <tr key={todo.id}>
                <td>{todo.id}</td>
                <td>{todo.description}</td>
                <td>{todo.done.toString()}</td>
                <td>{todo.targetDate.toDateString()}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}


function HeaderComponent() {
  return (
      
<nav className="navbar navbar-expand-lg bg-body-tertiary">
  <div className="container-fluid">
    <a className="navbar-brand" href="#"><b>Todo App by Manish</b></a>
    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span className="navbar-toggler-icon"></span>
    </button>
    <div className="collapse navbar-collapse" id="navbarSupportedContent">
      <ul className="navbar-nav me-auto mb-2 mb-lg-0">
      <li className="nav-item"><Link className="nav-link" to="/welcome/Manish">home</Link>  </li>
      <li className="nav-item"><Link className="nav-link" to="/todos">Todos</Link>  </li>
      </ul>
     
    </div>
    <ul className="navbar-nav">
      <li className="nav-item"><Link className="nav-link" to="/logout">Logout</Link>  </li>
      <li className="nav-item"><Link className="nav-link" to="/">Login</Link>  </li>
      </ul>


  </div>
</nav>


);
}





    {/* <header className="header">
     <div className="container">
      <ul className="navbar-nav">
         <li className="nav-item"><a className="nav-link" href="https://www.google.com">CodeWithManish</a>  </li>
         <li className="nav-item"><Link className="nav-link" to="/welcome/Manish">home</Link>  </li>
         <li className="nav-item"><Link className="nav-link" to="/todos">Todos</Link>  </li>
         <li className="nav-item"><Link className="nav-link" to="/logout">Todos</Link>  </li>
         <li className="nav-item"><Link className="nav-link" to="/">Login</Link>  </li>
        

      </ul>
   
     </div>
    </header> */}


function FooterComponent() {
  return (
    <footer className="footer">
     <div className="container">
      Your Footer
     </div>
    </footer>
  );
}

function LogoutComponent() {
  return (
    <div className="logout">
     <p>You are logged out.</p>
     <p>Thank you for using our app</p>

    </div>
  );
}
