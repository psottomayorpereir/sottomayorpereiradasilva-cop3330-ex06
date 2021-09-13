package org.example;

import java.util.Scanner;
import java.util.Date;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        Date d = new Date();
        int year=d.getYear();
        int cur_year=year+1900;
        String cur_age, ret_age;
        int cur, ret;
        int age_diff;
        System.out.print("What is your current age? ");
        cur_age=sc.nextLine();
        System.out.print("At what age would you like to retire? ");
        ret_age=sc.nextLine();
        cur=Integer.parseInt(cur_age);
        ret=Integer.parseInt(ret_age);
        age_diff=ret-cur;

        System.out.println("You have " + age_diff + " years left until you can retire.");
        System.out.println("It is " + cur_year + ", so you can retire in " + (cur_year+age_diff) + ".");
    }
}