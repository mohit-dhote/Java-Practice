import java.util.*;
public class LogicalOperator {
    public static void main(String args[]) {
        System.out.println(5>3 && 6>5); // if both are true then only true, rest all false
        System.out.println(5>3 || 6<5); // if both are false then false, rest all true
        System.out.println( !(6>5) );   // true will be false and false will be true
    }
    
}
