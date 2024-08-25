package control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;

/**
 *
 * @author nam142857
 */
public class Valid_Input {

    public static final Scanner sc = new Scanner(System.in);

    public static String valid_message(String thing_to_do) {
        System.out.print("Enter a message to " + thing_to_do + ": ");
        do {
            String userMessage = sc.nextLine();
            if (!userMessage.isEmpty()) {
                return userMessage;
            } else {
                System.err.println("Message is empty ! ");
                System.out.print("Enter a message to " + thing_to_do + ": ");
            }
        } while (true);
    }

    public static int valid_choice() {
        System.out.print("Enter your choice : ");
        do {
            try {
                int choice = Integer.parseInt(sc.nextLine());
                if (choice >= 1 && choice <= 5) {
                    return choice;
                } else {
                    System.err.println("Invalid choice! Try Again !");
                    System.out.print("Enter your choice : ");
                }
            } catch (Exception e) {
                System.err.println("Choice must be a number !");
                System.out.print("Enter your choice : ");
            }
        } while (true);
    }
}
