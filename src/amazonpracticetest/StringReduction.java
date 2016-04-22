/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazonpracticetest;

import java.util.Scanner;

/**
 *
 * @author Prathamesh
 */
public class StringReduction {

    public String replacement(String input) {
        System.out.println("Orignal String: " + input);
        String toBeReplaced = "", replace = "";
        int i = 0, j = 1;
        char[] inputsplit = input.toCharArray();
        while (inputsplit[i] == inputsplit[j]) {
            i++;
            j++;
        }
        toBeReplaced = input.substring(i, j + 1);
        if (toBeReplaced.equals("ab") || toBeReplaced.equals("ba")) {
            replace = "c";
        } else if (toBeReplaced.equals("bc") || toBeReplaced.equals("cb")) {
            replace = "a";
        } else if (toBeReplaced.equals("ca") || toBeReplaced.equals("ac")) {
            replace = "b";
        }
        input = input.replaceFirst(toBeReplaced, replace);
        System.out.println("Replaced String: " + input);
        return input;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int noOfInputs = scanner.nextInt();
        String[] inputArray = new String[noOfInputs];
        String input = "";

        for (int l = 0; l < noOfInputs; l++) {
            inputArray[l] = scanner.next();
        }

        int flag = 0;
        for (int k = 0; k < inputArray.length; k++) {
            input = inputArray[k];
            StringReduction str = new StringReduction();
            int i = 0, j = 1;
            char[] inputsplit = input.toCharArray();
            while (j < input.length()) {
                if (inputsplit[i] != inputsplit[j]) {
                    input = str.replacement(input);
                    inputsplit = input.toCharArray();
                    j = 1;
                    i = 0;
                } else {
                    i++;
                    j++;
                }
            }
            System.out.println(input.length());
        }
    }
}
