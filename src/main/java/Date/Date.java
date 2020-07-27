package Date;

public class Date {

    private Integer day;
    private String month;
    private String year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean rightDayFormat(){
        if (this.day.equals(Character.isDigit(day))){
            return true;
        } else {
            return false;
        }
    }
}
