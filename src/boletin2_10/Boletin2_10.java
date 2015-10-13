/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_10;

import java.util.Scanner;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("Introduce la cantidad de dinero a desglosar");
       Scanner eurosInt = new Scanner(System.in);
       int euros = eurosInt.nextInt();
       int b100 = euros/100;
       int resto100 = euros%100;
       int b20 = resto100/20;
       int resto20 = resto100%20;
       int b5 = resto20/5;
       System.out.println("billetes de 100");
       
    }
    
}