### Q. What are microservices, and how do they differ from monolithic architecture?

#### Ans
- Microservice Modular,Independent services, Single Responsibility,Loosely coupled ,Independently deployable
  Domain-driven design (DDD),API-based communication (e.g., REST, gRPC),Decentralized data management
  Scalability,Fault isolation.
- Monolithic : Tightly coupled, Shared database,Single deployable unit,Low flexibility
  Hard to scale independently,Tougher fault isolation,Slower development cycles

### Q. What are the benefits and challenges of adopting a microservices architecture?
#### Ans:

- Benefits of Microservices
  - Scalability (horizontal scaling of individual services)
  - Flexibility (technology-agnostic per service)
  - Independent deployment
  - Faster time to market
  - Fault isolation
  - Resilience
  - Team autonomy
  - Continuous delivery / CI/CD
  - Reusability
  - Improved maintainability
  - Domain-driven design (DDD)
  - Cloud-native readiness

- Challenges of Microservices
  - Increased complexity (more services to manage)
  - Service coordination
  - Distributed data management
  - Network latency
  - Inter-service communication (e.g., REST, gRPC)
  - Monitoring and observability
  - Deployment overhead
  - DevOps maturity required
  - Testing complexity (integration & end-to-end)
  - Service discovery
  - Security (e.g., authentication, authorization across services)
  - Data consistency (eventual consistency, distributed transactions)

### Q. How would you approach breaking a monolithic application into microservices?

###. What is a bounded context, and why is it important in microservices?

###. Explain CAP theorem and how it applies to microservices.

###. How do you ensure fault isolation in a microservices architecture?

###. Explain the role of the 12-Factor App methodology in microservices.

###. What is the difference between a domain-driven design (DDD) and microservices design?

###. How do you identify and define the boundaries of a microservice?

###. How do you handle shared libraries or common utilities in microservices?

#### Service Discovery

i. What are the advantages of dynamic service discovery in microservices?
ii. Compare client-side and server-side service discovery mechanisms.
iii. What are some tools for service discovery besides Eureka? How do they work?

#### Scalability and Load Balancing

i. How do microservices achieve horizontal scalability?
ii. What is the role of load balancers in a microservices setup? How do you configure them?
iii.What are the benefits and challenges of autoscaling microservices?
iv. Explain sticky sessions and their impact on scaling microservices.

#### Resilience and Fault Tolerance

i. What is a bulkhead pattern, and how does it improve microservices resilience?
ii. Explain the difference between retries and circuit breakers in fault tolerance.
iii. How do you implement timeout strategies to handle slow responses from a microservice?
iv. What is a fallback mechanism, and how can it improve user experience during failures?

#### Data Management

i. How do you handle schema changes in databases while maintaining backward compatibility in microservices?
ii. What is the CQRS (Command Query Responsibility Segregation) pattern, and how is it applied in microservices?
iii.Explain database sharding and its role in microservices scalability.
iv.What is eventual consistency, and how do you handle it in a distributed system?

#### Testing Microservices

i. How do you test inter-service communication in a microservices architecture?
ii. What are contract tests, and why are they important for microservices?
iii. How do you simulate dependencies while testing a microservice (e.g., using mocks or stubs)?
iv. What tools have you used for performance testing of microservices?

#### Distributed Systems Challenges

i. How do you handle distributed logging across microservices?
ii. What are some strategies for ensuring data consistency in distributed systems?
iii. How do you implement distributed tracing to debug issues in a microservices environment?

#### Deployment Strategies

i. What is a blue-green deployment, and how does it benefit microservices?
ii. Explain the canary deployment strategy and its implementation in microservices.
iii. What challenges do you face when deploying updates to microservices in production?

#### Event-Driven Architecture

i. What is the difference between event sourcing and traditional event-driven architectures?
ii. How do you ensure the reliability of events in an event-driven microservices setup?
iii. What is an event bus, and how is it used in microservices?

#### Miscellaneous Questions

i. How do you handle API dependencies when one microservice relies on another’s output?
ii. What role does Kubernetes play in managing microservices, and how do you use it?
iii. What are anti-patterns in microservices, and how do you avoid them?
iv. How do you handle latency issues in a distributed system?

