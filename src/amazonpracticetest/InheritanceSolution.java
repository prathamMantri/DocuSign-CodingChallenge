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
public class InheritanceSolution {

    public static void main(String[] argh) {
        Adder X = new Adder();
        System.out.println("My superclass is: " + X.getClass().getSuperclass().getName());
        System.out.print(X.add(10, 32) + " " + X.add(10, 3) + " " + X.add(10, 10) + "\n");
    }
}

class Adder extends InheritanceSolution {
    int sum = 0;
    int add(int a, int b) {
        sum = a + b;
        return sum;
    }

}
