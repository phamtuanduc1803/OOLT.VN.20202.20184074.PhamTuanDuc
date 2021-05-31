package hust.soict.hedspi.test.utils;

import hust.soict.hedspi.aims.utils.MyDate;

public class DateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate("second", "february", "thirty oh one");
		//date1.accept();
		date1.print();		//print current date
		
		date1.printDate();	//example of input: "January 28th 2021" 
							//output form: yyyy-MM-dd
		
		System.out.println(date1.parseYear(date1.getStrYear()));
	}

}
