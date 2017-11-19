
public class LibraryRun {
	public static void main(String[] args) {
		//used to run library and book classes'

		Book bookOne = new Book("White Teeth", "Zadie Smith");
		Book bookTwo = new Book("Milk and Honey", "Rupi Kaur");
		Book bookThree = new Book("Cosmos", "Carl Sagan");
		
		bookOne.inLibrary = true;
		bookTwo.inLibrary = true;
		bookThree.inLibrary = true;
		
		Library myBookshelf = new Library(bookOne, bookTwo, bookThree);
		
		myBookshelf.viewLibrary();
		
		myBookshelf.checkOutBook(bookOne);
		myBookshelf.checkOutBook(bookTwo);
		
		myBookshelf.checkStatus(bookThree);
		myBookshelf.viewLibrary();
	
	}
	
}
