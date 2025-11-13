// Program 14b: Demonstrate use of ArrayList
// MIT-WPU, PUNE-3
// Date: 05 JUN 2021

import java.util.ArrayList;

public class EXP_14 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();


        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("ArrayList Elements: " + numbers);
System.out.println("Element at index 2: " + numbers.get(2));
        numbers.remove(1);
        System.out.println("After removal: " + numbers);
        numbers.set(1, 25);
        System.out.println("After insertion: " + numbers);
        System.out.println("final list = " + numbers);




    }
}
