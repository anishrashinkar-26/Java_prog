import java.util.*;


public class EXP_15_Set_Interface {
    public static void main (String [] ar){
        Set<String> s = new HashSet<>();

        s.add("apple");
        s.add("banana");
        s.add("cherry");
        s.add("mango");
        System.out.println("origianl :"+ s);
        s.remove("apple");
        System.out.println("mod hashset :"+ s);
        Set <String> ts = new TreeSet<>();
        ts.add("apple");
        ts.add("banana");
        ts.add("cherry");
        ts.add("mango");
        System.out.println("origianl treeset:"+ ts);
        ts.remove("apple");
        System.out.println("mod treeset:"+ ts);



    }











}
