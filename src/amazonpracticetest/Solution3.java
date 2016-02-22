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

public class Solution3 {

    String flag = null;
    /*private void addM(int a[], int n, int m) throws ArrayIndexOutOfBoundsException{
     try {
     i = i + m;
     if (i == 0) {
     System.out.println("NO");
     } else if (i < n) {
     if (a[i] == 1 ){
     if (i == (n - 1)) {
     System.out.println("YES");
     } else {
     i = i - m + 1;
     if (a[i] == 0 || a[i-2] == 0) {
     addM(a, n, m);
     } else{
     System.out.println("NO");
     }
     }
     } else if (a[i] == 0) {
     addM(a, n, m);
     }
     } else if (i >= n) {
     System.out.println("YES");
     }
     } catch (ArrayIndexOutOfBoundsException e) {
     e.printStackTrace();
     }
     }*/

    /*private int walkForward(int i, int[] a) {
     i = i + 1;
     return i;
     }

     private int walkBackward(int i, int[] a) {
     i = i - 1;
     return i;
     }

     private int makeJump(int current, int jump, int[] a) {
     current = current + jump;
     return current;
     }
     int index = 0;
     boolean shouldIJump;

     private void activity(int jump, int[] a) {
     index = makeJump(index, jump, a);
     if (index > a.length) {
     System.out.println("Yes");
     } else if (a[index] == 0) {
     index = makeJump(index, jump, a);
     } else if (a[index] != 0) {
     index = index - jump;
     if (index == 0) {
     index = walkForward(index, a);
     if (a[index] == 0) {
     activity(jump, a);
     } else {
     System.out.println("NO");
     }
     } else {

     if (a[index] == 0) {
     activity(jump, a);
     } else {
     index = index - 1;
     index = walkBackward(index, a);
     if (a[index] == 0) {
     activity(jump, a);
     }
     else{
     System.out.println("NO");
     }
     }
     }

     }

     }*/
    int i = 0;

    private String addM(int m, int[] a) throws ArrayIndexOutOfBoundsException {

        i = i + m;
        int n = a.length;
        if (i == 0) {
            return "NO";
        } else if (i < n) {
            if (a[i] == 1) {
                i = i - m + 1;
                if (a[i] == 0) {
                    return addM(m, a);
                } else {
                    return "NO";
                }
            } else {
                return addM(m, a);
            }
        } else {
            return "YES";
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int i = 0; i < testcases; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int a[] = new int[n];
            for (int j = 0; j < a.length; j++) {
                a[j] = scanner.nextInt();
            }
            Solution3 sol3 = new Solution3();
            System.out.println(sol3.addM(m, a));
        }
    }
}
