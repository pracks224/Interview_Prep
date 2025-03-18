const EventEmitter = require('events');
const emitter = new EventEmitter();

emitter.on('myEvent',(data) =>{
    console.log(`Event received data: ${data}`)
});

emitter.emit('myEvent','Hello World');

function outerFunction(outerVariable){
    console.log("Outer Function===>",outerVariable);
    function innerFunction(){
        console.log(`${outerVariable} innner FUnctionss`);
    }
    return innerFunction;
}

const closure = outerFunction("Hellos");
closure();