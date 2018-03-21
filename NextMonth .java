package java8;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
public class NextMonth {
	
	    public static void main (String[] args) {
	       
	        YearMonth ym = YearMonth.of(2018, Month.APRIL);
	        LocalDate d3 = ym.atDay(1)
	                         .with(TemporalAdjusters.dayOfWeekInMonth(
	                                   2, DayOfWeek.SUNDAY));
	        System.out.println("Next Month second sunday is"+d3);
	    }
	}
