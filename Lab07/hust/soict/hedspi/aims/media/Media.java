package hust.soict.hedspi.aims.media;

abstract class Media {
	protected String title;
	protected String category;
	protected float cost;
	
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
		super();
	}
}
