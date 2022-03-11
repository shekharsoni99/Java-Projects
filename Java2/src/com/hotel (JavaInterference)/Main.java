package com.hotel;
import java.util.Scanner;

public class Main {
    public Hotel provideFood(int amount){
        if(amount > 1000) {
            return new TajHotel();
        }
        else if(amount >200 && amount < 1000) {
            return new RoadSideHotel();
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any amount");
        int amount = sc.nextInt();

        Main m1 = new Main();
        Hotel result = m1.provideFood(amount);

        if(result instanceof TajHotel) {
             result.chickenBiryani();
             result.masalaDosa();
             ((TajHotel) result).welcomeDrink();
        }

        else if(result instanceof RoadSideHotel) {
            result.chickenBiryani();
            result.masalaDosa();
        }

        if(result == null) {
            System.out.println("Please Enter a valid amount.");
        }
    }
}
