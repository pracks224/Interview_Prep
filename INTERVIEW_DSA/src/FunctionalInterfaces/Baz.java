package FunctionalInterfaces;
@FunctionalInterface
public interface Baz {
    String method(String str);
    default void defaultCommon(){ }
}
