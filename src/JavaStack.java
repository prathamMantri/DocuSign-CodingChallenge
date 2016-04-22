/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prathamesh
 */
import java.util.*;

class JavaStack {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<Character>();
        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            char[] c_arr = input.toCharArray();
            int length = c_arr.length;
            if (length % 2 == 0) {
                for (int i = 0; i < length; i++) {
                    if (c_arr[i] == '}') {
                        if (!st.empty() && st.peek() == '{') {
                            st.pop();
                        } else {
                            st.push(c_arr[i]);
                        }
                    }

                    else if (c_arr[i] == ')') {
                        if (!st.empty() && st.peek() == '(') {
                            st.pop();
                        } else {
                            st.push(c_arr[i]);
                        }
                    }
                    else if (!st.empty() && c_arr[i] == ']') {
                        if (st.peek() == '[') {
                            st.pop();
                        } else {
                            st.push(c_arr[i]);
                        }
                    }
                    else{
                        st.push(c_arr[i]);
                    }

                }
                if (st.empty()) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            } else {
                System.out.println("false");
            }
            st.removeAllElements();
        }
    }
}
