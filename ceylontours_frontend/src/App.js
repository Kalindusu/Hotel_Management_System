import logo from './logo.svg';
import './App.css';
import React from 'react';
import { BrowserRouter as Router, Routes, Route, Navigate } from 'react-router-dom';
import FooterComponent from './component/common/Footer';
import HomePage from './component/home/HomePage';
import Navbar from './component/common/Navbar';

function App() {
  return (
    <div className="App">
      <Router>
      <Navbar/>
      <div className='content'>
        <Routes>
        <Route exact path="/home" element={<HomePage />} />
        </Routes>
      </div> 
      </Router>
      <FooterComponent/>
      
    </div>
  );
}

export default App;
