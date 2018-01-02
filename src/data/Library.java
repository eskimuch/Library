package data;

public class Library {

    public static final int MAX_BOOKS = 1000;
    public static final int MAX_MAGAZINES = 1000;
    private int booksNumber;
    private int magazinesNumber;
    private Book[] books;
    private Magazine[] magazines;

    public Library() {
        books = new Book[MAX_BOOKS];
        magazines = new Magazine[MAX_MAGAZINES];
    }

    public int getBooksNumber() {
            return booksNumber;
        }

    public Book[] getBooks() {
            return books;
        }

    public int getMagazinesNumber() {
        return magazinesNumber;
    }

    public Magazine[] getMagazines() {
        return magazines;
    }

    public void addBook(Book book) {
        if (booksNumber<MAX_BOOKS) {
            books[booksNumber] = book;
            booksNumber++;
        }
        else {
            System.out.println("Maksymalna liczba książek została osiągnięta!");
        }
    }

    public void addMagazine(Magazine magazine){
        if(magazinesNumber<MAX_MAGAZINES){
            magazines[magazinesNumber] = magazine;
            magazinesNumber++;
        }
        else {
            System.out.println("Maksymalna liczba magazynów została osiągnięta!");
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

    public void printMagazines(){
        if(magazinesNumber==0){
            System.out.println("Brak magazynów w bibliotece!");
        }
        for (int x=0; x<magazinesNumber; x++){
            magazines[x].printInfo();
        }
    }
}
