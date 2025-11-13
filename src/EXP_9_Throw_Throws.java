import java.util.Scanner;

public class EXP_9_Throw_Throws {

    static class custExec extends Exception{
        custExec (String ms ){
            super(ms);
        }
    }
    public static void main (String [] args ){
        String pass = "1234";
        System.out.println("Enter password! \n");
        String input = new Scanner(System.in).next();
try {
    if (pass.equals(input)) {
        System.out.println("Authenticated!");
    } else {
        throw new custExec("Wrong password!!");
    }
}
catch (custExec e){
    System.out.println("error:  " + e.getMessage());
}


    }



}
