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
import java.util.Set;

/**
 *
 * @author Prathamesh
 */
public class HashSetExample {
    public static void main(String []argh)
   {
      HashMap<String,Integer> phonebook = new HashMap<String,Integer>();
       String name;
       Integer phoneno;
       ArrayList<String> directFriends = new ArrayList<String>();
       Set<String> setOfDirectFriends = new HashSet<String>();
       directFriends.add("PM");
       directFriends.add("SK");
       directFriends.add("DS");
       directFriends.add("RD");
       directFriends.add("PM");
       directFriends.add("DS");
       setOfDirectFriends.addAll(directFriends);
       
       for(String s : setOfDirectFriends)
       {
           System.out.println(s);
       }
       
       /*
       
       
       
       
      Scanner in = new Scanner(System.in);
       
      int n = in.nextInt();
       in.nextLine();
      for(int i=0;i<n;i++)
      {
         name=in.nextLine();
         phoneno=in.nextInt();
         phonebook.put(name,phoneno);
         in.nextLine();
      }
      while(in.hasNext())
      {
        
          String s=in.nextLine();
         if(phonebook.containsKey(s))
             {
             System.out.println(s+"="+phonebook.get(s));
         }
          else{
              System.out.println("Not found");
          }
      }*/
   }
}
