import java.util.TreeSet;

public class SmallestNumebrInInfinite {
    TreeSet<Integer> numSet = null;
    public static void main(String[] args) {

    }

    public SmallestNumebrInInfinite() {
        numSet = new TreeSet<>();
    }

    public int popSmallest() {
        int small = numSet.first();
        numSet.remove(small);
        return small;
    }

    public void addBack(int num) {
       numSet.add(num);
    }
}
