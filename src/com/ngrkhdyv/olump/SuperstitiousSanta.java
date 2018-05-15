/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngrkhdyv.olump;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author nigarkhudiyeva
 * https://www.e-olymp.com/az/problems/31
 */
public class SuperstitiousSanta {

    public static void main(String[] args) {
        
        int notWorkingDays = 0;

        
        Scanner scan = new Scanner(System.in);
        int quantityOfShifts = scan.nextInt();
        for (int i = 0; i < quantityOfShifts; i++) {
            
            int beginYear = Integer.parseInt(scan.next());
            int endYear = Integer.parseInt(scan.next());
            
            while (beginYear <= endYear) {
                for (int month = Calendar.JANUARY; month <= Calendar.DECEMBER; month++) {
                    if (isFriday13(beginYear, month, 1)) {
                        notWorkingDays++;
                    }
                }
                beginYear++;
            }
        }
        
        System.out.println(notWorkingDays);
    }
    
    
    public static boolean isFriday13(int year,int month,int day){
         Calendar calendar = Calendar.getInstance();
         calendar.set(year, month, day);
         return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;
    }
}
