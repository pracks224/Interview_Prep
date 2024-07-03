**Table of content:**

### Itertaion 1

1. [Classification of patterns](#p)
   - [Creational Pattern](#cp)
   - [Structural Pattern](#sp)
   - [Behavioral Pattern](#bp)
2. [Structural Pattern UseCases](#spu)

### Itertaion 2

3. # [In progress]()

===============================================================================================

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
