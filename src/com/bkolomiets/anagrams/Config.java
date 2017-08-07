package com.bkolomiets.anagrams;

public class Config {
    private boolean flag = false;
    private int count = 0;
    private int countSpace = 0;
    private int pointA = 0;
    private int pointB = 0;

    public int getPointA() {
        return pointA;
    }

    public int getPointB() {
        return pointB;
    }

    public Boolean equalsSpace(char[] charArr) {
        for(char value : charArr) {
            if(Character.isSpaceChar(value)) {
                flag = true;
            }
        }
        return  flag;
    }

    public int countForSpace(char[] charArr) {
        for(int i=0; i<charArr.length; i++) {
            if(Character.isSpaceChar(charArr[i]) && i != 0) {
                countSpace++;
            }
        }
        return countSpace;
    }

    public int getIdSpace(char[] charArr,int pointA, int pointB) {
        if(Character.isSpaceChar(charArr[pointA])) {
            pointA++;
        }
        for(int i=pointA; i<charArr.length; i++) {
            if(Character.isSpaceChar(charArr[i]) && i != 0) {
                pointB = i;
                break;
            }
        }
        return pointB;
    }

    public char[] notEqualsSpaceRules(char[] charArr, char[] temporaryArr, int i, int pointB) {
        if (Character.isLetter(charArr[i]) && Character.isLetter(charArr[pointB - 1 - count])) {
            temporaryArr[i] = charArr[pointB - 1 - count];
            count++;
            if(count == pointB) {
                count--;
            }
        }else if (Character.isLetter(charArr[i]) && Character.isDigit(charArr[pointB - 1 - count])) {
            while (Character.isDigit(charArr[pointB - 1 - count])) {
                count++;
            }
            temporaryArr[i] = charArr[pointB - 1 - count];
            count++;
        }else if (Character.isDigit(charArr[i])) {
            temporaryArr[i] = charArr[i];
            if(count == pointB) {
                count--;
            }
        }
        return temporaryArr;
    }

    public char[] equalsSpaceRules(int pointA, int pointB, char[] charArr, char[] temporaryArr) {
        count = 0;

        if(Character.isSpaceChar(charArr[0]) && pointA == 0) {
            temporaryArr[0] = charArr[0];
            pointA++;
        }
        if(Character.isSpaceChar(charArr[pointA])) {
            pointA++;
        }
        for(int i=pointA; i<pointB; i++) {
            notEqualsSpaceRules(charArr, temporaryArr, i, pointB);
        }
        if(pointB == charArr.length - 1) {
            temporaryArr[pointB] = charArr[pointB];
        }
        return temporaryArr;
    }
}
