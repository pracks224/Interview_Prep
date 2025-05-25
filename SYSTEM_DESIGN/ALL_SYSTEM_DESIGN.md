### System design Approach

- 7 steps
  - Functional Requirement
  - Non Functional Requirement
  - Schema design | Entities|DB
  - API design
  - High Level System Design
  - Deep core on functionality
  - Operational excellence

### Ticket Booking System ,Concurrency of a seat booking

- Pessimistic Locking (DB-level lock) deadlocks under heavy load
- In-Memory Locking (e.g., Redis Lock / Distributed Lock) Use Redis SETNX or Redlock to acquire lock per seat or per user session
- Queue-Based Booking (Eventual Consistency)
  - Accept all requests into a queue (Kafka/SQS)
  - Process bookings in order — only one wins the seat
- Pre-Hold Mechanism (Soft Reservation)
  - Temporarily “hold” seats for a short time (e.g., 2 minutes) during payment
  - Release them if user doesn’t complete payment
- User A and B try to book seat #17:

1. Redis lock acquired by User A
2. Seat held (soft lock) for 2 minutes
3. DB booking only if payment success
4. Redis lock released
   <a id="Designing-Scalable-Services">Designing Scalable Services</a>

### 1. How would you design a scalable architecture for handling sudden traffic spikes?

A. Load Balancing - Use LBs (L4 and L7) L4 transport layer and l7 Application layer

- Use round-robin,least connection or weighted routing
  A1 Auto scaling - Scale out horizantally,
  Or Auto Scaling groups like AWS ASG or Kubernetes HPA
- Traffic predition or pre warming
  B. Rate Limiting : Rate limiting via Redis-based throttling (e.g., Token Bucket, Leaky Bucket algorithms).

B1. Asynchronous Processing - Offload long-running tasks using message queues (Kafka, RabbitMQ, SQS).

C. Data Base Optimizations - Using Read replicas, differntiate read from write queries.
-> Sharading : Distribute data across multiple DB instances (e.g., by user ID, region).
-> Connection Pooling: Use HikariCP to efficiently manage DB connections.
C1.
D. Front end - Use CDNs
E. Monitoring,Alerts and Failure recovery
Auto-Healing & Failover

- Circuit Breaker Pattern (Resilience4j, Hystrix) to prevent cascading failures.
- Fallback Mechanisms: Serve cached content if backend fails.
- Multi-Region Deployment: Deploy across regions to avoid a single point of failure.
  F. Use CQRS (Command Query Responsibility Segregation) to separate read and write models.
  G. DDoS Mitigation
- Rate limiting, IP blacklisting, and bot detection using AI-based anomaly detection.
- Use Cloudflare, AWS Shield, Akamai for traffic filtering.

### 2. How would you handle failover if one data center goes down?/Disaster recovery

- Deploy to multiple AZs
- Multi-Region Failover - Active - Active or Active-Passive mode . Use Route 53 for DNS-based failover
- Data sync - Use RDS Multi-AZ or Aurora Global Databases for database failover. For S3: it’s automatically replicated across multiple AZs.
- #### Key Components for Resilient Failover

# 🔧 High Availability Components and Tool Examples

| **Component**           | **Tools/Service Examples**                          |
| ----------------------- | --------------------------------------------------- |
| **DNS Failover**        | AWS Route 53, Cloudflare, NS1                       |
| **Load Balancing**      | AWS ELB, NGINX, Istio, HAProxy                      |
| **Data Replication**    | RDS Multi-AZ, EFS, Kafka MirrorMaker                |
| **Infrastructure Sync** | Terraform, ArgoCD, Crossplane                       |
| **Health Checks**       | Built-in with most Load Balancers and DNS providers |

3. ### Vertical Scaling vs Horizontal Scaling

Vertical scaling means upgrading the hardware of an existing server — for example, increasing CPU or RAM. It's easier to implement but has physical limits and may require downtime.

Horizontal scaling means adding more instances or nodes to share the load. It's more complex but much more scalable and is commonly used in microservices, Kubernetes, or cloud environments.

In my projects, we typically use horizontal scaling — for example, with Kubernetes HPA or AWS Auto Scaling Groups — to handle load dynamically without downtime.

