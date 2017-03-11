/**
 * Created by Sungeun Oller on 3/10/2017.
 */
public class Position {

    public static void main(String []args){

        String s1 = "Welcome to California!";
        System.out.println("Length of string: "+ s1.length());

        int position = s1.indexOf("nia");
        System.out.println("position of substring: "+ position);

        StringBuilder sb = new StringBuilder(s1);
        sb.append(position);
        System.out.println(sb);

        String sub = s1.substring(11);
        System.out.println(sub);

        String a2 = "Beauty!     ";
        int len = a2.length();
        System.out.println(a2.length());

        String s3 = a2.trim();
        System.out.println(s3.length());

    }
}
