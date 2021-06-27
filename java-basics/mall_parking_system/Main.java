package com.kristina.java_intro.mall_parking_system;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String currentTime = "29/10/2019 20:10";
        System.out.println("In-time");
        String in = scanner.nextLine();
        System.out.println("Out-time");
        String out = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try {
            Date inTime = sdf.parse(in);
            Date outTime = sdf.parse(out);
            Date currTime = sdf.parse(currentTime);
            if (inTime.compareTo(currTime) >= 0) {
                System.out.println(sdf.format(inTime) + " is an Invalid In-Time");
                System.exit(1);
            }
            if (outTime.compareTo(currTime) >= 0) {
                System.out.println(sdf.format(outTime) + " is an Invalid Out-Time");
                System.exit(1);
            }
            //long diff = (outTime.getTime() - inTime.getTime() / (1000 * 60 * 60)) % 24;

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}




