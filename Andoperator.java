public class Andoperator {
    public static void main(String args[]) {  
        int a = 10;  // Declare and initialize variable 'a' with the value 10
        int b = 5;   // Declare and initialize variable 'b' with the value 5
        int c = 20;  // Declare and initialize variable 'c' with the value 20
        
        // Using the && (logical AND) operator
        System.out.println(a < b && a < c); // false && true = false
        // The result is 'false' because a is not less than b, but it is less than c.
        
        // Using the & (bitwise AND) operator
        System.out.println(a < b & a < c); // false & true = false
        // The result is also 'false' because both conditions are checked independently,
        // and since a is not less than b, the result is 'false'.
    }
}
