import java.math.BigDecimal;

/**
 * Created by Sungeun Oller on 3/10/2017.
 */
public class Main {

    public static void main(String [] args){

        double value =.012;
        double pSum = value + value + value;

        System.out.println("Sum of primitives : " +pSum);

        String strValue = Double.toString(value);
        System.out.println("strValue : "+strValue);
        BigDecimal bigValue = new BigDecimal(strValue);

        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);

        System.out.println("Sum of BigDecimal : " +bSum.toString());

        String sBoolean = "True";
        boolean parsed = Boolean.parseBoolean(sBoolean);
        System.out.println("parsed: "+ parsed);



    }



}
