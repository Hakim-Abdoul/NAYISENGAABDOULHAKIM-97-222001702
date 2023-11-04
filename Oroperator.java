public class Oroperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;

        // Using the logical OR operator (||)
        System.out.println(a > b || a < c); // true || true = true
        // The result is 'true' because at least one of the conditions is true.

        // Using the bitwise OR operator (|)
        System.out.println(a > b | a < c); // true | true = true
        // The result is also 'true' because both conditions are checked independently.

        // Comparison between || and |
        System.out.println(a > b || a++ < c); // true || true = true
        // The result is 'true' because the first condition is true, and the second condition is not checked due to the short-circuiting behavior of ||.

        System.out.println(a); // a is still 10 because the second condition was not checked.

        System.out.println(a > b | a++ < c); // true | true = true
        // The result is 'true' because both conditions are checked, but the value of 'a' is incremented after the evaluation.

        System.out.println(a); // a is now 11 because the second condition was checked and 'a' was incremented.
    }
}
