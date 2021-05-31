package hust.soict.hedspi.aims.order;
import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.utils.MyDate;
import java.util.ArrayList;
import java.time.LocalDate;
public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	public static final int MAX_LIMITTED_ORDER = 5;
	private ArrayList<DigitalVideoDisc> DVDOrdered = new ArrayList<DigitalVideoDisc>();
	private ArrayList<Book> bookOrdered = new ArrayList<Book>();
	private ArrayList<CompactDisc> CDOrdered = new ArrayList<CompactDisc>();
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
		float total1 = 0;
		float total2 = 0;
		float total3 = 0;
		for (int i=0; i<DVDOrdered.size(); i++) {
			total1 += DVDOrdered.get(i).getCost();
		}
		for (int i=0; i<bookOrdered.size(); i++) {
			total2 += bookOrdered.get(i).getCost();
		}
		for (int i=0; i<CDOrdered.size(); i++) {
			total3 += CDOrdered.get(i).getCost();
		}
		total = total1 + total2 + total3;
		return total;
	}
	
	public void addMedia(DigitalVideoDisc ...dvdList) {
		for(DigitalVideoDisc dvd: dvdList) {
			DVDOrdered.add(dvd);
			System.out.println("Added " + dvd.getTitle() + " successful!");
		}
	}
	
	public void addMedia(Book ...bookList) {
		for(Book book: bookList) {
			bookOrdered.add(book);
			System.out.println("Added " + book.getTitle() + " successful!");
		}
	}
	public void addMedia(CompactDisc ...cdList) {
		for(CompactDisc cd: cdList) {
			CDOrdered.add(cd);
			System.out.println("Added " + cd.getTitle() + " successful!");
		}
	}
	
//	public void addMedia(Media media) {
//		itemsOrdered.add(media);
//		System.out.println("Added media successful! " + media.getTitle());
//	}
	
	public void removeMedia(Book ...bookList) {
		if(bookOrdered != null) {
			for(Book book: bookList) {
				for(Book item: bookOrdered) {
					if(book.equals(item)) {
						bookOrdered.remove(item);
						System.out.println("Removed " + item.getTitle() + " successful!");
					}
				}
			}
		}
	}
	
	public void removeMedia(DigitalVideoDisc ... dvdList) {
		if(DVDOrdered != null) {
			for(DigitalVideoDisc dvd: dvdList) {
				for(DigitalVideoDisc item: DVDOrdered) {
					if(dvd.equals(item)) {
						DVDOrdered.remove(item);
						System.out.println("Removed " + item.getTitle() + " successful!");
					}
				}
			}
		}
	}
	public void removeMedia(CompactDisc ... cdList) {
		if(CDOrdered != null) {
			for(CompactDisc cd: cdList) {
				for(CompactDisc item: CDOrdered) {
					if(cd.equals(item)) {
						CDOrdered.remove(item);
						System.out.println("Removed " + item.getTitle() + " successful!");
					}
				}
			}
		}
	}
	public void removeBook(int id) {
			bookOrdered.remove(id);
			System.out.println("Removed item #" + id + " successful!");
	}
	public void removeDVD(int id) {
		DVDOrdered.remove(id);
		System.out.println("Removed item #" + id + " successful!");
	}
	public void removeCD(int id) {
		CDOrdered.remove(id);
		System.out.println("Removed item #" + id + " successful!");
}
	
	public void print() {
		System.out.println("Book:");
		for (Book book: bookOrdered) {
			System.out.println(book.getTitle());
		}
		System.out.println("DVD:");
		for (DigitalVideoDisc dvd: DVDOrdered) {
			System.out.println(dvd.getTitle());
		}
		System.out.println("CD:");
		for (CompactDisc cd: CDOrdered) {
			System.out.println(cd.getTitle());
		}
		
	}

}
