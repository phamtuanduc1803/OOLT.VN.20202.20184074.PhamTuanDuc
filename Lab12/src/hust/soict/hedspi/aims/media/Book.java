package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
public class Book extends Media {
	private String content;
	private List<String> contentTokens = new ArrayList<String>();
	private Map<String, Integer> wordFrequency = new TreeMap<String, Integer>();
	private ArrayList<String> authors = new ArrayList<String>();
	public Book(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		processContent();
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
	@Override
	public int compareTo(Media o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public void processContent() {
		contentTokens = Arrays.asList(content.split("\\s"));
		Collections.sort(contentTokens);
		Iterator<String> iterator = contentTokens.iterator();
		while(iterator.hasNext()) {
			String token = (String)iterator.next();
			if (wordFrequency.containsKey(token)) {
				int freq = wordFrequency.get(token) + 1;
				wordFrequency.remove(token);
				wordFrequency.put(token, freq);
			}
			else {
				wordFrequency.put(token, 1);
			}
		}
	}
	@Override
	public String toString() {
		return contentTokens.size() + ", " + wordFrequency;
	}
}
