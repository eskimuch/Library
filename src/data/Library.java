package data;

public class Library {

    public static final int MAX_PUBLICATIONS = 2000;
    private Publication[] publications;
    private int publicationsNumber;
/*    public static final int MAX_BOOKS = 1000;
    public static final int MAX_MAGAZINES = 1000;
    private int booksNumber;
    private int magazinesNumber;
    private Book[] books;
    private Magazine[] magazines;*/

    public Library() {
        //books = new Book[MAX_BOOKS];
        //magazines = new Magazine[MAX_MAGAZINES];
        publications = new Publication[MAX_PUBLICATIONS];
    }

    public int getPublicationsNumber(){
        return publicationsNumber;
    }

    public Publication[] getPublications(){
        return publications;
    }

/*    public int getBooksNumber() {
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
    }*/

    public void addPublication(Publication pub) throws ArrayIndexOutOfBoundsException{
        if (publicationsNumber==MAX_PUBLICATIONS){
            throw new ArrayIndexOutOfBoundsException("MAX_PUBLICATIONS "+ MAX_PUBLICATIONS);
        }
        //if (publicationsNumber<MAX_PUBLICATIONS){
        publications[publicationsNumber] = pub;
        publicationsNumber++;

/*        else {
            System.out.println("Maksymalna liczba publikacji została osiągnięta");
        }*/
    }

    public void addBook(Book book) {
        addPublication(book);
    }

    public void addMagazine(Magazine magazine){
        addPublication(magazine);
    }

   /* public void printBooks(){  - passed to LibraryUtils when exceptions added
        int countBooks = 0;
        for (int i=0; i<publicationsNumber; i++){
            if (publications[i] instanceof Book){
                System.out.println(publications[i]);
                countBooks++;
            }
            if (countBooks == 0){
                System.out.println("Brak książek w bibliotece!");
            }
        }
    }*/
/*    public void printBooks() {
        if (booksNumber==0) {
            System.out.println("Brak książek w bibliotece!");
        }
        for (int x=0; x<booksNumber; x++){
            //books[x].printInfo();   przed nadpisaniem metody toString w kl.Book
            System.out.println(books[x]);
        }
    }*/

   /* public void printMagazines(){  - passed to LibraryUtils when exceptions added
        int countMagazines = 0;
        for (int i=0; i<publicationsNumber; i++){
            if (publications[i] instanceof Magazine){
                System.out.println(publications[i]);
                countMagazines++;
            }
            if (countMagazines == 0){
                System.out.println("Brak magazynów w bibliotece!");
            }
        }
    }*/
}
