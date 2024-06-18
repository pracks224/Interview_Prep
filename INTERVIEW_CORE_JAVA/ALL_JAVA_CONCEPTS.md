**Table of content:**

#### Format code in Mac ===> command + option + L

- [Java 8 Features](#java8)

  - [How to use Optional in Java Coding](https://medium.com/javarevisited/optional-class-in-java-8-making-your-code-more-clear-and-concise-62af0712910d#:~:text=The%20Optional%20class%20in%20Java,as%20part%20of%20Java%208.)
  - [Functional Interface](#java8-fi)
  - [Method Refernce](https://medium.com/javarevisited/method-references-in-java8-9714496d5306)
    - [notes](#methodreference1)

- [OOPs]()

  - [What are SOLID principles of Object Oriented Programming?](https://www.freecodecamp.org/news/solid-principles-explained-in-plain-english/)

  - [Anti Pattern- pending definition]()

  - [Overiding vs Overloading](https://medium.com/@beknazarsuranchiyev/the-method-overloading-vs-overriding-in-java-9890e2dcf90a)
  - [Method overriding passing null object,which method will be called?]()

- [String]()
  - [Differnce between String,StringBuilder,StringBuffer](https://medium.com/@salvipriya97/string-vs-stringbuilder-vs-stringbuffer-which-one-to-choose-4308dbcc3022)
  - [How String Concatentaion works internally?](https://www.codementor.io/@nikunjgupta/behind-the-scene-of-a-concatenation-of-two-strings-using-plus-operator-10ad7v8f38)
  - [Best/efficient way to join String ?](https://www.baeldung.com/java-string-concatenation-methods)
  - [Check Anagram]()

<a id="java8"></a>

#### Java 8 Features

    - Lambda|Stream API|Method Reference|Static Method Reference|Parallel Array Sorting
      Type Annotations|Repeating Annotations|Concurrent Accumularators|Date and Time API|Nash Horn Javascript engiene

<a id="java8"></a>

#### Java 9 Features

    -

<a id="methodreference1"></a>

#### Method Interface

- Types 4 : Static,Instant Method of an object,Instant Method of an arbitrary object, Constructor etc
- It always returns a functional Interface

<a id="java8-fi"></a>

#### Functional Interface

- An interface with exactly one abstract method. It can have multiple default or static methods.
- Designed to be used with lambda expressions in Java.
   * Runnable: Used in threading contexts, with no arguments and no return value (void run()).
   * Callable: Similar to Runnable but returns a value and can throw a checked exception (V call()).
   * Comparator: Defines a comparison function for sorting that returns a negative integer, zero, or a positive integer (int compare(T o1, T o2)).
  * Consumer: Performs an action on the given argument, returning no result (void accept(T t)).
  * Supplier: Returns a result and does not take any input (T get()).
  * Predicate: Returns a boolean value based on its input, used for evaluating conditions (boolean test(T t)).
  * Function: Accepts one argument and produces a result, typical use case is for converting or transforming data (R apply(T t)).
  * UnaryOperator: A specialization of Function where the input and output are of the same type (T apply(T t)).
  * BinaryOperator: A specialization of Function for two inputs of the same type, producing a result of the same type (T apply(T t1, T t2)).

@FunctionalInterface Annotation: Optional but helps in making the intent clear and ensures the interface cannot have more than one abstract method.
