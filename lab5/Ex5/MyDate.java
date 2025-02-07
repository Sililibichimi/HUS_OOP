package oop_hus.lab5.Ex5;

public class MyDate {
    final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    final static int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            System.out.println("Invalid year, month, or day");
        }
    }

    // check if the date is valid
    public static boolean isValidDate(int year, int month, int day) {
        if (isLeapYear(year)) {
            if (month == 2) {
                return day >= 1 && day <= 29;
            }
        }
        if (year < 1 || year > 9999) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        return !(day < 1 || day > DAYS_IN_MONTH[month - 1]);
    }

    // chech if the year is leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // get the day of the week
    public int getDayOfWeek(int year, int month, int day) {
        int[] commonYear = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] leapYear = {0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
        int res;
        if (isLeapYear(year)) {
            res = (day + leapYear[month - 1] + 5 * ((year - 1) % 4) + 4 * (year - 1) % 100 + 6 * ((year - 1) % 400)) % 7;
        } else {
            res = (day + commonYear[month - 1] + 5 * ((year - 1) % 4) + 4 * (year - 1) % 100 + 6 * ((year - 1) % 400)) % 7;
        }
        return res;
    }

    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            System.out.println("Invalid year, month, or day");
        }
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (isValidDate(year, this.month, this.day)) {
            this.year = year;
        } else {
            System.out.println("Invalid year");
        }
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        if (isValidDate(this.year, month, this.day)) {
            this.month = month;
        } else {
            System.out.println("Invalid month");
        }
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        if (isValidDate(this.year, this.month, day)) {
            this.day = day;
        } else {
            System.out.println("Invalid day");
        }
    }

    @Override
    public String toString() {
        if (!isValidDate(this.year, this.month, this.day)) {
            return "";
        }
        return DAYS[getDayOfWeek(this.year, this.month, this.day)] + " " + this.day + " " + MONTHS[this.month - 1] + " " + this.year;
    }

    public MyDate nextDay() {
        boolean temp = false;
        if (this.month == 2 && isLeapYear(this.year) && this.day < 29) {
            temp = true;
        } else {
            if (this.day < DAYS_IN_MONTH[month - 1]) {
                temp = true;
            }
        }
        if (temp) {
            this.day++;
        } else {
            this.day = 1;
            if (this.month < 12) {
                this.month++;
            } else {
                this.month = 1;
                this.year++;
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        if (this.month < 12) {
            this.month++;
            if (month == 2) {
                if (isLeapYear(this.year)) {
                    if (this.day > 29) {
                        this.day = 29;
                    }
                } else {
                    if (this.day > 28) {
                        this.day = 28;
                    }
                }
            } else if (this.day > DAYS_IN_MONTH[month - 1]) {
                this.day = DAYS_IN_MONTH[month - 1];
            }
        } else {
            this.month = 1;
            this.year++;
        }
        return this;
    }

    public MyDate nextYear() {
        if (isLeapYear(this.year)) {
            if (this.month == 2 && this.day == 29) {
                this.day = 28;
            }
        }
        this.year++;
        return this;
    }

    public MyDate previousDay() {
        if (this.day > 1) {
            this.day--;
        } else {
            if (this.month > 1) {
                this.month--;
                if (this.month == 2 && isLeapYear(this.year)) {
                    this.day = 29;
                } else {
                    this.day = DAYS_IN_MONTH[this.month - 1];
                }
            } else {
                this.month = 12;
                this.year--;
                this.day = 31;
            }
        }
        return this;
    }

    public MyDate previousMonth() {
        if (this.month > 1) {
            this.month--;
            if (this.month == 2) {
                if (isLeapYear(this.year)) {
                    if (this.day > 29) {
                        this.day = 29;
                    }
                } else {
                    if (this.day > 28) {
                        this.day = 28;
                    }
                }
            } else if (this.day > DAYS_IN_MONTH[month - 1]) {
                this.day = DAYS_IN_MONTH[month - 1];
            }
        } else {
            this.month = 12;
            this.year--;
        }
        return this;
    }

    public MyDate previousYear() {
        if (isLeapYear(this.year)) {
            if (this.month == 2 && this.day == 29) {
                this.day = 28;
            }
        }
        this.year--;
        return this;
    }
}
