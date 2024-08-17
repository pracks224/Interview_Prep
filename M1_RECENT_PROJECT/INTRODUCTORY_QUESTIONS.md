### How to introduce?

Hello, I'm Prakash Sharma, Currently Serving as a technical manager,where lead a
talaneted team involved in developing wide range of insyrance product.
With over 14 + years of expreince got an opportunity to work on many differnt product organisation domain like finace,insirance,airline etc.

I have strong technical foundation with 10+ expreince of hands-on coding across many different
programming language like java,javascript,typescript,shellscript etc
My experties extends software architecture,cloud technologies,microservices architecture etc.

In my current role, I not only manage and mentor my team but also actively participate in code reviews and architectural discussions to maintain high standards of software quality. I pride myself on fostering a culture of collaboration, innovation, and continuous improvement within the team.

I’m excited about the opportunity to bring my leadership skills, technical knowledge, and passion for innovation to your organization, and I look forward to discussing how I can contribute
s
https://www.linkedin.com/in/ben-r-239268ab/

### Tell me something About your recent project,architecture,tech stacks etc.

- IFE(Interactive Front end) ==> For Insurance claim to reneal using Event Driven architecture(EDA)
- Front End => Angular with Micro front endpoints,Node Js
- Back End ==> Spring Boot, Kafka
- DataBase ==> Postgress, Casandra

#### Architecture

Event-Driven Microservices Architecture:

- Spring Boot for building the microservices.
- Kafka for asynchronous communication between services.
- Docker for containerization of the microservices.
- Kubernetes for orchestration and management of these containers.
- An Active-Active setup ensures the system is available even if one node fails.
- Auto failover mechanisms maintain continuous operation and prevent downtime.

#### Features

- Policy Enquiry API: Allows users to query details about their insurance policies.
- Vehicle Validation : Uses CBC API to validate vehicle information before processing insurance policies.
- Renewal Policy Information API
- Real-time Monitoring and Logging:
- Auto Scaling

#### Implementation

##### Implemented policy renewal API reduces response time and frequent time out by 1%. Using optimized query and caching using Redis. Can you elaborate it??

- Optimized Database Queries : Creating Indexes ex. CREATE INDEX idx_policy_id ON policies(policy_id);
- Query Refactoring : Breaking single complex query into small simple query, Reduces nested sub quereis to join etc
- Batch Processing
- Caching using redis (Caching Startegies like TTL or Cache Invalidations etc)

##### What are the steps in policy renewal generally?

- Policy Expiry Notification
- Policy Inquiry
- Review and update information
- Vehicle Validation
- Premium calculation
- Policy Renewal Offer
- Payment Processing
- Confirmation and Acknowledgement

### What is EDA and how it works ? What are different approach to implement EDA?

[Event Driven architecture overview](https://medium.com/search?q=Event+driven+using+Springboot)

- [Event Driven Architecture using Spring Cloud and Kafka broker](https://benstitou-anas.medium.com/event-driven-architecture-using-spring-cloud-and-kafka-broker-a3e7c907796d)
- [Event-Driven Architecture With Redis Streams Using Spring Boot ---> maninly for payment notification etc](https://medium.com/nerd-for-tech/event-driven-architecture-with-redis-streams-using-spring-boot-a81a1c9a4cde)
- [Event Driven Architecture using AWS SQS and Spring boot](https://anand-guptaa.medium.com/event-driven-architecture-using-aws-sqs-and-spring-boot-d29fc3b1b25b)

2. Tell me something about yourself?
   Ans :
3. What are the frontend library you have used in your project ?
   Ans:
4. What type of deployment model you have used?
   Ans :
5. What type of disister management you have in your project?
   Ans:
6. Types of MicroFront End implementations ?
   Ans :

7. Why do you choose PostgressSQl ?

8. Which version of Java ? What's the differnce between OpenJDK and OracleJDK ?

9. [How to secure your API]()
