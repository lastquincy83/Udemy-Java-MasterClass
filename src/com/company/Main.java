package com.company;

import sun.awt.geom.AreaOp;

public class Main {

    public static void main(String[] args) {

//        printConversion(1.5);
//        printConversion(10.25);
//        printConversion(-5.6);
//        printConversion(25.42);
//        printConversion(95.75);

//        printMegaBytesAndKiloBytes(-2500);
//        printMegaBytesAndKiloBytes(5000);

//        System.out.println(isLeapYear(1700));
//        System.out.println(isLeapYear(1800));
//        System.out.println(isLeapYear(1900));
//        System.out.println(isLeapYear(2100));
//        System.out.println(isLeapYear(2200));
//        System.out.println(isLeapYear(2300));
//        System.out.println(isLeapYear(2500));
//        System.out.println(isLeapYear(2600));
//        System.out.println(isLeapYear(1600));
//        System.out.println(isLeapYear(2000));
//        System.out.println(isLeapYear(2400));
//        System.out.println(isLeapYear(1855));

        System.out.println(getDaysInMonth(2, 2400));
	}

    private static void printFinalScore(int score, int levelCompleted, int bonus) {
		int finalScore = score +(levelCompleted*bonus);
		System.out.println("Your final score was " + finalScore);
	}

	private static void displayHighScorePosition(String name, int position) {
    	System.out.println(name + " managed to get into position " + position + " on the high score table");
	}

	private static long toMilesPerHour(double kilometersPerHour) {
    	if (kilometersPerHour >= 0) {
    		return Math.round(kilometersPerHour*0.621504);
		}

    	return -1;
	}

    private static void printConversion (double kilometersPerHour) {
        if (toMilesPerHour(kilometersPerHour) >= 0){
            System.out.println(kilometersPerHour + " km/h = "+ toMilesPerHour(kilometersPerHour) + " mi/h");
        } else {
            System.out.println("Invalid value");
        }
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes >= 0) {
            System.out.println(kiloBytes + " KB = " + (kiloBytes/1024) + " MB and " + (kiloBytes%1024) + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if ( hourOfDay < 0 || hourOfDay > 23){
            return false;
        } else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLeapYear (int year) {
        boolean continueCheck = false;
        if ( year < 1 || year > 9999){
            return false;
        } else if (year %4 == 0) {
            continueCheck = true;
        }

        if (continueCheck && !(year %100 == 0)) {
            return true;
        }

        return year % 400 == 0;
    }

    public static int getDaysInMonth(int month, int year){

        int days=0;

        if(month < 1 || month >12){
            return -1;
        }
        if(year<1 || year >9999){
            return -1;
        }

        else{
            switch(month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days=31;
                    break;
                case 2:
                    if (isLeapYear(year)){
                        days = 29;
                    }
                    else
                        days=28;
                    break;
                case 4: case 6: case 9: case 11:
                    days=30;
                    break;
            }


        }

        return days;
    }
}
