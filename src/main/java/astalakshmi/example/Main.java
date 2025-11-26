package astalakshmi.example;
import java.util.Scanner;

public class Main {
    static void main() {

        IO.println(String.format("Hello and welcome!"));
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition \n 2. Subtract \n 3. Multiply \n 4. Division \n 5. Exit");
    System.out.println("Choose the operator");
    int operator = sc.nextInt();
    System.out.println("Enter Your First Number");
    int Num1 = sc.nextInt();
    System.out.println("Enter Your Second Number");
    int Num2 = sc.nextInt();

    int result = 0;
    switch (operator) {
        case 1:
            result = Num1 + Num2;
            break;

        case 2:
            result = Num1 - Num2;
            break;

        case 3:
            result = Num1 * Num2;
            break;

        case 4:
            result = Num1 / Num2;
            break;
        case 5:
           // result = true;
            System.out.println("Goodbye");
        default:
            System.out.println("Entered operator is not vaild");


            System.out.println("Result :" + result);


    }

    }
    }

