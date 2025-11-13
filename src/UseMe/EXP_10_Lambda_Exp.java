package UseMe;

public class EXP_10_Lambda_Exp {

    interface noparam {
        void greet();
    }

    interface oneparam{
        void calc(int x );
    }

    interface twoparam{
        void area(int len, int wid);
    }

    public static void  main (String[] args) {
        noparam np = () -> System.out.println("no param lambda!");

        oneparam op = (y) -> {
            System.out.println("1 params! ");
            System.out.println("entered num is : " + y);
        };

        twoparam tp = (len, wid) -> {
            System.out.println("Area using 2 params!");
            System.out.println("Area is : "+ len*wid);

        };

        np.greet();

        op.calc(12);

        tp.area(25,4);





    }





}
