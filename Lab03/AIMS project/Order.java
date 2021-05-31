public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	
	private int qtyOrdered ;
	
	public Order() {
		this.qtyOrdered = 0;
		for (int i=0; i<MAX_NUMBER_ORDERED; i++) {
			itemsOrdered[i] = null;
		}
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
	
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
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
	
}
