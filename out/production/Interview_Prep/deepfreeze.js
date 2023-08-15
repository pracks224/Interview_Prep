const obj = {
    key1: "val1",
    key2:"val2",
    key3: ["val1","val2","val3"]
}

obj.key3[0] = "testt change";
//console.log(obj1)


const deepfreeze = (obj) => {
   Object.keys(obj).forEach((prop) => {
    if(typeof obj[prop] == "object" && !Object.isFrozen(obj[prop])){
       deepfreeze(obj[prop]);
    }
   }
   )
   return Object.freeze(obj);
}

deepfreeze(obj)

console.log("Before Change");
  console.log(obj);
  obj.key3[0] = "val";
  obj.key3[1] = "val";
  obj.key3[2] = "val";
  console.log("After Change");
  console.log(obj);
