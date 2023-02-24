package org.easyquestions;
/**
 * 3. Write a Java program to check if a vowel is present in a string.
 * */

public class StringContainsVowels {
	//stringContainsVowels
	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}
	public static void main(String[] args) {
		System.out.println("stringContainsVowels:\t"+stringContainsVowels("Hello")); //true 
		System.out.println("stringContainsVowels:\t"+stringContainsVowels("TV")); //false 
	}
}
