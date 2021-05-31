package hust.soict.hedspi.test.media;
import java.util.ArrayList;
import java.util.Iterator;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
public class TestMediaCompareTo {

	public static void main(String[] args) throws Exception {
		ArrayList<DigitalVideoDisc> collection = new ArrayList<DigitalVideoDisc>();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Roger Allers", "Animation", 87, 19.95f);
		collection.add(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "George Lucas", "Science Fiction", 124, 24.95f);
		collection.add(dvd2);
		
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "John Musker", "Animation", 90, 18.99f);
		collection.add(dvd3);
		
		Iterator iterator = collection.iterator();
		
		System.out.println("---------------------------------------");
		System.out.println("The DVDs currently in the order are:");
		while(iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
		}
		//Sort the collection of DVDs - based on the compareTo() method
		for(int i=0; i<collection.size(); i++) {
			for (int j=collection.size()-1; j>i; j--) {
				if (collection.get(i).compareTo(collection.get(j)) > 0) {
					DigitalVideoDisc tmp = new DigitalVideoDisc();
					tmp = collection.get(j);
					collection.set(j, collection.get(i));
					collection.set(i, tmp);
				}
			}
		}
		
		//Iterate through the ArrayList and output their titles in sorted order
		iterator = collection.iterator();
		System.out.println("---------------------------------------");
		System.out.println("The DVDs in sorted order are:");
		
		while(iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
		}
		System.out.println("---------------------------------------");
	}

}
