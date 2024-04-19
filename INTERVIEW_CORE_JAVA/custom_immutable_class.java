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

//Questions will come on how to protect it using deepcopy and clonecopy etc..
class Address{
    String streetName;
    String postalCode;
    // getter //setter
}
