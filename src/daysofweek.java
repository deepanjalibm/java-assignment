package com.company;
public class daysofweek {
    public static void main(String[] args) {
        int date = 21;
        int modresult = date % 7;
        switch (modresult) {
            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("ytuesday");
                break;

            case 3:
                System.out.println("wednesday");
                break;

            case 4:
                System.out.println("thrusay");
                break;

            case 5:
                System.out.println("friday");
                break;

            case 6:
                System.out.println("saturday");
                break;

            case 0:
                System.out.println("sunday");
                break;

        }
    }
}