package com.pyramid.kailash;

public class J {
	 // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }

    // Function to print the prime pyramid
    public static void printPrimePyramid(int rows) {
        int num = 2;
        for (int i = 1; i <= rows; i++) {
            int temp = num;
            int space = rows - i;
            // Print leading spaces
            for (int k = 0; k < space; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                while (!isPrime(num)) {
                    num++;
                }
                System.out.print(num);
                num++;
            }
            num = temp * 10 + 2; // Start from the next prime for the next row
            System.out.println(); // Move to the next line
        }
    }

    // Main method
    public static void main(String[] args) {
    	isPrime(4);
//    	//int rows = 5;
//        printPrimePyramid(rows);
    }
}
