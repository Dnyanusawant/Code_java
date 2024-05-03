class Book {
    String title;
    String author;
    String ISBN;
    int pageCount;
    String genre;

    Book(String title, String author, String ISBN, int pageCount, String genre) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.pageCount = pageCount;
        this.genre = genre;
    }
    
    public void displayBook() {
        System.out.println("***** BOOK DETAILS *****");
        System.out.println("Title : " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN : " + this.ISBN);
        System.out.println("Page Count: " + this.pageCount);
        System.out.println("Genre: " + this.genre);
    }
    
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084", 281, "Fiction");
        book1.displayBook();
    }
}
