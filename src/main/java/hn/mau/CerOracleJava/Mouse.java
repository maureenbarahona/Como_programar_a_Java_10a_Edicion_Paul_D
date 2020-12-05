/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.CerOracleJava;

import static java.lang.Integer.min;

/**
 *
 * @author maureen
 */
public class Mouse {
    
    public static double doNothing(int n) {
        n = n + 8;
        return (double) 12 / n;
    }


    public static void main(String[] args) {
        int n = 13;
        System.out.println(doNothing(n));
        System.out.println( n);



    }

}
