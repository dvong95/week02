/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week02;
import java.util.*;
/**
 *
 * @author david
 */
public class ReverseWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "";
        System.out.println("Enter a word: ");
        word = input.nextLine();
        
        
        char[] letter = new char[word.length()];
        
        for (int i = 0; i < word.length(); i++) {
            letter[i] = word.charAt(word.length() - 1 - i);
        }
        
        System.out.println(letter);
    }
}
