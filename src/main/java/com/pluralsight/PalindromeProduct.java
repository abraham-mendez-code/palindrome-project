package com.pluralsight;

public class PalindromeProduct {
    /*
        EXERCISE 2 (optional)
        In this exercise, you will write code to see if a number is a palindrome. A
        palindromic number reads the same both ways.
        The largest palindrome made from the product of two 2-digit numbers is 9009
        * 91 × 99 = 9009 (9009 is the same backwards as forwards so it is a
        palindrome).
        Create a new project in your workbook-2 directory named PalindromeProduct
        Your goal is to find the largest palindrome made from the product of two 3-digit
        numbers.
        You'll need nested loops that each go from 1 to 999. Multiply the two loop
        counters together. Then convert your potential palindrome number to a String
        using String.valueOf(), make a copy of the String, and reverse it. If the two
        strings are the same, it’s a palindrome!
        The real trick is keeping only the largest palindrome that you find!
        Whether you are successful or unsuccessful, using debugging techniques to view
        your code running step by step!
     */

    public static void main(String[] args) {

        for(int i = 0; i < 1000; i++) {

            for (int j = 0; j < 1000; j++) {
                // calculate product and store as string
                String original = String.valueOf(i * j);

                // s
                StringBuilder sb = new StringBuilder(original);
                String reversed = sb.reverse().toString();

            }

        }

    }
}
