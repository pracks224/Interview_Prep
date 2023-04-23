package FunctionalInterfaces;

public interface FooExtended extends Baz , Bar{
    @Override
    default void defaultCommon() {
        Baz.super.defaultCommon();
    }
}
