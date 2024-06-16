**Table of content:**
<a id="ms-top"></a>

- [Tools and Framework Used in MS](#ms-tools)
  - [Scenarios when Configuration Management Tools used](#ms-configs)
- [12 Factor App Methodology](#ms-12)
- Conway's Law
- Essential Components of MicroServices
- Importance Reports and Dashboards in Microservices
- [Cohesion Vs Coupling](ms-coh-cup)
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

- Patterns

  - Circuite Breaker
  - Implement Resillience Pattern Retry,Timeout,Fallback
  - Rate Limiting and Throttling
  - Service Mesh for Secure and Resilient Communication
  - Bulkhead Patten
  - Saga Pattern to manage Distributed Transaction
  - API Gateway Pattern and benefits
  - CQRS(Command Query Responsibility Segregation)
  - Materialized View Pattern

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
- Caching in MicroServices
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

### Event-Sourcing

- [source](https://medium.com/@ronen.albagli/event-sourcing-made-simple-a-high-level-overview-ed3d6fc01711#:~:text=Event%20Sourcing%20is%20a%20design,any%20given%20point%20in%20time.)
- Design pattern capturing events from differnt source or services and stores. To tackle the challnges of large data volumes of events we can use SNAPSHOT (consolidating after scertain number of events),CQS or CQRS (Command query serparation) for read and write events to attain eventual consistency.
- Technollogy can be used like Kafka to store the events as logs.

<a id="ms-cons"></a>

### Data Consistency In Micro Services

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

### Well Design Microservice Characterstics

- Important charactersics of wel designed MS
  - Single Responsibility Principle
  - Loose Coupling (reduce dependency between component)
  - Independent Deployment
  - Resilience (Handle failure gracefully and recover from error without impacting entire system)
  - Scalability (Horizonatl Scalability ,ensure best resource utiloization)
  - Polyglot persistence Different MS can use different database based on requirement
  - Monitoring and Observality : loging and robust monitoring.

<a id="ms-secuirty"></a>

### How to secure Microservices or what are the differnce approaches ?

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
