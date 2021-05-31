package date;
import java.text.*;
import java.util.Date;
public class DateUtils {

	public static final int MAX_LIMITTED_DATE = 5;
	public static String[] dateList = {"2020-12-12", "2020-12-10", "2020-12-14", "2020-12-11", "2020-12-09"};
	public static void main(String[] args) throws ParseException {
		compareDate("2020-12-12", "2021-12-12");
		upperSortDate();
	}
	
	public static void compareDate(String d1, String d2) throws ParseException {
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdFormat.parse(d1);
		Date date2 = sdFormat.parse(d2);
		if(date1.compareTo(date2) > 0) {
			System.out.println("Date 1 occurs after Date 2");
	    } 
		else if(date1.compareTo(date2) < 0) {
	        System.out.println("Date 1 occurs before Date 2");
	    } 
		else if(date1.compareTo(date2) == 0) {
	        System.out.println("Both dates are equal");
	    }
	}
	//Before to after
	public static void upperSortDate() throws ParseException {
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date[] date = new Date[MAX_LIMITTED_DATE];
		for (int i=0; i<MAX_LIMITTED_DATE; i++) {
			date[i] = sdFormat.parse(dateList[i]);
		}
		for (int i=0; i<MAX_LIMITTED_DATE-1; i++) {
			for (int j=i+1; j<MAX_LIMITTED_DATE; j++) {
				if(date[i].compareTo(date[j]) > 0) {
					Date dateTmp = date[i];
					date[i] = date[j];
					date[j] = dateTmp;
					String tmp = dateList[i];
					dateList[i] = dateList[j];
					dateList[j] = tmp;
			    } 	
			}
		}
		for (int i=0; i<MAX_LIMITTED_DATE; i++) {
			System.out.println(dateList[i] + " ");
		}
	}
}
