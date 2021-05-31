public class Aims {

	public static void main(String[] args) {
		
		Order anOrder = new Order().getNewOrder();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King ");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		anOrder.addDigitalVideoDisc(dvd3);
		
		/*DigitalVideoDisc dvd4 = new DigitalVideoDisc("One Piece");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		anOrder.addDigitalVideoDisc(dvd4);
		
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Power Ranger");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		anOrder.addDigitalVideoDisc(dvd5);
		
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Kamen Rider Kabuto");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		anOrder.addDigitalVideoDisc(dvd6);
		
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("Kamen Rider Ryuki");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		anOrder.addDigitalVideoDisc(dvd6);
		
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("Kamen Rider Zi-o");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		anOrder.addDigitalVideoDisc(dvd6);
		
		DigitalVideoDisc dvd9 = new DigitalVideoDisc("Kamen Rider Faiz");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		anOrder.addDigitalVideoDisc(dvd6);
		
		DigitalVideoDisc dvd10 = new DigitalVideoDisc("Kamen Rider Fourze");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		anOrder.addDigitalVideoDisc(dvd6);*/
		
		anOrder.removeDigitalVideoDisc(dvd3);
		anOrder.addDigitalVideoDisc(dvd1,dvd2);
		anOrder.addDigitalVideoDisc(dvd1,dvd2,dvd3);
		//dvd1.addDVDToList(dvd1,dvd2,dvd3,dvd4,dvd5,dvd6,dvd7,dvd8,dvd9,dvd10);
		//dvd1.printDVDList();
		
		System.out.println("Total Cost is:");
		System.out.println(anOrder.totalCost());
		System.out.println("Order date is: " + anOrder.getDateOrdered());
		//System.out.println(dvd2.search("the abc"));
		//System.out.println(dvd1.getALuckyItem().getTitle());
		anOrder.printOrder();
		
	}

}
