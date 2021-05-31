package hust.soict.hedspi.garbage;

public class NoGarbage {
	public String s;
	public NoGarbage() {
		super();
		this.s = "";
	}
	public void createGarbage() {
		StringBuffer sb = new StringBuffer();
		for (long i=0; i< 999999999; i++) {
		sb.append(i*999999999);
		}
		s = sb.toString();
		System.out.println(s);
	}
}
