import React from 'react'

const UserDetails = ({nome, idade, profissao}) => {
  return (
        <div>
            <h3>Usuários</h3>
            <ul>
                <li>Nome: {nome}</li>
                <li>Idade: {idade}</li>
                <li>Profissão: {profissao}</li>

            </ul>
            {idade>=18 ? (<p>Já serviu no exército</p>) : (<p>Ainda vai servir o exército</p>)} 
        </div>
  )
}

export default UserDetails
