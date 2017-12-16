package data;

import app.Book;
import utils.DataReader;

public class Library {
    public static void main(String[] args) {

        final String appName = "Biblioteka v0.6";
        DataReader dataReader = new DataReader();

        Book[] books = new Book[1000];


        System.out.print(appName);
        System.out.println("\nSystem może przechowywać "+books.length+" książek.");
        System.out.println("\nWprowadź nową książkę:");

        books[0] = dataReader.readAndCreateBook();
        books[1] = dataReader.readAndCreateBook();
        dataReader.close();

        books[0].printInfo();
        books[1].printInfo();
    }
}
