package data;

public class Book extends Publication{
    //Pola
    private String author;
    private int pages;
    private String isbn;

    //Konstruktory
    public Book(String title, String author, int year, int pages, String publisher, String isbn) {
        super(year,title,publisher);
        setAuthor(author);
        setPages(pages);
        setIsbn(isbn);
    }

    //gettery & settery

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

/*    public void printInfo()
    {
        String info = getTitle()+"; "+getAuthor()+"; "+getYear()+"; "+getPages()+"; "+getPublisher()+"; "+getIsbn();
        System.out.println(info);
    }*/

    @Override
    public String toString() {
        return getTitle()+"; "+getAuthor()+"; "+getYear()+"; "+getPages()+"; "+getPublisher()+"; "+getIsbn();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + pages;
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        return result;
    }

/*    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        result = prime * result + pages;
        return result;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;

        if (pages != book.pages) return false;
        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        return isbn != null ? isbn.equals(book.isbn) : book.isbn == null;
    }

/*    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        Book other = (Book) obj;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (isbn == null) {
            if (other.isbn != null)
                return false;
        } else if (!isbn.equals(other.isbn))
            return false;
        if (pages != other.pages)
            return false;
        return true;
    }*/

}
