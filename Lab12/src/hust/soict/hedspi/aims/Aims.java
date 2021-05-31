package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.order.*;
import hust.soict.hedspi.aims.media.*;
import java.util.Scanner;

import javax.naming.LimitExceededException;

import java.util.ArrayList;
public class Aims {

	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<>();
		ArrayList<DigitalVideoDisc> dvdList = new ArrayList<>();
		ArrayList<CompactDisc> cdList = new ArrayList<>();
		Order anOrder = null;
		int choose;
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Roger Allers", "Animation", 87, 19.95f);
		dvdList.add(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "George Lucas", "Science Fiction", 124, 24.95f);
		dvdList.add(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "John Musker", "Animation", 90, 18.99f);
		dvdList.add(dvd3);
	
		Book book1 = new Book("Conan", "Detective", 20f);
		book1.addAuthor("Minh Vu");
		bookList.add(book1);
		
		Book book2 = new Book("300", "History", 21f);
		book2.addAuthor("Minh Vu 2");
		bookList.add(book2);
				
		Book book3 = new Book("50 Shades of Grey", "Novel", 22f);
		book3.addAuthor("Minh Vu 3");
		bookList.add(book3);
		
		Track track1 = new Track("Khong con mua thu", 0);
		Track track2 = new Track("Yeu duoi", 15);
		Track track3 = new Track("Duong dem", 16);
		Track track4 = new Track("Noi tinh yeu bat dau", 25);
		Track track5 = new Track("Mo ho", 10);
		CompactDisc cd1 = new CompactDisc("CD1", "Test", "Hoang Dung", 25.5f);
		cd1.addTrack(track1,track2,track3);
//		cd1.removeTrack(track1);
		cdList.add(cd1);
		
		CompactDisc cd2 = new CompactDisc("CD2", "Test2", "Bui Anh Tuan", 30f);
		cd2.addTrack(track4, track5);
		cdList.add(cd2);
		
		
		Scanner addScanner = new Scanner(System.in);
		Scanner deleteScanner = new Scanner(System.in);
		Scanner selectScanner = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);
		do {
			showMenu();
			choose = keyboard.nextInt();
			switch(choose) {
				case 1: {
					try {
						anOrder = new Order();
					} catch(LimitExceededException le) {
						le.printStackTrace();
					}
					break;
				}
				case 2: {
					System.out.println("Books:");
					for(int i=0; i<3; i++) {
						System.out.println(i + ". " + bookList.get(i).getTitle());
					}
					System.out.println("DVD:");
					for(int i=0; i<3; i++) {
						System.out.println(i + ". " + dvdList.get(i).getTitle());
					}
					System.out.println("CD:");
					for(int i=0; i<2; i++) {
						System.out.println(i + ". " + cdList.get(i).getTitle());
					}
					System.out.println("What do you want to add? 1.Book  2.DVD  3.CD");
					int toAdd = addScanner.nextInt();
					if (toAdd == 1) {
						System.out.println("Enter the id of item you want to add:");
						int id = addScanner.nextInt();
						anOrder.addMedia(bookList.get(id));
						System.out.println("Do you want to play media? 1.Yes 2.No");
						if (selectScanner.nextInt() == 1) {
							bookList.get(id).getTitle();
							break;
						}
						else {
							break;
						}
					}
					else if (toAdd == 2) {
						System.out.println("Enter the id of item you want to add:");
						int id = addScanner.nextInt();
						anOrder.addMedia(dvdList.get(id));
						System.out.println("Do you want to play media? 1.Yes 2.No");
						if (selectScanner.nextInt() == 1) {
							try {	
								dvdList.get(id).play();
							} catch (PlayerException e) {
								e.printStackTrace();
							}
							break;
						}
						else {
							break;
						}
					}
					else if(toAdd == 3) {
						System.out.println("Enter the id of item you want to add:");
						int id = addScanner.nextInt();
						anOrder.addMedia(cdList.get(id));
						System.out.println("Do you want to play media? 1.Yes 2.No");
						if (selectScanner.nextInt() == 1) {
							try {
								cdList.get(id).play();
							} catch (PlayerException e) {
								e.printStackTrace();
							}
							break;
						}
						else {
							break;
						}
					}
					else {
						break;
					}
				}
				case 3: {
					anOrder.print();
					System.out.println("What do you want to remove? 1.Book  2.DVD  3.CD");
					int removeSelection = selectScanner.nextInt();
					if(removeSelection == 1) {
						System.out.println("Enter the id of item you want to delete:");
						int id = deleteScanner.nextInt();
						anOrder.removeBook(id);
						break;
					}
					else if(removeSelection == 2) {
						System.out.println("Enter the id of item you want to delete:");
						int id = deleteScanner.nextInt();
						anOrder.removeDVD(id);
						break;
					}
					else if(removeSelection == 3) {
						System.out.println("Enter the id of item you want to delete:");
						int id = deleteScanner.nextInt();
						anOrder.removeCD(id);
						break;
					}
					else {
						break;
					}
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
		selectScanner.close();
		System.out.println("Goodbye!!");
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
