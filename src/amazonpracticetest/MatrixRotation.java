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
public class MatrixRotation {

    /**
     * @param args the command line arguments
     */
    int temp = 0;

    void shift_left(int i, int j, int arr[][], int col) {
        
        for (int k = 0; k < col - 1; k++) {
            arr[i][j] = arr[i][j - 1];
            j--;
        }
       
    }

    void shift_up(int i, int j, int arr[][], int row) {
      //  arr[1][0]=temp;
        for (int k = 0; k < row - 1; k++) {
            arr[i][j] = arr[i -1][j];
            i--;
        }
         
    }

    void shift_right(int i, int j, int arr[][], int col) {
        temp = arr[i][j];
        for (int k = col-1; k > 0; k--) {
            arr[i][j] = arr[i][j+1];
            j++;   
        }
        
    }

    void shift_down(int i, int j, int arr[][], int row) {
        for (int k = row-1 ; k > 0; k--) {
            arr[i][j] = arr[i-1][j];
            i--;
        }
        arr[row-1][1] = temp;
        
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter Coloum: ");
        int col= scanner.nextInt();
        System.out.println("Enter Elements");
        
        int[][] arr = new int[row][col];
        
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("Array Before Rotation");
        for(int i=0; i<row; i++)
        {
            System.out.println();
            for(int j=0; j<col; j++)
            {
                System.out.print(arr[i][j]);
            }
        }
        
        MatrixRotation mr= new MatrixRotation();
        
        
       mr.shift_right(row-1, 0, arr, col);
        mr.shift_down(col-1, row-1, arr, row);
        mr.shift_left(row-1, col-1, arr, col);
        mr.shift_up(row-1, 0, arr, row);
        
       
      
        
        System.out.println();
        System.out.println("Array After Rotation");
        for(int i=0; i<row; i++)
        {
            System.out.println();
            for(int j=0; j<col; j++)
            {
                System.out.print(arr[i][j]);
            }
        }
        
        
    }

}
