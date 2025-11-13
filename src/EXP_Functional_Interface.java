import java.util.function.*;

public class EXP_Functional_Interface {

    public static void main (String[] ar){
        //consumer, predictate, function , supplier
        Consumer <String> c = s -> System.out.println("Consumer called with data: "+ s );
        Predicate <Integer> p = n -> n%2 == 0 ;
        Function <Integer, String> f = n -> "Square is : " + (n*n);
        Supplier <Double> s = () -> Math.random();

        c.accept("Hello world!");
        System.out.println("Predicate called with: "+  p.test(20));
        System.out.println("Function called with: "+f.apply(4));

        System.out.println("random number: " + s.get());




    }


}
