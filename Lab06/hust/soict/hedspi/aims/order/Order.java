package hust.soict.hedspi.aims.order;
import hust.soict.hedspi.aims.media.*;
import date.MyDate;
import java.util.ArrayList;
import java.time.LocalDate;
public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	public static final int MAX_LIMITTED_ORDER = 5;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	private MyDate dateOrdered = new MyDate();
	private static int nbOrdered = 0;
	
	public Order() {

		this.dateOrdered.setDate(LocalDate.now().toString());
	}
	//Make a new Order
	public static Order getNewOrder() {
		if (nbOrdered < MAX_LIMITTED_ORDER) {
			nbOrdered++;
			Order newOrder = new Order();
			return newOrder;
		}
		else {
			System.out.println("Reached MAX_LIMITTED_ORDER!");
			return null;
		}
	}
	
	public String getDateOrdered() {
		return dateOrdered.getDate();
	}
		
	public float totalCost() {
		float total = 0;
		for (int i=0; i<itemsOrdered.size(); i++) {
			total += itemsOrdered.get(i).getCost();
		}
		return total;
	}
	
	public void addMedia(DigitalVideoDisc ...dvdList) {
		for(DigitalVideoDisc dvd: dvdList) {
			itemsOrdered.add(dvd);
			System.out.println("Added " + dvd.getTitle() + " successful!");
		}
	}
	
	public void addMedia(Book ...bookList) {
		for(Book book: bookList) {
			itemsOrdered.add(book);
			System.out.println("Added " + book.getTitle() + " successful!");
		}
	}
	
	public void addMedia(Media media) {
		itemsOrdered.add(media);
		System.out.println("Added media successful! " + media.getTitle());
	}
	
	public void removeMedia(Book ...bookList) {
		if(itemsOrdered != null) {
			for(Book book: bookList) {
				for(Media item: itemsOrdered) {
					if(book.equals(item)) {
						itemsOrdered.remove(item);
						System.out.println("Removed " + item.getTitle() + " successful!");
					}
				}
			}
		}
	}
	
	public void removeMedia(DigitalVideoDisc ... dvdList) {
		if(itemsOrdered != null) {
			for(DigitalVideoDisc dvd: dvdList) {
				for(Media item: itemsOrdered) {
					if(dvd.equals(item)) {
						itemsOrdered.remove(item);
						System.out.println("Removed " + item.getTitle() + " successful!");
					}
				}
			}
		}
	}
	public void removeMedia(int...idList) {
		for(int i=0; i<itemsOrdered.size(); i++) {
			System.out.println(i + ". " + itemsOrdered.get(i).getTitle());
		}
		for(int id: idList) {
			itemsOrdered.remove(id);
			System.out.println("Removed item #" + id + " successful!");
		}
	}
	
	public void print() {
		for (Media media: itemsOrdered) {
			System.out.println(media.getTitle());
		}
	}
	
//	public void printOrder() {
//		System.out.println("***********************Order***********************");
//		System.out.println("Date: " + getDateOrdered());
//		System.out.println("Ordered Items:");
//		for(int i=0; i<qtyOrdered; i++) {
//			System.out.println(i+1 + ". DVD - " + itemsOrdered[i].getTitle() + " - "
//					+ itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() 
//					+ " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$");
//		}
//		System.out.println("Total cost: " + totalCost() + " $");
//		System.out.println("***************************************************");
//	}
}
