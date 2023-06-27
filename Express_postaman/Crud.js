const express=require("express");
const app=express();
const path=require("path");
const bodyparser=require("body-parser");
const router=require("./router/router");

//middle wares
app.use(bodyparser.urlencoded({extended:false}));

//configure aplication
app.set("views",path.join(__dirname,"views"));
app.set("view engine","ejs");
app.set(express.static(path.join(__dirname,"public")));

//add url
app.use("/",router);

//start server
app.listen(3002,function(){
    console.log("port connected to 3002");
})


