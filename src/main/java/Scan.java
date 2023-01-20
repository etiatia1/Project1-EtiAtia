import java.util.InputMismatchException;
import java.util.Scanner;

public class Scan {
    static double input=0 ;
    static String input2="y";
    static Scanner scanner = new Scanner(System.in);
    public static void scan1() {
        try {
            input = scanner.nextInt();
        }catch (InputMismatchException e) {
            scanner=new Scanner(System.in);
            System.out.println("Invalid input. Please try again.");
        }
    }
    public static void scan2(){
        try {
            input2 = scanner.next();
        } catch (InputMismatchException e) {
//            scanner=new Scanner(System.in);
            System.out.println("Invalid input. Please try again.");

        }
    }
}

