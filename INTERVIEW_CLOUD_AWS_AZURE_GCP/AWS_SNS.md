1. How would you use AWS SNS and AWS SQS for asynchrnous communication and message processing in microservice architectute?

Ans.
AWS SNS (Simple Notification Service)

- SNS provides pub-sub messaging system
  AWS SQS (Simple Queue Service)
- SQS provides a messaging queueing system
  Together builds a scalable and flexible messaging-processing system
  In this architecture, One Microservice publishes a message to SNS topic and multiple microservices subscribe to the same topic to receive the message
  -> Messages stores in the Queue for worker microservices to act on it asynchronously
  -> Dead Letter Queue can also set up in SQS to store messages which can not be processed due to some reason.
