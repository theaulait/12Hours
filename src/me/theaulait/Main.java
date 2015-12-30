package me.theaulait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

//    public static void Convert(){
//        System.out.println("Please enter a time in this format 00:00:00AM/PM");
//        Scanner input = new Scanner(System.in);
//        String time = input.next();
//        String extension = "PM";
//
//        if (time.contains(extension)) {
//            time = time.replace("PM", "");
//            StringBuffer buffer = new StringBuffer(time);
//            String hourPM = time.substring(0, 2);
//            int hour = Integer.parseInt(hourPM);
//            int miliTime = 12 + hour;
//            String military = String.valueOf(miliTime);
//            buffer.replace(0, 2, military);
//            System.out.println("The military time is: " + buffer);
//        }
//        else{
//            time = time.replace("AM", "");
//            System.out.println(time);
//        }
//    }


    public static void Convert(){
        System.out.println("Please enter a time in this format 00:00:00AM/PM");
        Scanner input = new Scanner(System.in);
        DateFormat twelveHour = new SimpleDateFormat();

    }
    public static void main(String[] args) {
        Convert();
        }
}
