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
public class ArrayShifting {

    public static void main(String args[]) {
        String[] arr = new String[3];

        arr[0] = "02";
        arr[2] = "22";
        arr[1] = "12";
        for (int i=0; i< arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        
       // arr = ArrayUtils.removeElement(arr, 2);

    }
}
