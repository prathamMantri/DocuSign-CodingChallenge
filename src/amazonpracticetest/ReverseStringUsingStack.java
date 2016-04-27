/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazonpracticetest;

/**
 *
 * @author Prathamesh
 */
import java.util.*;

public class ReverseStringUsingStack {

    Stack st = new Stack();
    String reverse="";

    String reverseWholeString(String str) {
        char[] characterReverse = new char[str.length()];
        char[] character = str.toCharArray();
        
        int j = 0;

        for (int i = 0; i < character.length; i++) {
            st.push(character[i]);
        }
        while (!st.empty()) {
            characterReverse[j] = (char) st.pop();
            reverse=reverse+characterReverse[j];
            j++;
        }
        
        return reverse;
    }

    String reverseStringAfterSpace(String str) {
        String[] splitted = str.split(" ");
        char[] characterReverse;
        
        for (int i = 0; i < splitted.length; i++) {
            reverse = reverse+reverseWholeString(splitted[i]);
        }
        return reverse;
    }
    
      String reverseOrderOfString(String str) {
        String[] splitted = str.split(" ");
        String[] stringReverse = new String[splitted.length];
        int j = 0;
        for (int i = 0; i < splitted.length; i++) {
            st.push(splitted[i]);
        }
        while (!st.empty()) {
            stringReverse[j] = (String) st.pop();
            reverse=stringReverse[j]+reverse;
            j++;
        }
        return reverse;
    }

    public static void main(String args[]) {

        String str = "I am going to be selected in Amazon";
        ReverseStringUsingStack rsus = new ReverseStringUsingStack();
        try {
            System.out.println(str);
            System.out.println("Complete String Reverse: "+rsus.reverseWholeString(str));
           // System.out.println("Splitted String Reverse: "+rsus.reverseStringAfterSpace(str));
            System.out.println("Reverse order of String: "+rsus.reverseOrderOfString(str));

        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }
}
