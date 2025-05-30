# Spring Boot Interview Preparation

## Table of Contents
1. [Spring Boot Basics](#spring-boot-basics)
2. [Spring Boot Configuration](#spring-boot-configuration)
3. [Dependency Injection and IoC](#dependency-injection-and-ioc)
4. [Spring Boot Data Access](#spring-boot-data-access)
5. [Spring Boot Security](#spring-boot-security)
6. [Spring Boot REST APIs](#spring-boot-rest-apis)
7. [Spring Boot Actuator and Monitoring](#spring-boot-actuator-and-monitoring)
8. [Spring Boot Testing](#spring-boot-testing)
9. [Spring Boot Cloud Integration](#spring-boot-cloud-integration)
10. [Common Scenarios and Best Practices](#common-scenarios-and-best-practices)

---

## 1. Spring Boot Basics
- **What is Spring Boot?**
  - Benefits and Features
  - Difference between Spring and Spring Boot
- **Spring Initializr**
  - What is it?
  - How to generate a Spring Boot project
- **Auto-Configuration**
  - How does it work?
  - Disabling specific auto-configurations
- **Spring Boot Starter Dependencies**
  - Purpose and examples (e.g., `spring-boot-starter-web`, `spring-boot-starter-data-jpa`)
  
---

## 2. Spring Boot Configuration
- **Configuration Methods**
  - `application.properties` vs. `application.yml`
  - Profiles and environment-specific configurations
- **Externalized Configuration**
  - `@Value` and `@ConfigurationProperties`
  - Loading properties from different sources
- **Custom Configuration**
  - Defining beans using `@Configuration`
  - Conditional configuration (`@ConditionalOnProperty`, `@ConditionalOnMissingBean`)

---

## 3. Dependency Injection and IoC
- **What is Dependency Injection?**
  - Types of DI (Constructor, Setter, Field)
- **Spring Bean Scope**
  - Singleton, Prototype, Request, Session
- **Annotations**
  - `@Component`, `@Service`, `@Repository`, `@Controller`
  - `@Autowired`, `@Qualifier`, `@Primary`

---
### Q.11 Constructor Injection Vs Setter Injection

- Constructor Injection makes dependencies immutable meaning once object created,its dependencies can not be changed.
- Constructor Injection avoids null pointer exception , tesetble, Best suggested
- Setter Injection, if Spring uses public setter methods to inject dependencies after object construction. You may need to change the dependency after construction
- Field Injection used when Some libraries (e.g., some JPA providers, CDI, etc.) require a no-arg constructor, making constructor injection harder.


### Q.10 @primary vs @qualifier

#### Ans :
-  [More here](https://medium.com/@youeleven/understanding-primary-and-qualifier-annotations-in-spring-differentiating-bean-selection-de003735f4f9)
-  @Qualifier is used to specify which bean to inject when multiple candidates exist.
-  @Primary marks a bean as the default when no qualifier is specified.

### Q.10 @component vs @bean

- @Component is used to auto-detect and auto-register beans via classpath scanning, while @Bean is used in configuration classes to define beans manually.
- 

## 4. Spring Boot Data Access
- **Spring Data JPA**
  - Repository pattern
  - `JpaRepository` and `CrudRepository`
  - Query methods and `@Query` annotation
- **Database Connection**
  - Configuring data sources
  - H2 database for testing
- **Transactions**
  - `@Transactional` annotation
- **Spring JDBC**
  - Using `JdbcTemplate`

---
<a id="spring-boot-security"></a>
## 5. Spring Boot Security
- **Spring Security Basics**
  - Authentication and Authorization
  - In-memory authentication
  - Role-based access control
- **Custom Security Configuration**
  - `SecurityFilterChain` and `WebSecurityConfigurerAdapter`
  - Custom user details and password encoders
- **OAuth2 and JWT**
  - Implementing OAuth2 with Spring Boot
  - Creating and validating JWT tokens

---

## 6. Spring Boot REST APIs
- **Building REST APIs**
  - `@RestController`, `@GetMapping`, `@PostMapping`, etc.
  - Returning `ResponseEntity`
- **Request and Response Handling**
  - `@RequestBody`, `@PathVariable`, `@RequestParam`
- **Exception Handling**
  - `@ControllerAdvice` and `@ExceptionHandler`
- **Pagination and Sorting**
  - Using Spring Data JPA
- **Swagger/OpenAPI**
  - Documenting APIs with `springdoc-openapi` or Swagger UI

---

## 7. Spring Boot Actuator and Monitoring
- **Spring Boot Actuator**
  - Purpose and features
  - Common endpoints (`/actuator/health`, `/actuator/metrics`)
- **Custom Metrics**
  - Exposing custom health indicators and metrics
- **Integration with Monitoring Tools**
  - Prometheus, Grafana, or ELK Stack

---

## 8. Spring Boot Testing
- **Unit Testing**
  - Using JUnit and Mockito
- **Integration Testing**
  - `@SpringBootTest` annotation
  - Mocking dependencies
- **Test Utilities**
  - `MockMvc` for testing REST APIs
  - Embedded database for testing (H2)

---

## 9. Spring Boot Cloud Integration
- **Spring Cloud Overview**
  - Key components: Config Server, Discovery Server (Eureka), Gateway
- **Spring Boot with Microservices**
  - Service registration and discovery
  - Centralized configuration management
- **Circuit Breakers and Resilience**
  - Implementing resilience using Resilience4j or Hystrix
- **Distributed Tracing**
  - Using Sleuth and Zipkin

---

## 10. Common Scenarios and Best Practices
- **Performance Optimization**
  - Caching with `@Cacheable`
  - Connection pool management
- **Handling Large Data**
  - Streaming responses
  - Using chunk-based processing with Spring Batch
- **Best Practices**
  - Layered architecture
  - Avoiding circular dependencies
  - Logging and error handling


















**Table of content:**
--------------------- ------------------- ------------------ ------------
-----------------------------------------------------------------------------------
1. [SpringBoot Features]()
2. [SpringBoot Transaction](./E11_ORM_BACKENDDB_TRANSACTION.md)
3. [SpringBoot Secuirty]()







<a id="ms-top"></a>

[Spring boot Features,Advantages and Implementation](#sb-1)

- [What makes Spring Boot superior to JAX-RS?]() - SB no set up ,other spring project support etc.
- [What Spring Boot features help develop Microservices Applications?]() => Autoconfiguration, embedded server,spring-boot-starter-web etc
- [What are the key dependencies of Spring Boot?]()

  - spring-boot-starter-parent => common configuration,versions,dependency managements etc
  - spring-boot-starter-web
  - spring-boot-starter-data-jpa,spring-boot-starter-data-mongodb
  - spring-boot-starter-secuirty
  - sbs-thymeleaf --> template engeienfor server-side rendering html
  - actuator -> for metrics

- [Important Spring boot Annotations](#sb-2)
- [How do you handle configuration in Spring boot?](#sb-3)
- [@Retryable @Recover Anntation, features](#sb-4)
- [Spring Bean Life Cycle](#sb-5)
- [@Component vs @Bean ](#sb-6)
- [@component vs @service @repository](#sb-7)
- [What's the default retention policy?](#sb-8)
- [How do you handle thread safety in Spring Boot](#sb-9)
- [How request Spring Boot can Handle](#sb-10)
  - [Change default Tomcat conatiner to Jetty](#sb-10)
- [XML to Json libraries]()
- What is Spring Boot and what are its Benefits?
- What makes Spring Boot superior to JAX-RS?
- What Spring Boot features help develop Microservices Applications?
- Why Spring Boot is preferred over any other framework?
- What are the key dependencies of Spring Boot?
- What are the advantages of Spring Boot?
- What are the features of Spring Boot?
- How do you create a Spring Boot application using Maven?
- How do you create a Spring Boot project using Spring Initializer?
- How do you create a Spring Boot project using boot CLI?
- How do you create a simple Spring Boot application?
- What are the Spring Boot Annotations?
- What are the Spring Boot properties?
- What are the Spring Boot Starters?
- What is Spring Boot Actuator?
- What is thyme leaf?
- How to use thyme leaf?
- How do you connect Spring Boot to the database using JPA?
- How to connect the Spring Boot application to a database using JDBC?

<a id="sb-1"></a>

### Feature ,Advantages and Implementaion

- SB is a powerful framework which provides tool and conevntions to make easily production grade spring appls
- #### Features of SB
  - Auto Configuration : Eliminates the extensive need of xml. (@SpringBootApplication)
  - Standalone and run independelnly hence easy for deployments
  - Opinionated Defaults : Provides sesnsible default configuartions, but can override them when necessary
  - Microservice support becoz lighweight and embedded container support
  - It seamless integrate with other spring projects like Spring Data,Spring Security,Spring Cloud

<a id="sb-2"></a>

### Important Annotations SB

- @SpringBootApplication,@EnableAutoConfiguration,@Configuration
  @ComponentScan,@RestController,@Autowired

<a id="sb-4"></a>

### @Retryable,@Recover

- @Retryable with value as exception, other parameters like maxAttempt,BackOff etc. Generally useful while accessing remote service,db call,file operation etc

<a id="sb-8"></a>

### Retention Policy

- Three types SOURCE, CLASS,RUNTIME
- RetentionPolicy.SOURCE: Discard during the compile. These annotations don't make any sense after the compile has completed, so they aren't written to the bytecode.
  Example: @Override, @SuppressWarnings

RetentionPolicy.CLASS: Discard during class load. Useful when doing bytecode-level post-processing. Somewhat surprisingly, this is the default.

RetentionPolicy.RUNTIME: Do not discard. The annotation should be available for reflection at runtime. Example: @Deprecated

Default retention policy in spring is RUNTIME

### Handling exception Spring Boot

### Important

- @SpringBootApplication: It is a combination of three annotations @EnableAutoConfiguration, @ComponentScan, and @Configuration.
- @RestController: It can be considered as a combination of @Controller and @ResponseBody annotations.
- @RequestAttribute is a Spring annotation used to bind a method parameter to a request attribute. This annotation is often used in controllers to access attributes added to the request in a previous stage of request processing.
  request.setAttribute("user", "John Doe");
- ### How to change the port
  - application name and port. The port 8081 denotes that the application runs on port 8081.

<a id="sb-10"></a>

### How Many Requests Can Spring Boot Handle Simultaneously?

[More](https://medium.com/@haiou-a/spring-boot-how-many-requests-can-spring-boot-handle-simultaneously-a57b41bdba6a)

- No of request spring boot handles ,it depends on the embedded container
- Three main web container : Tomcat, Jetty, UnderTow
- UnderTow : Low Memory usage and High concurrency
- In summary, Tomcat is suitable for large applications due to its maturity and enterprise-level features;

Undertow excels in high-performance and low-memory usage, especially for high-concurrency short connection scenarios;

and Jetty is characterized by its lightweight, flexibility, and ease of embedding, suitable for rapid development and lightweight deployment.

- spring-configuration-metadata.json file has the default settigs
- Tomcat allows a maximum of 8192 connections (8192 = 8 \* 1024).
- So, the number of connections Spring Boot can handle simultaneously is equal to Tomcat’s maximum connections plus Tomcat’s maximum waiting number. i.e 8192 + 100/200/300 etc.
- Setting the Container to Jetty :
  In spring-boot-starter-web dependency exclude tomact and add Jetty/ Undertow depenceny

  #### Spring Web

  1. What is @RestController annotation in Spring Boot?
  2. What is @RequestMapping annotation in Spring Boot?
  3. How do you create a Spring Boot application using Spring Starter Project Wizard?
  4. Spring Vs Spring Boot? Or Why Spring Boot over Spring?
  5. What annotations are used to create an Interceptor?
  6. What is a Swagger in Spring Boot?
  7. What are Profiles in Spring Boot?
  8. What differentiates Spring Data JPA and Hibernate?
  9. How are the @RestController and @Controller Annotation different?
  10. How does Spring Boot works?
  11. What does the @SpringBootApplication annotation do internally?
  12. What is the purpose of using @ComponentScan in the class files?
  13. How does a spring boot application get started?
  14. Can we create a non-web application in Spring Boot?
  15. Can we override or replace the Embedded tomcat server in Spring Boot?
  16. Can we disable the default web server in the Spring boot application?
  17. How to disable a specific auto-configuration class?
  18. Describe the flow of HTTPS requests through the Spring Boot application?
  19. What is the difference between RequestMapping and GetMapping?
  20. What is the use of Profiles in spring boot?
  21. What is Spring Actuator? What are its advantages?
  22. How to enable Actuator in Spring boot application?
  23. What are the actuator-provided endpoints used for monitoring the Spring boot application?
  24. How to get the list of all the beans in your Spring boot application?
  25. How to check the environment properties in your Spring boot application?
  26. How to enable debugging log in the spring boot application?
  27. Where do we define properties in the Spring Boot application?
  28. What is dependency Injection?
  29. What is an IOC container?

1703. [Spring Reactive Flux]()
1704. [Spring Security](https://medium.com/@AlexanderObregon/common-java-spring-boot-security-interview-questions-and-answers-0513efb6fb12)

1705. [How to handle Exception in SpringBoot?](https://medium.com/@fullstacktips/exception-handling-in-spring-boot-using-controlleradvice-and-exceptionhandler-8dda72b33c45)
1706. [What is the @controllerAdvice/@restcontrolleradvice in springboot? - Exception Handling](https://medium.com/@fullstacktips/exception-handling-in-spring-boot-using-controlleradvice-and-exceptionhandler-8dda72b33c45)
1707. [How to do transaction management in Spring boot application?](https://www.scaler.com/topics/spring-boot/transaction-management-in-spring-boot/)
1708. [How Spring- Security works.](https://www.scaler.com/topics/spring-boot/spring-security/).
1709. [SpringBoot with OAuth2.How it works?](https://howtodoinjava.com/spring-boot2/oauth2-auth-server/)
1710. [How to do CORS configuration in Spring Boot ?](https://howtodoinjava.com/spring-boot2/spring-cors-configuration/)
1711. How to add Global CORS configuration for the application?
1712. What is the use @Configuration? //Bean Definitions
1713. What is a passwordEncoder ? // enforeces password encoding ,plain text password wont allowed
1714. CQRS design patterns in Microservices?
1715. Design a URL Shortner (tinyurl)
1716. [Design a web crawler.](https://github.com/preslavmihaylov/booknotes/blob/master/system-design/system-design-interview/chapter10/README.md)
1717. Design a notification System
1718. Describe the use case of JSON Web Token?
1719. [How can you disable the Autoconfiguration in Spring boot Application?](https://github.com/pracks224/Interview_Prep/edit/main/INTERVIEW_SPRING/springboot)
1720. [How do Microservice communicate each other?](https://medium.com/bitsrc/my-favorite-interservice-communication-patterns-for-microservices-d746a6e1d7de)
1721. [Describe the API Gateway design pattern for Micro service?](https://medium.com/@wahyubagus1910/api-gateway-design-pattern-implement-rate-limiting-and-circuit-breaker-on-microservices-9d777c778272)
1722. [Describe some principle of Mircro Service deployment?](https://github.com/pracks224/Interview_Prep/edit/main/INTERVIEW_SPRING/springboot)
1723. [Describe the Circuit Breaker Design Pattern?](https://medium.com/javarevisited/what-is-circuit-breaker-design-pattern-in-microservices-java-spring-cloud-netflix-hystrix-example-f285929d7f68)