### 4. How does a load balancer improve scalability?

- A load balancer improves scalability by allowing multiple backend servers to share the workload. Instead of relying on a single server, it distributes traffic across healthy instances based on policies like round-robin or least connections.

For example, in AWS, we use Application Load Balancers (ALB) with Auto Scaling Groups — when traffic increases, new EC2 instances spin up, and the load balancer automatically includes them in the pool. Similarly, in Kubernetes, we use Ingress or Services with Horizontal Pod Autoscalers (HPA) to scale pods horizontally.

This setup lets us handle more traffic, ensure high availability, and provide a better user experience — even during peak load.

### 5. How would you reduce API response time under high load?

- To reduce API response time under high load, I typically start with caching using Redis for frequently requested data, and I optimize DB queries with proper indexing and connection pooling. I also move non-critical logic like logging and notifications to background workers using SQS or Kafka.

On the infrastructure side, I use load balancers and autoscaling (e.g., AWS ALB + ASG or Kubernetes HPA) to scale horizontally based on metrics. Additionally, I monitor performance using tools like AppDynamics and tune endpoints by reducing payload size and enabling GZIP compression.

These combined strategies have helped me improve latency significantly even during peak traffic.

### 6. What is Rate limiting ?

- Rate limiting is the practice of controlling how many requests a client can make to a server or API within a specific time window.
- Avoids Ddos attacks, fair usage to users, protect backend resources,mantain consistent performances under load etc
- E.g. 100 req per minute,1000 req per IP,10 login attempts
- Common stratergies like 1. Fixed Window Count requests in a fixed time window (e.g., 60 sec) 2. Sliding Window More accurate counting over a sliding time frame 3. Token Bucket Requests are allowed if there's a token; tokens refill at a fixed rate 4. Leaky Bucket Requests processed at a constant rate; excess goes to a queue or is dropped

  #### 7.Implement a rate limiter using Redis

  ### 8. How do you handle API rate limiting for millions of requests?

  - For handling millions of API requests, I implement rate limiting using Redis as a centralized counter with a fixed window or token bucket algorithm. Each request increments a Redis key with TTL, and we throttle based on user ID or IP.

To support high throughput, I enforce limits at the API Gateway level and use Cloudflare to filter abusive traffic at the edge. Redis gives us atomic operations and scalability, while usage metrics help us tune limits per user tier and auto-scale the backend. This setup ensures fair usage and protects our services under load.

### 9. How would you ensure fault tolerance in an API gateway?

- To ensure fault tolerance in our API Gateway, we deployed it across multiple availability zones using AWS API Gateway and Lambda. We implemented circuit breakers and timeouts to avoid cascading failures, and used Redis-based caching for high-traffic endpoints. For resilience, we set up health checks with Route 53 to failover across regions. Additionally, we monitored latency and errors using CloudWatch and set alerts for proactive intervention.

  ### 10.When would you choose SQL vs. NoSQL for a high-traffic system?

  ### 11. How would you handle database sharding in a multi-region setup?

  ### 12. What is the trade off between Read Replicas and Sharding ?

  - Read replicas help scale reads quickly and are easy to implement, but don’t help with write-heavy workloads. On the other hand, sharding distributes both reads and writes but adds complexity in partitioning and query logic. For example, in our analytics system, we used replicas to serve read dashboards, while for our real-time game engine, we sharded player state data to ensure low-latency writes and horizontal scalability.

    ### 13. What caching strategies would you use to reduce database load?

    - Read through Cache - First check cache ,if miss data is loaded from DB and stored in cache for next time. "We used Redis as a read-through cache for product details, which reduced DB hits by ~70%"
    - Write through cache
    - Cache-Aside (Lazy Loading) n cache miss: fetch from DB, then update cache manually.
    - Time-To-Live (TTL) / Expiry Policies Set TTL on cache entries (e.g., 5 mins, 1 hour).

  ### 13. How to decide the eviction policy ?

  - It decides which cached items to remove when the cache is full and you need to make room for new data.
  - Based on the pattern type , eviction policy decides
  - Frequently accessed LFU (Least Frequently Used) Keeps the most-used items, great for hot data
  - Recently accessed LRU (Least Recently Used) Keeps items recently used, good for session-like data
  - Insertion order matters FIFO (First In, First Out) Useful if access patterns are consistent by time
  - Random/unpredictable Random Simple, less overhead (not optimal though)
  - Memory is limited?
  - Go with LRU or LFU to retain the most valuable data.
  - To choose the right eviction policy, I analyze the access pattern. For example, if users tend to access a small set of items repeatedly, I prefer LFU. For session-related data or APIs where recent usage is more relevant, LRU works better. In Redis, we’ve used allkeys-lru in high-read apps and switched to allkeys-lfu for search caching. I always monitor cache hit ratios and adjust based on real-world behavior.

