
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String str = scan.nextLine();
        System.out.println("Give an integer:");
        int anInt = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double aDbl = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean aBool = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + anInt);
        System.out.println("You gave the double " + aDbl);
        System.out.println("You gave the boolean " + aBool);

    }
}
