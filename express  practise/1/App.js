const express=require("express")
const app=express()
const router=require("./router/router")
const bodyparser=require("body-parser")

app.use(bodyparser.urlencoded({extended:false}))
app.use(bodyparser.json())

app.use("/",router)

app.listen(3002,function(){
    console.log("connected to port 3002");
})

