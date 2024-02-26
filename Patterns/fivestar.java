package Patterns;

import java.util.*;

public class fivestar {
    public static void main(String args[]) {
        int n = 5;
        //int b = 5;
         
        // outer loop
        for(int i=1; i<=n; i++) { 
        // inner loop    
         for(int j=1; j<=n-i+1; j++) {
            System.out.print(j+"");
            //System.out.print("*");
         }
         System.out.println();
        }
    }
}
