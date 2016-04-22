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

public class FuunyStrings {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int noOfStrings = scanner.nextInt();
        String input ;
        int difference, difference2;
        char[] inputCharArray = null;
        for (int i = 0; i < noOfStrings; i++) {
            int flag = 0;
            input = scanner.next();
            inputCharArray = input.toCharArray();
            for (int j = 1, k = inputCharArray.length; j < inputCharArray.length; j++, k--) {
                difference = (int) inputCharArray[j] - (int) inputCharArray[j - 1];
                difference2 = (int) inputCharArray[k - 1] - (int) inputCharArray[k - 2];
                if (Math.abs((difference)) != Math.abs(difference2)) {
                    flag = 1;
                }
            }
            if (flag == 1) {
                System.out.println("Not Funny");
            } else {
                System.out.println("Funny");
            }
        }
    }
}
