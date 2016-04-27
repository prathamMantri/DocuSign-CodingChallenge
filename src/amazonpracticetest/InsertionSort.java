/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazonpracticetest;

import java.util.Arrays;

/**
 *
 * @author Prathamesh
 */
public class InsertionSort {

    public static void main(String[] args) {
        //This is unsorted array
        int[] array = new int[]{12, 13, 24, 10, 3, 6, 90, 70};

        //Let's sort using insertion sort
        insertionSort(array, 0, array.length);

        //Verify sorted array
        System.out.println(Arrays.toString(array));
    }
//int[] array = new int[]{12, 13, 24, 10, 3, 6, 90, 70};

    public static void insertionSort(int[] a, int fromIndex, int toIndex) {

        for (int i = fromIndex; i < toIndex; i++) {
            int d = a[i];
            int j = i;
            while (j > fromIndex && ((Comparable) a[j - 1]).compareTo(d) > 0) 
            {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = d;
        }

    }

}
