## ITERATION 01

------------------------------- **\*\*\*** -----------------------------

#### 1. What is Kafka Broker ?

#### 2. What is Kafka Cluster ?

#### 3. What is Kafka Producer?

#### 4. What is Kafka Consumer?

#### 5. What is Kafka Connectors?

#### 6. What is Zookeeper ?

#### 7. What is Stream ?

#### 8. What is Kafka Topic?

#### 9. What is Partition in Kafka?

#### 10. What is Offset?

#### 11. What is Key and How it is differnt from Offset?

#### 12.Why Send Messages with Keys in Kafka?

#### 13.How to Send Messages with Keys in Kafka?

#### 14.Steps to work on Kafka?

#### 15.Understanding Consumer Offset, Consumer Groups, and Message Consumption in Apache Kafka

#### 16. Understanding Segments, Commit Log, and Retention Policy

#### 17. How to Make a Kafka Cluster with 3 Brokers: Understand Replication Factor.

#### 18. ISR in Kafka?

#### 19. What is Checkpointing?

#### 20. How Offsets work in Kafka ?

#### 21. How to ensure message to deliver only once ?

### [Important Link and Use cases Paypal](https://medium.com/paypal-tech/kafka-consumer-benchmarking-c726fbe4000)

### [Why Kafka is very fast](https://www.youtube.com/watch?v=UNUz1-msbOM)

### [Kafka Stream - Must reacd Book](https://assets.confluent.io/m/7997a914c1a19b5?mkt_tok=NTgyLVFIWC0yNjIAAAGGApzv7utiTseX[…]yqvKtp86XezuCYCO30eyP63XV8MjOSS5737KVpPO1BXbiPx5soDrNGE3YDA)

### [How linkedin works?](https://engineering.linkedin.com/blog/2019/apache-kafka-trillion-messages)

### [POC](https://github.com/hardikSinghBehl/kafka-java-spring-boot-poc)

### [Blogs](https://www.linkedin.com/pulse/kafka-idempotent-producer-rob-golder/)

### [Blogs-2](https://medium.com/@shesh.soft/kafka-idempotent-producer-and-consumer-25c52402ceb9)

#### can we create dynamic consumer in kafka.

#### My producer generates topics where prefix will be fixed.And I want all of those topics to be consumed by one consumer .Is it possible in kafka?

#### Tell me about some of the use cases where Kafka is not suitable.|

#### Describe message compression in Kafka. What is the need of message compression in Kafka? |

#### What do you understand about log compaction and quotas in Kafka?|

#### Explain the four core API architecture that Kafka uses.|

#### What do you mean by a Partition in Kafka?|

#### What do you mean by zookeeper in Kafka and what are its uses?|

#### Differentiate between Rabbitmq and Kafka.|

#### What do you understand about Kafka MirrorMaker? |

#### What do you mean by confluent kafka? What are its advantages?|

#### How are partitions distributed in an Apache Kafka cluster? |

#### What is the purpose of ISR in Apache Kafka?|

#### [How you will handle 50K req per second because coping 50K messages to kafka will also take some time](#12)|

#### Tell me about some of the use cases where Kafka is not suitable.|

#### Describe message compression in Kafka. What is the need of message|

#### Tell me about some of the use cases where Kafka is not suitable.|

#### Describe message compression in Kafka. What is the need of message |

#### Tell me about some of the use cases where Kafka is not suitable.|

#### Describe message compression in Kafka. What is the need of message|

#### Tell me about some of the use cases where Kafka is not suitable.|

#### Describe message compression in Kafka. What is the need of message |

#### Can we add consumer dynamically to Kafka ?

#### What are the differnet Partition Startergy ?

#### Mention the differnce between Kafak and JMS?

#### How to avoid duplicate event kafka ?

=======================================================================================

1. Broker is the instance where Kafka is installed
2. Clusetr is the group of Brokers
3. Producer write/send new data to Kafka Broker/Cluster
4. Consumer reads the data.
5. Zookeeper is the monitors the Kafka cluster health
6. Connects is basically a configuartion used to pull data externally.
7. Stream is used to transform data
8. Topics are the table like structure of data base. Resides inside the broker.
   Topics has partions. Producers produces messages and send to topic or keys
9. Topic has many partitions like p0,p1,p2 etc.
   All the partitions are independent each other. All the partition are ordered and immutable sequence.All the transactions stores in distributed logs files.
10. An offset is unique identifier to each message within a partion assigned.
    It represent the position of a message in the partition.
11. Offsets in Kafka are unique, sequential identifiers for each message within a  
    partition, ensuring message order and tracking consumption.

- Keys, on the other hand, determine which partition a message is sent to, enabling message grouping and partition-specific processing. While offsets manage message position, keys manage message distribution.

12/13. Importance of using Keys :

