
public class DigitalVideoDisc {
	private String title;
	private String director;
	private String category;
	private int length;
	private float cost;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getCost() {
		return cost;
	}
	public DigitalVideoDisc(String title, String director, String category, int length, float cost) {
		super();
		this.title = title;
		this.director = director;
		this.category = category;
		this.length = length;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title) {
		this.title = title;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
}

