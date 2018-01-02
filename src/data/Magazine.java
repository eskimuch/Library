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
        setTitle(title);
        setPublisher(publisher);
        setLangauge(langauge);
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public void printInfo(){
        String info = getTitle()+"; "+getPublisher()+"; "+getLangauge()+"; "+getYear()+"-"+getMonth()+"-"+getDay()+"; "+getLangauge();
        System.out.println(info);
    }
}
