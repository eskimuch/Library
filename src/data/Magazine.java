package data;

public class Magazine extends Publication {

    private int month;
    private int day;
    private String langauge;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getLangauge() {
        return langauge;
    }

    public void setLangauge(String langauge) {
        this.langauge = langauge;
    }

    public Magazine(String title, String publisher, String langauge, int year, int month, int day){
        super(year,title,publisher);
        setLangauge(langauge);
        setMonth(month);
        setDay(day);
    }

/*    public void printInfo(){
        String info = getTitle()+"; "+getPublisher()+"; "+getLangauge()+"; "+getYear()+"-"+getMonth()+"-"+getDay()+"; "+getLangauge();
        System.out.println(info);
    }*/

    @Override
    public String toString() {
        return getTitle()+"; "+getPublisher()+"; "+getLangauge()+"; "+getYear()+"-"+getMonth()+"-"+getDay()+"; "+getLangauge();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + month;
        result = 31 * result + day;
        result = 31 * result + (langauge != null ? langauge.hashCode() : 0);
        return result;
    }

    /*    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + day;
        result = prime * result + ((language == null) ? 0 : language.hashCode());
        result = prime * result + month;
        return result;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Magazine)) return false;
        if (!super.equals(o)) return false;

        Magazine magazine = (Magazine) o;

        if (month != magazine.month) return false;
        if (day != magazine.day) return false;
        return langauge != null ? langauge.equals(magazine.langauge) : magazine.langauge == null;
    }

    /*    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;

        Magazine other = (Magazine) obj;

        if (day != other.day) return false;
        if (language == null) {
            if (other.language != null)
                return false;
        } else if (!language.equals(other.language))
            return false;
        if (month != other.month) return false;
        return true;
    }*/

}
