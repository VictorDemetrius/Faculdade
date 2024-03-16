import React from 'react'
import {Link} from 'react-router-dom'
import './NavBar.css'
const NavBar = () => {
  return (
    <nav>
        <Link to="/">Home</Link>
        <Link to="/Sobre.jsx">Sobre Nós</Link>
        <Link to="/Contato.jsx">Contato</Link>
    </nav>
  )
}

export default NavBar
