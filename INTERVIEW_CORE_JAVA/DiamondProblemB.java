package Interview_CoreJava;

public interface DiamondProblemB  extends DiamonProblemA{
    default void methodB(){
        System.out.println("Hello default");
    }
}
