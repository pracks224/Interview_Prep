**Table of content:**

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
