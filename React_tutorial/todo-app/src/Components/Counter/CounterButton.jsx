import { useState } from "react";
import "./Counter.css";
import {PropTypes} from 'prop-types'

export default function CounterButton({by, incrementMethod, decrementMethod}){

    return(
        <div className="Counter">

         <button className="counterButton" onClick={()=> incrementMethod(by)}>+{by}</button>    //directly calling methods of Parent comp using arror functions
         <button className="counterButton" onClick={()=> decrementMethod(by)}>-{by}</button>
         


        </div>
    )
}


CounterButton.propTypes= {
    by: PropTypes.number
}