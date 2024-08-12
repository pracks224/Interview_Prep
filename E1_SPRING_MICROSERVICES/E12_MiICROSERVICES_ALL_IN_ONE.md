**Table of content:**
<a id="ms-top"></a>

- [Tools and Framework Used in MS](#ms-tools)
  - [Scenarios when Configuration Management Tools used](#ms-configs)
- [12 Factor App Methodology](#ms-12)
- [Conway's Law](#con-way)
- [Essential Components of MicroServices](#com-ms)
  - [Moving monolith to Microservices](https://launchdarkly.com/blog/migrating-legacy-monolithic-applications-microservices/)
  - [Monolithic can not be scalable, why?Tight Coupled]()
- Importance Reports and Dashboards in Microservices
- [Cohesion Vs Coupling](#ms-coh-cup)
- Key challenges migrating from monolithic to Micoservice
- [Event Sourcing](#ms-1)
- [Data Consistency in a microservices ](#ms-cons)
- Handle/Manage Large Data Set in a Microservices
- [When we say Well Designed MS](#ms-design)
- [Event Driven Architecture]()
- [Domain Driven Design DDD in Micro Services]()
- [Versioning in Microservices]()
- Microservice vs ServerLess Architecture
- [Acheive Auto Scaling in a Micro Services]
- [Security In MS](#ms-secuirty)

  - Prevent Distributed DDos
  - JWT for Authentication and Authorization
  - Principles of Zero Trust Security Model
  - Best Practises to handling secuirty and vulnerabilities
  - How to implement distributed Authorization

- [Challenges In MS](#ms-challenegs)
- [Fault Tollerency in MS](#ms-fault-recovery)
  - Hystrix
  - Staregies for Fault Isolation
- [Versioning of MS](#ms-versioning)
- [Log Aggregation](#ms-log-aggregation)

- [Microservice Patterns](#ms-patterns)

- Distributed Tracing By Spring Cloud Sleuth
- Handle CORS in Micro Service
- Spring Cloud
  - Spring Cloud Gateway
  - Spring Cloud Config
- Communication Between Micro Services

  - Synchronous
  - Asynchronous
  - Trade off between Syncronous and Asynchronous
  - Differenr approach service to service cmmnication

- Dockerize a MicroService
- Disaster Recovery Startergies
- Backward Compatibility while Rolling out microservices
- Deployment Startergy

  - Canary Deployment
  - Feature Flags
  - Blue-Green Deployments
  - Rollback Deployment Startergy

- Testing Microservices
  - Service Virtualization in End to End Testing
  - Challenges of testing and how to overcome it
- Identify Performance Bottleneck in Microservices
  - What are the Key Perfomance Matrics
  - Differnce between Monitoring and Observability.
- [Caching in MicroServices](#ms-caching)
- Service Orcherstartion and Choreography in Micro services
-

<a id="ms-tools"></a>

### Popular Tools and Frameworks used in Micro services? [TOP](#ms-top)

- Spring Boot
- Node Js
- Docker
- Kubernetes
- Istio
- Netflix OSS
  - Eureka Service Discovery
  - Ribbon client side load balancing
  - Hystrix
- RabbitMQ,Kafka
- Promethus,Grafana - Monitoring tool
- Consul,etcd - Distributed Key Value store
- ELK Stack
- Micronaut
- Linkerd

<a id="ms-1"></a>

### Event-Sourcing [TOP](#ms-top)

- [source](https://medium.com/@ronen.albagli/event-sourcing-made-simple-a-high-level-overview-ed3d6fc01711#:~:text=Event%20Sourcing%20is%20a%20design,any%20given%20point%20in%20time.)
- Design pattern capturing events from differnt source or services and stores. To tackle the challnges of large data volumes of events we can use SNAPSHOT (consolidating after scertain number of events),CQS or CQRS (Command query serparation) for read and write events to attain eventual consistency.
- Technollogy can be used like Kafka to store the events as logs.

<a id="ms-cons"></a>

### Data Consistency In Micro Services [TOP](#ms-top)

[source](https://dilfuruz.medium.com/data-consistency-in-microservices-architecture-5c67e0f65256)

- Data Consitency challenging in micro services as we have databse per service compared to monolithic where db is central
- To manage distributed transaction , in case of MSs we have multiple approach
  ### 2Phase Commit
  - Ensures Tight consistecny but latency is more becoz of blocking nature . And Single point of failure becoz of the transaction coordinator.Based on ACID
  - Eventual Cositency
    - It follows BASE (Basically Available,Soft-State,Eventual COnsistency)
    - SAGA is the common pattern to acgeive the ES
    - Two types Choreography-based -> Uses EVENT SOURCING for each events
      Orchestration based -> Compensation action if it fails
      Framewrok supports SAGA => Apache Camel ,Camunda

<a id="ms-design"></a>

### Well Design Microservice Characterstics [TOP](#ms-top)

- Important charactersics of wel designed MS
  - Single Responsibility Principle
  - Loose Coupling (reduce dependency between component)
  - Independent Deployment
  - Resilience (Handle failure gracefully and recover from error without impacting entire system)
  - Scalability (Horizonatl Scalability ,ensure best resource utiloization)
  - Polyglot persistence Different MS can use different database based on requirement
  - Monitoring and Observality : loging and robust monitoring.

<a id="ms-secuirty"></a>

### How to secure Microservices or what are the differnce approaches ? [TOP](#ms-top)

- [Ways to secure](https://medium.com/decathlondigital/api-security-diving-into-authentication-and-json-web-token-2387c6d49d3c)
- [Implement startergy](https://medium.com/microservices-learning/how-to-implement-security-for-microservices-89b140d3e555)

<a id="ms-challenegs"></a>

### Challenges faced while developing Micro services.

<a id="ms-fault-recovery"></a>

### How do ensure fault tolerence and resillience in distributed MS systems?

<a id="ms-log-aggregation"></a>

### Log Aggregation of logs from different Microservices?

<a id="ms-configs"></a>

### Need of configuration mgmt tools in microservices? [TOP](#ms-top)

- Spring cloud Config, HashiCorp Consul,Vault,Launch darkly - Feature flags
- Scenario when constant configs across all the microservices, hence tools helps in central configuration mgmts
- Dynamic Configiration updated with out restarting the services like changing log levels etc
- Environment specific configuarions
- Secure credtentials using Valut or Feature flag management using Launch darkly.

<a id="ms-12"></a>

### 12 Factor App methodologies ? [TOP](#ms-top)

- Best practises for building modern,scalable and mantainable cloud based microservices.
  - 1.Single Code Base : One on One relationship between codebase n deployments
  - 2. Dependencies : explicitly declare all the configs
  - 3. Config
  - 4. Backing Services
  - 5. Build Release and Run
  - 6. Processes stateless
  - 7. Port Binding
  - 8. Concurrency scalability
  - 9. Disposibility
  - 10. Dev/Prod Parity
  - 11. Logs
  - 12. Admin Process : Keeping Admin Process Script along with Codebase so that same process followed in other environments.

<a id="ms-coh-cup"></a>

### Cohesion Vs Coupling ? [TOP](#ms-top)

Coupling: The degree of interdependence between modules. Example: Order Service directly calling Inventory Service leads to tight coupling.
Cohesion: The degree to which elements within a module belong together. Example: A Payment Service handling all payment-related functionalities like refund, processing etc shows high cohesion.

<a id="con-way"></a>

### Conway's Law [TOP](#ms-top)

Conway's Law states that the structure of an organization will influence the design of the systems they create. In the context of microservices, this means that the communication and interaction patterns between teams within an organization will shape how the microservices architecture is designed and organized.

For example, if an organization's teams are divided based on specific business domains (e.g., payments, user management), the resulting microservices architecture is likely to reflect this division. Each team may own and develop microservices that align with their domain expertise, leading to a decentralized architecture where services are organized around business capabilities.

Conversely, if teams are organized around technical layers (e.g., frontend, backend), the microservices architecture might reflect a more layered approach, where services are organized based on their technical responsibilities.

In essence, Conway's Law emphasizes that the communication structures within organizations impact the architecture and design decisions of the systems they build, including microservices architectures.

<a id="com-ms"></a>

#### Components of Microservices [TOP](#ms-top)

1. Services: Independently deployable components encapsulating specific business functions.
2. APIs: Well-defined interfaces enabling communication between microservices
3. Containers: Lightweight, portable environments ensuring consistent deployments
4. Decentralized Data Management: Microservices manage their own databases or data stores.
5. Service Discovery: Mechanisms allowing dynamic service location and communication.
6. Fault Tolerance and Resilience: Built-in mechanisms for handling failures gracefully
7. Monitoring and Logging: Tools for monitoring performance and centralized logging for troubleshooting.
8. Security: Implementing authentication, authorization, and encryption mechanisms.
9. CI/CD: Automation pipelines for rapid and reliable deployment.
10. Scalability: Architectural patterns for handling varying loads.
11. Versioning and Compatibility: Strategies for managing API and data schema changes
12. Governance and Documentation: Guidelines, standards, and documentation for microservice development and maintenance.

<a id="ms-caching"></a>

### Caching in Microservices? [TOP](#ms-top)

- Caching is temporrary storing in memory for faster retreival.
- Cache HIT ~~> If data already exist
- Cache MISS ~~~> If data does not exist
- What is Cache Eviction Policy ~~~> As cache data is temporray, It has to evict certain data as per some policy.
- - LRU - Least Recently Used
  - LFU - Least Frequently Used
  - MRU - Most Recently Used
  - FIFO
  - LIFO
- Types of Caching
  - Embedded Cache -> Most simplest cache, priavte to the running instance. Problem when multiple instances present for the same service. To resolve it used event listners to updated other instance caches
  - Client-Server Cache -> Centralized Cache
  - Distributed Cache/Cloud Cache -> Multiple CS cache
  - Side Car Cache -> Two container : In Sidecar Cache a separate container image is also spin-up with the application image and both the containers are isolated from each other.
  - Reverse Proxy Cache :
    In Reverser Proxy Caching the API response of a request which was served earlier by any underlying service is saved in the cache associated with API gateway or Reverse proxy. So when the same request hits the gateway it will be served from the gateway itself instead of hitting the underlying micro-services.

[More](https://medium.com/@ashishteotia/types-of-caching-in-microservices-a68455ba8c45)

<a id="ms-patterns"></a>

### Patterns [TOP](#ms-top)

- Circuite Breaker
- Implement Resillience Pattern Retry,Timeout,Fallback
- Rate Limiting and Throttling
- Service Mesh for Secure and Resilient Communication
- Bulkhead Patten
- Saga Pattern to manage Distributed Transaction
- API Gateway Pattern and benefits
- CQRS(Command Query Responsibility Segregation)
- Materialized View Pattern

===

1. [How secure a Microservice ?]()
2. What is the diffence between cohesion and coupling ?
3. What is 12-Factor App ? // if all these there then it's microservice enabled
4. What are the type of Service Discovery ?
5. What is the difference between normal REST service and Restful WS (Web Service)?
6. [What is service mesh ? Explain the differnet advantages like traffic splitting ](https://www.youtube.com/watch?v=16fgzklcF7Y)
7. [circuit breaker using Resilllinec4J and springboot](https://salithachathuranga94.medium.com/micro-service-patterns-circuit-breaker-with-spring-boot-253e4a829f94)
8. [How springboot works internally? What happens after run method](https://medium.com/javarevisited/what-happens-internally-when-you-start-a-spring-boot-application-part1-a683a64c1be8)
9. [differnce between @RestControler @controler ? What is the default retention ploicy ?](https://stackabuse.com/controller-and-restcontroller-annotations-in-spring-boot/)
10. [@condtional ,@ConditionalOnClass and @ConditionalOnProperty]()
11. [@profile,How it works ?](https://medium.com/@AlexanderObregon/exploring-the-use-of-profile-annotation-in-spring-framework-32cf9fff60f2#:~:text=The%20%40Profile%20annotation%20was%20introduced,to%20customize%20the%20application%20context.)
12. [What is Swagger , OpenAPI Vs Swagger, What are the features of swagger ?Swagger editor,Swagger UI,Swagger Codegen]()

### SAGA PATTERN

- It's an ingenious solution to manage the transactions in the world of distributed systems or Microsrvices.
- In a monolithic application, this transaction would usually be handled using ACID transactions
- In the simplest terms, a saga is a sequence of local transactions. Each local transaction updates the database and publishes an event to trigger the next local transaction in the saga
- The Saga Execution Coordinator(SEC) is the central component to implement a Saga flow.
- It contains a Saga log that captures the sequence of events of a distributed transaction.
- For any failure, the SEC component inspects the Saga log to identify the impacted components and the sequence in which the compensating transactions should run.
- For any failure in the SEC component, it can read the Saga log once it’s coming back up.
- It can then identify the transactions successfully rolled back, which ones are pending, and can take appropriate actions
- Two ways : 1. choreography and orchestration

In the Saga Choreography pattern, each microservice that is part of the transaction publishes an event that is processed by the next microservice. Suitable for fewer services.

- Tools for Choregraphy -Axon,Microprofile,Seata
- In the Orchestration pattern, a single orchestrator is responsible for managing the overall transaction status.
- Tools for Orchestrator - Camunda, Apache Camel

More details - https://www.baeldung.com/cs/saga-pattern-microservices#:~:text=7.1.,performed%20by%20a%20Saga%20participant.
