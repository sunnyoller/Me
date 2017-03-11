import java.util.Scanner;

/**
 * Created by Sungeun Oller on 3/10/2017.
 */
public class Challenge {
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value: ");
        double input = scanner.nextDouble();

        System.out.println("Enter a second value");
        double input2 = scanner.nextDouble();

        double total = input + input2;
        System.out.println("Total value is "+ total);
    }

}
