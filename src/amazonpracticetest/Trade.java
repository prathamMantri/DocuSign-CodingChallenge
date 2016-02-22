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
public class Trade {

    public static void main(String args[]) {
        int[] array = {200, 90, 450, 500, 300, 550, 400};
       int[] output={0,0};
        

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            
            int sub=0;
            for (int j = 0; j < array.length; j++) {
               if(array[i]!=array[j] && array[i]<array[j])
               {
                   int tempsub=array[j]-array[i];
                   if(sub < tempsub )
                           {
                                 sub = array[j]-array[i];
                                 output[0]=  array[i];
                                 output[1]= array[j];
                           }
               }

            }
        }
         for (int i = 0; i < output.length; i++) {
        System.out.print(output[i]+" , ");
         }
    }

}
