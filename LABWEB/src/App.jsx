
import {BrowserRouter, Routes, Route} from 'react-router-dom'
import Header from './components/Header'
import NavBar from './components/NavBar'
import Footer from './components/Footer'
import Home from './pages/Home'
import Sobre from './pages/Sobre'
import Contato from './pages/Contato'
import ShowUserName from './components/ShowUserName'
import CarDetails from './components/CarDetails.jsx'
import cars from './app.js'
function App() {
    /*const users = [
      {id:101, nome: "Amado Amoroso", idade : 41, profissao: "Secador de Gelo" },
      {id: 102, nome: "Maria Privada de Jesus", idade : 22, profissao: "Apalpadora de Face" },
      {id: 103, nome: "Alucinético Honorata", idade : 16, profissao: "Estudante" },
      {id: 104, nome: "Sebastião Salgado Doce", idade : 52, profissao: "Secador de Gelo" }
    ]*/
  
  return (
    <>
    <div>
        <ShowUserName name="Inocêncio Coitadinho"/>
        {cars.map((car)=>(
          <CarDetails key={car.id} marca={car.marca} km={car.km} cor={car.cor} ano = {car.ano}/>
        ))}
    </div>
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