Performance critical, low CPU overhead?
→ FIFO or Random are simple and fast.

Prevents stale data and automatic invalidation.

### 14. How would you handle cache invalidation in a distributed system?

- In a distributed system, I use a mix of TTL and explicit invalidation. For frequently changing data, we use a cache-aside pattern and delete the cache after a successful DB update. To ensure consistency across services, we use Kafka to publish change events and let subscribers invalidate their local or shared cache. In Redis, we also set TTLs as a fallback to avoid stale entries sticking around too long. This helped us maintain eventual consistency without overloading the DB.

### 15. How would you detect and resolve performance bottlenecks?

- 1. Monitoring & Observability
     Start by using tools to get metrics, logs, and traces:
     - Infra - CloudWatch, Prometheus, Grafana CPU, memory, disk I/O, network
     - App - APMs like New Relic, AppDynamics, Dynatrace Slow API calls, DB queries
     - Logs - ELK (Elastic), Loki, Fluentd Errors, exceptions
     - Traces - Jaeger, Zipkin, X-Ray End-to-end latency breakdown
- 2. Resolve Based on Root Cause
     - Application Layer : Optimize code or business logic,Use async where possible,Reduce unnecessary API/database calls
     - Database : Add indexes,Optimize slow queries (use EXPLAIN),Add read replicas or cache results
     - Load Balancer : Use health checks, autoscaling,Enable sticky sessions if needed
     - Cache Layer : Use Redis or Memcached to avoid repeated DB hits,Apply appropriate TTL + eviction policy
     - Network/CDN : Use Cloudflare, Akamai, or CloudFront to cache static assets.Minimize payload size
- “To detect bottlenecks, I start with full-stack observability using tools like Dynatrace and ELK. I check latency across services using distributed tracing, then drill into logs and metrics to isolate the slow component — whether it’s API logic, DB queries, or external services. For example, in one case, we identified a slow SQL query missing an index, which we optimized to reduce API latency from 1.5s to 300ms. We also used Redis as a cache and enabled auto-scaling in our backend pods.”

### 16. How do you debug latency issues in a microservices architecture?

- To debug latency in microservices, I start with distributed tracing using tools like Dynatrace or Jaeger. I trace the request flow to see which service is slow, then use logs with correlation IDs to dig deeper. In one project, we found that the user-service was taking 2s due to a missing DB index. We added the index and introduced Redis cache for hot data, which brought latency down to 300ms. I also look at infrastructure metrics like CPU/memory and check for API retries or downstream timeouts.
- Common Latency Causes in Microservices
  - N+1 queries Calling DB/API repeatedly inside a loop
  - Missing indexes DB taking too long
  - Chained services One service waiting on many others
  - Network hops Too many layers or regions
  - Rate limiting or throttling Queuing up requests
  - DNS or service discovery issues Delays in resolving addresses

### 17. What would you do service discovery delays in resolving addresses?

Reason for delay in service discovery

- Slow DNS Resolution
- Frequent DNS Lookups
- Stale DNS Cache
- Misconfigured Service Mesh / Envoy / Istio
  Tools
- CoreDNS logs (K8s default DNS)
- tcpdump to trace DNS requests
- traceroute/dig to test resolution time
- Service Mesh Dashboards (Istio, Consul, Linkerd)

Interview Answers : We noticed increased latency due to slow DNS resolution. Using CoreDNS metrics, we found thousands of requests per second from each pod. We tuned the TTL settings and introduced local DNS caching to reduce lookups, which helped bring down inter-service latency by ~20%.

