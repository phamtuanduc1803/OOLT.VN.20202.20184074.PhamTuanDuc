package hust.soict.hedspi.garbage;

public class GarbageCreator {
	public String s;
	public GarbageCreator() {
		super();
		this.s = "";
	}
	public void createGarbage() {
		for (long i=0; i < 999999999; i++) {
			s+=i*999999999;
				
			}
		System.out.println(s);
	}
}
