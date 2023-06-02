import logo from "./logo.svg";
import "./App.css";
import { Component } from "react";
import Counter from "./Components/Counter/Counter";

function App() {
  return (
    <div className="App">
      <Counter/>
    

      {/* <PlayingWithProps property1="value1" property2= "value2"/> */}
    </div>
  );
}


// function PlayingWithProps(properties){
//   console.log(properties.property1);
//   console.log(properties.property2);

//   return (
//     <div>Props</div>
//   )
// }

// function PlayingWithProps({property1, property2}){
//   console.log(property1);
//   console.log(
//     property2);

//   return (
//     <div>Props</div>
//   )
// }



export default App;