# Fundamental Concepts - A

## Questions

1. What are microservices, and how do they differ from monolithic architecture?
2. What are the benefits and challenges of adopting a microservices architecture?
3. How would you approach breaking a monolithic application into microservices?
4. What is a bounded context, and why is it important in microservices?
5. Explain CAP theorem and how it applies to microservices.
6. How do you ensure fault isolation in a microservices architecture?
7. Explain the role of the 12-Factor App methodology in microservices.
8. What is the difference between a domain-driven design (DDD) and microservices design?
9. How do you identify and define the boundaries of a microservice?
10. How do you handle shared libraries or common utilities in microservices?

# Service Discovery - B

## Questions

1. What are the advantages of dynamic service discovery in microservices?
2. Compare client-side and server-side service discovery mechanisms.
3. What are some tools for service discovery besides Eureka? How do they work?

# Scalability and Load Balancing - C

## Questions

1. How do microservices achieve horizontal scalability?
2. What is the role of load balancers in a microservices setup? How do you configure them?
3. What are the benefits and challenges of autoscaling microservices?
4. Explain sticky sessions and their impact on scaling microservices.

# Resilience and Fault Tolerance -D

## Questions

1. What is a bulkhead pattern, and how does it improve microservices resilience?
2. Explain the difference between retries and circuit breakers in fault tolerance.
3. How do you implement timeout strategies to handle slow responses from a microservice?
4. What is a fallback mechanism, and how can it improve user experience during failures?

# Data Management - E

## Questions

1. How do you handle schema changes in databases while maintaining backward compatibility in microservices?

2. What is the CQRS (Command Query Responsibility Segregation) pattern, and how is it applied in microservices?

3.Explain database sharding and its role in microservices scalability.

4. What is eventual consistency, and how do you handle it in a distributed system?

# Testing Microservices - F

## Questions

1. How do you test inter-service communication in a microservices architecture?

2. What are contract tests, and why are they important for microservices?

3. How do you simulate dependencies while testing a microservice (e.g., using mocks or stubs)?

4. What tools have you used for performance testing of microservices?

# Distributed Systems Challenges - G

## Questions

1. How do you handle distributed logging across microservices?

2. What are some strategies for ensuring data consistency in distributed systems?

3. How do you implement distributed tracing to debug issues in a microservices environment?

# Deployment Strategies - H

## Questions

1. What is a blue-green deployment, and how does it benefit microservices?

2. Explain the canary deployment strategy and its implementation in microservices.

3. What challenges do you face when deploying updates to microservices in production?

# Event-Driven Architecture - I

## Questions

1. What is the difference between event sourcing and traditional event-driven architectures?

2. How do you ensure the reliability of events in an event-driven microservices setup?

3. What is an event bus, and how is it used in microservices?

# Miscellaneous Questions - J

## Questions

1. How do you handle API dependencies when one microservice relies on another’s output?
2. What role does Kubernetes play in managing microservices, and how do you use it?
3. What are anti-patterns in microservices, and how do you avoid them?
4. How do you handle latency issues in a distributed system?

### [Moving monolith to Microservices](https://launchdarkly.com/blog/migrating-legacy-monolithic-applications-microservices/)

### Importance Reports and Dashboards in Microservices

### Handle/Manage Large Data Set in a Microservices

### [Domain Driven Design DDD in Micro Services]()

### [Versioning in Microservices]()

### Microservice vs ServerLess Architecture

### [Fault Tollerency in MS](#ms-fault-recovery)

- Hystrix
- Staregies for Fault Isolation

### [Log Aggregation](#ms-log-aggregation)

### [Microservice Patterns](#ms-patterns)

### Distributed Tracing By Spring Cloud Sleuth

### Handle CORS in Micro Service

### Dockerize a MicroService

### Disaster Recovery Startergies

### Testing Microservices

### Service Virtualization in End to End Testing

### Challenges of testing and how to overcome it

### Identify Performance Bottleneck in Microservices

### What are the Key Perfomance Matrics

### Differnce between Monitoring and Observability.

### Challenges faced while developing Micro services.

