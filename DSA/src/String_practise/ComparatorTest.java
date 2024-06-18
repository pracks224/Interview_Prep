package DSA.src.String_practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);
        /*System.out.println("Before Sorting : " + footballTeam);
        Collections.sort(footballTeam); // compilation error if with out implement comparable
        System.out.println("After Sorting : " + footballTeam);*/

        //Now using Comparator
        //One way impleneting the Comaprator  and override the compare methdo
        //Second way Java 8 comparators
        Comparator<Player> cmp = (Player p1,Player p2)->Integer.compare(p1.getRanking(),p2.getRanking());
       // Collections.sort(footballTeam,cmp);

        System.out.println("Before Sorting : " + footballTeam);
        Collections.sort(footballTeam,cmp);
        System.out.println("After Sorting : " + footballTeam);

        //Last Using more concise and Method refernce
        Comparator<Player> byRanking = Comparator
                .comparing(Player::getRanking);
        Comparator<Player> byAge = Comparator
                .comparing(Player::getAge);

        System.out.println("Before Sorting : " + footballTeam);
        Collections.sort(footballTeam,byRanking);
        System.out.println("After Sorting : " + footballTeam);

    }
}
