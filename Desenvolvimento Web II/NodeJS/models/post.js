const db = require("./banco")

const Cadastro = db.sequelize.define("cadastros", {
    nome:{
        type: db.Sequelize.STRING
    },
    telefone:{
        type: db.Sequelize.BIGINT
    },
    origem:{
        type: db.Sequelize.STRING
    },
    data:{
        type: db.Sequelize.DATE
    },
    observacao:{
        type: db.Sequelize.STRING
    }
})
//Cadastro.sync({force: true})

module.exports = Cadastro