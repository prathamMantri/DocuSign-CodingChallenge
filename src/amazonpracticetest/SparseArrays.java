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
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SparseArrays {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        int noOfStrings = scanner.nextInt();
        int counter = 1;
        //  String[] strings = new String[noOfStrings];
        Map<String, Integer> strings = new HashMap<String, Integer>();
        for (int i = 0; i < noOfStrings; i++) {
            String item = scanner.next();
            if (strings.containsKey(item)) {
                Integer count = (Integer) strings.get(item);
                strings.put(item,  count.intValue() + 1);
            } else {
                strings.put(item, counter);
            }
        }
        
        int noOfStringsToBeChecked = scanner.nextInt();
        for (int i = 0; i < noOfStringsToBeChecked; i++) {
            Integer count= strings.get(scanner.next());
            if (count==null)
            {
                count=0;
            }
            System.out.println(count);
        }
    }
    /*  for (int i = 0; i < strings.length; i++) {
     strings[i] = scanner.next(); 
     }
        
     int noOfStringsToBeChecked = scanner.nextInt();
     for (int i = 0; i < noOfStringsToBeChecked; i++) {
     String stringCheck = scanner.next();
     int counter = 0;
     for (String string : strings) {
     if (stringCheck.equals(string)) {
     counter++;
     }
     }
     System.out.println(counter);
     counter = 0;
     }
     }*/
}
