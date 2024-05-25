package Core_Basics;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public final class Employee {
    String name;
    Date dob;

    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = new Date(dob.getTime());
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return new Date(dob.getTime());
    }

    public static void main(String[] args) {
        // Create a Date object for date of birth
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dob = null;
        try {
            dob = dateFormat.parse("1990-05-15");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Employee e1 = new Employee("Prakash", dob);
        Date date = e1.getDob();
        date.setYear(1999);
        System.out.println(dateFormat.format(e1.getDob()));
    }
}
