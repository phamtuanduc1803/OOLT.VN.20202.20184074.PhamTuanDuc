import date.MyDate;
import java.time.LocalDate;
public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	public static final int MAX_LIMITTED_ORDER = 5;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered;
	private MyDate dateOrdered = new MyDate();
	private static int nbOrdered = 0;
	
	public Order() {
		this.qtyOrdered = 0;
		this.dateOrdered.setDate(LocalDate.now().toString());
		for (int i=0; i<MAX_NUMBER_ORDERED; i++) {
			itemsOrdered[i] = null;
		}
	}
	//Make a new Order
	public Order getNewOrder() {
		if (nbOrdered < MAX_LIMITTED_ORDER) {
			nbOrdered++;
			System.out.println(nbOrdered);
			Order newOrder = new Order();
			System.out.println("Added successfully!");
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
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	
	//Print all title to check
	public void printAllTitle() {
		for (int i=0; i<qtyOrdered; i++) {
			System.out.println(itemsOrdered[i].getTitle());
		}
	}
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 10) 
			System.out.println("The order is almost full!!");
		else {
			itemsOrdered[qtyOrdered] = disc ;
			System.out.println("The disc has been added");
			qtyOrdered ++;
		}
	}
	public boolean removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("The order is empty!!");
			return false;
			}
		else {
			for (int i=0; i<qtyOrdered; i++) {
				if (itemsOrdered[i] == disc) {
					for (int j=i; j<qtyOrdered-1; j++) {
						itemsOrdered[j] = itemsOrdered[j+1];
					}
					qtyOrdered--;
					System.out.println("Remove successful!!");
					return true;
				}	
			}
			System.out.println("This disc not found!!");
			return false;
		}	
	}
	public float totalCost() {
		float total = 0;
		for (int i=0; i<qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
		for (DigitalVideoDisc disc: dvdList) {
			if (qtyOrdered < MAX_NUMBER_ORDERED) {
				itemsOrdered[qtyOrdered] = disc;
				System.out.println(disc.getTitle() + " has been added 123!");
				qtyOrdered ++;
			}
			else {
				System.out.println("The order is almost full! Cannot add '" + disc.getTitle() + "' !");
			}
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered == MAX_NUMBER_ORDERED) {
			System.out.println("The item quantity has reached its limit. Cannot add anymore!");
		}
		else if (qtyOrdered == MAX_NUMBER_ORDERED-1) {
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered ++;
			System.out.println("The disc '" + dvd1.getTitle() + "' has been added. The disc '" 
			+ dvd2.getTitle() + "' could not be added!");
		}
		else {
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered ++;
			itemsOrdered[qtyOrdered] = dvd2;
			qtyOrdered ++;
			System.out.println("All 2 discs has been added!");
		}
	}
	public void printOrder() {
		System.out.println("***********************Order***********************");
		System.out.println("Date: " + getDateOrdered());
		System.out.println("Ordered Items:");
		for(int i=0; i<qtyOrdered; i++) {
			System.out.println(i+1 + ". DVD - " + itemsOrdered[i].getTitle() + " - "
					+ itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() 
					+ " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$");
		}
		System.out.println("Total cost: " + totalCost() + " $");
		System.out.println("***************************************************");
	}
}
