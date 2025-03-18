1702. [Microfont end]()

1703. [Javascript Event Loop and Call Stack Explain?](https://www.knowledgehut.com/blog/web-development/node-js-event-loop)
1704. [How to create object in Javascript?](https://github.com/pracks224/Interview_Prep/blob/main/INTERVIEW_JAVASCRIPT/js_concepts)
1705. [Difference between Object.freeze() and const in JavaScript ?]()
1706. [How to deep-freeze an object in JavaScript ?](https://github.com/pracks224/Interview_Prep/blob/main/deepfreeze.js)
1707. [Implement sum(2)(3)() (Currying funtions- is also a higher order function](https://github.com/pracks224/Interview_Prep/blob/main/deepfreeze.js)
1708. [What is the difference between call(),apply() and bind() methods?](https://github.com/pracks224/Interview_Prep/blob/main/INTERVIEW_JAVASCRIPT/js_concepts)
1709. [How can you handle errors in Node.js, and what is the purpose of the error event in streams?](https://medium.com/@phamtuanchip/top-10-interview-question-for-node-js-senior-developer-c20bb80377a4)
1710. [What is a closure in JavaScript, and how is it relevant in Node.js?](https://medium.com/@phamtuanchip/top-10-interview-question-for-node-js-senior-developer-c20bb80377a4)
1711. [What is the difference between setTimeout and setImmediate in Node.js?](https://medium.com/@phamtuanchip/top-10-interview-question-for-node-js-senior-developer-c20bb80377a4)

1712. [What is event-driven programming in Node.js, and how does it work?](https://medium.com/@phamtuanchip/top-10-interview-question-for-node-js-senior-developer-c20bb80377a4)

1713. [Explain the difference between “require” and “import” in Node.js.?](https://medium.com/@phamtuanchip/top-10-interview-question-for-node-js-senior-developer-c20bb80377a4)

1714. [What is middleware in Express.js, and why is it important?](https://medium.com/@phamtuanchip/top-10-interview-question-for-node-js-senior-developer-c20bb80377a4)

1715. [What is a closure in JavaScript, and how is it relevant in Node.js?](https://medium.com/@phamtuanchip/top-10-interview-question-for-node-js-senior-developer-c20bb80377a4)

1716. [What is a closure in JavaScript, and how is it relevant in Node.js?](https://medium.com/@phamtuanchip/top-10-interview-question-for-node-js-senior-developer-c20bb80377a4)

1717. [What is a MicroTask Queue, Callback Queue,Event Loop,Execution Order?](#Node_Queue)

## Answer

### 1713.

- Does NOT block execution—the script can continue running while the module is being fetched.Uses Promises under the hood, so it can be awaited if needed. More efficient for performance, especially in the browser.

- Blocks execution until the module is fully loaded.The entire script waits for the required module before continuing.Slower for large modules since it must be loaded immediately.

- require is like commonJs style and import in ES6 style

```
const myModule = require('./myModule'); // Blocks execution until myModule is loaded

console.log("Before import");
import('./myModule.js') // Loads asynchronously
  .then((myModule) => {
    console.log("Module loaded", myModule);
  });
console.log("After import");
```

### 1717

- In JavaScript, asynchronous tasks are queued into two different queues:
- Microtask Queue → Higher priority (Executes before Callback Queue)
- Callback Queue (Macrotask Queue) → Lower priority
- What goes inside Microtask Queue?
  ✅ Promises (.then(), .catch(), .finally())
  ✅ process.nextTick() (Node.js only) → Runs before Promises
  ✅ MutationObserver (Web API for DOM changes)

🔹 Executed immediately after the current execution stack is cleared (before setTimeout, setInterval).

- What goes inside Callback Queue?
  ✅ setTimeout()
  ✅ setInterval()
  ✅ setImmediate() (Node.js only, runs after I/O phase)
  ✅ I/O callbacks (file system, network requests)
  ✅ UI rendering events (in browsers)

🔹 Executed only after Microtasks are completed.

```
console.log("A");

setTimeout(() => console.log("B"), 0);

Promise.resolve().then(() => console.log("C"));

console.log("D");

//Output ?

```

```
console.log("1");

setTimeout(() => console.log("2"), 0);

Promise.resolve().then(() => {
  console.log("3");
  setTimeout(() => console.log("4"), 0);
});

Promise.resolve().then(() => console.log("5"));

console.log("6");
//Output ?
```
