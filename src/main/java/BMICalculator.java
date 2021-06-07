/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 jiahao Zhu
 */

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        double weight, height,bmi;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your weight");
        do{
        weight = scan.nextDouble();
        if(weight < 0 || weight > 500)
        {
            System.out.println("Please enter the valid number");
        }
        }while(weight < 0 || weight > 500);

        System.out.println("Enter your height");
        do{
            height = scan.nextDouble();
            if(height < 0 || height > 500)
            {
                System.out.println("Please enter the valid number");
            }
        }while(height < 0 || height > 300);
        bmi = (weight / (height * height)) * 703;
        System.out.println("Your BMI is " + bmi);
        if(bmi < 18.5)
        {
            System.out.println("Your are underweight");
        }
        else if(bmi > 25) {
            System.out.println("You are overweight");
        }
        else{
            System.out.println("everything is ok");
        }
    }

}
