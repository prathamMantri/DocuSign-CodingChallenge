/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazonpracticetest;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author Prathamesh
 */
public class SubArraySolution {
    private int add(int i, int j, int array[])
    {
        int sum=0;
        for(int k=i; k<=j; k++)
        {
            sum= sum+array[k];
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        SubArraySolution sol = new SubArraySolution();
        int sum = 0, counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                sum = sol.add(i,j, array);
                if (sum < 0) {
                    counter++;
                    System.out.println(i + " :" + j);
                }
            }
        }
        System.out.println(counter);
    }
}
