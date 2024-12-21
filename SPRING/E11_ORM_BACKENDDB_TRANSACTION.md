Question 1 : How can you manage transactions across multiple databases in Spring?

Question 2 : XA and non XA transactions

Question 3 : Dirty Read, Phantom Read and Isolation Levels explain with one example.

Question 4 : Distributed Transaction Explain.







### Dirty Read

Occurs when a transaction reads data that has been modified but not yet committed by another transaction. If the uncommitted transaction rolls back, the data read becomes invalid.
Isolation Level: Happens in Read Uncommitted.

### Phantom Read

Occurs when a transaction reads a set of rows, and another transaction inserts or deletes rows that affect the result set during the execution of the first transaction.

Isolation Level: Prevented only in Serializable.

### Isolation Levels

# Isolation Levels in SQL

| **Isolation Level**  | **Dirty Read** | **Non-Repeatable Read** | **Phantom Read** |
|-----------------------|----------------|--------------------------|-------------------|
| **Read Uncommitted** | Possible       | Possible                 | Possible          |
| **Read Committed**   | Prevented      | Possible                 | Possible          |
| **Repeatable Read**  | Prevented      | Prevented                | Possible          |
| **Serializable**     | Prevented      | Prevented                | Prevented         |


### [OPTIMISTIC LOCKING(E1.1)](#e1-1)

#### 2.If One table accessed by two user from front end at a time, Like Rohshin accessed the employee table ,updated the email of an user same time Roshan updated it ? How to tackle it ?

### [DISTRIBUTED TRANSACTION(E1.1)](#e1-1)

#### 1. How to update two same table but in differnet datasources ?

