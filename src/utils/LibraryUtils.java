package utils;

import data.Book;
import data.Library;
import data.Magazine;
import data.Publication;

public class LibraryUtils {

    //DL 05-01-18
    public static void printBooks(Library lib){
        Publication[] publications = lib.getPublications();
        int publicationsNumber = lib.getPublicationsNumber();
        int countBooks = 0;
        for (int i=0; i<=publicationsNumber; i++){ // < zmieniona na <=, nie drukował się if (countBooks == 0)
            if (publications[i] instanceof Book){
                System.out.println(publications[i]);
                countBooks++;
            }
            if (countBooks == 0 && i == publicationsNumber){ // dodane && i==publicationsNumber
                System.out.println("Brak książek w bibliotece!");
            }
        }
    }

    //DL 05-01-18
    public static void printMagazines(Library lib){ //  < zmieniona na <=, nie drukował się if (countBooks == 0)
        Publication[] publications = lib.getPublications();
        int publicationsNumber = lib.getPublicationsNumber();
        int countMagazines = 0;
        for (int i=0; i<=publicationsNumber; i++){
            if (publications[i] instanceof Magazine){
                System.out.println(publications[i]);
                countMagazines++;
            }
            if (countMagazines == 0 && i==publicationsNumber){ // dodane && i==publicationsNumber
                System.out.println("Brak magazynów w bibliotece!");
            }
        }
    }
}
