package date;

import java.time.LocalDate;
import java.util.Scanner;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private String date;
	
	public MyDate() {
		this.date = null;
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
		date = index.nextLine();
		String[] arrDate = date.split("\\s");
		year = Integer.parseInt(arrDate[2]);
		if (year <0) {
			System.out.println("This date does not exist!");
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
				return false;
			}
		}
		day = Integer.parseInt(arrDate[1].substring(0, arrDate[1].length()-2));
		if ((day > limit) || (day < 0)) {
			System.out.println("This date does not exist!");
			return false;
		}
		System.out.println(day + " - " + month + " - " + year);
		return true;
	}
	public void print() {
		var curDate = LocalDate.now();
		System.out.println("Current date is: " + curDate);
	}
}
