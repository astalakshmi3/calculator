package astalakshmi.example;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        boolean keepRunning = true;

        System.out.println("Java Calculator");

        while (keepRunning) {
            System.out.println("\nChoose an operation:");
            System.out.println("1) Addition (+)");
            System.out.println("2) Subtraction (-)");
            System.out.println("3) Multiplication (*)");
            System.out.println("4) Division (/)");
            System.out.println("5) Exit");

            System.out.print("Enter choice (1-5): ");

            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                sc.nextLine();
                continue;

            }
                if (choice == 5) {
                    keepRunning = false;
                    System.out.println("Goodbye!");
                    break;
                }


            try {
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                double result;



                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("Result: " + result);
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.println("Result: " + result);
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.println("Result: " + result);
                        break;
                    case 4:
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose 1-5.");

                }
            }
            catch(InputMismatchException ex){
                        System.out.println("Invalid number. Please enter numeric values.");
                        sc.nextLine();

                    }


                        System.out.print("\nDo you want to perform another calculation? (yes/no): ");
                        String again = sc.next().trim().toLowerCase();
                        if (!again.equals("yes")) {
                            keepRunning = false;
                            System.out.println("Goodbye!");
                        }


            }

        }
    }



