package com.assignment1;

public class EmployeeWages {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static final int MAX_HRS_IN_MONTH = 10;

    public static void main(String[] args) {

        int totalEmpHrs = 0, totalEmpWage = 0, totalWorkingDays = 0;

        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays <= NUM_OF_WORKING_DAYS) {
            int emphrs = 0;
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    emphrs = 8;
                    break;
                case IS_PART_TIME:
                    emphrs = 4;
                    break;
                default:
                    emphrs = 0;
            }

            totalEmpHrs += emphrs;
            int empWage = emphrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println(emphrs);
            System.out.println(""+totalEmpWage);


        }


    }
}

