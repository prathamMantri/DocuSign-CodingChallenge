/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Solution {

    /**
     * @param args the command line arguments
     */
    int temp = 0;
    
     void shift_right(int i, int j, int arr[][], int col) {
        temp= arr[i][col-1];
        for (int k = col-1; k > 0; k--) {
            arr[i][j] = arr[i][j-1];
            j--;
        }
    }
     
      void shift_down(int i, int j, int arr[][], int row) {
        for (int k = row-1 ; k > 0; k--) {
            arr[i][j] = arr[i-1][j];
            i--;
        }
      }
     
     
  /*   void shift_up(int i, int j, int arr[][], int row) {
        // arr[i][j] = arr[i+1][j];
        //i++;
        for (int k = 0; k < row - 1; k++) {
            arr[i][j] = arr[i+1][j];
            i++;
        }
    }*/

   /* void shift_left(int i, int j, int arr[][], int col) {
        for (int k = 0; k < col - 1; k++) {
            arr[i][j] = arr[i][j - 1];
            j++;
        }
    }
    void shift_down(int i, int j, int arr[][], int row) {
        for (int k = row-1 ; k > 0; k--) {
            arr[i][j] = arr[i-1][j];
            i--;
        }
         arr[1][] = temp;
    }
    
*/
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
        System.out.println("Array before Rotation");
        for(int i=0; i<row; i++)
        {
            System.out.println();
            for(int j=0; j<col; j++)
            {
                System.out.print(arr[i][j]);
            }
        }
        
        Solution s= new Solution();
        
        
        //s.shift_left(0, 0, arr, col);
        
        s.shift_right(0, col-1, arr, col);
        
        System.out.println("Array after right Rotation");
        for(int i=0; i<row; i++)
        {
            System.out.println();
            for(int j=0; j<col; j++)
            {
                System.out.print(arr[i][j]);
            }
        }
        
        s.shift_down(row-1, col-1, arr, col);
        
        System.out.println("Array after down Rotation");
        for(int i=0; i<row; i++)
        {
            System.out.println();
            for(int j=0; j<col; j++)
            {
                System.out.print(arr[i][j]);
            }
        }
        
        
      //  s.shift_up(row-1, col-1, arr, row);
        
        /*System.out.println("Array after up Rotation");
        for(int i=0; i<row; i++)
        {
            System.out.println();
            for(int j=0; j<col; j++)
            {
                System.out.print(arr[i][j]);
            }
        }
        */
        
       // s.shift_down(row-1, 0, arr, row);
      
        
        /*System.out.println();
        System.out.println("Array After Rotation");
        for(int i=0; i<row; i++)
        {
            System.out.println();
            for(int j=0; j<col; j++)
            {
                System.out.print(arr[i][j]);
            }
        }*/
        
        
    }

}

