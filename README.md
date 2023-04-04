 ## About me

Hello, my name is Prakash. I am in the process of creating a repository to store all of my interview questions in one central location. This will allow me to better prepare for future interviews and keep track of the questions I have been asked in the past. I believe that this will also help me to identify patterns and areas where I may need to improve my skills. Thank you for your assistance in helping me to achieve this goal.

### Table of Contents
**[Miscellenous](#miscellenous)**<br>
**[Core Java/OOPs](#java-oops)**<br>
**[Functional Program](#functional-programming-using-java)**<br>
**[Collections](#java-collections)**<br>
**[Multi Threading](#java-multi-threading)**<br>
**[System Design](#system-design)**<br>
**[Data Structure](#data-structure-using-java)**<br>
**[Micro Services Using Spring-Boot](#microservices-using-spring-boot)**<br>
**[SQL](#sql)**<br>
**[Kubernetes](#kubernetes)**<br>
**[Kafka](#kafka)**<br>
**[Docker](#docker)**<br>
**[React Js](#react-js)**<br>
**[JavaScript ES6](#java-script)**<br>
**[AWS](#aws)**<br>
**[ChatBot](#chatbot)**<br>

## Miscellenous

   -  << of any number is like multiplying by two. For ex : 3<<2 //12 -> 3 *2 = 6 then 6*2 = 12

## Java Script
<details>
  <summary>Important Interview Questions/Concepts!! </summary>
  
  1. #### How to create object in Javascript?
  ### Ans
  ```
   a) Creating objects using object literal syntax . key value pairs separated by ‘:’ inside a set of curly braces({ })
     const person = {
          firstName: 'testFirstName',
          lastName: 'testLastName'
          };
   b) Using new keyword; const person = new Object(); person.firstname ="Prakash"  
       Also, this practice is not recommended as there is a scope resolution that happens behind the scenes to find if the constructor function is built-in or user-defined. Difficult to create more object also.
   c) Using ‘new’ with user defined constructor function
      In this approach first create one function constructor and then create object.
      ex. function Person (firstname,lastaname){
                          this.firstname = firstname;
                          this.lastname = lastname;
                          }
           const personOne = new Person('testFirstNameOne', 'testLastNameOne');
           const personTwo = new Person('testFirstNameTwo', 'testLastNameTwo');
    d) Using Object.create() to create new objects
        This pattern comes in very handy when we are asked to create objects from other existing objects and not directly using the ‘new’ keyword.
        Object.create method, just remember that it takes two parameters. The first parameter is a mandatory object that serves as the prototype of the new object to be created. The second parameter is an optional object which contains the properties to be added to the new object.
        e.g. const orgObject = { company: 'ABC Corp' };
              And you want to create employees for this organization. Clearly, you want all the employee objects.
              const employee = Object.create(orgObject, { name: { value: 'EmployeeOne' } });

              console.log(employee); // { company: "ABC Corp" }
              console.log(employee.name); // "EmployeeOne"
     e) Using Object.assign() to create new objects
        The Object.assign() method is used to copy the values of all enumerable own properties from one or more source objects to a target object. It will return the target object.
const orgObject = { company: 'ABC Corp' }
const carObject = { carName: 'Ford' }
const employee = Object.assign({}, orgObject, carObject);
  
  ```
  2. #### Difference between Object.freeze() and const in JavaScript ?
  ### Ans
  ```
     The const keyword creates a read-only reference to a value. Variables created by the const keyword are immutable. In other words, you can’t reassign them to different values. Trying to reassign a constant variable will result in a TypeError.
     const name = "test" 
     name = "rrr" //TypeError: Assignment to constant variable.
     The const keyword ensures that the variable created is read-only. But It doesn’t mean that the actual value to which the const variable reference is immutable.
     const person = { name:"xyz"
     }
     person.name = "abc" - > no type error
     
     Object.freeze() method: If you want the value of the person object to be immutable, you have to freeze it by using the Object.freeze() method. 
     But it freeze only the existing values,however we can add new properties.
     const person = Object.freeze({
    name: 'Geeksforgeeks',
    address: {
        city:"Noida"
    }
});
person.address.country = "India"
console.log(person.address.country) // It will pring India ,even though it is already freezed.

  ```
  3. #### How to deep-freeze an object in JavaScript ?
  ### Ans [code](https://github.com/pracks224/Interview_Prep/blob/main/deepfreeze.js)
  
  4. #### Implement sum(2)(3)() (Currying funtions- is also a higher order function ?
  ### Ans [code](https://github.com/pracks224/Interview_Prep/blob/main/deepfreeze.js)
</details>

## Java OOps

## Functional Programming Using Java

## Java Collections

## Java Multi Threading

## System Design

<details>
  <summary>What is Consisten Hashing </summary>
  
  ### Algorithm
  1. Foo
  2. Bar
     * Baz
     * Qux

  ### Some Code
  ```js
  function logSomething(something) {
    console.log('Something', something);
  }
  ```
</details>

<details>
  <summary>Tiny Urls </summary>
  
  ### Design
  1. Foo
  2. Bar
     * Baz
     * Qux

  ### Some Code
  ```js
  function logSomething(something) {
    console.log('Something', something);
  }
  ```
</details>

## Data Structure Using Java

| Algorithms       | link to solutions           | Remarks  |
| ------------- |:-------------:| -----:|
| Invert the Binary Tree      | Tree | First Attempt - Fail |
| Reverse Level Order     | Tree      |   First Attempt - Done |
| Boat Two Save    | 2 pointer,Array      |   First Attempt - Done |
| Connect Nodes at same level    | Binary Tree     |   First Attempt - Fail |
| Kth smallest BST    | Binary SearchTree     |   First Attempt - Done |
|  Check Valid BST    | Binary SearchTree     |   First Attempt - ? |
|  Optimal String Partion    | Bit Manipulation,Hashing   |   First Attempt - done//Bit Manipulation Approach is much faster [solution link](https://github.com/pracks224/Interview_Prep/blob/main/OptimalStringPartion.java)  |

<details>
  <summary>Scramble String </summary>
  
  ### Algorithm
  Given two strings s1 and s2 of the same length, return true if s2 is a scrambled string of s1, otherwise, return false.

  ### Some Details
  ```
  Input: s1 = "great", s2 = "rgeat"
Output: true
Explanation: One possible scenario applied on s1 is:
"great" --> "gr/eat" // divide at random index.
"gr/eat" --> "gr/eat" // random decision is not to swap the two substrings and keep them in order.
"gr/eat" --> "g/r / e/at" // apply the same algorithm recursively on both substrings. divide at random index each of them.
"g/r / e/at" --> "r/g / e/at" // random decision was to swap the first substring and to keep the second substring in the same order.
"r/g / e/at" --> "r/g / e/ a/t" // again apply the algorithm recursively, divide "at" to "a/t".
"r/g / e/ a/t" --> "r/g / e/ a/t" // random decision is to keep both substrings in the same order.
The algorithm stops now, and the result string is "rgeat" which is s2.
As one possible scenario led s1 to be scrambled to s2, we return true.
  ```
</details>

<details>
  <summary>Remove a Loop from a Single List </summary>
  
  ### Algorithm -> Hint : Floyd Cycle Detection
  1. Visited Node Technique
  2. Hashing
     * Baz
     * Qux

  ### Some Code
  ```js
  function logSomething(something) {
    console.log('Something', something);
  }
  ```
</details>

**[⬆ Back to Top](#table-of-contents)**
                                                                                                               
## Microservices Using Spring Boot
<details>
  <summary>Basic Interview Question</summary>
  
  1. #### What is Spring Boot and what are its Benefits?
  2. #### What makes Spring Boot superior to JAX-RS?
  3. #### What Spring Boot features help develop Microservices Applications?
  4. #### Why Spring Boot is preferred over any other framework?
  5. #### What are the key dependencies of Spring Boot?
  6. #### What are the advantages of Spring Boot?
  7. #### What are the features of Spring Boot?
  8. #### How do you create a Spring Boot application using Maven?
  9. #### How do you create a Spring Boot project using Spring Initializer?
  10. #### How do you create a Spring Boot project using boot CLI?
  11. #### How do you create a simple Spring Boot application?
  12. #### What are the Spring Boot Annotations?
  13. #### What are the Spring Boot properties?
  14. #### What are the Spring Boot Starters?
  15. #### What is Spring Boot Actuator?
  16. #### What is thyme leaf?
  17. #### How to use thyme leaf?
  18. #### How do you connect Spring Boot to the database using JPA?
  19. ####  How to connect the Spring Boot application to a database using JDBC?
  20. #### What is @RestController annotation in Spring Boot?
  21. #### What is @RequestMapping annotation in Spring Boot?
  22. #### How do you create a Spring Boot application using Spring Starter Project Wizard?
  23. #### Spring Vs Spring Boot? Or Why Spring Boot over Spring?
  24. #### What annotations are used to create an Interceptor?
  25. #### What is a Swagger in Spring Boot?
  26. #### What are Profiles in Spring Boot?
  27. #### What differentiates Spring Data JPA and Hibernate?
  28. #### How are the @RestController and @Controller Annotation different?
  </details>
  <details>
  <summary>Advanced Interview Question</summary>
  
  ```diff
- Very Very Important Questions
```
  1. #### How does Spring Boot works?
  2. #### What does the @SpringBootApplication annotation do internally?
  3. #### What is the purpose of using @ComponentScan in the class files?
  4. #### How does a spring boot application get started?
  5. #### Can we create a non-web application in Spring Boot?
  6. #### Can we override or replace the Embedded tomcat server in Spring Boot?
  7. #### Can we disable the default web server in the Spring boot application?
  8. #### How to disable a specific auto-configuration class?
  9. #### Describe the flow of HTTPS requests through the Spring Boot application?
  10. #### What is the difference between RequestMapping and GetMapping?
  11. #### What is the use of Profiles in spring boot?
  12. #### What is Spring Actuator? What are its advantages?
  13. #### How to enable Actuator in Spring boot application?
  14. #### What are the actuator-provided endpoints used for monitoring the Spring boot application?
  15. #### How to get the list of all the beans in your Spring boot application?
  16. #### How to check the environment properties in your Spring boot application?
  17. #### How to enable debugging log in the spring boot application?
  18. #### Where do we define properties in the Spring Boot application?
  19. ####  What is dependency Injection?
  20. #### What is an IOC container?  
  </details>
  <details>
  <summary>Spring Security Interview Questions</summary>
  
  ```diff
- Very Very Important Questions
```
  1. #### What are some essential features of Spring Security?
  2. #### What is Spring security authentication and authorization?
  3. #### What do you mean by basic authentication?
  4. #### What do you mean by digest authentication?
  5. #### What do you mean by session management in Spring Security?
  6. #### Explain SecurityContext and SecurityContext Holder in Spring security.
  7. #### Explain spring security OAuth2.
  8. #### What do you mean by OAuth2 Authorization code grant type?
  9. #### What is method security and why do we need it?
  10. #### What do you mean by HASHING in spring security?
  11. #### Explain salting and its usage.
  12. #### What is PasswordEncoder?
  13. #### Explain AbstractSecurityInterceptor in spring security?
  14. #### Is security a cross-cutting concern?
  15. #### What is SpEL (Spring Expression Language)?
  16. #### Name security annotations that are allowed to use SpEL.
  17. #### Explain what is AuthenticationManager in Spring security.
  18. #### Explain what is ProviderManager in Spring security.
  19. ####  What is JWT?
  20. #### What is Spring Security Filter Chain?
  21. #### Explain how the security filter chain works.
  22. #### Name some predefined filters used in spring security and write their functions.
  23. #### What do you mean by principal in Spring security?
  24. #### Can you explain what is DelegatingFilterProxy in spring security?
  25. #### Can you explain what is FilterChainProxy in spring security?
  26. #### What is the intercept-url pattern and why do we need it?
  27. #### Does order matter in the intercept-url pattern? If yes, then in which order should we write it?
  28. #### State the difference between ROLE_USER and ROLE_ANONYMOUS in a spring intercept-url configuration.
  29. ####  State the difference between @PreAuthorize and @Secured in Spring security.
  30. #### State the difference between @Secured and @RolesAllowed.
  </details>
  
  <details>
    <summary>Book Review : Building Microservices (Designing Fine Grained System </summary>
    
 ### Key Points
  1. Domain Driven Design - Can you give one example
  2. Virtulization platform allow us to provison and resize our machine at will, with infrastructure automation giving us a way to handle at scale.
  3. What are Micro services?
     Ans: Small,autonomus services that work together.
  4. #### Key Benefits of Micro Services 
     - Technology Heterogenity
     - Resilinece -> If one component fails ,it wont cascade
     - Scaling  -> With monolithic, we have scale everything ,but here one small unit only
     - Ease of deployment
     - Organizational Allignments - NO large team,NO Large DB etc
     - Optimizing of replacibility - Easy replacement after reaching end of life
 
 #### How to Model Services
     1. Loose coupling and High cohesion makes a services good. 
        -  Whats is Loose coupling? Ans: When services are loosly coupled, a change in one service should not require a change in another.
        -  What is High cohesion? Ans: Related behaviors sit together. So we have to find out the boundaries within our problem domain that help ensures that related behaviours in one place.
     2. What do you mean by Bounded Context?
        Ans : A Bounded Context is a central pattern in DDD (Domain-Driven Design), which deals with collaboration across large models and teams. DDD breaks large models down into multiple contexts to make them more manageable. Additionally, it explains their relationship explicitly. The concept promotes an object-oriented approach to developing services bound to a data model and is also responsible for ensuring the integrity and mutability of said data model.   Eg. In Music corp - Finance and warehouse are two bounded context.
    3.  https://github.com/rootusercop/Free-DevOps-Books-1/blob/master/book/Building%20Microservices%20-%20Designing%20Fine-Grained%20Systems.pdf Page - 34
 
 **[⬆ Back to Top](#table-of-contents)**   
  </details>

## SQL

## Kubernetes

## Kafka
<details>
  <summary>Important Notes to revise</summary>  
 
  ```diff
    a) What is kafka Cluster? 
       - Group of Kafka brokers.  
    b) What is Kafka broker -> Its the server where Kafka instances are running.
    c) Producer -> Writes new data to the kafka cluster (data dal dega)
    d) Consumer - > Kaffka cluster se data utha ta hai
    e) Zookeeper -> Monitors the Kafka cluster health
    f) Connects -> If you have to pull data from external source ( configurable ). We dont need to write any code
    g) Stream -> to transformation the data 
 ```
 ##### Kafka Topics 
    - These are like tables of databse
    - They live inside the broker
    -  Producers produces the messages and send to topics
    -  Topics has partions
    - Producers can directly send the data to partion or topics
 
 ##### Kafka Partiontions 
 
    - Topics has many partions like p0 p1 p2 ..
    - Partions where actual messages stores.
    - While creating topics,number partions will be decided
    -  Partions are ordered and immutable sequence
    - Partions are in increased order id called offset
    - Each partion is independent of each other.
    - All the trannsactions stores in distributed log files.
 
 ##### How and why to send messages to KAFKA keys ?
 
    - When producers send messages to Topics/Partions , It will insert into Partions in  round robin fashion
      Producer - Send messages m1,m2,m3, m4
    - Let's say Topics has p1,p2 partions,Then messages will insert into p1 - m1 -> p2 - m2  -> p1- m3 -> p2 - m4 etc
      The problem with this approach is it fetches in unorders fashion. To avoid we have to pass the message with keys
 
   -  When message passed with keys, partiotoner created a hash and bind it to a prticular partion.
 
   - Key is optional . With out key sending messages wont guarntees the ordering of the message as the consumer poll the
     messages from all partions at the same time.
 
 #### Steps to work on Kafka
     
     -  Start zookeeper
     -  start the broker
     -  create the topic 
         > kafka-topics.bat --create --topic fruit --bootstrap-server localhost:9092 --replication-factor 1 -- partions 4
     - create producers
         > kafka-console-producers.bat --broker-list localhost:9092 --topic fruit --property "key.separator = -" --property "parse-key=true
     - same way create/register producers
 
 #### Understanding Consumer Offset, Consumer Groups, and Message Consumption in Apache Kafka
     
     -  In this section ,I will write about the process consumer consuing information from Partions
     -  Consumer Offset - Position of a consumer in a specific partition of topic. It represents the latest message consumer has read.
     -  When a consumer group reads a message from a topic, each member of the group mantains its own offset and updates it as it consumes message.
     -  when consumer created - > it will assigned with a group id . One consumer grouop can have multiple consumers.
     -  Ok, Each consumer mantains its own offset that is nothing but the bookmark of the last read . 
     - All the offset stores in _consumer_offset named topic. _consumer_offset is the builtin topic in apache kafka that keeps track of the latest offset commited forv each partion of each consumer group.
     - The information in _consumer_offset used by kafka for reliabity of the consumet groups and to ensure that messages are not lost or duplicated.
     - Important - There is separate __consumer_offset for each consumer group.
     - The group co ordinator uses this information to manage the assignment of partitions to consumers and ensure that each partion is being consumed 
     by exactly one consumer in the group.
     - when consumer joins a consumer group,it sends the join request to the group coordinator
     - The G.C will determine which partition the consumer assigned to be.
     - STICKY FASHION --> Consumer will assigned to the same partion until its on the same Consumer group.
 **[⬆ Back to Top](#table-of-contents)** 
 
 </details>


## Docker

## React Js

## AWS

**[⬆ Back to Top](#table-of-contents)**
