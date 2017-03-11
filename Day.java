import java.time.LocalDateTime;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DateFormat;

/**
 * Created by Sungeun Oller on 3/10/2017.
 */
public class Day {

    public static void main(String []args){

        Date d = new Date();

        GregorianCalendar gc = new GregorianCalendar(2010, 10,20);
        gc.add(GregorianCalendar.DATE,1);
        Date d2 = gc.getTime();
        System.out.print(d2);

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(d2);

        LocalDateTime idt = LocalDateTime.now();
        System.out.println(idt);
}
}
