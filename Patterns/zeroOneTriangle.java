package Patterns;

public class zeroOneTriangle {
    public static void main(String args[]) {
        int n = 5;
        //int b = 5;
         
        // outer loop
        for(int i=1; i<=n; i++) { 
        // inner loop    
         for(int j=1; j<=i; j++) {
            int sum = j + i;

            if(sum % 2 == 0) {
                System.out.print("1"); 
            }
            else {
                System.out.print("0");
            }
            //System.out.print(j);
            //System.out.print("*");
         }
         System.out.println();
        }
    }
    
}
