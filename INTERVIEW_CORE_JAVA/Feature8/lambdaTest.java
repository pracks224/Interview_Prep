package INTERVIEW_CORE_JAVA.Feature8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
enum MenuType{
    VEGETABLES("vegetables"),
    FRUIT("fruit"),
    CEREAL("cereal"),
    MEATS("meats");

    private final String menuTypeCode;
    MenuType(String menuTypeCode) {
        this.menuTypeCode = menuTypeCode;
    }
    public String getMenuTypeCode(){
        return this.menuTypeCode;
    }
}
class MenuTypeChecker{
    public static boolean isMeats(Menu1 menu){
        return menu.menuName().equals(MenuType.MEATS);
    }
    public static boolean isExpensive(Menu1 menu){
        int cheapPrize = 1000;
        return menu.price()>cheapPrize;
    }
}
public class lambdaTest {
    static Predicate<Menu1> isMeatsOrExpensiveMenu =
            m->(MenuTypeChecker.isMeats(m) || MenuTypeChecker.isExpensive(m));
    static Function<Menu1,String> getMenuNamePrice =  m->m.menuName()+" "+m.price();
    public static void main(String[] args) {
        Collection<Menu1> list = new ArrayList<>() {
            {
                add(new Menu1("Chicken", 1300, "meats"));
                add(new Menu1("Pig", 2500, "meats"));
                add(new Menu1("CocoCrunch", 450, "cereal"));

            }
        };

        Collection<String> list2 =  list.stream().filter(m->m.menuType().equals("meats"))
                .map(m->m.menuName() +" "+ m.price())
                .collect(Collectors.toList());
       // list2.forEach(System.out::println);

        Collection<String> list3=  list.stream().filter(isMeatsOrExpensiveMenu)
                .map(getMenuNamePrice)
                .collect(Collectors.toList());
        list3.forEach(System.out::println);

    }
}
