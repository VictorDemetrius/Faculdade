
import {BrowserRouter, Routes, Route} from 'react-router-dom'
import Header from './components/Header'
import NavBar from './components/NavBar'
import Footer from './components/Footer'
import Home from './pages/Home'
import Sobre from './pages/Sobre'
import Contato from './pages/Contato'

function App() {
  return (
    <>
      <BrowserRouter>
          <Header/>
          <NavBar/>
          <Routes>
              <Route path = '/' element={<Home />}/>
              <Route path = '/Sobre.jsx' element={<Sobre />}/>
              <Route path = '/Contato.jsx' element={<Contato />}/>
          </Routes>
          <Footer/>
      </BrowserRouter>
    </>
  );
}

export default App;