- When producers send messages to Topics/Partions , It will insert into Partions in round robin fashion Producer - Send messages m1,m2,m3, m4 .
- Let's say Topics has p1,p2 partions,Then messages will insert into p1 - m1 -> p2 - m2 -> p1- m3 -> p2 - m4 etc The problem with this approach is it fetches in unorders fashion. To avoid we have to pass the message with keys.
- When message passed with keys, partiotoner created a hash and bind it to a prticular partion.
- Key is optional . With out key sending messages wont guarntees the ordering of the message as the consumer poll the messages from all partions at the same time.

#### Partitioning:

Kafka topics are divided into partitions, and keys determine the partition to which a message is sent. Using keys ensures that messages with the same key are sent to the same partition. This can be critical for order guarantees within a partition.

#### Data Locality:

By controlling which partition a message goes to, you can optimize for data locality. For example, you might want all data for a specific user or entity to be in the same partition for efficient processing.

#### Load Balancing:

Proper use of keys can help distribute the load evenly across partitions. Without keys, Kafka uses a round-robin approach which might not always be optimal.

#### Scalability:

As the number of partitions increases, using keys helps in scaling the system by distributing the load evenly and ensuring that new partitions do not disrupt the data distribution.

#### Consistency:

For certain applications, it’s crucial that related data is processed in order. Keys ensure that all related messages are processed by the same consumer, maintaining consistency.

```
String topic = "my_topic"; String key = "my_key"; String value = "my_value";
ProducerRecord<String, String> record = new ProducerRecord<>(topic, key, value);
```

14. Steps to work on Kafka

- Start Zoo Keeper (bin/zookeeper-server-start.sh config/zookeeper.properties)
- Start Broker (bin/kafka-server-start.sh config/server.properties)
- Create Topic
- Start a Producer and send message
- Start consumer and read message

15/19/20.

- When a producer sends a message to a Kafka topic, Kafka assigns an offset to the message within the specific partition it is sent to. The producer does not need to know the offset; it is managed by Kafka.

- Consumers read messages from partitions using offsets. They can start consuming from the beginning of the partition (offset 0), from the end (new messages), or from a specific offset. The consumer maintains the current offset for each partition it reads from.

- When a consumer group reads a message from a topic, each member of the group mantains its own offset and updates it as it consumes message.
- when consumer created - > it will assigned with a group id . One consumer grouop can have multiple consumers.
- All the offset stores in \_consumer_offset named topic. \_consumer_offset is the builtin topic in apache kafka that keeps track of the latest offset commited forv each partion of each consumer group.
- Important - There is separate \_\_consumer_offset for each consumer group.
- The group co ordinator uses this information to manage the assignment of partitions to consumers and ensure that each partion is being consumed by exactly one consumer in the group.
- The group co ordinator will determine which partition the consumer assigned to be.
- STICKY FASHION --> Consumer will assigned to the same partion until its on the same Consumer group.

  16.Understanding Segments, Commit Log, and Retention Policy
  Segments : Particular set of messages ,Ek partition me bahut sare messages rehete hai. Ek segement ka size we can define.

Commit Log : In the server.properties -> directory for commit log All the messages stored in the commit log folder as .log files As manay partions for a topic ,that many folders will be created E.g. -> Topic name food with 4 partitions food_0 food_1

Retentions Policy : Two types Data Based policy -> after a size it will delete Time Based policy -> By default 168 hours and after that the file will deleted

Actually data stores in .log file in encoded format and consumer decode it before uses.

17. How to Make a Kafka Cluster with 3 Brokers: Understand Replication Factor.
    A Kafka cluster is a distributed system that consists of multiple Kafka brokers. Each broker is a server that runs Kafka to manage and store message data. Each will unique broker Id.

The replication factor refers to the number of copies of each message that are stored in the Kafka cluster for fault tolerance.

When a topic is created with a replication factor of N, Kafka ensures that there are N replicas of each message distributed across the brokers in the cluster. This allows for high availability and fault tolerance, as well as scalability for handling large volumes of data.

E.g. One Zoo keeper and 3 Brokers Create topic command kafka-topics.bat --create --topic gadgets --bootstrap-server localhost:9092,localhost:9093,localhost:9094 --replication-factor 3 --partition 3 In this 9092/9093/9094 are the brokers and replication fator 3 means creates 3 copies But when producer sends message,It will send to one broker who is the leader for that partion and then it will replicate inn other two. Similarly we can create prodcuers using command kafka -consumer-console.bat --bootsrtap-server --from-begining

18.ISR in Kafka
In Sync Replica . To see the list of topics kafka-topics.bat --describe Lets say one broker down ,the automatically leader will be assigned in sync.

19. Checkpointing -

    Kafka allows consumers to periodically commit their current offset to a special topic called "\_\_consumer_offsets". This process is known as checkpointing and helps in fault tolerance by enabling consumers to restart from the last committed offset.
