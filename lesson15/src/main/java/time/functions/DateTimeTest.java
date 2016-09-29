package time.functions;

import org.joda.time.DateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeTest {

    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String result = format.format(date);

        System.out.println(result);

        date.setYear(1984); // deprecated

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 11);
        calendar.set(Calendar.MONTH, 5); // 0 - January, 1 - February
        calendar.set(Calendar.YEAR, 1985);

        Date newDate = calendar.getTime();
        result = format.format(newDate);
        System.out.println(result);

        DateTime joda = new DateTime();
        joda.getDayOfYear();
    }
}
