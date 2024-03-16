const CarDetails = ({marca, km, cor, ano}) => {
    return (
          <div>
              <h3>Carros</h3>
              <ul>
                  <li>Marca: {marca}</li>
                  <li>Km: {km}</li>
                  <li>Cor: {cor}</li>
                  <li>Ano: {ano}</li>
  
              </ul>
              {km>=10.000 ? (<p>Usado</p>) : (<p>Seminovo</p>)} 
          </div>
    )
  }
  
  export default CarDetails