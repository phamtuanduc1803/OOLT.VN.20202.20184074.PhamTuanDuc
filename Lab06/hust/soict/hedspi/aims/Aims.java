package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.order.*;
import hust.soict.hedspi.aims.media.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Aims {

	public static void main(String[] args) {
		ArrayList<Media> mediaList = new ArrayList<Media>();
		Order anOrder = null;
		int choose;
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King ");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		mediaList.add(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		mediaList.add(dvd2);
		
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		mediaList.add(dvd3);
//		anOrder.addDigitalVideoDisc(dvd3);
		
		//test search method
		//System.out.println(dvd1.search("the KiNg"));
		
		//test get lucky item method
		//System.out.println(dvd1.getALuckyItem().getTitle());
		//anOrder.printOrder();
//		
		Book book1 = new Book();
		book1.addAuthor("Minh");
		book1.addAuthor("Minh Vu");
		book1.removeAuthor("Minh");
		book1.setCategory("Detective");
		book1.setCost(20f);
		book1.setTitle("Conan");
		mediaList.add(book1);
//		book1.printAuthors();
//		System.out.println(book1.getTitle());
		
		Book book2 = new Book();
		book2.addAuthor("Minh Vu 2");
		book2.setCategory("History");
		book2.setCost(21f);
		book2.setTitle("300");
		mediaList.add(book2);
		
//		
		Book book3 = new Book();
		book3.addAuthor("Minh Vu 3");
		book3.setCategory("Novel");
		book3.setCost(22f);
		book3.setTitle("50 Shades of Grey");
		mediaList.add(book3);
		
		Book book4 = new Book();
		book4.addAuthor("Minh Vu 4");
		book4.setCategory("Manga");
		book4.setCost(21f);
		book4.setTitle("One Piece");
		mediaList.add(book4);
		
		Scanner addScanner = new Scanner(System.in);
		Scanner deleteScanner = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);
		do {
			showMenu();
			choose = keyboard.nextInt();
			switch(choose) {
				case 1: {
					anOrder = new Order().getNewOrder();
					break;
				}
				case 2: {
					for(int i=0; i<7; i++) {
						System.out.println(i + ". " + mediaList.get(i).getTitle());
					}
					System.out.println("Enter the id of item you want to add:");
					int id = addScanner.nextInt();
					anOrder.addMedia(mediaList.get(id));
					break;
				}
				case 3: {
					anOrder.print();
					System.out.println("Enter the id of item you want to delete:");
					int id = deleteScanner.nextInt();
					anOrder.removeMedia(id);
					break;
				}
				case 4: {
					anOrder.print();
					break;
				}
			}
		} while (choose != 0);
		keyboard.close();
		addScanner.close();
		deleteScanner.close();
		System.out.println("Goodbye!!");
		
		
//		Order order = new Order().getNewOrder();
//		order.addMedia(book4);
		
		
//		anOrder.addMedia(book1, book2);
//		anOrder.removeMedia(book1, book4);
//		
//		System.out.println("Total Cost is:");
//		System.out.println(anOrder.totalCost());
//		System.out.println("Order date is: " + anOrder.getDateOrdered());
	}
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
}


}
