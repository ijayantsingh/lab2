package main;

import java.util.Scanner;

/**
 * @author SAGAR THAKUR
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine().trim();
        System.out.println("welcome," + username + "!")
        System.out.println("ho gaya!!");
        scanner.close();

    }
}
