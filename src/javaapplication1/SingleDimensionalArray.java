/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author colchhina
 */
public class SingleDimensionalArray {
    public static void main(String[] args) {
    int a[] = new int[5]; //declaration and instantiation
    a[0] = 10; //initialization
    a[1] = 20;
    a[2] = 30;
    a[3] = 40;
    a[4] = 50;
    
    //printing array
    for( int i = 0; i < a.length; i++){
        System.out.println(a[i]);
    }
    }
    
}
