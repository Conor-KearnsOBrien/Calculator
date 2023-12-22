
import java.util.Scanner;
public class bob{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int number;
        int num1;
        int num2;
        do{
            System.out.println("Please enter what you would like");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            number = input.nextInt();
            switch(number){
                case 1:
                    System.out.println("Addition");
                    System.out.println("Please enter two numbers");
                    num1 = input.nextInt();
                    num2 = input.nextInt();
                    System.out.println(num1 + num2);
                    break;

                case 2:
                    System.out.println("Subtraction");
                    System.out.println("Please enter two numbers");
                    num1 = input.nextInt();
                    num2 = input.nextInt();
                    System.out.println(num1 - num2);
                    break;

                case 3:
                    System.out.println("Multiplication");
                    System.out.println("Please enter two numbers");
                    num1 = input.nextInt();
                    num2 = input.nextInt();
                    System.out.println(num1 * num2);
                    break;

                case 4:
                    System.out.println("Division");
                    System.out.println("Please enter two numbers");
                    num1 = input.nextInt();
                    num2 = input.nextInt();
                    System.out.println(num1/num2);

            }
        }while(number !=4);

    }
}