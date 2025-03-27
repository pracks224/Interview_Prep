**Table of content:**

### Itertaion 1

1. [Classification of patterns](#p)
   - [Creational Pattern](#cp)
   - [Structural Pattern](#sp)
   - [Behavioral Pattern](#bp)
2. [Structural Pattern UseCases](#spu)

3. [Why need interface if there is Abstract class?](#3ia)

4. [OutOfMememory vs Memory Leak ?](#4Om)
5. [All about Singleton](#singleton)

===============================================================================================

#### SOLID

- Single Responsibility - One class related functionality
- Open/Close Principle -
  - Software entities should be open for extension, but closed for modification.
- Liskove Substitution (LSP)-

```
A subclass should be replaceable for its parent class without affecting the program.

class Bird {
    void fly() { System.out.println("Bird is flying"); }
}

class Sparrow extends Bird { } // ✅ Still follows Bird behavior

class Penguin extends Bird {
    void fly() { throw new UnsupportedOperationException("Penguins can't fly"); } // ❌ Breaks LSP
}

```

- Interface Segregation - Class should not implement unrelated interfaces
- ##### Dependency Inversion Principel (DIP)
  - High-level modules should not depend on low-level modules. Both should depend on abstractions.
  - Use dependency injection instead of direct object creation.
  ```
  interface Database {
    void save(String data);
  }
  ```

class MySQLDatabase implements Database {
public void save(String data) { System.out.println("Saving to MySQL"); }
}

class UserService {
private Database database;

    UserService(Database database) { // Dependency Injection
        this.database = database;
    }

    void saveUser(String user) {
        database.save(user);
    }

}

```
- UserService directly doesnt depend on MySQLDatabase diretly
<a id="p"></a>

There are three main groups of design patterns in software development.

- Creational Pattern - provides object creation that increases flexibility and reuse of existing code
- Structural Pattern - Explain how assemble objects and classes into larger structures
- Behavioral Pattern - Provides effective communication and the assignments of responsiblities between objects

Structural Patterns

- [Adapter](https://medium.com/javarevisited/top-structural-design-patterns-with-real-examples-in-java-7eede31bde45)
- [Bridge](https://howtodoinjava.com/design-patterns/structural/bridge-design-pattern/?source=post_page-----7eede31bde45--------------------------------)
- [Composite]()
- [Decorator](https://howtodoinjava.com/design-patterns/structural/decorator-design-pattern/?source=post_page-----7eede31bde45--------------------------------)
- [Facde]()
- [Flyweight](https://howtodoinjava.com/design-patterns/structural/flyweight-design-pattern/?source=post_page-----7eede31bde45--------------------------------)
- [Proxy](https://refactoring.guru/design-patterns/proxy?source=post_page-----7eede31bde45--------------------------------)

- [Differnce between HashMap,TreeMap and LinkedHashMap]()
- [Destory Singleton Using Reflcection]()
- [Serilaization and Singleton]()
- [Enum Singleton](https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples)

- [BillPugh Singleton Implementation - Using Static helper vs DoubleCheck Singleton + Clonable exception](https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples)

- [Marker Interface and Annotation]()
- [Memory Leak - Reasons]()

===============================================================================================

#### [Structural Patterns UseCases :](https://medium.com/javarevisited/top-structural-design-patterns-with-real-examples-in-java-7eede31bde45)

A. Suppose you have a Retail or E-commerce system that has different payment gateways. Each gateway has its implementation and APIs, and you want to integrate them into your system: GatewayA and GatewayB. Your system may only have one interface, so you should use that one and implement each separately.

B. Let’s say we want to generate a report for some Products

Assume you have some “Report” generators in your system that can generate different outputs. You just want to pass data and generate the report. That’s all.

C. I just want to display the hierarchy for a tree of files and directories with indentation.In our computers is file system components. There are directories and files. Each directory can contain some directories and files.

D. Suppose you want to build a file downloader application which it should download and store files on any operating system.

You should be able to add more platform support in the future with minimum changes.
Additionally, If you want to add more support in the downloader class (e.g. delete the download in Windows only), then It should not affect the client code as well as the Linux downloader.

E. Let’s have a common usecase where we have to show all user created reports to admin. Now, these reports can fall into these categories.

Client reports
Support reports
Both of these reports must have their first column as a link to original report and they should have different coloring. Possibly they should be opened in different popup window sizes. These are just few things, a lot can come in reality.

F. You are developing a library management system where access to certain restricted books needs to be controlled. The system should allow regular users to access general books directly, but for restricted books, access should be granted only if the user has special permissions. Implement a solution that transparently handles the access control for restricted books, ensuring that users without the necessary permissions are prevented from viewing them, while those with permissions can access them seamlessly.

======================================================================================================

#### Software Design Principles

1. [Solid]()
2. [DRY]()
3. [KISS]()
4. [GRASP]()
5. [High Cohesion]()
6. [Low Coupling]()

<a id="3iA"></a>

### Why interface if Abstract class?

- Interface allows multiple inheritance,so that class can implement multiple interface but abstract class wont allow multiple inheritance
- Interfaces provide a way to define a contract or capability that multiple classes, potentially unrelated in their hierarchy, can implement. They are essential for achieving multiple inheritance of type.
- Abstract classes allow sharing of code and state among a group of related classes. They provide a common base for subclasses and allow you to define methods with default behavior that can be shared and overridden by subclasses.
- Default methods in Java 8 blurs differnce between Interface and Abstract class but still Interface can not have constructor and can not mantain states

<a id="4Om"></a>

### Memory Leak

- Memory leak refers to a situation where it never be garabge collected . like collection in sttaic block,listner/callabck register but unregister if nt in use,inner clss,caches with out eviction policy,db connection,io streams.
- Memory leaks leads to slowly towards OutOfMemory
- Detection using VisualVM,Jprofiler,Eclipse Memory Analyser
- How to avoid
- Close resources
- Use WeakHashMap when storing key needs to be garbage collected

<a id="singleton"></a>

### Singleton
[more](https://medium.com/@jayram_manale/mastering-singleton-design-patterns-in-java-a-complete-guide-with-real-world-examples-9ed6d59e2dbf)
```
