package zad4;

import java.util.Comparator;

public class DateTimeComparator implements Comparator<DateTime> {
        @Override
        public int compare(DateTime dt1, DateTime dt2)
        {
            if(dt1.month != dt2.month){
                return Integer.compare(dt1.month, dt2.month);
            }
            if(dt1.day != dt2.day){
                return Integer.compare(dt1.day, dt2.day);
            }
            if(dt1.year != dt2.year){
                return Integer.compare(dt1.year, dt2.year);
            }
            if(dt1.seconds != dt2.seconds){
                return Integer.compare(dt1.seconds, dt2.seconds);
            }
            if(dt1.minutes != dt2.minutes){
                return Integer.compare(dt1.minutes, dt2.minutes);
            }

                return Integer.compare(dt1.hours, dt2.hours);

        }
}