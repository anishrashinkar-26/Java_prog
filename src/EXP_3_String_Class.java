import java.util.Scanner;

public class EXP_3_String_Class {
//PAssword:
    /*
    public static void main (String[] args){
        String password = "", input;
        int in;

        Scanner s = new Scanner(System.in);

        System.out.println("Select :1)Set password\n2)Authenticate\n");
        in = s.nextInt();
        if (in ==1 ){
            System.out.println("Enter Password");
            input = s.next();
            if (password.isEmpty()&& !input.isEmpty()){
                password = input;
                System.out.println("Password set.\n");

            } else if (password.equals(input)) {
                System.out.println("Verfied!, same old and new password");

            }
            else {
                System.out.println("wrong password entered");
            }

        } else if (in ==2) {
            System.out.println("Enter Password");
            input = s.next();
            if (password.equals(input)) {
                System.out.println("Verfied!");

            }
            else {
                System.out.println("wrong password entered");
            }

        }


    }*/
    //palindorme:
    /*
    public static void main (String[] args){
        String input = "";
        System.out.println("enter input! \n");
        Scanner s =  new Scanner(System.in);
        input = s.next();
        int left =0 , right = input.length()- 1;
        while (left<right){
            if (input.charAt(left) != input.charAt(right)){
                System.out.println("not a palindorme!");
                return;
            }
            left ++ ; right --;
            System.out.println("palindorme!");
        }
    }*/
    //String rev:
/*
    public static void main (String[] args){

        String input = "";
        System.out.println("enter input! \n");
        Scanner s =  new Scanner(System.in);
        input = s.next();
StringBuilder builder = new StringBuilder(input);
        System.out.println("reversed string = "+ builder.reverse().toString());
    }*/

    //Character count:
    public static void main (String[] args){

        String input = "";
        System.out.println("enter input! \n");
        Scanner s =  new Scanner(System.in);
        input = s.next();
int count = input.length();
        System.out.println("count = "+ count);

    }

}
