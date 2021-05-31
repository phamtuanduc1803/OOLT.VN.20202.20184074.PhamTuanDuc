package hust.soict.hedspi.aims.media;

public class Disc extends Media{
	protected int length;
	protected String director;
	
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	public Disc() {
		super();
	}
	@Override
	public int compareTo(Media o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
