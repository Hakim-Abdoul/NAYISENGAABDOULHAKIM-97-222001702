public class Leftshiftoperator {
    public static void main(String[] args) {
        // Left shift operator (<<) shifts the bits of the number to the left.
        
        System.out.println(10 << 2); // 10 * 2^2 = 10 * 4 = 40
        // The binary representation of 10 is 1010. When you shift it two positions to the left, you get 101000, which is 40 in decimal.

        System.out.println(10 << 3); // 10 * 2^3 = 10 * 8 = 80
        // Shifting 10 three positions to the left results in 1010000, which is 80 in decimal.

        System.out.println(20 << 2); // 20 * 2^2 = 20 * 4 = 80
        // Shifting 20 two positions to the left results in 101000, which is 80 in decimal.

        System.out.println(15 << 4); // 15 * 2^4 = 15 * 16 = 240
        // Shifting 15 four positions to the left results in 240 in decimal.
    }
}
