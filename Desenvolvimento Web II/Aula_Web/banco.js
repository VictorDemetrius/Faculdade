const Sequelize = require("sequelize")
const sequelize = new Sequelize("test", "root", "",{
    host: "localhost",
    dialect: "mysql"
})

sequelize.authenticate().then(function(){
    console.log("Conectado com sucesso!")
}).catch(function(erro){
    console.log("Falha ao conectar: "+ erro)
})

const Agendamentos = sequelize.define("agendamentos", {
    nome:{
        type: Sequelize.STRING
    },
    endereco:{
        type: Sequelize.STRING
    },
    bairro:{
        type: Sequelize.STRING
    },
    cep:{
        type: Sequelize.INTEGER
    },
    cidade:{
        type: Sequelize.STRING
    },
    estado:{
        type: Sequelize.STRING
    },
    observacao:{
        type: Sequelize.STRING
    }
})

//Agendamentos.sync({force : true})

Agendamentos.create({
    nome: "Victor Demetrius Marqueto",
    endereco: "Rua Gastão Vidigal",
    bairro: "Vila Amorim",
    cep: 08610080,
    cidade: "Suzano",
    estado: "São Paulo",
    observacao: "Teste para a aula"
})
    