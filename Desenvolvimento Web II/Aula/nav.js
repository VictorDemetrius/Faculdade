const express = require("express")
const app = express()

app.get("/cadastro",function(req, res){
    res.sendFile(__dirname + "/html/cadastro.html")
})

app.listen(8081, function(){
    console.log("Servidor Ativo")
})