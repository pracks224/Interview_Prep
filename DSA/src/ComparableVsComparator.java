package DSA.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/*The Comparable interface is a good choice to use for defining the default ordering, or in other words, if it's the main way of comparing objects.

        So why use a Comparator if we already have Comparable?

        There are several reasons why:

        Sometimes we can't modify the source code of the class whose objects we want to sort, thus making the use of Comparable impossible
        Using Comparators allows us to avoid adding additional code to our domain classes
        We can define multiple different comparison strategies, which isn't possible when using Comparable
 */

public class ComparableVsComparator {
    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);
       // Collections.sort(footballTeam); // This wiil give compile time error as it is not comparable type.
       // footballTeam.forEach(System.out::println);

        // Java 8 comparator
        Comparator<Player> byRanking = Comparator.comparing(Player::getRanking);
        Collections.sort(footballTeam,byRanking); // This wiil give compile time error as it is not comparable type.
        footballTeam.forEach(System.out::println);

    }
}
