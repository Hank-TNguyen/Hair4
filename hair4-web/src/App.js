import React from 'react';
import logo from './logo.svg';
import './App.css';

import Button from 'react-bootstrap/Button';

const handleClick = () => {
  fetch('http://localhost:8080/hello')
    .then(res => res.json())
    .then(data => console.log("Success: " + JSON.stringify(data)))
    .catch(err => console.log("Failure: " + JSON.stringify(err)))
};


function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <Button
          onClick={handleClick}
          >
          Click me
        </Button>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
