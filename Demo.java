class Date{
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return (day +" "+month+" "+year);
    }
}
public class Program {
    public static void main(String[] args) {
        Date date = null; //new Date(22,03,1996)
        System.out.println(date.toString());
    }
}

