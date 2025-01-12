### SNS (SIMPLE NOTIFICATION SERVICE):
--------------------------------------
--------------------------------------
1. What is SNS ?
2. How does AWS SNS differ from SQS (Simple Queue Service)?
3. What is an SNS Topic?
4. What are the main components of SNS?
5. What message delivery protocols does SNS support?
6. How do you ensure message delivery in AWS SNS?
7. What is message filtering in SNS, and how does it work?
8. How do SNS access policies work?
9. What is the maximum message size in AWS SNS?
10. How do you integrate SNS with AWS Lambda?
11. Explain SNS’s cross-account access feature.
12. What is FIFO (First-In-First-Out) in SNS, and when would you use it?
13. How do you monitor and troubleshoot SNS?
14. What are some real-life use cases for AWS SNS?
15. Design policyrenerwal notification system using SNS .
16. How would you implement a fan-out architecture using SNS?
17. [How can you achieve message deduplication in SNS?](#17)
18. What are the limitations of AWS SNS?

<a id="#17"></a>

### FIFO Topic 

1. Topic name should suffix with .fifo
2.  FIFO topics receives the message with deduplication id from the publisher and checks the same deduplicayion id then discards it
3.  Also, FIFO topic ensures ordering using group id ,If any message comes with group id then it mantians the order or else it publish concurrently.

### Limitations of SNS

-  Rate limit (FIFO topic 300 transaction per sec but standrad has limit though .Still limited)
-  Subscription Limit (Max 10,000)
-  Size of the message (256 KB)
-  Message retention : SNS does not retain messages. Once a message is delivered to all subscribers (or the maximum delivery attempts are reached), it is permanently deleted. This means you cannot re-read or replay messages after delivery.
