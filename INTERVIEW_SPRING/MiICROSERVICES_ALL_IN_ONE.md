**Table of content:**

- [Event Sourcing](#ms-1)
- [Data Consistency in a microservices ](#ms-cons)
- [When we say Well Designed MS](#ms-design)
- [Security In MS](#ms-secuirty)

<a id="ms-1"></a>

### Event-Sourcing

- [source](https://medium.com/@ronen.albagli/event-sourcing-made-simple-a-high-level-overview-ed3d6fc01711#:~:text=Event%20Sourcing%20is%20a%20design,any%20given%20point%20in%20time.)
- Design pattern capturing events from differnt source or services and stores. To tackle the challnges of large data volumes of events we can use SNAPSHOT (consolidating after scertain number of events),CQS or CQRS (Command query serparation) for read and write events to attain eventual consistency.
- Technollogy can be used like Kafka to store the events as logs.

<a id="ms-cons"></a>

### Data Consistency In Micro Services

[source](https://dilfuruz.medium.com/data-consistency-in-microservices-architecture-5c67e0f65256)
- Data Consitency challenging in micro services as we have databse per service compared to monolithic where db is central
-  To manage distributed transaction , in case of MSs we have multiple approach
   ### 2Phase Commit
      *  Ensures Tight consistecny but latency is more becoz of blocking nature . And Single point of failure becoz of the transaction coordinator.Based on ACID
      *  Eventual Cositency
            - It follows BASE (Basically Available,Soft-State,Eventual COnsistency)
            - SAGA is the common pattern to acgeive the ES
            - Two types  Choreography-based -> Uses EVENT SOURCING for each events
                                 Orchestration based -> Compensation action if it fails
              Framewrok supports SAGA => Apache Camel ,Camunda

<a id="ms-design"></a>

### Well Design Microservice Characterstics

- Important charactersics of wel designed MS
  * Single Responsibility Principle
  * Loose Coupling (reduce dependency between component)
  * Independent Deployment
  * Resilience (Handle failure gracefully and recover from error without impacting entire system)
  * Scalability (Horizonatl Scalability ,ensure best resource utiloization)
  * Polyglot persistence  Different MS can use different database based on requirement
  * Monitoring and Observality : loging and robust monitoring.

<a id="ms-secuirty"></a>

### How to secure Microservices or what are the differnce approaches ?
