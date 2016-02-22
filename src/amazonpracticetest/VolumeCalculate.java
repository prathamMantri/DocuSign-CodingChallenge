/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazonpracticetest;

import java.io.*;
import java.util.*;
import java.security.Permission;

/**
 *
 * @author Prathamesh
 */
class Formulas {

    int main(int a) {
        return a * a * a;
    }

    int main(int l, int b, int h) {
        return l * b * h;
    }

    double main(double r) {
        return Math.PI * 2 * r * r * r / 3;
    }

    double main(double r, double h) {
        return Math.PI * r * r * h;
    }
}

class Output {

    void display(double x) {
        System.out.printf("%.3f\n", x);
    }
}

class Calculate {

    Scanner scanner = new Scanner(System.in);
    Output output;

    Calculate() throws IOException {
        scanner = new Scanner(System.in);
        output = new Output();
        if (scanner == null) {
            throw new IOException("dummy");
        }
    }
    int getINTVal() {

        int testcases=scanner.nextInt();
        if(testcases<=0)throw new NumberFormatException("All the values must be positive");
        return testcases;
    }
    double getDoubleVal() {
        double testcases=scanner.nextDouble();
        if(testcases<=0)throw new NumberFormatException("All the values must be positive");
        return testcases;
    }
    static public Formulas get_Vol() {

        return new Formulas();
    }
}

public class VolumeCalculate {

    public static void main(String[] args) {
        Do_Not_Terminate.forbidExit();
        try {
            Calculate cal = new Calculate();
            int T = cal.getINTVal();
            while (T-- > 0) {
                double volume = 0.0d;
                int ch = cal.getINTVal();
                if (ch == 1) {
                    int a = cal.getINTVal();
                    volume = Calculate.get_Vol().main(a);

                } else if (ch == 2) {
                    int l = cal.getINTVal();
                    int b = cal.getINTVal();
                    int h = cal.getINTVal();
                    volume = Calculate.get_Vol().main(l, b, h);

                } else if (ch == 3) {
                    double r = cal.getDoubleVal();
                    volume = Calculate.get_Vol().main(r);

                } else if (ch == 4) {

                    double r = cal.getDoubleVal();
                    double h = cal.getDoubleVal();
                    volume = Calculate.get_Vol().main(r, h);
                }
                cal.output.display(volume);
            }
        } catch (NumberFormatException e) {
            System.out.print(e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }

    }
}

/**
 * This class prevents the user from using System.exit(0) from terminating the
 * program abnormally.
 */
class Do_Not_Terminate {

    public static class ExitTrappedException extends SecurityException {
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}//end of Do_Not_Terminate	

