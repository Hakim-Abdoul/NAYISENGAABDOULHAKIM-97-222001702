public class Rightshiftoperator {
    public static void main(String[] args) {
        // Right shift operator (>>) shifts the bits of the number to the right.
        
        System.out.println(10 >> 2); // 10 / 2^2 = 10 / 4 = 2
        // The binary representation of 10 is 1010. When you shift it two positions to the right, you get 10, which is 2 in decimal.

        System.out.println(20 >> 2); // 20 / 2^2 = 20 / 4 = 5
        // Shifting 20 two positions to the right results in 101, which is 5 in decimal.

        System.out.println(20 >> 3); // 20 / 2^3 = 20 / 8 = 2
        // Shifting 20 three positions to the right results in 10, which is 2 in decimal.
    }
}