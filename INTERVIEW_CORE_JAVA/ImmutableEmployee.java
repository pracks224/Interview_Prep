package INTERVIEW_CORE_JAVA;

import java.time.LocalDate;

public final class ImmutableEmployee {
    private final int id;
    private final String name;
    private final LocalDate dob;
    public ImmutableEmployee(int id,String name,LocalDate dob){
        this.name = name;
        this.id = id;
        this.dob = dob;
    }
    
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public LocalDate getDob(){
        return dob;
    }
    public static void main(String args[]){
        ImmutableEmployee emp = new ImmutableEmployee(10,"Prakash",LocalDate.of(1990, 1, 1));
        System.out.println(emp.getDob());
        LocalDate dt = emp.getDob();
        
    }
}
