package calendarApp;

public class calendarSource {
    //private data variable
    private int year;
    private int month;
    private int day;

    //constructor
    public calendarSource() {
        this.year = 2018;
        this.month = 1;
        this.day = 1;
    }

    public calendarSource(int month, int day, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //getter and setter methods
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

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

    public String returnDate() {
        //String.format = inbuilt function to format output string
        //'0' specifier to add 0 where applicable
        return String.format("%02d/%02d/%4d", this.getDay(), this.getMonth(), this.getYear());
    }

    public void setDate(int day, int month, int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

}
