/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazonpracticetest;

import java.util.Scanner;
import java.math.*;

/**
 *
 * @author Prathamesh
 */
public class ModifiedFibbonaci {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        BigInteger first = BigInteger.valueOf(scanner.nextInt());
        BigInteger second = BigInteger.valueOf(scanner.nextInt());
        int limit = scanner.nextInt();
        BigInteger result = BigInteger.ZERO;
        int counter = 3;
        for (int i = 0; i < limit - 2; i++) {
            result = second.multiply(second).add(first);
            //System.out.println("First is " + first + " Second is " + second + " Result is " + result + " Counter is " + counter);
            first = second;
            second = result;
            counter++;   
        }
        System.out.println(result);
    }
}
