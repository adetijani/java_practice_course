import java.sql.SQLOutput;
import java.util.Scanner;

public class calculator {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = sc.nextInt();
        System.out.print("Enter your second number");
        int num2 = sc.nextInt();

        //To add the two numbers together
        int add = num1 + num2;
        System.out.println("Addition of two numbers:" + add);

        //To subtract two numbers together
        int subtract = num2 - num1;
        System.out.println("Subtraction of two numbers:" + subtract);

        //To multiply two numbers together
        int multiply = num1 * num2;
        System.out.println("Multiplication of two numbers:" +multiply);

        //To divide two numbers together
        int divide = num2 / num1;
        System.out.println("Division of two numbers:" + divide);

    }

}
