const express=require("express")
const router=express.Router();
const connection=require("../db/dbconnect")

router.get("/hospital",(req,resp)=>{
    connection.query("select * from hospital",(err,data)=>{
        if(err){
            resp.status(500).send("error in get"+JSON.stringify(err))
        }
        else{
            resp.send(data);
        }
    })
})

router.post("/hospital/:hid",(req,resp)=>{
      connection.query("insert into hospital values(?,?,?)",[req.body.hid,req.body.hname,req.body.hprice],(err,data)=>{
        if(err){
            resp.status(500).send("error in get"+JSON.stringify(err))
        }
        else{
            resp.send(data);
        }
      })
})

router.put("/hospital/:hid",(req,resp)=>{
    connection.query("update hospital set hname=?,hprice=? where hid=?",[req.body.hname,req.body.hprice,req.params.hid],(err,data)=>{
        if(err){
            resp.status(500).send("error in get"+JSON.stringify(err))
        }
        else{
            resp.send(data);
        }
    })
})

router.delete("/hospital/:hid",(req,resp)=>{
    connection.query("delete from hospital where hid=?",[req.params.hid],(err,data)=>{
        if(err){
            resp.status(500).send("error in get"+JSON.stringify(err))
        }
        else{
            resp.send(data);
        }
    })
})



module.exports=router;