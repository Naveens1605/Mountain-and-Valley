package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int level=0,valley=0;
        System.out.println("Number of Steps taken by Gary :");
        int n = sc.nextInt();
        System.out.println("Enter Ups and Downs");
        String st = sc.next();
         if(st.length()!=n) {
             st = st.substring(0, n);
             for (char c : st.toCharArray()) {
                 if (c == 'U')
                     ++level;
                 else if (c == 'D')
                     --level;
                 if (level == 0 && c == 'U')
                     ++valley;
             }
                 System.out.println(valley);
         }
         else {
             for (char c : st.toCharArray()) {
                 if (c == 'U')
                     ++level;
                 else if (c == 'D')
                     --level;
                 if (level == 0 && c == 'U')
                     ++valley;
             }
                 System.out.println(valley);
         }
    }
}
