package com.bridgelabz;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinate value for first line");
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("Enter the x1 co-ordinate of first point ");
        double x1 = sc.nextDouble();
        System.out.print("Enter the y1 co-ordinate of first point ");
        double y1 = sc.nextDouble();
        System.out.print("Enter the x2 co-ordinate of Second point ");
        double x2 = sc.nextDouble();
        System.out.print("Enter the y2 co-ordinate of Second point ");
        double y2 = sc.nextDouble();
        double lengthOfFirstLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Calculate the length for first line is " + df.format(lengthOfFirstLine));
        String l1 = String.valueOf(df.format(lengthOfFirstLine));
        System.out.println("Enter the co-ordinate value for Second line");
        System.out.print("Enter the X1 co-ordinate of first point ");
        double X1 = sc.nextDouble();
        System.out.print("Enter the Y1 co-ordinate of first point ");
        double Y1 = sc.nextDouble();
        System.out.print("Enter the X2 co-ordinate of Second point ");
        double X2 = sc.nextDouble();
        System.out.print("Enter the Y2 co-ordinate of Second point ");
        double Y2 = sc.nextDouble();
        double lengthOfSecondLine = Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2));
        String l2 = String.valueOf(df.format(lengthOfSecondLine));
        System.out.println("Calculate the length for second line is " + df.format(lengthOfSecondLine));
        System.out.println();
        if (l1.compareTo(l2) == 0) {
            System.out.println("Two lines are equal.");
        } else if(l1.compareTo(l2) > 0 ){
            System.out.println("First Line is Greater. ");
        }else if(l1.compareTo(l2) < 0){
            System.out.println("Second line is Greater. ");
        }
    }
}
