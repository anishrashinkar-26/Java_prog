import java.util.Scanner;

public class EXP1_Java_Setup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ----------------- 1. Addition of two numbers for fixed values -----------------
        /*
        int a = 10, b = 20;
        System.out.println("Fixed Addition: " + (a + b));
*/
        // ----------------- 2. Addition of two numbers using Scanner class -----------------
        /*System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.println("Addition using Scanner: " + (n1 + n2));
*/
        // ----------------- 3. Finding greatest of three numbers using logical operators -----------------
        /*System.out.print("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int greatest = (x > y && x > z) ? x : (y > z ? y : z);
        System.out.println("Greatest number: " + greatest);
*/
        // ----------------- 4. Arithmetic operators using switch case -----------------
     /*  System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("Choose operation (+ - * / %): ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+': System.out.println("Sum: " + (num1 + num2)); break;
            case '-': System.out.println("Difference: " + (num1 - num2)); break;
            case '*': System.out.println("Product: " + (num1 * num2)); break;
            case '/': System.out.println("Quotient: " + (num1 / num2)); break;
            default: System.out.println("Invalid operator!");
        }
*/
        // ----------------- 5. Reversing the digits and finding sum of digits -----------------
      /*  System.out.print("Enter a number to reverse: ");
        int number = sc.nextInt();
        int reverse = 0, sumDigits = 0, temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            sumDigits += digit;
            temp /= 10;
        }
        System.out.println("Reversed Number: " + reverse);
        System.out.println("Sum of Digits: " + sumDigits);
*/
        // ----------------- 6. Finding sum of numbers between given range using logical operators -----------------
      /*  System.out.print("Enter range (start end): ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sumRange = 0;
        for (int i = start; i <= end; i++) {
            sumRange += i;
        }
        System.out.println("Sum between range: " + sumRange);
*/
        // ----------------- 7. Display * pattern -----------------
      /*  System.out.print("Enter number of rows for * pattern: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
        */

    }

}
