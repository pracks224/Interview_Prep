### JAVA Stream [Link 1](https://stackify.com/streams-guide-java-8/)

- Stream should not be confused with I/O Stream
- Streams are just the warppers around the data sources ,facilitates for conventient bulk processing
- Stream does not store data,in that sense it's not a data structure.It also never modifies the underlying data structure.
- The primary advantage of using Streams is that they abstract the underlying data and simplify the code for data manipulation. With Streams, you can create more readable and concise code, which makes your programs easier to understand and maintain.

### Ways to create stream using strea(),stream.of,Stream.builder()

## Stream Operations

Two types : 1. Intermediate and Terminal

1. Intermediate :
   - Intermediate operations are operations that transform the Stream into another Stream.
   - filter, map, distinct, sorted, limit
2. Terminal :
   - Terminal operations are operations that produce a result or side effect.
   - forEach(),count,collect , anyMatch,reduce - reudce all elemnts into a single result.

### forEach() is terminal opertaion

### map

### collect

### filter

### flatMap

### peek (peek vsforEach)

###

### Parallel Stream

### Find the max element of a List

```
List<Integer> numbers = Arrays.asList(5, 12, 8, 24, 15, 10);
Optional<Integer> maxNumber = numbers.stream()
    .max(Integer::compareTo);
if (maxNumber.isPresent()) {
    System.out.println("Maximum number: " + maxNumber.get());
} else {
    System.out.println("No maximum number found.");
}
```

### Java 9 Improvisation of Stream

- TakeWhile,DropWhile,
- iterate() overiden which replaces the old for loop

#### Calculate the average age of a list of Person objects using Java streams ?

#### Check if a list of integers contains a prime number using Java streams?

#### Merge two sorted lists into a single sorted list using Java streams?

#### Find the intersection of two lists using Java streams

#### Remove duplicates from a list while preserving the order using Java streams

#### Given a list of transactions, find the sum of transaction amounts for each day using Java streams

19. What is Short-circuiting evaluation in stream ?
20. When to use findFirst and findAny.
21. Summing all the element of a list.
22. Describe the use of Optional in Java?
23. Describe the differnce between map,flatmap and reducce
24. [Java 8 Feature - Lambda](https://medium.com/java-pearls/taming-the-lambda-a-practical-guide-to-java-8-lambda-expressions-6c0051f97995)
25. [Concurrent Modification Using Stream API Possible ?](https://medium.com/@sum98kumar/java-developer-interview-questions-and-answers-b5732cd18c5b)
26. [How ParallelStream Works internally?](https://medium.com/@sum98kumar/java-interview-questions-9cb306e392d3)

===

Q.1) Find the most populated city of each continent

Q.2) Find the number of movies of each director

Q.3) Find the number of genres of each director's movies

Q.4) Find the highest populated capital city

Q.5) Find the highest populated capital city of each continent

Q.6) Sort the countries by number of their cities in descending order

Q.7) Find the list of movies having the genres "Drama" and "Comedy" only

Q.8) Group the movies by the year and list them

Q.9) Sort the countries by their population densities in descending order ignoring zero population countries

Q.10) Find the richest country of each continent with respect to their GNP (Gross National Product) values.

Q.11) Find the minimum, the maximum and the average population of world countries.

Q.12) Find the minimum, the maximum and the average population of each continent.

Q.13) Find the countries with the minimum and the maximum population.

Q.14) Find the countries of each continent with the minimum and the maximum population.

Q.15) Group the countries by continent, and then sort the countries in continent by number of cities in each continent.

Q.16) Find the cities with the minimum and the maximum population in countries.

Q.17) Find the minimum, the maximum, the average, and the standard deviation of GNP values.

Q.18) Find the year where the maximum number of movie is available

### Ans 18.

int maxYear = movies.stream()
.collect(Collectors.groupingBy(Movie::getReleaseYear, Collectors.counting()))
//===> it will return (Map<Year,Long>)
.entrySet().stream()
.max(Map.Entry.comparingByValue())
.map(Map.Entry::getKey)
.orElseThrow(() -> new RuntimeException("No movies found"));
