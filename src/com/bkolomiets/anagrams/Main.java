package com.bkolomiets.anagrams;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Config config = new Config();

        int pointA = config.getPointA();
        int pointB = config.getPointB();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something...");

        String userData = scan.nextLine();

        char[] charArr = userData.toCharArray();
        char[] temporaryArr = new char[charArr.length];

        for(int i=0; i<charArr.length; i++) {
            if(config.equalsSpace(charArr) == true) {
                int countSpaces = config.countForSpace(charArr);

                for(int j=0; j<countSpaces; j++) {
                    pointB = config.getIdSpace(charArr, pointA, pointB);
                    config.equalsSpaceRules(pointA, pointB, charArr, temporaryArr);
                    pointA = pointB;
                }
                config.equalsSpaceRules(pointA, charArr.length, charArr, temporaryArr);
                break;
            }else {
                pointB = charArr.length;
                config.notEqualsSpaceRules(charArr, temporaryArr, i, pointB);
            }
        }
        System.out.print("Your result: ");

        for(char value : temporaryArr) {
            System.out.print(value);
        }
    }
}
