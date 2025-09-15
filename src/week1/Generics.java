package week1;

import java.util.*;
import java.util.function.Predicate;

public class Generics {

    // Generic method to count elements satisfying a condition
    public static <T> long countMatches(Collection<T> collection, Predicate<T> condition) {
        return collection.stream()
                .filter(condition)
                .count();
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 7, 11, 22, 33);
        List<String> words = Arrays.asList("anna","abba","baba","dog","mom","dad");

        // Count odd numbers
        long oddCount = countMatches(numbers, n -> n % 2 != 0);
        System.out.println("Odd numbers: " + oddCount);

        // Count primes
        long primeCount = countMatches(numbers, Generics::isPrime);
        System.out.println("Prime numbers: " + primeCount);

        // Count Palindrome
        long palindromeCount = countMatches(words, Generics::isPalindrome);
        System.out.println("Palindromes: " + palindromeCount);
    }


    public static boolean isPrime(int number){
        if (number < 2){
            return false;
        }
        int i = 2;
        while (i <= number / 2){
            if (number % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }



    private static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
