
 class Book {
    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; 
    }
}


class Library {
    Book book;

    public void addBook(Book b) {
        book = b;
        System.out.println("Book added: " + b.title);
    }

    public void checkOutBook() {
        if (book != null && book.isAvailable) {
            book.isAvailable = false;
            System.out.println("You checked out: " + book.title);
        } else {
            System.out.println("Book not available.");
        }
    }

    public void returnBook() {
        if (book != null && !book.isAvailable) {
            book.isAvailable = true;
            System.out.println("You returned: " + book.title);
        } else {
            System.out.println("No book to return.");
        }
    }
}


class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Book b1 = new Book("Java Basics", "John Smith");

        lib.addBook(b1);
        lib.checkOutBook();
        lib.checkOutBook();
        lib.returnBook();
    }
}
