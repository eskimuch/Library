package app;

import data.Book;
import data.Library;
import data.Magazine;
import utils.DataReader;
import utils.LibraryUtils;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class LibraryControl {

    // zmienne do kontrolowania programu - zastąpione przez Enum
    //public static final int EXIT = 0;
    //public static final int ADD_BOOK = 1;
    //public static final int ADD_MAGAZINE = 2;
    //public static final int PRINT_BOOKS = 3;
    //public static final int PRINT_MAGAZINES = 4;

    private DataReader dataReader; // zmienna do komunikacji z użytkownikiem
    private Library library; // "biblioteka" przechowująca dane

    public LibraryControl(){
        dataReader = new DataReader();
        library = new Library();
    }

     //Główna pętla programu, która pozwala na wybór opcji i interakcję

    public void controlLoop(){
        //int option; - 1
        //Option option; - 2
        Option option = null;
        //while ((option = dataReader.getInt()) != EXIT){ - 1
        //while ((option = Option.createFromInt(dataReader.getInt())) != Option.EXIT){ -2
        while (option != Option.EXIT){
            try {
                printOptions();
                option = Option.createFromInt(dataReader.getInt());
                switch (option){
                case ADD_BOOK:
                    addBook();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
                    case EXIT:
            //default:  - 1
                //System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
                }
            //printOptions();
            } catch (InputMismatchException e){
                System.out.println("Wprowadzono niepoprawne dane, publikacji nie dodano");
            } catch (NumberFormatException | NoSuchElementException e){
                System.out.println("Wybrana opcja nie istnieje, wybierz ponownie:");
            }
        }
        // zamykamy strumień wejścia
        dataReader.close();
    }
    private void printOptions(){
        System.out.println("Wybierz opcję: ");
        for (Option o: Option.values()){
            System.out.println(o);
        }
        //System.out.println(EXIT + " - wyjście z programu");
        //System.out.println(ADD_BOOK + " - dodanie nowej książki");
        //System.out.println(ADD_MAGAZINE + " - dodanie nowego magazynu");
        //System.out.println(PRINT_BOOKS + " - wyświetl dostępne książki");
        //System.out.println(PRINT_MAGAZINES + " - wyświetl dostępne magazyny");
    }
    private void addBook(){
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }
    private void addMagazine(){
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }

    private void printBooks(){
        //library.printBooks();
        LibraryUtils.printBooks(library);
    }

    private void printMagazines(){
        LibraryUtils.printMagazines(library);
    }

    private enum Option {  //klasa wewnętrzna

        EXIT(0, "Wyjście z programu"),
        ADD_BOOK(1, "Dodanie książki"),
        ADD_MAGAZINE(2, "Dodanie magazynu/gazety"),
        PRINT_BOOKS(3, "Wyświetlenie dostępnych książek"),
        PRINT_MAGAZINES(4, "Wyświetlenie dostępnych magazynów/gazet");

        private int value;
        private String description;

        Option(int value, String description) {
            this.value = value;
            this.description = description;
        }

        @Override
        public String toString() {
            return value + " - " + description;
        }

        public static Option createFromInt(int option) throws NoSuchElementException{
            //return Option.values()[option];
            Option result = null;
            try {
                result = Option.values()[option];
            } catch (ArrayIndexOutOfBoundsException e){
                throw new NoSuchElementException("Brak elementu o podanym ID");
            }
            return result;
        }
    } //klasa wewnętrzna
}
