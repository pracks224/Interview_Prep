### [Java Stream](CJ_Streams.md)

### [Collections](CJ_Collections.md)

### [Thread](CJ_Multithreading.md)

### [Java 8 Sample Coding Questions](CJ_Sample_Coding_Question.md)

### [Thread](CJ_DesignPatterns.md)

### [Thread](CJ_Java8_Features.md)

### [Change Of feature Post Java 8](CJ_Java8_Features.md)

### CJ6. Why migration needed from Java 8 to Java 21

Ans :

| Reason                           | Details                                                                                                           |
| -------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| 🔐 **Security**                  | Java 8 is out of public updates unless on commercial support. Java 21 has stronger cryptography, TLS, sandboxing. |
| ⚙️ **Performance**               | JVM enhancements, new GCs (ZGC, Shenandoah), CDS, warmup optimizations.                                           |
| 👨‍💻 **Developer Productivity** | Features like `var`, `records`, pattern matching, sealed classes, virtual threads streamline development.         |
| 📦 **Modern APIs**               | New `HttpClient`, Stream & Optional improvements, better date/time API, native memory tracking.                   |
| 🤝 **Community & Ecosystem**     | Most libraries and frameworks (Spring Boot 3.x, Hibernate 6) now require Java 17+.                                |
| 🧵 **Scalability**               | Virtual threads (Java 21) offer massive scalability gains for concurrent apps (like web servers).                 |
| ☁️ **Cloud-Readiness**           | JDK 11+ brings container awareness (CPU/mem limits), making it better for Docker/K8s.                             |

### CJ7. Java 8 to Java 21 Migration Checklist

#### Ans:

1. ### Pre-Migration Planning
   - Inventory your applications: List down all Java applications, libraries, frameworks, and tools.
   - Check dependencies: Ensure third-party libraries support Java 21.
   - Understand breaking changes: Review JDK release notes from 9 to 21.
   - Upgrade build tools: Maven 3.9+ or Gradle 7+ recommended.
   - Ensure plugins support Java 21.
   - You may jump directly to 21, but it's wise to test with intermediate LTS versions for compatibility and smoother debugging.
     - Java 8 → 11 → 17 → 21 (LTS = Long-Term Support)
  
| Version | Feature                                      | Description                                          |
| ------- | -------------------------------------------- | ---------------------------------------------------- |
| 9       | Modules (JPMS)                               | `module-info.java`—optional but impacts modular JARs |
| 10      | `var`                                        | Local variable type inference                        |
| 11      | `HttpClient`                                 | Replaces legacy `HttpURLConnection`                  |
| 12      | `switch` (preview)                           | Enhancements: yield, expressions                     |
| 14      | Records                                      | Immutable data classes                               |
| 15      | Text blocks                                  | Multiline strings with `"""`                         |
| 16      | Pattern matching (instanceof)                | Simplifies casting                                   |
| 17      | Sealed classes                               | Restrict subclassing                                 |
| 19–21   | Virtual threads (Project Loom)               | Lightweight concurrency                              |
| 21      | Pattern matching for switch, Record patterns | Finalized                                            |



