1A -
Monolithic more tightly coupled, microservice more flexible,scalable,mantaibility

4J -

To handle latency issues, implement caching to reduce repeated computations, use asynchronous communication and message queues, optimize database queries, compress data transfers, implement load balancing, and monitor network performance. Deploying services closer to users via CDNs or edge computing also minimizes latency.

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
