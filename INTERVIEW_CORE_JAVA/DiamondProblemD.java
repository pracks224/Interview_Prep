package Interview_CoreJava;

import java.util.Optional;

public class DiamondProblemD  implements DiamondProblemB,DiamondProblemC{

    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {
         System.out.println("++++");
    }

    @Override
    public void methodC() {

    }

    public static void main(String args[]){
        DiamondProblemD d1 = new DiamondProblemD();
        d1.methodB();
    }

    public static class OptinalTest {

        public static void main(String[] args) {
            String[] strArr = new String[10];
            Optional<String> optiStr = Optional.ofNullable(strArr[5]);
            System.out.println(optiStr.isPresent()?strArr[5].toLowerCase():"String Not There");
        }
    }
}
