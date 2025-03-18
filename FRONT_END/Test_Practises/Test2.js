const express = require('express');
const app = express();
const logger = (req,res,next) =>{
    console.log(`${req.method} request to ${req.url}`);
    next();
}
app.use(logger);
app.get('/',(req,res)=>{
    res.send('hello world');
})
app.listen(3000,()=>console.log('Server running on port 3000'));