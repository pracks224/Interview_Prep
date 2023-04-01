 ## About me

Hello, my name is Prakash. I am in the process of creating a repository to store all of my interview questions in one central location. This will allow me to better prepare for future interviews and keep track of the questions I have been asked in the past. I believe that this will also help me to identify patterns and areas where I may need to improve my skills. Thank you for your assistance in helping me to achieve this goal.

### Table of Contents
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
**[AWS](#aws)**<br>

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

## SQL

## Kubernetes

## Kafka

## Docker

## React Js

## AWS
