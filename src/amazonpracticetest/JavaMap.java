/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazonpracticetest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Prathamesh
 */
public class JavaMap {

    public static void main(String[] argh) {
        HashMap<String, Integer> phonebook = new HashMap<String, Integer>();
        String name;
        Integer phoneno;
     
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            name = in.nextLine();
            phoneno = in.nextInt();
            phonebook.put(name, phoneno);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (phonebook.containsKey(s)) {
                System.out.println(s + "=" + phonebook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}