When two users (Rohshin and Roshan) simultaneously access and attempt to update the same record (e.g., an employee's email) in a table, concurrency control mechanisms are required to ensure data integrity. Here's how you can tackle this scenario:

1. Optimistic Locking
   Version Field: Add a version field (e.g., version or last_updated) to the employee table.
   Check Version: When Rohshin and Roshan load the employee record, they each get the current version.
   Update Attempt: Before updating, each user checks if the version in the database matches the version they fetched.
   Conflict Detection: If the versions match, the update proceeds, and the version is incremented. If not, an exception is thrown, indicating a conflict, and one of the users must refresh the data and try again.
2. Pessimistic Locking
   Lock Row: When Rohshin or Roshan begins to update the record, the row in the database is locked.
   Prevent Other Access: The lock prevents the other user from updating the record until the first user completes their transaction.
   Release Lock: Once the transaction is complete (commit or rollback), the lock is released, allowing the other user to proceed.
3. Last Write Wins
   Overwrite: Allow both updates to proceed, with the last one overwriting the previous one.
   Risk: This approach is simpler but risks losing data if updates are not coordinated.
4. Merge Changes
   Detect Differences: When a conflict occurs, compare the changes made by both users.
   Manual Merge: Prompt the users to resolve the conflict by merging the changes manually.
5. User Notifications
   Alert Users: Notify users when the record they are editing has been updated by someone else. They can then choose to refresh or save their changes.
6. Transaction Isolation Levels
   Serializable Isolation: Use the highest isolation level to ensure transactions are executed one after the other, preventing conflicts.
   Repeatable Read: Ensures that if a user reads a row, they will see the same data until their transaction completes, preventing non-repeatable reads but not phantom reads.
   Summary
   The most common and recommended approach in a web application is Optimistic Locking, as it balances performance with data integrity without the overhead of locking resources for extended periods. However, depending on the specific use case and requirements, other strategies like Pessimistic Locking or conflict resolution through merging can also be applied.

### [LOCAL TRANSACTION(E1.1)]()

- Some examples of distributed transaction managers include Atomikos, Bitronix, and Narayana.

- To ensure both tables are updated under the same transaction, even though they are in different data sources, you need to use distributed transactions (or XA transactions) which allow you to coordinate transactions across multiple data sources.

- Spring Boot supports distributed transactions using JTA (Java Transaction API). Here’s how you can configure and implement it.

1. What is a Local Transaction?
   Local Transaction: A transaction that is confined to a single transactional resource, such as a single database. In a local transaction, all the operations are performed within the same resource, and the resource itself (like a relational database) manages the transaction.
   Local transactions are simpler and more efficient than distributed transactions because they do not require coordination across multiple resources.

2. Transaction Management in Local Transactions
   Resource-Managed Transactions: The transaction is managed by the resource itself (e.g., a relational database using JDBC).
   Spring’s @Transactional: In Spring, the @Transactional annotation can be used to manage transactions declaratively. When using a single data source, Spring uses a local transaction manager (e.g., DataSourceTransactionManager for JDBC) to manage the transaction.

3. Do You Need a Transaction Manager for Local Transactions?
   Yes, you need a transaction manager, but it’s a local transaction manager provided by Spring, such as:

DataSourceTransactionManager: For JDBC-based transactions, this is used to manage transactions on a single data source.
JpaTransactionManager: For JPA-based transactions, this manages transactions for a single JPA EntityManagerFactory. 4. How Spring Manages Local Transactions
When you define a transaction with @Transactional in a Spring application that uses a single data source, Spring uses a local transaction manager to handle the transaction. This transaction manager delegates the transaction control to the underlying resource (like a database).

Here’s how it works:

Beginning the Transaction: When a method annotated with @Transactional starts, Spring asks the local transaction manager to start a new transaction.
Commit or Rollback: At the end of the method, Spring asks the transaction manager to commit the transaction if everything is successful. If an exception occurs, it asks the transaction manager to roll back the transaction.
No XA Protocol: Since everything happens within a single resource, there is no need for the XA protocol or a global transaction manager like JTA. 5. When to Use Local Transactions
Single Data Source: If your application interacts with only one data source (e.g., a single database), local transactions are sufficient and more efficient.
Single Resource: Use local transactions when your transaction only spans a single transactional resource, such as a single database or a single JMS queue.

Example: Using Local Transactions with Spring
Configuration:
If you are using JDBC, Spring will automatically configure a DataSourceTransactionManager when you define a DataSource bean

== == == ==

In a local transaction managed by DataSourceTransactionManager, concurrent updates to the same table are handled through the database's concurrency control mechanisms, such as locking and transaction isolation levels. Here's how it works:

1. Concurrency Control via Locking
   Pessimistic Locking: The database may place locks on the rows being updated to prevent other transactions from modifying them until the current transaction is complete. For example:

Exclusive Lock (Write Lock): Prevents other transactions from reading or writing the locked rows.
Shared Lock (Read Lock): Allows other transactions to read but not modify the locked rows.
Optimistic Locking: Instead of locking rows, the database checks for conflicts at the time of commit. If another transaction has modified the same data, the transaction is rolled back, and the application can retry the operation.

2. Transaction Isolation Levels
   The DataSourceTransactionManager uses the transaction isolation level to control how data changes made by one transaction are visible to others. Common isolation levels include:

READ COMMITTED: Ensures that a transaction only reads data that has been committed by other transactions. It prevents dirty reads but allows non-repeatable reads and phantom reads.
REPEATABLE READ: Ensures that if a transaction reads a row, subsequent reads within the same transaction will see the same data, preventing non-repeatable reads. It can still allow phantom reads.
SERIALIZABLE: The highest isolation level, which ensures that transactions are executed in a way that makes them appear as if they were run sequentially. This prevents dirty reads, non-repeatable reads, and phantom reads but can lead to more locking and reduced concurrency. 3. Handling Concurrent Updates
When two transactions try to update the same row at the same time:

If using Pessimistic Locking: The first transaction to acquire the lock will proceed, and the second transaction will be blocked until the first one completes.

If using Optimistic Locking: Both transactions may proceed simultaneously, but when one tries to commit, the database will check if the data has been modified by another transaction. If a conflict is detected, the transaction will fail, and you can handle the retry logic in your application.

If using Isolation Levels: The database ensures that the data integrity is maintained based on the chosen isolation level. For instance, with SERIALIZABLE isolation, the database might prevent one of the transactions from committing until the other has completed.

Example Scenario
Transaction 1 begins and updates a row in the employees table.
Transaction 2 begins slightly later and tries to update the same row.
Depending on the locking strategy and isolation level:

With Pessimistic Locking: Transaction 2 waits until Transaction 1 completes and releases the lock.
With Optimistic Locking: Transaction 2 may proceed, but it will fail on commit if Transaction 1 commits first.
With SERIALIZABLE Isolation: Transaction 2 may be blocked or delayed until Transaction 1 completes to ensure they do not interfere with each other.
Summary
In local transactions managed by DataSourceTransactionManager, concurrent updates on the same table are controlled by the database using locking mechanisms and isolation levels. These ensure data consistency and integrity by coordinating how multiple transactions interact with the same data at the same time.
