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

12.
