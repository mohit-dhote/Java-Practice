import java.util.*;
public class SwitchStatement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        System.out.println("enter operator");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println( "Addition is" + (a + b));
            break;
            case '-' : System.out.println( "Subs is " + ( a - b));
            break;
            case '*' : System.out.println( "Subs is " +  (a * b));
            break;
            case '/' : System.out.println( a / b);
            break;
            case '%' : System.out.println( a % b);
            default : System.out.println( "wrong input please provide valid input" );

        }














         /* int number = 1; // can be used with other type too
        switch (number) {
        case 1 : System.out.println("samosa");
        break;
        case 2 : System.out.println("sambharvadi");  
        break;
        case 3 : System.out.println("Burger");
        break;

        default : System.out.println("we waked up");

        }  */

    }
    
}
