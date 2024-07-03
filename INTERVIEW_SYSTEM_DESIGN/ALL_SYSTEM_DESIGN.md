**Table of content:**

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
- CDNs
- [System Design Content Delivery Network.](https://www.youtube.com/watch?v=8zX0rue2Hic)
- [System Design Distributed Cache and Caching Strategies | Cache-Aside, Write-Through, Write-Back](https://www.youtube.com/watch?v=RtOyBwBICRs)
- [Latency Vs ThroughPut ?](https://aws.amazon.com/compare/the-difference-between-throughput-and-latency/)
- [What is CAP Theorem](https://www.bmc.com/blogs/cap-theorem/)
- [What is Load Balancing](https://aws.amazon.com/what-is/load-balancing/)
- [Design Elevator](https://medium.com/geekculture/system-design-elevator-system-design-interview-question-6e8d03ce1b44)

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
