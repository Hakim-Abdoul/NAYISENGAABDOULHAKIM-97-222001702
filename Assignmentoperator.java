public class Assignmentoperator {
    public static void main(String args[]) {  
        int a = 10;  // Declare and initialize variable 'a' with the value 10
        int b = 20;  // Declare and initialize variable 'b' with the value 20
        
        // Using the += (addition assignment) operator
        a += 4;  // Equivalent to a = a + 4
        // Now 'a' is updated to 14 because it adds 4 to its current value.

        // Using the -= (subtraction assignment) operator
        b -= 4;  // Equivalent to b = b - 4
        // Now 'b' is updated to 16 because it subtracts 4 from its current value.

        System.out.println(a);  // Output the updated value of 'a' (14)
        System.out.println(b);  // Output the updated value of 'b' (16)
    }
}