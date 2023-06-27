const express=require("express");
const connection=require("../db/connect");
const { json } = require("body-parser");
const router=express.Router();

//show employee
router.get("/employee",(req,resp)=>{
    connection.query("select * from employee",(err,data)=>{
        if(err)
        {
            resp.status(500).send("failed"+JSON.stringify(err));
        }
        else{
            resp.send(data);
        }
    })
})


//display blank form
router.get("/displayform",(req,resp)=>{
    resp.render("addemp");
})


//add employee

router.post("/insertEmployee",(req,resp)=>{

    var empid=req.body.empid;
    var ename=req.body.name;
    var sal=req.body.sal;
    connection.query("insert into employee values (?,?,?)",[empid,ename,sal],(err,data)=>{
        if(err)
        {
            resp.status(500).send("failed to add"+JSON.stringify(err));
        }
        else{
            resp.send(data);
        }
    })
})



//update employee
router.get("/edit/:eid",(req,resp)=>{
    connection.query("select * from employee where empid=?",[req.params.eid],(err,data)=>{
        if(err)
        {
            resp.status(500).send("Not reached"+JSON.stringify(err));
        }
        else{
            resp.send(data);
        }
    })
})

router.post("/updateEmp/:eid",(req,resp)=>{
    console.log(1)
    var empid=req.body.empid;
    var name=req.body.ename;
    var sal=req.body.sal;
    connection.query("update employee set name=?,sal=? where empid=?",[name,sal,empid],(err,data)=>{
        if(err)
        {
            resp.status(500).send("not updated"+JSON.stringify(err));
        }
        else{
            resp.send("udpdate success");
        }
    })
})

//delete
router.get("/delete/:eid",(req,resp)=>{
    console.log(2)
    connection.query("delete from employee where empid=?",[req.params.eid],(err,data)=>{
        if(err)
        {
            resp.status(500).send("not deleted"+JSON.stringify(err));
        }
        else{
            resp.send("ddleted")
        }
    })
})


//
module.exports=router;
