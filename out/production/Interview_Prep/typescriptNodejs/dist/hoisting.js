function foo () {
    console.log(a);
  }
  //foo();
  let a = 20;
foo();  


let peter = new Person('Peter', 25); // ReferenceError: Person is  
                                     // not defined
console.log(peter);
class Person {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }
}