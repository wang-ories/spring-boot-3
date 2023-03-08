package com.ories.coffee;

public class Grader {

    public char determinGrade(int grade) {
        if (grade < 0) {
            throw new IllegalArgumentException("Number should be great than 0");

        } else if (grade < 60) {
            return 'F';
        } else if (grade < 70) {
            return 'E';
        } else if (grade < 80) {
            return 'D';
        } else if (grade < 90) {
            return 'C';
        } else if (grade < 95) {
            return 'B';
        } else {
            return 'A';
        }
    }
}