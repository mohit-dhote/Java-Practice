import java.util.Scanner;

// exited when entered the 10
public class forloop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 

    do {
        System.out.println("Enter your number : ");
            int n = sc.nextInt();

            if (n % 10 == 0) { 
            break;
    }
    System.out.println(n);
     }while(true);

     
}
}

      // skip returning the multiple of 10. rest continue        

       /* do {
            System.out.println("Enter your number : ");
            int n = sc.nextInt();

            if( n % 10 == 0 ) { 
              continue;
        }

        System.out.println("the number was : " + n );
    } while(true);  */


        

    // skip 3 and return rest

         /* for(int i=1; i<=5; i++) {
          //if (i ==3){
            if ( n % 10 == 0) { 
            continue;
          }
          System.out.println(i);
        } */



        // return sum of all n numbers.

        /* 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while( i<= n) { 
        sum += i;
        i++;
        }
        
        {
            System.out.println(sum);
        }
    }
} */



/* for (i=1; i<=n; i++) */


