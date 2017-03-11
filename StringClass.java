import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by Sungeun Oller on 3/10/2017.
 */
public class StringClass {

    public static void main(String[]args){


        String s1 = "Hello";
        System.out.println(s1.toUpperCase());

        char[] char1 = {'H','e','l','l','o'};
        String s2 = new String(char1);
        System.out.println(s2);
        System.out.println(s1);

        char[] char2 = char1;
        for(char c: char2) {
            System.out.println(c);
        }
         long longValue = 10_000_000;
            NumberFormat formatter = NumberFormat.getNumberInstance();
            String formatted = formatter.format(longValue);
            System.out.println(formatted);




        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value: ");
        String input = scanner.nextLine();
        System.out.println(input);

        StringBuilder sb = new StringBuilder(input);
        sb.append(", ");
        sb.append("world");
        sb.append("!");
        System.out.println(sb);

        sb.delete(0, sb.length());

        for (int i = 0; i < sb.length() ; i++) {
            input = scanner.nextLine();
            sb.append(input +"\n");
        }







    }
}
