package oop_hus.lab5.Ex4;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    // Constructor
    public MyTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // SetTime
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getters
    public int getHour() {
        return this.hour;
    }

    // Setters
    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    // toString
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    // nextSecond
    public MyTime nextSecond() {
        this.second++;
        if (this.second == 60) {
            this.second = 0;
            this.minute++;
            if (this.minute == 60) {
                this.minute = 0;
                this.hour++;
                if (this.hour == 24) {
                    this.hour = 0;
                }
            }
        }
        return this;
    }

    // nextMinute
    public MyTime nextMinute() {
        this.minute++;
        if (this.minute == 60) {
            this.minute = 0;
            this.hour++;
            if (this.hour == 24) {
                this.hour = 0;
            }
        }
        return this;
    }

    // nextHour
    public MyTime nextHour() {
        this.hour++;
        if (this.hour == 24) {
            this.hour = 0;
        }
        return this;
    }

    // previousSecond
    public MyTime previousSecond() {
        this.second--;
        if (this.second == -1) {
            this.second = 59;
            this.minute--;
            if (this.minute == -1) {
                this.minute = 59;
                this.hour--;
                if (this.hour == -1) {
                    this.hour = 23;
                }
            }
        }
        return this;
    }

    // previousMinute
    public MyTime previousMinute() {
        this.minute--;
        if (this.minute == -1) {
            this.minute = 59;
            this.hour--;
            if (this.hour == -1) {
                this.hour = 23;
            }
        }
        return this;
    }

    // previousHour
    public MyTime previousHour() {
        this.hour--;
        if (this.hour == -1) {
            this.hour = 23;
        }
        return this;
    }

    public static void main(String[] args) {
        MyTime t1 = new MyTime(23, 59, 59);
        t1.setHour(12);
        t1.setMinute(30);
        t1.setSecond(45);
        System.out.println(t1.getHour());
        System.out.println(t1.getMinute());
        System.out.println(t1.getSecond());
        System.out.println(t1);
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextMinute());
        System.out.println(t1.nextHour());
        System.out.println(t1.previousSecond());
        System.out.println(t1.previousMinute());
        System.out.println(t1.previousHour());
    }
}