### How do ensure fault tolerence and resillience in distributed MS systems?

### Log Aggregation of logs from different Microservices?

### What are the type of Service Discovery ?

### What is the difference between normal REST service and Restful WS (Web Service)?

### [What is service mesh ? Explain the differnet advantages like traffic splitting ](https://www.youtube.com/watch?v=16fgzklcF7Y)

### [circuit breaker using Resilllinec4J and springboot](https://salithachathuranga94.medium.com/micro-service-patterns-circuit-breaker-with-spring-boot-253e4a829f94)

### Q.Communication Between Micro Services

- Synchronous
- Asynchronous
- Trade off between Syncronous and Asynchronous
- Differenr approach service to service cmmnication

### Q. Deployment Startergy

#### Ans:

- Canary Deployment
- Feature Flags
- Blue-Green Deployments
- Rollback Deployment Startergy

### Q.Challenges faced while developing Micro services.

### Q.How to secure Microservices or what are the differnce approaches ?

- [Ways to secure](https://medium.com/decathlondigital/api-security-diving-into-authentication-and-json-web-token-2387c6d49d3c)
- [Implement startergy](https://medium.com/microservices-learning/how-to-implement-security-for-microservices-89b140d3e555)

### Q. Well Design Microservice Characterstics [TOP](#ms-top)

- Important charactersics of wel designed MS
  - Single Responsibility Principle
  - Loose Coupling (reduce dependency between component)
  - Independent Deployment
  - Resilience (Handle failure gracefully and recover from error without impacting entire system)
  - Scalability (Horizonatl Scalability ,ensure best resource utiloization)
  - Polyglot persistence Different MS can use different database based on requirement
  - Monitoring and Observality : loging and robust monitoring.

### Q.Conway's Law [TOP](#ms-top)

Conway's Law states that the structure of an organization will influence the design of the systems they create. In the context of microservices, this means that the communication and interaction patterns between teams within an organization will shape how the microservices architecture is designed and organized.

For example, if an organization's teams are divided based on specific business domains (e.g., payments, user management), the resulting microservices architecture is likely to reflect this division. Each team may own and develop microservices that align with their domain expertise, leading to a decentralized architecture where services are organized around business capabilities.

Conversely, if teams are organized around technical layers (e.g., frontend, backend), the microservices architecture might reflect a more layered approach, where services are organized based on their technical responsibilities.

In essence, Conway's Law emphasizes that the communication structures within organizations impact the architecture and design decisions of the systems they build, including microservices architectures.

### Q.SAGA PATTERN

#### Ans

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

### Q. Components of Microservices [TOP](#ms-top)

#### Ans

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

### Event-Sourcing [TOP](#ms-top)

- [source](https://medium.com/@ronen.albagli/event-sourcing-made-simple-a-high-level-overview-ed3d6fc01711#:~:text=Event%20Sourcing%20is%20a%20design,any%20given%20point%20in%20time.)
- Design pattern capturing events from differnt source or services and stores. To tackle the challnges of large data volumes of events we can use SNAPSHOT (consolidating after scertain number of events),CQS or CQRS (Command query serparation) for read and write events to attain eventual consistency.
- Technollogy can be used like Kafka to store the events as logs.

### Need of configuration mgmt tools in microservices? [TOP](#ms-top)

- Spring cloud Config, HashiCorp Consul,Vault,Launch darkly - Feature flags
- Scenario when constant configs across all the microservices, hence tools helps in central configuration mgmts
- Dynamic Configiration updated with out restarting the services like changing log levels etc
- Environment specific configuarions
- Secure credtentials using Valut or Feature flag management using Launch darkly.

### Cohesion Vs Coupling ? [TOP](#ms-top)

#### Ans

Coupling: The degree of interdependence between modules. Example: Order Service directly calling Inventory Service leads to tight coupling.
Cohesion: The degree to which elements within a module belong together. Example: A Payment Service handling all payment-related functionalities like refund, processing etc shows high cohesion.

### 12 Factor App methodologies ?

#### Ans

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

### Q. [Caching in Microservices?](https://medium.com/@ashishteotia/types-of-caching-in-microservices-a68455ba8c45)

#### Ans

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

### Q. [How to Scale Microservice?](https://medium.com/cloud-native-daily/scaling-microservices-a-comprehensive-guide-200737d75d62)

- Ans
  - A Stateless Services: Ensure services don’t store session data; scale horizontally with ease.
  - B Externalized Storage: Use cloud-native DBs (e.g., RDS, Firestore) and caches (e.g., Redis)
  - C Leverage Auto-Scaling: Kubernetes HPA: Auto-scales pods based on CPU, memory, or custom metrics.Cloud Auto-Scaling: Use provider-managed scaling for VMs, containers.
  - D Use Managed Services Databases & Queues: Use AWS Aurora, SQS, Pub/Sub to reduce ops overhead.
  - E Istio/Linkerd: Handle load balancing, retries, traffic shaping, and circuit breakers.
  - F Event-Driven Architecture : Message Brokers: Kafka, SQS, or Kinesis enable asynchronous scaling. && Serverless: Use AWS Lambda or GCP Functions for on-demand, stateless tasks.
  - G Caching : In-Memory/Edge: Use Redis/Memcached and CDNs (CloudFront, Cloudflare) to reduce load.
  - H IaC : Automation: Use Terraform or CloudFormation to automate and replicate scaling setups.
  - I Observilibity: Monitoring: Use Prometheus, Grafana, CloudWatch for metrics and alerts. && Tracing: Track service calls with Jaeger or Zipkin to identify bottlenecks.

1A -
Monolithic more tightly coupled, microservice more flexible,scalable,mantaibility

4J -

To handle latency issues, implement caching to reduce repeated computations, use asynchronous communication and message queues, optimize database queries, compress data transfers, implement load balancing, and monitor network performance. Deploying services closer to users via CDNs or edge computing also minimizes latency.

10A -

Package the library in a shared repository like Maven Central, Nexus, or Artifactory for easy distribution.
Services can then include the library as a dependency using build tools like Maven or Gradle.

# 9A - Define Boundary

Defining the boundaries of a microservice is a critical step in designing a microservices architecture. Proper boundaries ensure that each microservice is cohesive, loosely coupled, and aligned with the overall business goals. Here’s how you can identify and define these boundaries, followed by an example:

Key Steps to Identify and Define Microservice Boundaries
Understand Business Domains:

Use Domain-Driven Design (DDD) to identify the core, supporting, and generic domains.
Break down the business into subdomains, each representing a specific area of responsibility.
Follow the Single Responsibility Principle:

Each microservice should focus on one specific functionality or responsibility within the system.
Avoid overloading a service with unrelated tasks.
Design Around Business Capabilities:

Align services with business capabilities rather than technical layers.
Example: "Order Management" or "Payment Processing" rather than "Database Service."
Bounded Contexts:

In DDD, a bounded context represents the scope within which a model applies.
Each bounded context maps to a microservice.
Analyze Data Ownership:

Define which microservice owns a particular piece of data.
Avoid sharing databases directly between services to maintain independence.
Consider Autonomy and Scalability:

A microservice should be independently deployable and scalable.
Group functionalities that scale together into one service.
Handle Cross-Cutting Concerns Separately:

Centralize concerns like logging, monitoring, and authentication into shared libraries or infrastructure services, not core microservices.
Use Event Storming or Process Analysis:

Map out the entire workflow of the application and identify the events that trigger specific processes.
Group related processes into separate services.
Example: E-commerce Application
Business Requirements:
An e-commerce platform has the following functionalities:

User Management: Handles user registration, login, and profile management.
Product Catalog: Manages the list of products, their categories, and details.
Order Management: Processes orders, including creation, updates, and cancellations.
Payment Service: Handles payment processing and integration with third-party payment gateways.
Inventory Service: Tracks product stock levels and updates them in real time.
Shipping Service: Manages shipping logistics and tracks delivery status.
Applying Microservices Boundaries:
Bounded Contexts:

User Management: Owns data related to user accounts and authentication.
Product Catalog: Manages product details and metadata.
Order Management: Responsible for order creation and status updates.
Payment Service: Focuses on payment processing, payment status, and refunds.
Inventory Service: Handles stock availability and replenishment.
Shipping Service: Manages shipping labels, carriers, and delivery tracking.
Independence:

Each service has its own database. For example:
User Management: UserDB (Relational DB like MySQL or PostgreSQL).
Product Catalog: ProductDB (NoSQL like MongoDB for flexibility).
Order Management: OrderDB (Relational DB).
Communication happens through APIs or events, not shared databases.
Scalability:

Services that experience high traffic can scale independently. For instance:
Product Catalog may scale to handle browsing traffic.
Payment Service may scale during peak sales.
Communication:

Use asynchronous messaging for event-driven communication.
Example:
When an order is placed, the Order Management service emits an event that the Inventory and Shipping services consume to update stock and create a shipping order.

4A -

- A bounded context is a clear boundary within which a particular domain model is defined and applicable. In microservices, it ensures that each service has a well-defined scope, preventing overlapping responsibilities and promoting decoupled and cohesive services. This leads to better scalability, maintainability, and team autonomy.

  - **Use Case Example:** In an e-commerce system, "Order Management" and "Inventory Management" are separate bounded contexts. The "Order Management" service tracks customer orders, while the "Inventory Management" service maintains stock levels. Each service operates independently with its own data model, reducing coupling and simplifying scalability.

2E -

1. CQRS is a design pattern that separates the responsibility for handling commands (updates queries) from queries (reads). In microservices, it improves performance and scalability by using distinct models or services for read and write operations. For example, an e-commerce system might use a write model for processing orders and a read model for querying order details.

2. Basically create two services and use messagingto be in sync between these two command database and read database.

3. CQRS helps writing complex queries, securtty feature for write effectivly by avoidingthe read opertaions etc. Example on Sale day of amzon 30% write n 70% read so ithelps segregate the load effectivly.

1C - Microservices achieve horizontal scalability by deploying multiple instances of individual services across distributed servers or containers. Load balancers distribute incoming traffic among these instances, ensuring high availability and performance. Since each service is independently scalable, resources can be allocated based on demand, optimizing system efficiency.

4C - Sticky sessions are a load balancing mechanism where a user's requests are always routed to the same server instance during a session. While this can simplify session state management, it reduces scalability and fault tolerance as traffic is not evenly distributed. Stateless microservices with externalized session management are preferred for better scalability.
[More details](https://medium.com/@aditimishra_541/sticky-sessions-an-in-depth-overview-4ec19bd7e22a)

- Trade offs of using sticky session and their alternatives

3C **Benefits Of Austoscaling:**

- Handles varying workloads by dynamically adjusting resources. - Reduces costs by scaling down during low demand. - Enhances fault tolerance and availability by maintaining service levels under high demand.

- **Challenges:**
  - Requires accurate monitoring and load prediction.
  - Latency during scale-up can impact performance.
  - Configuration complexities with cloud platforms and orchestration tools like Kubernetes.

3E - Database sharding divides large databases into smaller, independent pieces (shards) across multiple servers. In microservices, it improves scalability, performance, and fault tolerance by distributing data and load. Each service manages its shard, reducing contention and enabling independent scaling, though it can introduce challenges with data distribution, consistency, and complex queries. [more](https://medium.com/design-microservices-architecture-with-patterns/database-sharding-pattern-for-scaling-microservices-database-architecture-2077a556078)

1J - Using Asynchronous communication using brokers like Kafka or RabbitMQ. Service A publishes an event when its processing is done, and Service B consumes the event. Also, Caching can be used to store the out put and used by another. For caching Redis or Memcached used.

- Another Approach is service composition,combines data from multiple microservices
- Using API gateways which can handle tasks like response aggregation,retries and fallback.

Question 1 : How can you manage transactions across multiple databases in Spring?

Question 2 : XA and non XA transactions

Question 3 : Dirty Read, Phantom Read and Isolation Levels explain with one example.

Question 4 : Distributed Transaction Explain.

### Dirty Read

Occurs when a transaction reads data that has been modified but not yet committed by another transaction. If the uncommitted transaction rolls back, the data read becomes invalid.
Isolation Level: Happens in Read Uncommitted.

### Phantom Read

Occurs when a transaction reads a set of rows, and another transaction inserts or deletes rows that affect the result set during the execution of the first transaction.

Isolation Level: Prevented only in Serializable.

### Isolation Levels

# Isolation Levels in SQL

| **Isolation Level**  | **Dirty Read** | **Non-Repeatable Read** | **Phantom Read** |
| -------------------- | -------------- | ----------------------- | ---------------- |
| **Read Uncommitted** | Possible       | Possible                | Possible         |
| **Read Committed**   | Prevented      | Possible                | Possible         |
| **Repeatable Read**  | Prevented      | Prevented               | Possible         |
| **Serializable**     | Prevented      | Prevented               | Prevented        |

### [OPTIMISTIC LOCKING(E1.1)](#e1-1)

#### 2.If One table accessed by two user from front end at a time, Like Rohshin accessed the employee table ,updated the email of an user same time Roshan updated it ? How to tackle it ?

### [DISTRIBUTED TRANSACTION(E1.1)](#e1-1)

#### 1. How to update two same table but in differnet datasources ?

When two users (Rohshin and Roshan) simultaneously access and attempt to update the same record (e.g., an employee's email) in a table, concurrency control mechanisms are required to ensure data integrity. Here's how you can tackle this scenario:

1. Optimistic Locking
   Version Field: Add a version field (e.g., version or last_updated) to the employee table.
   Check Version: When Rohshin and Roshan load the employee record, they each get the current version.
   Update Attempt: Before updating, each user checks if the version in the database matches the version they fetched.
   Conflict Detection: If the versions match, the update proceeds, and the version is incremented. If not, an exception is thrown, indicating a conflict, and one of the users must refresh the data and try again.
2. Pessimistic Locking
   Lock Row: When Rohshin or Roshan begins to update the record, the row in the database is locked.
   Prevent Other Access: The lock prevents the other user from updating the record until the first user completes their transaction.
   Release Lock: Once the transaction is complete (commit or rollback), the lock is released, allowing the other user to proceed.
3. Last Write Wins
   Overwrite: Allow both updates to proceed, with the last one overwriting the previous one.
   Risk: This approach is simpler but risks losing data if updates are not coordinated.
4. Merge Changes
   Detect Differences: When a conflict occurs, compare the changes made by both users.
   Manual Merge: Prompt the users to resolve the conflict by merging the changes manually.
5. User Notifications
   Alert Users: Notify users when the record they are editing has been updated by someone else. They can then choose to refresh or save their changes.
6. Transaction Isolation Levels
   Serializable Isolation: Use the highest isolation level to ensure transactions are executed one after the other, preventing conflicts.
   Repeatable Read: Ensures that if a user reads a row, they will see the same data until their transaction completes, preventing non-repeatable reads but not phantom reads.
   Summary
   The most common and recommended approach in a web application is Optimistic Locking, as it balances performance with data integrity without the overhead of locking resources for extended periods. However, depending on the specific use case and requirements, other strategies like Pessimistic Locking or conflict resolution through merging can also be applied.

### [LOCAL TRANSACTION(E1.1)]()

- Some examples of distributed transaction managers include Atomikos, Bitronix, and Narayana.

- To ensure both tables are updated under the same transaction, even though they are in different data sources, you need to use distributed transactions (or XA transactions) which allow you to coordinate transactions across multiple data sources.

- Spring Boot supports distributed transactions using JTA (Java Transaction API). Here’s how you can configure and implement it.

1. What is a Local Transaction?
   Local Transaction: A transaction that is confined to a single transactional resource, such as a single database. In a local transaction, all the operations are performed within the same resource, and the resource itself (like a relational database) manages the transaction.
   Local transactions are simpler and more efficient than distributed transactions because they do not require coordination across multiple resources.

2. Transaction Management in Local Transactions
   Resource-Managed Transactions: The transaction is managed by the resource itself (e.g., a relational database using JDBC).
   Spring’s @Transactional: In Spring, the @Transactional annotation can be used to manage transactions declaratively. When using a single data source, Spring uses a local transaction manager (e.g., DataSourceTransactionManager for JDBC) to manage the transaction.

3. Do You Need a Transaction Manager for Local Transactions?
   Yes, you need a transaction manager, but it’s a local transaction manager provided by Spring, such as:

DataSourceTransactionManager: For JDBC-based transactions, this is used to manage transactions on a single data source.
JpaTransactionManager: For JPA-based transactions, this manages transactions for a single JPA EntityManagerFactory. 4. How Spring Manages Local Transactions
When you define a transaction with @Transactional in a Spring application that uses a single data source, Spring uses a local transaction manager to handle the transaction. This transaction manager delegates the transaction control to the underlying resource (like a database).

Here’s how it works:

Beginning the Transaction: When a method annotated with @Transactional starts, Spring asks the local transaction manager to start a new transaction.
Commit or Rollback: At the end of the method, Spring asks the transaction manager to commit the transaction if everything is successful. If an exception occurs, it asks the transaction manager to roll back the transaction.
No XA Protocol: Since everything happens within a single resource, there is no need for the XA protocol or a global transaction manager like JTA. 5. When to Use Local Transactions
Single Data Source: If your application interacts with only one data source (e.g., a single database), local transactions are sufficient and more efficient.
Single Resource: Use local transactions when your transaction only spans a single transactional resource, such as a single database or a single JMS queue.

Example: Using Local Transactions with Spring
Configuration:
If you are using JDBC, Spring will automatically configure a DataSourceTransactionManager when you define a DataSource bean

== == == ==

In a local transaction managed by DataSourceTransactionManager, concurrent updates to the same table are handled through the database's concurrency control mechanisms, such as locking and transaction isolation levels. Here's how it works:

1. Concurrency Control via Locking
   Pessimistic Locking: The database may place locks on the rows being updated to prevent other transactions from modifying them until the current transaction is complete. For example:

Exclusive Lock (Write Lock): Prevents other transactions from reading or writing the locked rows.
Shared Lock (Read Lock): Allows other transactions to read but not modify the locked rows.
Optimistic Locking: Instead of locking rows, the database checks for conflicts at the time of commit. If another transaction has modified the same data, the transaction is rolled back, and the application can retry the operation.

2. Transaction Isolation Levels
   The DataSourceTransactionManager uses the transaction isolation level to control how data changes made by one transaction are visible to others. Common isolation levels include:

READ COMMITTED: Ensures that a transaction only reads data that has been committed by other transactions. It prevents dirty reads but allows non-repeatable reads and phantom reads.
REPEATABLE READ: Ensures that if a transaction reads a row, subsequent reads within the same transaction will see the same data, preventing non-repeatable reads. It can still allow phantom reads.
SERIALIZABLE: The highest isolation level, which ensures that transactions are executed in a way that makes them appear as if they were run sequentially. This prevents dirty reads, non-repeatable reads, and phantom reads but can lead to more locking and reduced concurrency. 3. Handling Concurrent Updates
When two transactions try to update the same row at the same time:

If using Pessimistic Locking: The first transaction to acquire the lock will proceed, and the second transaction will be blocked until the first one completes.

If using Optimistic Locking: Both transactions may proceed simultaneously, but when one tries to commit, the database will check if the data has been modified by another transaction. If a conflict is detected, the transaction will fail, and you can handle the retry logic in your application.

If using Isolation Levels: The database ensures that the data integrity is maintained based on the chosen isolation level. For instance, with SERIALIZABLE isolation, the database might prevent one of the transactions from committing until the other has completed.

Example Scenario
Transaction 1 begins and updates a row in the employees table.
Transaction 2 begins slightly later and tries to update the same row.
Depending on the locking strategy and isolation level:

With Pessimistic Locking: Transaction 2 waits until Transaction 1 completes and releases the lock.
With Optimistic Locking: Transaction 2 may proceed, but it will fail on commit if Transaction 1 commits first.
With SERIALIZABLE Isolation: Transaction 2 may be blocked or delayed until Transaction 1 completes to ensure they do not interfere with each other.
Summary
In local transactions managed by DataSourceTransactionManager, concurrent updates on the same table are controlled by the database using locking mechanisms and isolation levels. These ensure data consistency and integrity by coordinating how multiple transactions interact with the same data at the same time.
