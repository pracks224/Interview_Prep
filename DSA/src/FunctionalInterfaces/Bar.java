package FunctionalInterfaces;
@FunctionalInterface
public interface Bar {
    String method(String s);
    default void defaultCommon(){}
}
