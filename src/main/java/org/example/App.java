/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
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

        if(age_diff<0){
            System.out.println("You can already retire!");
        }//end if

        else{
            System.out.println("You have " + age_diff + " years left until you can retire.");
            System.out.println("It is " + cur_year + ", so you can retire in " + (cur_year+age_diff) + ".");
        }//end else

    }
}