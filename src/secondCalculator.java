import java.util.Scanner;
public class secondCalculator {

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        double number;
        double numberTwo;
        double result;
        char op;
        String status;

//Taking the input of the  number from the user:
            System.out.println("Please input a number");
            number = sc.nextDouble();


//Taking the arithmetic operator:
        do {
            do {
                System.out.println("Please input a operator:");
                op = sc.next().charAt(0);
                sc.nextLine();
                if (op == '+' || op == '-' || op == '/' || op == '*') {
                    break;
                } else {
                    System.out.println("Invalid operator, please try again");
                }
            } while (true);


//Taking the "next" number:
            System.out.println("Please input another number");
            numberTwo = sc.nextDouble();
            sc.nextLine();

//Performing the arithmetic calculation:
            if (op == '+') {
                result = number + numberTwo;
            } else if (op == '-') {
                result = number - numberTwo;
            } else if (op == '*') {
                result = number * numberTwo;
            } else {
                result = number / numberTwo;
            }
//Asking the user if they are done with their calculations:
            System.out.println("if you are finished, type yes.");
            status = sc.nextLine();
            if(status.equals("yes")){
                System.out.println(result);
                break;
            }
            else{
                number = result;
            }

        }while(true);
    }
}
