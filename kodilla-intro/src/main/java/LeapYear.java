public class LeapYear {
    public static void main(String[] args) {
        int year = 1900;
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear) {
            System.out.println("Rok jest przestępny!");
        }
        else {
            System.out.println("Nie jest przestępny!");
        }
    }
}
