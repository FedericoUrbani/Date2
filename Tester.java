import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tester {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        int hour = now.getHour();
        int minute = now.getMinute();
        LocalDate today = LocalDate.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MMMM/yy");
        String formattedDate = today.format(dateTimeFormatter);
        String formatForHHmm=String.format("%02d:%02d",hour, minute);
        String printOutput= formattedDate+"-"+formatForHHmm;
        System.out.println(printOutput);

        //-----------------------------------" ho deciso di farlo in 2 modi diversi "-----------------------------------------------

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yy-HH:mm");
        ZonedDateTime moment = ZonedDateTime.now();
        String ZoneddateTimeString = moment.format(formatter);
        System.out.println(ZoneddateTimeString);
    }

}
/**
 * calculate and print:
 * using LocaleDateTime, the current date and time in the following format:
 * DayNumber FullMonthName Last2DigitsOfYearNumber HourTime MinuteTime
 * using ZonedDateTime, the current date and time in ISO Zoned Date Time format
 */