- [The Twelve-Factor App principles?](#12-app)
  - Alternative Method to 12-Factors
    - 15 Factor APP
    - Cloud Native APP
    - MicroService Architecture
    - Nginx Microservices Reference Architecture
- [Shared Nothing Architecture](#share-nothing)
- [Eventually Consistent Mean](#eventual-consistents)
- [BASE Property Of A System](#bas-e)
- [2-Phase Commit Protocol](#2PA)
- [Heuristic Exceptions](#he)
- [Improve API Performance - Microservices](https://github.com/pracks224/Interview_Prep/blob/main/Design_API_Performance_Improvement)
- [Must Read Books- System design The big archive](https://github.com/pracks224/Interview_Prep/blob/main/system_design_the_big_archive.txt)
- [Grokking System Design Notes](https://github.com/pracks224/Interview_Prep/blob/main/grekking_in_short.txt)
- [Design FB Messanger]()
- [Design Instagram]()
- [Design StockMarket](STOCK_MARKET.md)
- CDNs
- [System Design Content Delivery Network.](https://www.youtube.com/watch?v=8zX0rue2Hic)
- [System Design Distributed Cache and Caching Strategies | Cache-Aside, Write-Through, Write-Back](https://www.youtube.com/watch?v=RtOyBwBICRs)
- [Latency Vs ThroughPut ?](https://aws.amazon.com/compare/the-difference-between-throughput-and-latency/)
- [What is CAP Theorem](https://www.bmc.com/blogs/cap-theorem/)
- [What is Load Balancing](https://aws.amazon.com/what-is/load-balancing/)
- [Design Elevator](https://medium.com/geekculture/system-design-elevator-system-design-interview-question-6e8d03ce1b44)
- [Design API Performance Improvements](#api-improvements)
- [Store trillions of Data](https://medium.com/@iBMehta/how-discord-stores-trillions-of-messages-31ed9195c3e8)

  - MongoDB upto ~100 millions
  - Cassandra is better for Billions of data uses LSM for retreiveal. Read is expensive than write
  - ScyllaDB with Rust API is good for Trillions of data

- [Well documented - All Concepts in one Place](https://github.com/black-shadows/System-Design)

- Design Data Intensive Application Book Overview.
- Consistency Hashing.
- Isolation levels.
- 2PL
- [How to make the API end point faster.](https://medium.com/design-bootcamp/how-i-optimized-an-api-endpoint-to-make-it-10x-faster-2f5fe9a84bd9)

- [Scalable Notification System](https://medium.com/@adityagoel123/designing-scalable-notification-system-79f83272755e)

- [What is DDOS(denial of service ) attack and how will we prevent from this in our Applications ?]()

- [Building & deploying highly available and low latency systems as service-oriented architecture, event driven architecture using Spring Boot, Kafka]()
- [Design high available fault tolrent system](#active-active)
- [How do you monitor the health of nodes in Active-Active and Active-Passive environments?](#monitor)

<a id="12-app"></a>

#### The Twelve-Factor App principles:

- Best Practices to build modern,scallable and resillient cloud native application
  - Codebase -> One Codebase and Many Deployment
  - Dependencies -> It should be declarable
  - Config -> Configuration that varies between deployments should be stored in the environment
  - Build,Release,Run -> The delivery pipeline should strictly consist of build, release, run, Each process should be independent
  - Stateless Process -> There will be no session data maintained in any of the processes, and each process independently serves the request without communicating with other processes.
    Any data that needs to persist must use a backing service such as a database.
  - Port Binding
  - Disposability
  - Dev/Prod Parity
  - Logs -> treating logs as event streams ,do not store it as part of the app
  - Admin -> The developer often needs to perform administrative or maintenance activities for apps that need data migration,
    running processes, or one-time scripts. These should also be identical across different landscapes (DEV, QA, and PROD).
    These processes should also be shipped along with the application code to avoid synchronization issues.

<a id="share-nothing"></a>

#### Shared Nothing Architecture:

- SNA Shared Nothing Architecture (SNA) is a distributed computing architecture where each node (processor/memory/storage unit)
  in a computer cluster is independent and self-sufficient, with its own dedicated resources
- Shared-Nothing Architecture is a popular design for building scalable, fault-tolerant distributed systems
  like databases, big data platforms, and cloud infrastructure.
- ##### How Data Consistency Mantained in SNA
  - Compensating Transactions
  - Partitioning and Sharding
  - Eventual Consistency
  - Versioning and Timestamps
  - Monitoring and Alerting

<a id="eventual-consistents"></a>

#### Eventual Consistent:

- Eventual consistency is often used in NoSQL databases and microservices architectures
  where high availability is prioritized over strong consistency
  - How to Implement Eventual Consistency? - Asynchrnous Replication - Conflict Resolution - Versioning and Timestamp - Quorum Read - Compensating Transaction - Monitoring and Alerting
    <a id="bas-e"></a>

#### What Is BASE Property Of A System?

- Basically Available, Soft State, and Eventual Consistency.
- Alternatibe to ACID property
- System based on BASE ==> NoSQL DBs,Social Media platforms,E-commerce platform etc.
- Soft State: The soft state property implies that the state of the system can change over time.
  This change can occur due to background processes, updates to data, or other factors
- Basically Available: This property ensures that the system is available most of the time,
  even in the face of failures. It prioritizes availability over consistency
- Eventual Consitency

<a id="2PA"></a>

#### Two Phase Protocol

<a id="he"></a>

#### What are Heuristic Exceptions?

#### What is Multi Tenant Service and how do you support at service level.

<a id="active-active"></a>

#### Active - Active or Active-passive system design

- Active -passive : Often used in disaster recovery, database replication setups, or systems that don’t require load balancing but need high availability.
- Active-Active setups are ideal for high availability and load distribution, while Active-Passive is often more about ensuring backup and continuity with less complexity.
- What are some use cases for choosing an Active-Active setup over an Active-Passive setup, and vice versa?
- How do you monitor the health of nodes in Active-Active and Active-Passive environments?
- In summary:

Active-Active is ideal for high-traffic, highly available, geographically distributed, and performance-critical applications.
Active-Passive works well for budget-conscious, non-critical, disaster recovery, and predictable-use applications where failover is the main priority.

<a id="monitor"></a>

#### Monitor

- Application-Level Monitoring tools like AppDynamics, Dynatrace, or custom scripts
- Data Consistency Checks Data replication tools (e.g., Galera Cluster for MySQL, Cassandra, or Elasticsearch clusters) often have built-in consistency checks.
- Performance Metrics Monitoring Tools like Prometheus, Grafana, Datadog, or New Relic
- Health Checks and Heartbeats Periodic checks on each node's availability, response time, and connectivity status.Using protocols like HTTP, TCP, or ICMP pings, health checks and heartbeats continuously monitor each node’s responsiveness and status. This can be done using tools like HAProxy, NGINX, or cloud load balancers (e.g., AWS Elastic Load Balancing).

<a id="api-improvements"></a>

#### How to improve the API performance ?(Very Important)

- 1.Caching - Use Redis/MemChahe if cache miss hit the db
- 2.Pagination - If huge amount of data
- 3.Proper Conncetion Pool -> Creates a major problem in case serverless like lambda ,function etc they use their own db connections. Hence it's important to manage it better.
- 4. Payload Compression
  5. Asynchronous logging - Write log is problematic when the number request is more. Hence to use asynclog
  6. Avoid N+1 Problem. Try to fetch all the required data in one query rather multiple .(Simplyfy your databsae query)
  7. JSON Serializer ???
  8. Leverage CDN Services for faster content delivery.
  9. Rate Limiting to avoid Ddos attacks.
  10. Real time monitoring like Splunk alert,dynatrace ALert,
  11. Gzip compression: Compressed Data: If the REST resource is fairly large, it is better to allow compressed data to be sent as response. At the client end, all you need to do is to use Accept-Encoding header as gzip.
  12. Filtering: Provide only the data that is requested for. Example: GraphQL
  13. Session data is stored in memory. As traffic in your app grows, more sessions will be generated, and
      this might add significant overhead to your server. You need to find the means to store session data or minimize the amount of data stored in a session. Modules such as Express.js can help you create stateless server protocols. Stateless protocols do not save, or store any information from previous visits.
      Switch to an external session store such as Redis, Nginx, or MongoDB. Whenever possible, the best option would be to store no session state on your server-side for better performance.
      GraphQL and REST APIs are stateless.
