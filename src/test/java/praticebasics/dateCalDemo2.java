package praticebasics;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class dateCalDemo2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        //cal.getTime();

        System.out.println("Calendar Formatted_Date: "+sd.format(cal.getTime()));

        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));

        //Getting the current date value
        LocalDate currentdate = LocalDate.now();
        System.out.println("Current Date: "+currentdate);

        int currentDay = currentdate.getDayOfMonth();
        System.out.println("Current Day: "+currentDay);

        Month currentMonth = currentdate.getMonth();
        System.out.println("Current Month: "+currentMonth);

    }
}
