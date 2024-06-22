**Table of content:**

### Itertaion 1

1. [Classification of patterns](#p)
   1.1 [Creational Pattern](#cp)
   1.2 [Structural Pattern](#sp)
   1.3 [Behavioral Pattern](#bp)
2. [Structural Pattern UseCases](#spu)

### Itertaion 2

3. # [In progress]()

<a id="p"></a>

There are three main groups of design patterns in software development.

    * Creational Pattern - provides object creation that increases flexibility and reuse of existing code
    * Structural Pattern - Explain how assemble objects and classes into larger structures
    * Behavioral Pattern - Provides effective communication and the assignments of responsiblities between objects

Structural Patterns

- Adapter
- Bridge
- Composite
- Decorator
- Facde
- Flyweight
- Proxy

=============================================================================================================

#### Structural Patterns UseCases :

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

==========================================================================================================
