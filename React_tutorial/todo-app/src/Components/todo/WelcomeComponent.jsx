import {BrowserRouter, Routes, Route, useNavigate, Navigate, useParams, Link} from "react-router-dom";
export default function WelcomeComponent() {
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
  