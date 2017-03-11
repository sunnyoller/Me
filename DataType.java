/**
 * Created by Sungeun Oller on 3/10/2017.
 */
public class DataType {

    public static void main(String[] args){

        char c1 = '1';
        char c2 = '2';
        char c3 = '3';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);


        char dollarSign = '\u0024';
        System.out.println("Currency: "+ dollarSign);

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';

        System.out.print(Character.toUpperCase(a1));
        System.out.print(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));

        String s = "Hello";
        if (s instanceof java.lang.String){
            System.out.println("s is a String");


        String s1 = "Hello";
        String s2 = "Hello ";
        if (s1.equals(s2)){

            System.out.println("they match!");
        }
            else{
            System.out.println("not match!");


            boolean s3 = 6 <7 ? true:false;
            System.out.println(s3);
        }
        }
    }


}
