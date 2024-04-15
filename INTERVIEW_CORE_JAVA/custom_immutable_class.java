/*
-> FYI Date is depricated ??? Using LocalDate
-> Once an object is instantiated,we can not modify its content is called immutable class
->All the wrapper classes  like Integer,Short,Boolean,Byte etc and String classes are immutable
-> Thread Safety: Immutable objects are inherently thread-safe because their state cannot change once they are created.
->How to create immutable class : 
     (A) Class Must be final
     (B) Data Memembers must be declared as Private
     (C) A parameterized constructor should initilize all the fields
     (D) Deep Copy and CLone copy return
*/
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
//Questions will come on how to protect it using deepcopy and clonecopy etc..
class Address{
    String streetName;
    String postalCode;
    // getter //setter
}
