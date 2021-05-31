package hust.soict.hedspi.aims.media;

abstract class Media {
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
	public boolean equals(Media m) throws Exception{
		try {
			if (m.getTitle().compareTo(title) == 0 && m.getCost() == cost) {
				return true;
			}
		} 
		catch (NullPointerException e1) {
			e1.printStackTrace();
		}
		catch (ClassCastException e2) {
			e2.printStackTrace();
		}
		return false;
	}
	public int compareTo(Media m) throws Exception {
		try {
			if (m.getCost() > cost) {
				return -1;
			}
			if (m.getCost() == cost) {
				return 0;
			}
		}
		catch (NullPointerException e1) {
			e1.printStackTrace();
		}
		catch (ClassCastException e2) {
			e2.printStackTrace();
		}
		return 1;
	}
}
