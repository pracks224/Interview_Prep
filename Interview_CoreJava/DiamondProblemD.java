package Interview_CoreJava;

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
}
