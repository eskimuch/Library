package data;

public class Publication {

    private int year;
    private String title;
    private String publisher;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    protected Publication(int year, String title, String publisher){
        setYear(year);
        setTitle(title);
        setPublisher(publisher);
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        return result;
    }

/*    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + year;
        return result;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false; //dopisane
        if (!(o instanceof Publication)) return false;

        Publication that = (Publication) o;

        if (year != that.year) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        return publisher != null ? publisher.equals(that.publisher) : that.publisher == null;
    }

/*    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Publication other = (Publication) obj;
        if (year != other.year) return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (publisher == null) {
            if (other.publisher != null)
                return false;
        } else if (!publisher.equals(other.publisher))
            return false;
        return true;
    }*/

}
