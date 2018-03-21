package java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class Experience {	
	public static void main(String[] args) {
	             Scanner s=new Scanner(System.in);
	            System.out.println("Enter joining date in year-month-date format");
	            String dateString=s.next();
		       
		        LocalDate startDate = LocalDate.parse(dateString);
		        LocalDate endtDate = LocalDate.now();
		        Long d=ChronoUnit.DAYS.between(startDate, endtDate);
		        Long m= ChronoUnit.MONTHS.between(startDate, endtDate);
		        Long y= ChronoUnit.YEARS.between(startDate, endtDate);
		        System.out.println("Number of years"+y);
		        System.out.println("Number of months"+m);
		        System.out.println("Number of days"+d);		      
		      }

		}
