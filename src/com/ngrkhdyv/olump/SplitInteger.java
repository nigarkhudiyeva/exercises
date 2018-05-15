/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngrkhdyv.olump;

import java.util.Scanner;

/**
 *
 * @author nigarkhudiyeva
 */
public class SplitInteger {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        System.out.print(x / 10);
        System.out.print(" ");
        System.out.println(x % 10);

    }
}
