package hust.soict.hedspi.aims.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private String date;
	private String strDay;
	private String strMonth;
	private String strYear;
	private String[] digitDay = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth",
			"ninth", "tenth", "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth", "sixteenth",
			"seventeenth", "eighteenth", "nineteenth", "twentieth", "twenty-first", "twenty-second", "twenty-third",
			"twenty-fourth", "twenty-fifth", "twenty-sixth", "twenty-seventh", "twenty-eighth", "twenty-ninth",
			"thirtieth", "thirty-first"};
	private String[] digitMonth = {"January", "February", "March", "April", "May", "June", "July", "August", 
			"September", "October", "November", "December"}; 
	private String[] firstTwoDigitYear = {"ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty-one",
            "twenty-two", "twenty-three", "twenty-four", "twenty-five", "twenty-six", "twenty-seven",
            "twenty-eight", "twenty-nine", "thirty"};
	private String[] lastTwoDigitYear = {"one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "twenty-one", "twenty-two", "twenty-three", "twenty-four",
            "twenty-five", "twenty-six", "twenty-seven", "twenty-eight", "twenty-nine", "thirty", "hundred"};
	
	public MyDate() {
		this.date = null;
	}
	public MyDate(String strDay, String strMonth, String strYear) {
		this.strDay = strDay; 
		this.strMonth = strMonth;
		this.strYear = strYear;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDate() {
		return date;
	}
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public boolean accept() {
		int limit = 0;
		Scanner index = new Scanner(System.in);
		System.out.println("Enter the input time:");
		setDate(index.nextLine());
		String[] arrDate = date.split("\\s");
		year = Integer.parseInt(arrDate[2]);
		if (year <0) {
			System.out.println("This date does not exist!");
			index.close();
			return false;
		}
		arrDate[0] = arrDate[0].toLowerCase();
		switch (arrDate[0]) {
			case "january": {
				month = 1;
				limit = 31;
				break;
			}
			case "february": {
				month = 2;
				if(year%4 == 0 && year%100 != 0)
					limit = 29;
				else if (year%400 == 0)
					limit = 29;
				else
					limit = 28;
				break;
			}
			case "march": {
				month = 3;
				limit = 31;
				break;
			}
			case "april": {
				month = 4;
				limit = 30;
				break;
			}
			case "may": {
				month = 5;
				limit = 31;
				break;
			}
			case "june": {
				month = 6;
				limit = 30;
				break;
			}
			case "july": {
				month = 7;
				limit = 31;
				break;
			}
			case "august": {
				month = 8;
				limit = 31;
				break;
			}
			case "september": {
				month = 9;
				limit = 30;
				break;
			}
			case "october": {
				month = 10;
				limit = 31;
				break;
			}
			case "november": {
				month = 11;
				limit = 30;
				break;
			}
			case "december": {
				month = 12;
				limit = 31;
				break;
			}
			default: {
				System.out.println("This date does not exits!");
				index.close();
				return false;
			}
		}
		day = Integer.parseInt(arrDate[1].substring(0, arrDate[1].length()-2));
		if ((day > limit) || (day < 0)) {
			System.out.println("This date does not exist!");
			index.close();
			return false;
		}
		if(month < 10) {
			System.out.println(year + "-0" + month + "-" + day);
			index.close();
			return true;
		}
		System.out.println(year + "-" + month + "-" + day);
		index.close();
		return true;
	}
	public String parseDay(String strDay) {
		for(int i=0; i<31; i++) {
			if(strDay.equalsIgnoreCase(digitDay[i])) {
				return String.valueOf(i+1);
			}
		}
		return null;
	}
	public String parseMonth(String strMonth) {
		for(int i=0; i<12; i++) {
			if(strMonth.equalsIgnoreCase(digitMonth[i])) {
				return String.valueOf(i+1);
			}
		}
		return null;
	}
	public String parseYear(String strYear) {
		int countSpace = 0;
		for (int i=0; i < strYear.trim().length(); i++) {
			if(strYear.charAt(i) == ' ') {
				countSpace++;
			}
		}
		//Year with 2 digits (1 space)
		if (countSpace == 1) {
			String[] yearOneSpace = strYear.trim().split("\\s");
			String[] yearDigitOneSpace = new String[2];
			for(int i=0; i < firstTwoDigitYear.length; i++) {
				if(yearOneSpace[0].equalsIgnoreCase(firstTwoDigitYear[i])) {
					yearDigitOneSpace[0] = String.valueOf(i+10);	//firstTwoDigitYear[0] = "ten"...	
					break;
				}
			}
			if(yearOneSpace[1].equalsIgnoreCase("hundred")) {
				yearDigitOneSpace[1] = "00";
			}
			for(int i=0; i < lastTwoDigitYear.length-1; i++) {		//lastTwoDigitYear[last] = "hundred"
				if(yearOneSpace[1].equalsIgnoreCase(lastTwoDigitYear[i])) {
					yearDigitOneSpace[1] = String.valueOf(i+1);
					break;
				}
			}
			return yearDigitOneSpace[0] + yearDigitOneSpace[1];
		}
		//Year with 3 digits (2 spaces)
		if(countSpace == 2) {
			String[] yearTwoSpace = strYear.trim().split("\\s");
			String[] yearDigitTwoSpace = new String[2];
			for(int i=0; i<firstTwoDigitYear.length; i++) {
				if(yearTwoSpace[0].equalsIgnoreCase(firstTwoDigitYear[i])) {
					yearDigitTwoSpace[0] = String.valueOf(i+10);
					break;
				}
			}
			for(int i=0; i<9; i++) {
				if(yearTwoSpace[2].equalsIgnoreCase(lastTwoDigitYear[i])) {
					yearDigitTwoSpace[1] = "0" + String.valueOf(i+1);
					break;
				}
			}
			return yearDigitTwoSpace[0] + yearDigitTwoSpace[1];
		}
		return null;
	}
	public String getStrDay() {
		return strDay;
	}
	public void setStrDay(String strDay) {
		this.strDay = strDay;
	}
	public String getStrMonth() {
		return strMonth;
	}
	public void setStrMonth(String strMonth) {
		this.strMonth = strMonth;
	}
	public String getStrYear() {
		return strYear;
	}
	public void setStrYear(String strYear) {
		this.strYear = strYear;
	}
	//Print the current date
	public void print() {
		LocalDate curDate = LocalDate.now();
		String now = curDate.format(DateTimeFormatter.ofPattern("MM dd yyyy"));
		String[] tokenDate = now.trim().split("\\s");
		String ordinalStr;  
		if (Integer.parseInt(tokenDate[1]) % 10 == 1) {
			ordinalStr = "st";
		}
		else if (Integer.parseInt(tokenDate[1]) % 10 == 2) {
			ordinalStr = "nd";
		}
		else if (Integer.parseInt(tokenDate[1]) % 10 == 3) {
			ordinalStr = "rd";
		}
		else {
			ordinalStr = "th";
		}
		String nowMonth = digitMonth[Integer.parseInt(tokenDate[0]) - 1];
		System.out.println(nowMonth + " " + tokenDate[1] + ordinalStr + " " + tokenDate[2]);
	}
	//Form is yyyy-MM-dd
	public boolean printDate() {
		return accept();
	}
}
