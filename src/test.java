import java.util.Scanner;
public class test {
    public static boolean finished(String input) {
        return input.equals("yes");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String status;
        System.out.println("if you are finished, type yes.");
        do {
            status = sc.nextLine();
            if(finished(status)){
                break;
            }
            else{
                System.out.println("Okay, tell me when you are finished.");
            }
        } while(!finished(status));

    }
}