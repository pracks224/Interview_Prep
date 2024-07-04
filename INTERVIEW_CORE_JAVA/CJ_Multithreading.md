### What is a thread in Java?

A thread in Java is a lightweight subprocess, the smallest unit of processing, used to perform multiple tasks concurrently within a program.

### How do you create a thread in Java? (Execrcise)

### What is the difference between a thread and a process?

- Process independent program with its own memeory space,heavy weight, process are isolate from each other
- Thread light weight ,samllest unit of program with shared memory

### Explain the lifecycle of a thread in Java.

new - runnable : call start
runnable - running : scheduled by the thread
running - blocked : calls wait/sleep
blocked - runnable - wait/sleep expires
running - terminated - run method completes

### How do you start a thread in Java?

### What are the ways to stop a thread in Java? Is Thread.stop() method safe to use?

### What is the difference between Runnable and Thread in Java?

### How can you synchronize threads to avoid race conditions and concurrent access issues?

### What is the purpose of the synchronized keyword in Java?

### Explain the concept of thread safety and how you achieve it in Java.

### Can you explain the wait(), notify(), and notifyAll() methods in Java?

### What is the purpose of the join() method in Java threads?

### How do you handle exceptions in threads? What happens if an uncaught exception occurs in a thread?

### What are the advantages and disadvantages of using threads in Java?

### How do you handle deadlock situations in Java threading?

### Can you explain the concept of daemon threads in Java?

### How do you ensure that a particular block of code is executed by only one thread at a time?

### How to set the Ideal Thread Pool size.

### What is the Java Memory Model (JMM) and how does it relate to multi-threading?

### Executor Framework. What's your understanding about it ?

### Whar is deadlock,livelock and starvation?

### Differnce between ReentrantLock and Synchronization?

### How to avoid Starvation ?

### What is Fairness and how to use it using ReentrantLock ?

### What are the performance implications of using ReentrantLock compared to synchronized?

