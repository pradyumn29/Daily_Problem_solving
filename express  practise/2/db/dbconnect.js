const mysql=require("mysql")

var connection=mysql.createConnection({
    host:'127.0.0.1',
    user:'root',
    password:'root123',
    database:'test',
    port:3306
});

connection.connect((err)=>{
    if(err){
        console.log("error"+JSON.stringify(err))
    }else{
        console.log("dabase connected")
    }
})

module.exports=connection;
