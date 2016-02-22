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
import java.util.Scanner;

public class Solution2 {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
    

        int[][] arr = new int[row][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int k =  scanner.nextInt();
        int c=0;   
        for(int i=0; i<k;i++)
        {
            for(int j=0; j<k; j++)
            {
                if(arr[i][j]==k && (i!=k && j!=k))
                {
                    c=1;
                }
            }
        }
        if(c==1)
        {
            System.out.print("YES");
        }
        else
        {
             System.out.print("NO");
        }
       
    }
}
