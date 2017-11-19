
public class Library {
	Book[] libraryStock;
 
	Library(Book bookOne, Book bookTwo, Book bookThree) {
		libraryStock = new Book[]{bookOne, bookTwo, bookThree};
	}
	//how to add more books? Use list?
	
	boolean checkStatus(Book book) {
		// returns true if book is in library
		// returns false if book is checked out 
		
		if(book.inLibrary == true) {
			System.out.println(book.title + " is available.");
		}
		else {
			System.out.println(book.title + " is currently checked out.");
		}
		return book.inLibrary;
	}
	
	void returnBook(Book book) {
		book.inLibrary = true;
		System.out.println(book.title + " has been returned.");
	}
	
	void checkOutBook(Book book) {
		book.inLibrary = false;
		System.out.println(book.title + " has been checked out.");
	}
	
	void viewLibrary() {
	int i;
		for (i = 0; i < libraryStock.length; i++)
			if (libraryStock[i].inLibrary == true) {
				System.out.println("The book " +libraryStock[i].title + " is currently available.");
			}
			else {
				System.out.println("The book " +libraryStock[i].title + " is currently unavailable");
			}
	}
	
}


