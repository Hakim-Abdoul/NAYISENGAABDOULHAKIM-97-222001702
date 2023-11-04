public class Ternaryoperator {
    public static void main(String args[]) {  
        int a = 2;  // Initialize variable 'a' with the value 2
        int b = 5;  // Initialize variable 'b' with the value 5

        // Use the ternary operator to find the minimum of 'a' and 'b'
        int min = (a < b) ? a : b;
        // If 'a' is less than 'b', 'min' is assigned the value of 'a'; otherwise, 'min' is assigned the value of 'b'.

        System.out.println(min);  // Print the minimum value, which is 2 in this case
    }
}  
