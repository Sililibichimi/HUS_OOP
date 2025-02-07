package oop_hus.lab5.Ex4;

import java.util.Scanner;

public class TestMyTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour, minute, second: ");
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
            MyTime time = new MyTime(hour, minute, second);
            System.out.println("Time: " + time);
            System.out.println("The next second of" + time + " is " + time.nextSecond());
            System.out.println("The next minute of" + time + " is " + time.nextMinute());
            System.out.println("The next hour of" + time + " is " + time.nextHour());
            System.out.println();
            System.out.println("The previous second of" + time + " is " + time.previousSecond());
            System.out.println("The previous minute of" + time + " is " + time.previousMinute());
            System.out.println("The previous hour of" + time + " is " + time.previousHour());
        } else {
            System.out.println("Invalid time");
            return;
        }
        MyTime t2 = new MyTime();
        t2.setTime(hour, minute, second);
        System.out.println("Time: " + t2);
        t2.setHour(12);
        t2.setMinute(30);
        t2.setSecond(45);
        System.out.println("Time: " + t2);
        System.out.println("Hour: " + t2.getHour());
        System.out.println("Minute: " + t2.getMinute());
        System.out.println("Second: " + t2.getSecond());
    }
}
