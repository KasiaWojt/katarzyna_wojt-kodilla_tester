public class LeapYear {

    public boolean check(int year) {
        if (year % 4 == 0) {

            if (year % 100 == 0) {

                return year % 400 == 0;

            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        LeapYear leapYear = new LeapYear();

        System.out.println("Is 1600 leap year? " + leapYear.check(1600));
        System.out.println("Is 1900 leap year? " + leapYear.check(1900));
        System.out.println("Is 2000 leap year? " + leapYear.check(2000));
        System.out.println("Is 2001 leap year? " + leapYear.check(2001));
        System.out.println("Is 2004 leap year? " + leapYear.check(2004));
    }
}
