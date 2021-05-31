import java.util.Scanner;
public class Calendar {

	public static void main(String[] args) {
		int iYear;
		String strMonth;
		Scanner keyboard = new Scanner(System.in);
		
		do {
			System.out.println("Enter a year:");
			iYear = keyboard.nextInt();
			if (iYear < 0)
				System.out.println("Year invalid! Please re-enter!");
		} while(iYear < 0);
		
		int check = 0;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter a month:");
			strMonth = input.nextLine();
			
			switch (strMonth) {
				case "1":
				case "January":
				case "Jan":
				case "Jan.": {
					check ++;
					System.out.println("January " + iYear + " has 31 days");
					break;
				}
				case "2":
				case "February":
				case "Feb":
				case "Feb.": {
					check ++;
					if(iYear%4 == 0 && iYear%100 != 0)
						System.out.println("February " + iYear + " has 29 days");
					else if (iYear%400 == 0)
						System.out.println("February " + iYear + " has 29 days");
					else
						System.out.println("February " + iYear + " has 28 days");
					break;
				}
				case "3":
				case "March":
				case "Mar":
				case "Mar.": {
					check ++;
					System.out.println("March " + iYear + " has 31 days");
					break;
				}
				case "4":
				case "April":
				case "Apr":
				case "Apr.": {
					check ++;
					System.out.println("April " + iYear + " has 30 days");
					break;
				}
				case "5":
				case "May":
				case "May.": {
					check ++;
					System.out.println("May " + iYear + " has 31 days");
					break;
				}
				case "6":
				case "June":
				case "Jun":
				case "Jun.": {
					check ++;
					System.out.println("June " + iYear + " has 30 days");
					break;
				}
				case "7":
				case "July":
				case "Jul":
				case "Jul.": {
					check ++;
					System.out.println("July " + iYear + " has 31 days");
					break;
				}
				case "8":
				case "August":
				case "Aug":
				case "Aug.": {
					check ++;
					System.out.println("August " + iYear + " has 31 days");
					break;
				}
				case "9":
				case "September":
				case "Sep":
				case "Sep.": {
					check ++;
					System.out.println("September " + iYear + " has 30 days");
					break;
				}
				case "10":
				case "October":
				case "Oct":
				case "Oct.": {
					check ++;
					System.out.println("October " + iYear + " has 31 days");
					break;
				}
				case "11":
				case "November":
				case "Nov":
				case "Nov.": {
					check ++;
					System.out.println("November " + iYear + " has 30 days");
					break;
				}
				case "12":
				case "December":
				case "Dec":
				case "Dec.": {
					check ++;
					System.out.println("December " + iYear + " has 31 days");
					break;
				}
			}
		} while(check < 1);
	}

}
