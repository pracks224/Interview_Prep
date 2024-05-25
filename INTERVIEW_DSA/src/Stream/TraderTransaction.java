package DSA.src.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TraderTransaction {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 400),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 399),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //Find all transactions in the year 2011 and sort them by value (small to high).
        List<Transaction> sortedTnx = transactions.stream().filter(i -> i.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
      //  sortedTnx.forEach(x->System.out.println(x.getTrader().getName()));
        //What are all the unique cities where the traderswork? --> we can use distinct and toSet
       Set<String> cities = transactions.stream().map(trader->trader.getTrader().getCity()).collect(Collectors.toSet());
     //  cities.forEach(System.out::println);
        //Find all traders from Cambridge and sort them by name
        List<Trader> sortedTnxByCity = transactions.stream().map(Transaction::getTrader).filter(i -> i.getCity().equals("Cambridge")).sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
        sortedTnxByCity.forEach(x->System.out.println(x.getName()));
    }
}
