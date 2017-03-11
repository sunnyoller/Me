/**
 * Created by Sungeun Oller on 3/8/2017.
 */

import java.util.Scanner;

public class FtoC {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Fahrenheit: ");
        double f = input.nextDouble();

        double c = (5.0/9) * (f-32);
        System.out.println("fahrenheit " + f + " to "+ "celsius is " + c);

    }
}
