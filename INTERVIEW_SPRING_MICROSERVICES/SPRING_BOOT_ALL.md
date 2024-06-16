**Table of content:**

<a id="ms-top"></a>

[Spring boot Features,Advantages and Implementation](#sb-1)
[What makes Spring Boot superior to JAX-RS?]() - SB no set up ,other spring project support etc.
[What Spring Boot features help develop Microservices Applications?]() => Autoconfiguration, embedded server,spring-boot-starter-web etc
[What are the key dependencies of Spring Boot?]()

- spring-boot-starter-parent => common configuration,versions,dependency managements etc
- spring-boot-starter-web
- spring-boot-starter-data-jpa,spring-boot-starter-data-mongodb
- spring-boot-starter-secuirty
- sbs-thymeleaf --> template engeienfor server-side rendering html
- actuator -> for metrics
  [Important Spring boot Annotations]()

<a id="sb-1"></a>

### Feature ,Advantages and Implementaion

- SB is a powerful framework which provides tool and conevntions to make easily production grade spring appls
- #### Features of SB
  - Auto Configuration : Eliminates the extensive need of xml. (@SpringBootApplication)
  - Standalone and run independelnly hence easy for deployments
  - Opinionated Defaults : Provides sesnsible default configuartions, but can override them when necessary
  - Microservice support becoz lighweight and embedded container support
  - It seamless integrate with other spring projects like Spring Data,Spring Security,Spring Cloud
