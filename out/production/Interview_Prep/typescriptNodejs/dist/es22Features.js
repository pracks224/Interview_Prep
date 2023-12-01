"use strict";
/*class Hello{
    field = 0;
    title: any;
}

const helloInstance = new Hello();
console.log('Field::',helloInstance.field);
console.log('tiles:',helloInstance.title);*/
class Hello {
    name;
    static #title = 'here'; // Private static field
    constructor(name) {
        this.name = name;
    }
    static getTitle() {
        return this.#title; // Access private static field
    }
}
const instance1 = new Hello('Instance 1');
const instance2 = new Hello('Instance 2');
console.log(instance1.name); // Output: Instance 1
console.log(instance2.name); // Output: Instance 2
//console.log(Hello.#title); // Error: Private static field '#title' is not accessible
console.log(Hello.getTitle()); // Output: here
let num = [1, 2, 3, 4, 5];
console.log(num.at(-1));
//# sourceMappingURL=es22Features.js.map