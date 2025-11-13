
import java.util.*;

public class EXP_14_Linked_List {






    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();

        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Nashik");
        cities.add("Nagpur");

        System.out.println("LinkedList Elements: " + cities);


        cities.addFirst("Kolhapur");
        cities.addLast("Aurangabad");
        System.out.println("After adding at both ends: " + cities);
        cities.set(1, "Nagpur");

        cities.removeFirst();
        cities.removeLast();
        System.out.println("After removing from both ends: " + cities);


        System.out.println("Iterating through LinkedList:");
        System.out.println("cities = "+ cities);
    }
}
