**Table of content:**
- [Interfaces](#all_interfaces_java_collections)
    * [Scenario when NavigableMap used?](#scenario-1)
- [Comparable vs Comparator?](https://www.baeldung.com/java-comparator-comparable)
- [Java 10 Collections API Changes](#changes-1)
- [Coding Questions](#coding-collection)
  - [Return a list of all unique characters for a list of words?]()
- [How to Fix the ConcurrentModification Exception in Java](#CJ_01)
  	* [How do you handle concurrent modifications to a Collection in Java?](#handle-concurrency)
- [TreeSet Vs HashSet + How internally data stores](#hashsetVstreeSet)
  	* [What is LinkedHashSet in Java Collections Framework?](#linkedhashset)
- [Map in details](#map)

=================================================================================================
<a id="map"></a>

#### Why Map doesn’t extend the Collection Interface?
#### Can you use any class as a Map key?

=================================================================================================
<a id="hashsetVstreeSet"></a>
#### HashSet Vs TreeSet
- HashSet based on hashtable where as TreeSet based on Red-Black Tree
- HS - No Specific Order where as TS Sorted Order
- HS implements Set where as TS implements SortedSet
- Both doesnot allows duplicates and HS allows only one null value
  	* [more](https://medium.com/javarevisited/tricky-java-interview-questions-for-7-years-of-experience-c2d2bf37d746)

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

|    Interfaces    |   Descrption  |    Methods     |    Base DataStructure   |
| :----------: | :------------: | :--------------------: | :--------------: |
| Collection| - | - | - |
| List| Ordered , Random Access,Duplicate allowed | get,set,add,lastIndexOf,add remove | Array |
| Set| No Duplicate,No Random Access | No additional methods beyond those inherited from Collection | - |
| SortedSet| Natural Order | first,last,headSet,subSet, | - |
| NavigableSet| - | - | - |
| Queue| FIFO | - | - |
| Deque| double-ended queue that allows elements to be added or removed from both ends | - | - |
| Map| - | - | - |
| SortedMap| Map that maintains its keys in ascending order | - | - |
| NavigableMap| It is a sub interface of SortedMap,methods returning the closest matches for given search targets | lowerEntry,floorEntry,highestEntry | - |
| Iterator| Provides methods to iterate over any collection | - | - |
| ListIterator| An iterator for lists that allows bidirectional traversal of the list and modification of elements. | - | - |

============================ ******** ******** ======================================= ****** ================

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

==============================================    ====================================================
<a id="linkedhashset"></a>
#### LinkedHashSet
- It is like HashSet + LinkedList. No duplicate and mantain insertion oredr.
- Performance: Provides relatively fast performance for basic operations (add, remove, contains) due to its underlying HashSet implementation, while also maintaining order due to the linked list.
- ### Scenario :
    * Implementing a Recent Searches Feature for an E-Commerce Application

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
