**Table of content:**

- [Interfaces](#all_interfaces_java_collections)
  - [Iterable Vs Enumeration?](#IterableVsEnumeration)
- [Comparable vs Comparator?](https://www.baeldung.com/java-comparator-comparable)
- [Java 10 Collections API Changes](#changes-1)
- [Coding Questions](#coding-collection)
  - [Return a list of all unique characters for a list of words?]()
- [How to Fix the ConcurrentModification Exception in Java](#CJ_01) \* [How do you handle concurrent modifications to a Collection in Java?](#handle-concurrency)
- [TreeSet Vs HashSet + How internally data stores](#hashsetVstreeSet) \* [What is LinkedHashSet in Java Collections Framework?](#linkedhashset)
- [Map in details](#map)
  - [Scenario when NavigableMap used?](#scenario-1)
  - [HashSet vs HashMap and Which one is faster?](#hashsetVsmap)
  - [RandomAccess - what do you mean by RandomAccess ??](#RandomAcess)
  - [What is Treeify](#treeify)
  - [Differnce between FailFast and FailSafe](#fvsf)
  - [How many users can you allow in the list with out impacting performance](#notes_71)

=================================================================================================

#### Write a program to remove empty strings from an array of Strings.

-

```
String[] arr = {"Hello", "", "World", null, "Java", "", "Streams", null};
        // Remove empty and null strings using Java 8 Streams
        List<String> filteredList = Arrays.stream(arr)
                                          .filter(str -> str != null && !str.isEmpty()) // Exclude nulls and empty strings
                                          .collect(Collectors.toList());
        System.out.println(filteredList);
```

#### Refreshing Points

1. ArrayList Non Synchonized in natture but Vectors are SYnchronized(thread safe).
   AL is not a legacy class but Vector is a legacy class
   AL increase size of 1/2 of the arraylist but Vectors doubles

2. HashMap doesn't preserve the order but TreeMap preserve the Order
   HM Based on Hashing and TM based on Red-Black Tree

3. Queue refers to single ended queue but Deque refers to double ended queue
   Queue elements add or remove from one end but Deque on both ends

4. HashSet uses HashMap to store element but TreeSet uses TreeMap
   HS Unorder in nature but TS in natural order by default
   Uses hashCode and equal for compare but TS uses compare and compareTo

5. Iterator can only perform remove but ListIterator add,remove,and replace opertaion
   Iterator can traverse List,Sets,Maps but LIT only lists
   Iterator can traverse forward but ListIterator in any direction
   Provide no method to retreive the index but LIT has it ????

<a id="comparable vs comparator"></a>

### Difference Between Comparable and Comparator

- Comparable compareTo() and Comparator comapre()
- Comparable uses natural ordering

<a id="map"></a>

#### Why Map doesn’t extend the Collection Interface?

Ans :

The Map interface in Java follows a key/value pair structure whereas the Collection interface is a collection of objects which are stored in a structured manner with a specified access mechanism.
The main reason Map doesn’t extend the Collection interface is that the add(E e) method of the Collection interface doesn’t support the key-value pair like Map interface’s put(K, V) method. It might not extend the Collection interface but still is an integral part of the Java Collections framework.

#### Can you use any class as a Map key?

Ans :

Yes, any class can be used as Map Key as long as the following points are considered:

1. The class overriding the equals() method must also override the hashCode() method
2. The class should adhere to the rules associated with equals() and hashCode() for all instances
3. The class field which is not used in the equals() method should not be used in hashCode() method as well
4. The best way to use a user-defined key class is by making it immutable. It helps in caching the hashCode() value for better performance. Also if the class is made immutable it will ensure that the hashCode() and equals() are not changing in the future.

#### What do you mean by Randon Access

<a id="RandomAcess"></a>

"Random Access" refers to the ability to access any element in a collection directly and efficiently using its index or position. Collections that support random access allow you to retrieve an element at a specific index in constant time.

<a id="hashsetVsmap"></a>

#### HashSet Vs HashMap

- Both doesnot mantains order, allow one null
- hashmap is key value and only value without duplicates
- HashMap can random access but HashSet can not.

=================================================================================================
<a id="hashsetVstreeSet"></a>

#### HashSet Vs TreeSet

- HashSet based on hashtable where as TreeSet based on Red-Black Tree
- HS - No Specific Order where as TS Sorted Order
- HS implements Set where as TS implements SortedSet
- Both doesnot allows duplicates and HS allows only one null value \* [more](https://medium.com/javarevisited/tricky-java-interview-questions-for-7-years-of-experience-c2d2bf37d746)

<a id="treeify"></a>

#### Treeify or How HashMap Works Internally ?

- A HashMap consists of an array of buckets, where each bucket is a linked list or a balanced tree (for large hash chains).

- Each bucket stores elements of type Entry (or Node in Java 8+), which contains the key-value pairs.

- Each bucket contains nodes (entries) that store the actual key-value pairs. The node structure includes the hash value, key, value, and a reference to the next node (for linked list implementation).

##### Operations

- Insertion (put method)

Step-by-Step Process:

- Compute Hash: Calculate the hash code of the key using the hashCode() method and then transform it using a supplemental hash function to reduce collisions.

- Find Bucket Index: Use the hash value to determine the index in the array of buckets.

- Check Existing Entries: Check if the bucket at that index already contains entries. If it does, iterate through the linked list (or tree) to find if the key already exists.

- Handle Collisions: If the key does not exist, create a new node and add it to the bucket. If it does exist, update the value.

- Treeify (Java 8+): If the number of nodes in a bucket exceeds a threshold (default 8), the linked list is converted into a balanced tree to improve performance.

- Treeify Threshold: In Java 8+, if a bucket contains more than 8 nodes, it gets converted to a balanced tree for better performance.

==============================================================================================
<a id="changes-1"></a>

#### Java 10 Changes :

- List.copyOf, Set.copyOf, and Map.copyOf methods to create unmodifiable collections.
  // 1. List, Set, Map copyOf(Collection) method
  List<String> actors = new ArrayList<>();

  // New API added - Creates an UnModifiable List from a List.
  List<String> copyOfActors = List.copyOf(actors);

  // UnsupportedOperationException
  actors.add("Robert De Niro");

=============================== ===================== ========================================

#### Java Collection Interfaces ::

<a id="all_interfaces_java_collections"></a>

|  Interfaces  |                                             Descrption                                              |                           Methods                            | Base DataStructure |
| :----------: | :-------------------------------------------------------------------------------------------------: | :----------------------------------------------------------: | :----------------: |
|  Collection  |                                                  -                                                  |                              -                               |         -          |
|     List     |                              Ordered , Random Access,Duplicate allowed                              |              get,set,add,lastIndexOf,add remove              |       Array        |
|     Set      |                                    No Duplicate,No Random Access                                    | No additional methods beyond those inherited from Collection |         -          |
|  SortedSet   |                                            Natural Order                                            |                  first,last,headSet,subSet,                  |         -          |
| NavigableSet |                                                  -                                                  |                              -                               |         -          |
|    Queue     |                                                FIFO                                                 |                              -                               |         -          |
|    Deque     |            double-ended queue that allows elements to be added or removed from both ends            |                              -                               |         -          |
|     Map      |                                                  -                                                  |                              -                               |         -          |
|  SortedMap   |                           Map that maintains its keys in ascending order                            |                              -                               |         -          |
| NavigableMap |  It is a sub interface of SortedMap,methods returning the closest matches for given search targets  |              lowerEntry,floorEntry,highestEntry              |         -          |
|   Iterator   |                           Provides methods to iterate over any collection                           |                              -                               |         -          |
| ListIterator | An iterator for lists that allows bidirectional traversal of the list and modification of elements. |                              -                               |         -          |

============================ **\*\*\*\*** **\*\*\*\*** ======================================= **\*\*** ================

<a id="scenario-1"></a>

#### Scenarion to Use NavigableSet

Implementing a Stock Price Tracker with Historical Data Lookup.

Imagine you're developing a financial application that tracks the prices of a particular stock throughout the day. Users should be able to query the price of the stock at any given time and also find the nearest price point if the exact timestamp is not available.

NavigableMap<Long, Double> stockPrices = new TreeMap<>();

stockPrices.put(1623423600000L, 150.25); // Timestamp in milliseconds and price
stockPrices.put(1623427200000L, 152.00);
stockPrices.put(1623430800000L, 151.75);
stockPrices.put(1623434400000L, 153.50);

//Find the nearest price

long searchTimestamp = 1623429000000L; // Timestamp that does not exist in the map

Map.Entry<Long, Double> floorEntry = stockPrices.floorEntry(searchTimestamp);
Map.Entry<Long, Double> ceilingEntry = stockPrices.ceilingEntry(searchTimestamp);

if (floorEntry != null) {
System.out.println("Closest price before or at " + searchTimestamp + ": " + floorEntry.getValue() + " at " + floorEntry.getKey());
}

if (ceilingEntry != null) {
System.out.println("Closest price at or after " + searchTimestamp + ": " + ceilingEntry.getValue() + " at " + ceilingEntry.getKey());
}

============================================== ====================================================
<a id="linkedhashset"></a>

#### LinkedHashSet

- It is like HashSet + LinkedList. No duplicate and mantain insertion oredr.
- Performance: Provides relatively fast performance for basic operations (add, remove, contains) due to its underlying HashSet implementation, while also maintaining order due to the linked list.
- ### Scenario :
  - Implementing a Recent Searches Feature for an E-Commerce Application

Imagine you're developing an e-commerce application where users frequently search for products. You want to implement a feature that keeps track of the recent searches made by a user, ensuring that the list of recent searches does not contain duplicates and maintains the order of searches as they were performed.

======================================================================================================
<a id="handle-concurrency"></a>

#### How to handle Concurrent Modification in Collection

- Use synchronized collections like Collection.synchronizedList()
- Use concurrent collection like ConucrrentHashMap,ConcurrentLinkedDeque,ConncurrentSkipListSet
- Use iterators properly
- Use locking [more](https://medium.com/javarevisited/tricky-java-interview-questions-for-7-years-of-experience-c2d2bf37d746)

<a id="CJ_01"></a>

#### Concurrent Modification in Collection

- It is runtime exception when a collection is modified while it is being iterated over.
- Four ways we can fix

  - Use the Iterator’s remove() methods
  - Create a copy of the colletion for the itertaion
  - Use Java8 stream filters
  - Use a concurrent collections like CopyOnWriteArraylist,CopyonWriteArraySet etc

  ====================================================================================

<a id="iterableVsEnumeration"></a>

#### Iterable Vs Enumeration

- Collection element can be removed while traversing it. Enu not possible
- Can traverse most classes but Enu only legacy classes like vector,hashtable etc
- It's fail-fast in nature and Enu is fail-safe in nature

========================================================================================

<a id="fvsf"></a>

#### FailFast Vs FailSafe

- FF does n't allow modification of a collection while iterating whereas FS allows
- FF throws ConcurrentModification but FS does n't throws any
- FF uses the original collection to traverse but FS works on the copy of it.
- FF doesn't need any extra memory but FS needs extra memory
- Commonly used fail-safe collection in Java includes 'CopyOnWriteArrayList','ConcurrentHashMap'
  'CopyOnWriteArraySet'.
- FS collections are thread safe and avoid 'concurrentmodificationexception'
- FF ArrayList and HashMap

=======================================================

63. How ConcurrentHashMap works ?
64. How HashSet works internally ?
65. What is Consisten Hashing?
66. [TreeMap works internally?](https://medium.com/@basecs101/treemap-in-java-collection-framework-interview-question-a3f81c7aaa84)
67. [How to create custom immutable class ?]()
68. [in built immutable classes in java - String,Integer,Long,Double,BigInteger,LocalDate,LocalDateTime etc]()
69. [Aggregation vs composition]()
70. [Create An Immutable Map]()

<a id="notes_71"></a>

#### Storage choices based on Storage Choices

- Using Array List,Linear search O(n), for more than 10K its become expensive.
- Using a HashSet(Best for Java in memory ) complexity O(1) constant time lookup
- Redis best for high traffic
- Bloom filter is also best for high traffic ,memory usage is much less than hashset.
- ArrayList fasstre rerteival upto 10K
- ConcurrentHashMap or HashMap Faster retreival
- TreeMap for ordered Search
- CopyOnWriteArrayList - Heavy Read

### How to implement LRU Cache?
