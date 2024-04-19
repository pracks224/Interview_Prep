package INTERVIEW_CORE_JAVA;

import java.time.LocalDate;
import java.util.Optional;

public class OptionalTest {

    public  static Optional<Student> getStudentWithName(String nm){
        if(nm.equals("kkk") || nm.equals("jjj")){
            return Optional.of(new Student("hsbc",22,"Morocco"));
        }else{
            return Optional.empty();
        }

    }

    public static void main(String[] args) {
     Optional<Student> st = getStudentWithName("mmmm");
    // System.out.println(st.name()); // it will throw null pointer exception
        if(st.isPresent()){
            System.out.println(st.get().name());
        }else{
            System.out.println("Null Student");
        }
    }
}
