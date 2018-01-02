package data;

public class Library {

        public static final int MAX_BOOKS = 1000;
        private int booksNumber;
        private Book[] books;

        public Library() {
            books = new Book[MAX_BOOKS];
        }
        public int getBooksNumber() {
            return booksNumber;
        }
        public Book[] getBooks() {
            return books;
        }
        public void addBook(Book book) {
            if (booksNumber<MAX_BOOKS) {
                books[booksNumber] = book;
                booksNumber++;
            }
            else {
                System.out.println("Maksymalna wartość została osiągnięta!");
            }
        }
        public void printBooks() {
            if (booksNumber==0) {
                System.out.println("Brak książek w bibliotece!");
            }
            for (int x=0; x<booksNumber; x++){
                books[x].printInfo();
            }

        }
}
