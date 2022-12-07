/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Hello {
     public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    while (true) {
    System.out.println("Enter some data: ");
    String input = myScanner.nextLine();
    if(input == null || input.isEmpty()) {
        System.out.println("You did not enter anything!");
    } else {
        break;  
    }
}        
}
}   
