function sum(x) {
  return function(y) {
    if (y) {
      return sum(x + y);
    } else {
      return x;
    }
  };
}
console.log(sum(2)(3)())

//Using Arrow function
const sum = x=>y=>z=>{
    if(z)
      return sum(x+y)(z);
    else
       return x+y;
}
console.log(sum(2)(3)(5)())
