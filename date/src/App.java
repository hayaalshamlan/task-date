import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Current date and time: " + now);

        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_MONTH, 5);

        Date futureDate = calendar.getTime();
        System.out.println("Date after 5 days: " + futureDate);

        Date date1 = new Date();
        Date date2 = new Date();

        boolean isBefore = date1.before(date2);
        System.out.println("Is date1 before date2? " + isBefore);

        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = formatter.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);

        calendar.setTime(currentDate);
        calendar.add(java.util.Calendar.DAY_OF_MONTH, 5); // Adding 5 days

        String formattedFutureDate = formatter.format(futureDate);
        System.out.println("Date after 5 days: " + formattedFutureDate);

    }

}
