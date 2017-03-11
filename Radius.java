/**
 * Created by Sungeun Oller on 3/8/2017.
 */

import java.util.Scanner;
public class Radius {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("please enter the radius: ");
        double radius = input.nextDouble();

        double area = radius * radius * Math.PI;
        System.out.println(area);

    }

}
