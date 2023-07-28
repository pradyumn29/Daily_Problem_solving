const express=require("express")
const router=express.Router();
const connection=require("../db/dbconnect")

//show 
router.get("/hotel",(req,resp)=>{
    connection.query("select * from hotel",(err,data)=>{
        if(err){
            resp.status(500).send("errr"+JSON.stringify(err))
        }else{
            resp.send(data);
        }
    })
})


//insert
router.post("/hotel/:hid",(req,resp)=>{
    connection.query("insert into hotel values(?,?,?)",[req.body.hid,req.body.hname,req.body.hprice],(err,data)=>{
        if(err){
            resp.status(500).send("errr"+JSON.stringify(err))
        }else{
            resp.send(data);
        }
    })
})

//udpdate

router.put("/hotel/:hid",(req,resp)=>{
    connection.query("update hotel set hname=?,hprice=? where hid=?",[req.body.hname,req.body.hprice,req.params.hid],(err,data)=>{
        if(err){
            resp.status(500).send("errr"+JSON.stringify(err))
        }else{
            resp.send(data);
        }
    })
})

//delete
router.delete("/hotel/:hid",(req,resp)=>{
    connection.query("delete from hotel where hid=?",[req.params.hid],(err,data)=>{
        if(err){
            resp.status(500).send("errr"+JSON.stringify(err))
        }else{
            resp.send(data);
        }
    })
})

//getById
router.get("/hotel/:hid",(req,resp)=>{
    connection.query("select * from hotel where hid=?",[req.params.hid],(err,data)=>{
        if(err){
            resp.status(500).send("errr"+JSON.stringify(err))
        }else{
            resp.send(data);
        }
    })
})


// router.get("/hotel/ass/:hnam",(req,resp)=>{
//     console.log('asdsd.............')
//     connection.query("select * from hotel where hname = ?",[req.params.hnam],(err,data)=>{
//         if(err){
//             console.log("hii")
            
//             resp.status(500).send("errr"+JSON.stringify(err))
//         }else{
//             console.log(data);
//             resp.send(data);
//         }
//     })
// })

router.get("/hotel/name/:hname",(req,resp)=>{
    connection.query("select * from hotel where hname=?",[req.params.hname],(err,data)=>{
        if(err){
            resp.status(500).send("errr"+JSON.stringify(err));
        }else{
            console.log(data);

            resp.send(data);
        }

    })
})

router.put("/hotel/update/:hname",(req,resp)=>{
    connection.query("update hotel set hprice=? where hname=?"[req.body.hprice,req.params.hname],(err,data)=>{
        if(err){
            resp.status(500).send("errr"+JSON.stringify(err));
        }else{
            console.log(data);

            resp.send(data);
        }
    })
})

//export

module.exports=router;