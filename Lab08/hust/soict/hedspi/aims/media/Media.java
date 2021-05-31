package hust.soict.hedspi.aims.media;

abstract class Media implements Comparable <Media> {
	protected String title;
	protected String category;
	protected float cost;
	protected int id;
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	
	public Media() {
		
	}
	public boolean equals(Media m) {
		if (m.id == id) {
			return true;
		}
		return false;
	}
	
}
