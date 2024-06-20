**Table of content:**

- [Comparable vs Comparator?](https://www.baeldung.com/java-comparator-comparable#:~:text=Java%208%20provides%20new%20ways,compare(player1.)

- [Coding Questions](#coding-collection)
  - [Return a list of all unique characters for a list of words?]()
- [How to Fix the ConcurrentModification Exception in Java](#CJ_01)

<a id="CJ_01"></a>

#### Concurrent Modification in Collection

- It is runtime exception when a collection is modified while it is being iterated over.
- Four ways we can fix
  - Use the Iterator’s remove() methods
  - Create a copy of the colletion for the itertaion
  - Use Java8 stream filters
  - Use a concurrent collections like CopyOnWriteArraylist,CopyonWriteArraySet etc
