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
