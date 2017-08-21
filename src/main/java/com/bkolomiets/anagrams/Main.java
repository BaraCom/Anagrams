package com.bkolomiets.anagrams;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Reverser reverser = new Reverser();

        System.out.print("Enter something: ");

        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        System.out.printf("Your result:     %s", reverser.reverseLine(inputLine));

        scanner.close();
    }
}
