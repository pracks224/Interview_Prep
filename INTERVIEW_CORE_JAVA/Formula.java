package Interview_CoreJava;

import java.awt.*;
import java.text.Normalizer;

public interface Formula {

    double calculate(int a);
    default double sqrt(int a){
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        Formula f    = new  Formula(){
            public double calculate(int a){
                return sqrt(a*100);
            }
        };
        System.out.println(f.calculate(100));
        System.out.println(f.sqrt(25));

        ClientRecord record1 = new ClientRecord(1001,"Prakash","Sharma");
        ClientRecord record2 = new ClientRecord(1002,"Prakash1","Sharma1");
        System.out.println(record1.client());
        System.out.println(record1.hashCode());

    }
}