6. [What is transient variable ?](https://www.scaler.com/topics/transient-variable-in-java/)
7. [Exchanger in Thread](https://medium.com/javarevisited/tricky-java-interview-questions-for-7-years-of-experience-c2d2bf37d746)
8. [Reader-Writer vs ReentrantReadWriteLock lock . And Which is more flexible to use? ](https://medium.com/javarevisited/tricky-java-interview-questions-for-7-years-of-experience-c2d2bf37d746)
9. [Volatile vs Atomic Vs Synchronized](https://medium.com/@erayaraz10/understanding-atomic-volatile-and-synchronized-variables-in-java-differences-and-use-cases-b12f519a4c4b)
10. [What is Thread Local Cache](https://codegym.cc/quests/lectures/questcore.level07.lecture05)
11. [Importance of Thread Local](https://medium.com/@fullstacktips/what-is-threadlocal-in-java-a51bdaaa6079)
12. [100 task 5 threads using executors and manual]()
13. [How threadpool executor works ?](https://www.digitalocean.com/community/tutorials/threadpoolexecutor-java-thread-pool-example-executorservice)

14. [What is the idean thread pool size](#14)

15. [FORKANDJOIN Vs EXECUTORS](#15)

16. [Types of Pool in Executor Service](#16)

<a id="14"></a>

#### Ideal Pool Size

CPU Intensive -> Number of Thread is equal to the number of cores
IO Intesive -> Thread nouber could be higher

<a id="15"></a>

#### ForkJoin Vs Executors

- ForkJoinPool and ExecutorService are both part of the Java concurrency framework and serve different purposes.

#### ExecutorService:

- General-Purpose Interface: ExecutorService is an interface that provides a higher-level interface for executing tasks asynchronously.

- Flexible Task Execution: It offers a more general approach to execute tasks. It doesn't specialize in any particular type of tasks.

- Task Submission: Allows submitting Runnable or Callable tasks for execution using methods like submit, invokeAll, or invokeAny.

- ThreadPool Implementations: It can be implemented by various types of thread pools like ThreadPoolExecutor.

- Control Over Threads: Provides more control over thread creation, termination, and pool size adjustments through configurations.

- Task Management: Allows managing the execution status of submitted tasks through Future objects.

Use Cases: Suitable for general-purpose asynchronous task execution where you have a mix of different types of tasks to execute.

#### ForkJoinPool:

- Specialized for Recursive Tasks: ForkJoinPool is designed specifically for parallelizing recursive algorithms by employing the divide-and-conquer strategy.

- Work Stealing Algorithm: Utilizes a work-stealing algorithm where threads can steal tasks from other threads' queues when idle.

- ForkJoinTask: Focuses on executing tasks that extend the ForkJoinTask class, enabling tasks to split themselves into subtasks.

- Task Synchronization: Provides mechanisms like join() to synchronize the completion of subtasks within a parent task.

- Ideal for Divide-and-Conquer: Well-suited for problems that can be split into smaller subtasks, enabling parallel execution.

- Automatic Thread Management: Typically manages its own pool of threads, automatically adjusting thread count based on workload.

- Use Cases: Best used for tasks that can be divided into smaller subtasks and benefit from parallel execution, such as recursive algorithms like quicksort, merge sort, matrix multiplication, etc.

When to Use Which:
General Tasks: For executing general asynchronous tasks, use ExecutorService.
Recursive Parallel Tasks: For problems that fit the divide-and-conquer model and can benefit from parallelization, ForkJoinPool is a better choice.

In summary, while both ExecutorService and ForkJoinPool belong to the Java concurrency framework and manage task execution, ExecutorService is more
general-purpose and flexible, while ForkJoinPool is specifically tailored for efficiently executing recursive, divide-and-conquer tasks in a parallelized manner.

<a id="16"></a>

#### Types of Pool in Executor Services

1.ScheduledThreadPool - Execute task after a specified delay or periodically
2.SingleThreadExecutor -> If you want the task to run sequence
3.CachedThreadPool -> Dynamically mantain the thread pool and removes the ideal threads
4.FixedThreadPool -> Useful when you have a specific number of tasks to execute and want to limit the number of concurrent threads.

### Executor FrameWork Questions:

#### What is ExecutorService in Java?
#### What are the benefits of using ExecutorService over managing threads manually?
#### How do you create an ExecutorService instance?
#### What are the differences between execute() and submit() methods in ExecutorService?
#### Explain the different thread pool implementations provided by ExecutorService.
#### How does shutdown() differ from shutdownNow() in ExecutorService?
#### What is the purpose of the submit() method in ExecutorService, and how do you retrieve the result of the task?
#### How do you handle exceptions thrown by tasks executed through ExecutorService?
#### What happens if you don't call the shutdown() method on an ExecutorService?
#### What is the purpose of the invokeAny() and invokeAll() methods in ExecutorService?
#### Explain the concept of thread pooling in ExecutorService and its benefits.
#### How can you control the number of threads in a thread pool created by ExecutorService?
#### What is the difference between a Runnable and a Callable in the context of ExecutorService?
#### How can you handle the cancellation of tasks submitted to ExecutorService?
#### Explain the purpose of the ScheduledExecutorService in Java and its applications.
#### How can you handle periodic execution of tasks using ScheduledExecutorService?
#### What is the purpose of the ThreadFactory interface, and how is it used with ExecutorService?

### Thread Synchronization Questions

#### What is thread synchronization, and why is it important in multi-threaded programming?
#### Explain the concept of race conditions in multi-threaded programs. How can you prevent race conditions?
#### What is the purpose of using the synchronized keyword in Java? How does it work?
#### What are the differences between using synchronized methods and synchronized blocks?
####  How can you achieve thread synchronization using the ReentrantLock class in Java?
#### What is the purpose of the volatile keyword in Java, and how does it relate to thread synchronization?
#### Explain the concept of deadlock in multi-threaded programming. How can you avoid deadlock situations?
#### What are the benefits and drawbacks of using locks (ReentrantLock) over synchronized blocks?
#### How does the wait() and notify() methods work in Java? Provide an example of their usage.
#### What is the purpose of the java.util.concurrent package in Java, and how does it help with thread synchronization?
#### Can you explain the usage of CountDownLatch and CyclicBarrier in thread synchronization?
#### How do you ensure thread safety in Java when multiple threads access a shared resource?
#### What are atomic operations, and how do they help with thread synchronization?
#### What is the difference between optimistic and pessimistic concurrency control?
#### Can you explain the Amdahl's Law and its relevance to parallel processing and thread synchronization?
#### Explain the concept of memory visibility in multi-threaded programming. How does the Java Memory Model (JMM) address this issue?
#### What are the differences between intrinsic locks (monitor locks) and explicit locks (ReentrantLock) in Java? When would you prefer one over the other?
#### Can you explain the use of the volatile keyword in detail? How does it ensure visibility and ordering of variables across threads?
#### What are the challenges of debugging and testing multi-threaded applications? How do you approach finding and fixing concurrency bugs?
#### What is thread starvation, and how can it be avoided in concurrent programs?
#### Explain the concept of ThreadLocal in Java. When and why would you use it in a multi-threaded application?
#### What is the purpose of the java.util.concurrent.atomic package? Provide examples of using atomic classes for thread-safe operations.
#### Can you explain the concept of Read-Copy-Update (RCU) and how it addresses read-write conflicts in concurrent data structures?
#### What is the purpose of the java.util.concurrent.locks package in Java, and how does it extend the locking capabilities beyond intrinsic locks?
#### Explain the concept of wait-free and lock-free algorithms in concurrent programming. Provide examples of both types of algorithms.
#### Can you discuss the concept of non-blocking algorithms and how they compare to traditional blocking algorithms in terms of performance and scalability?
#### What is the Java Fork/Join Framework, and how does it support parallel processing and task decomposition in multi-threaded applications?
#### Explain the concept of Software Transactional Memory (STM) and how it simplifies thread synchronization by providing a transactional approach.
#### How do you deal with the challenge of thread contention in high-concurrency applications? What techniques can be used to reduce contention and improve performance?
#### Can you discuss the concept of thread affinity and how it impacts thread scheduling and cache utilization in multi-core systems?
#### What is the purpose of the java.util.concurrent.CopyOnWriteArrayList class? How does it provide thread-safe access to a list?
#### Explain the concept of BlockingQueue in Java. How is it used for inter-thread communication and coordination?
#### What are the differences between CountDownLatch and CyclicBarrier? In which scenarios would you prefer one over the other?
#### Can you explain the concept of Semaphore and how it controls access to a shared resource among multiple threads?
#### What is the java.util.concurrent.Phaser class, and how does it enable advanced thread synchronization and coordination?
#### What are the benefits of using the java.util.concurrent.Exchanger class in Java? Provide an example of its usage.
#### Explain the concept of ReadWriteLock in Java. When would you use a read lock versus a write lock?
#### How do you handle thread synchronization when working with the java.util.concurrent.ConcurrentHashMap class?
#### What is the purpose of the java.util.concurrent.Semaphore class, and how is it different from using intrinsic locks?
#### Explain the concept of CompletableFuture in Java 8. How does it support asynchronous programming and chaining of tasks?
#### Discuss the concept of StampedLock in Java. How does it improve read-write synchronization in comparison to ReadWriteLock?
#### What is the purpose of the java.util.concurrent.Phaser class, and how does it enable advanced thread synchronization and coordination?
#### Can you explain how the java.util.concurrent.Exchanger class allows two threads to exchange data in a synchronized manner?
#### Discuss the java.util.concurrent.DelayQueue and how it is useful for scheduling delayed tasks in concurrent applications.
#### How do you ensure thread safety when working with the java.util.concurrent.PriorityBlockingQueue class?
