**Table of content:**
- [Interfaces](#all_interfaces_java_collections)
    * [Scenario when NavigableMap used?](#scenario-1)
- [Comparable vs Comparator?](https://www.baeldung.com/java-comparator-comparable#:~:text=Java%208%20provides%20new%20ways,compare(player1.)
- [Java 10 Collections API Changes](#changes-1)

- [Coding Questions](#coding-collection)
  - [Return a list of all unique characters for a list of words?]()
- [How to Fix the ConcurrentModification Exception in Java](#CJ_01)

  ******* - - - -- ---- ---------------- --------------- ***************** - - - -- ---- ---------------- --------------- ***************** - - - -- ---- ---------------- --------------- **********

<a id="changes-1"></a>

#### Java 10 Changes :
- List.copyOf, Set.copyOf, and Map.copyOf methods to create unmodifiable collections.
    // 1. List, Set, Map copyOf(Collection) method
		List<String> actors = new ArrayList<>();
  
    // New API added - Creates an UnModifiable List from a List.
		List<String> copyOfActors = List.copyOf(actors);

    // UnsupportedOperationException
    actors.add("Robert De Niro");



#### Java Collection Interfaces ::
<a id="all_interfaces_java_collections"></a>

|    Interfaces    |   Descrption  |    Methods     |    Base DataStructure   |
| :----------: | :------------: | :--------------------: | :--------------: |
| Collection| - | - | - |
| List| Ordered , Random Access,Duplicate allowed | get,set,add,lastIndexOf,add remove | Array |
| Set| No Duplicate,No Random Access | No additional methods beyond those inherited from Collection | - |
| SortedSet| Natural Order | first,last,headSet,subSet, | - |
| NavigableSet| - | - | - |
| Queue| - | - | - |
| Deque| double-ended queue that allows elements to be added or removed from both ends | - | - |
| Map| - | - | - |
| SortedMap| Map that maintains its keys in ascending order | - | - |
| NavigableMap| It is a sub interface of SortedMap,methods returning the closest matches for given search targets | lowerEntry,floorEntry,highestEntry | - |
| Iterator| Provides methods to iterate over any collection | - | - |
| ListIterator| An iterator for lists that allows bidirectional traversal of the list and modification of elements. | - | - |



<a id="scenario-1"></a>
#### Scenarion -1 
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

******* - - - -- ---- ---------------- --------------- **********




<a id="CJ_01"></a>

#### Concurrent Modification in Collection

- It is runtime exception when a collection is modified while it is being iterated over.
- Four ways we can fix
  - Use the Iterator’s remove() methods
  - Create a copy of the colletion for the itertaion
  - Use Java8 stream filters
  - Use a concurrent collections like CopyOnWriteArraylist,CopyonWriteArraySet etc
