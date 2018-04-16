import calendarApp.calendarSource;

public class calendarImplement {
    public static void main(String[] args) {
        // Test constructor and toString()
        calendarSource d1 = new calendarSource(12, 4, 2016);
        System.out.println(d1.returnDate());

        // Test Setters and Getters
        d1.setYear(2012);
        d1.setMonth(12);
        d1.setDay(23);
        System.out.println(d1.returnDate());  // run toString() to inspect the modified instance
        System.out.println("Year is: " + d1.getYear());
        System.out.println("Month is: " + d1.getMonth());
        System.out.println("Day is: " + d1.getDay());

        // Test setDate()
        d1.setDate(1, 2, 2088);
        System.out.println(d1.returnDate());  // toString()
    }
}