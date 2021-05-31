package hust.soict.hedspi.test.media;

import hust.soict.hedspi.aims.media.Book;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book("Conan", "Detective", 20f);
		book1.addAuthor("Minh Vu");
		book1.setContent("lua nep la lua nep lang");
		System.out.println(book1.toString());
	}

}
