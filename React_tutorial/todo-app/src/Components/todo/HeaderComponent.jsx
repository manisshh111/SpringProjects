import { Link } from "react-router-dom";
import {AuthContext } from "./security/AuthContext";
import { useContext } from "react";

export default function HeaderComponent() {

    const authContext = useContext(AuthContext);
    console.log(authContext.number);

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
  