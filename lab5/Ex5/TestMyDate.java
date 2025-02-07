package oop_hus.lab5.Ex5;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2012, 2, 28);
        System.out.println(date1);
        System.out.println(date1.nextDay());
        System.out.println(date1.nextDay());
        System.out.println(date1.nextMonth());
        System.out.println(date1.nextYear());
        System.out.println();

        MyDate date2 = new MyDate(2020, 1, 2);
        System.out.println(date2);
        System.out.println(date1.previousDay());
        System.out.println(date1.previousDay());
        System.out.println(date1.previousMonth());
        System.out.println(date1.previousYear());
        System.out.println();

        MyDate date3 = new MyDate(2012, 2, 29);
        System.out.println(date3.previousYear());
        System.out.println();

        MyDate date4 = new MyDate(2099, 11, 31);
        System.out.println(date4);
        MyDate date5 = new MyDate(2011, 2, 29);
        System.out.println(date5);

        MyDate date6 = new MyDate(2012, 12, 31);
        System.out.println(date6.previousMonth());
        System.out.println(date6.nextDay());

        MyDate date7 = new MyDate(2012, 1, 1);
        System.out.println(date7.previousDay());
        System.out.println();

        int day = 28;
        int month = 12;
        int year = 2011;
        while (!(day == 2 && month == 3 && year == 2012)) {
            if (MyDate.isValidDate(year, month, day)) {
                System.out.println(new MyDate(year, month, day));
                ++day;
            } else {
                day = 1;
                if (month == 12) {
                    month = 1;
                    ++year;
                } else {
                    ++month;
                }
            }
        }
    }
}
