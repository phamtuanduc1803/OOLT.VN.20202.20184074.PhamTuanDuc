package hust.soict.hedspi.aims.media;
public class DigitalVideoDisc extends Media {
	private String director;
	private int length;
	public static final int MAX_NUMBER_DVD = 10;
	private static DigitalVideoDisc[] listDVD = new DigitalVideoDisc[MAX_NUMBER_DVD];	//An array which stores list of DVDs
	private int qtyAdded = 0;
	
	public DigitalVideoDisc(String title, String director, String category, int length, float cost) {
		super();
		this.director = director;
		this.length = length;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public DigitalVideoDisc() {
		super();
	}
	public void addDVDToList(DigitalVideoDisc... dvdList) {
		for (DigitalVideoDisc disc: dvdList) {
			if (qtyAdded == MAX_NUMBER_DVD) {
				System.out.println("The order is almost full! Cannot add '" + disc.getTitle() + "' !");
			}
			else {
				listDVD[qtyAdded] = disc;
				System.out.println(disc.getTitle() + " has been added 1234!");
				qtyAdded ++;
			}
		}
	}
	public static void printDVDList() {
		for (DigitalVideoDisc dvd: listDVD) {
			System.out.println(dvd.getTitle());
		}
	}
	
	//This method return the disc which include 'title' 
	/*public String search(String title) {
		String[] titleSearch = title.split("\\s");
		for(DigitalVideoDisc dvd: listDVD) {
			int check = 0;
			String strToSearch = dvd.getTitle();
			String[] tokenSearch = strToSearch.split("\\s");
			for (String word: titleSearch) {
				for (String token: tokenSearch) {
					if(word.equalsIgnoreCase(token) == true) {
						check++;
						if (check == titleSearch.length) {
							return dvd.getTitle();
						}
					}
				}
			}
		}
		return null;
	} */
	public boolean search(String title) {
		String[] titleSearch = title.split("\\s");
		int check = 0;
		String strToSearch = getTitle();
		String[] tokenSearch = strToSearch.split("\\s");
		for (String word: titleSearch) {
			for (String token: tokenSearch) {
				if(word.equalsIgnoreCase(token) == true) {
					check++;
					if (check == titleSearch.length) {
						return true;
					}
				}
			}
		}
		return false;
	}
	public DigitalVideoDisc getALuckyItem() {
		double random = Math.random()*10;
		int lucky = (int)random;
		return listDVD[lucky];
	}
}

