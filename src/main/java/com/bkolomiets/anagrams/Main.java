package com.bkolomiets.anagrams;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Reverser reverser = new Reverser();
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        System.out.println(reverser.reverseLine(inputLine));

        scanner.close();
    }
}
