//import modules
const http=require("http");
const url=require("url");
const fs=require("fs");
const m1=require("./Calculation");
//create server

const server=http.createServer(function(req,resp){

     var q=url.parse(req.url,true);

     resp.writeHeader(200,{"content-type":"text/html"})
     switch(q.pathname){

        case "/home":
             var rs=fs.createReadStream("./public/calc.html");
             rs.pipe(resp);
             break;

        case "/Add":
            var a=parseInt(q.query.num);
            var b=parseInt(q.query.num1);

            var ans=m1.Add(a,b);
            resp.write("<h3>Addition:"+ans+"</h3>");
            resp.end();
            break;

        case "/Sub":
            var a=parseInt(q.query.num);
            var b=parseInt(q.query.num1);

            var ans=m1.Sub(a,b);
            resp.write("<h3>Substraction:"+ans+"</h3>");
            resp.end();
            break;

        case "/Mult":
            var a=parseInt(q.query.num);
            var b=parseInt(q.query.num1);

            var ans=m1.Mult(a,b);
            resp.write("<h3>Multiplication:"+ans+"</h3>");
            resp.end();
            break;

        case "/Div":
                var a=parseInt(q.query.num);
            var b=parseInt(q.query.num1);

            var ans=m1.Div(a,b);
            resp.write("<h3>Division:"+ans+"</h3>");
            resp.end();
            break;


            
           
     }
})
//start server

server.listen(3000,function(){
    console.log("port startedd");
})