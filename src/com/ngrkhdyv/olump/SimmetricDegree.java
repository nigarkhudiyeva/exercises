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
 * https://www.e-olymp.com/az/problems/1
 */
public class SimmetricDegree {

    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String value = scan.nextLine();
        int degree = 0;
        int size =  value.length() / 2;
        if( value.length()%2!=0){
            size++;
        }
        for (int i = 0, j = value.length() - 1; i < size; i++, j--) {
            if (value.charAt(i) == value.charAt(j)) {
                degree++;
            }
        }
                    System.out.println(degree);

    }
}
