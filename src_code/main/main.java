/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import control.Substitution_Algo;
import control.Function;
import control.Valid_Input;

/**
 *
 * @author nam142857
 */
public class main {

    public static void main(String[] args) {
        Substitution_Algo sa = new Substitution_Algo();
        while (true) {
            System.out.println("");
            System.out.println("** Substitution Encrypt Tools **");
            System.out.println("(1). Set new key");
            System.out.println("(2). Get current key");
            System.out.println("(3). Encrypt message");
            System.out.println("(4). Decrypt message");
            System.out.println("(5). Quit");
            System.out.println("*********************************");
            int choice = Valid_Input.valid_choice(); 
            System.out.println("");
            switch (choice) { 
                case 1 : 
                    sa.setNewKey();
                    break; 
                case 2 :   
                    sa.getCurrentKey();
                    break;
                case 3 : 
                    sa.encrypt();
                    break;
                case 4 : 
                    sa.decrypt();
                    break;
                case 5 : 
                    System.out.println("Quitting....");
                    System.out.println("");
                    return;
            }
        }

    }
}
