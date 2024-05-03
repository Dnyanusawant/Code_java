public class LibraryAggregationExample {
    public static void main(String[] args) {
    
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565", 180, "Fiction");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084", 281, "Novel");
        Book book3 = new Book("1984", "George Orwell", "978-0451524935", 328, "Dystopian Fiction");

        // Create library
        Library library = new Library("Central Library", book1, book2, book3);

        
        library.displayBooks();
    }
}