import logo from './logo.svg';
import './App.css';
import UserApp from "./component/UserApp";
import {Component} from "react/cjs/react.production.min";

class App extends Component{
  render(){
    return (
        <div className="container">
          <UserApp />
        </div>
    )
  }
}

export default App

// function App() {
//   return (
//     <div className="App">
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Edit <code>src/App.js</code> and HEY THERE!.
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           Learn React
//         </a>
//       </header>
//     </div>
//   );
// }
//
// export default App;
