package homework4.library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Utils {
    static Date parseDate(String date) {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            return new Date();
        }
    }
}
