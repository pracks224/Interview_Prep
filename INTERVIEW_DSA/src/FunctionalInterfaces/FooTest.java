package FunctionalInterfaces;

public class FooTest {
    public static void main(String[] args) {
        String str = "Prakash";
        Foo s = (String k) -> "My name is :" + k;
        // System.out.println(s.method("Prakash"));
        FooTest ts = new FooTest();
        String result = ts.add("First functional", s);
        System.out.println(result);

        FooExtended ext = (String ktr)->ktr;
        System.out.println(ext.method("thoko"));
    }

    public String add(String str, Foo foo) {
        return foo.method(str);
    }
}
