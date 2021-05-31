package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
public class Book extends Media {
	private ArrayList<String> authors = new ArrayList<String>();
	public Book(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public boolean addAuthor(String authorName) {
		for(String name: authors) {
			if(name.equals(authorName)) {
				return false;
			}
		}
		authors.add(authorName);
		System.out.println("Added " + authorName + " successfully!!");
		return true;
	}
	public void removeAuthor(String authorName) {
		if(authors.size() == 0) {
			System.out.println("Cannot remove! List is empty!");
		}
		authors.remove(authorName);
	}
	//Print all authors to test
	public void printAuthors() {
		System.out.println(authors);
	}
}
