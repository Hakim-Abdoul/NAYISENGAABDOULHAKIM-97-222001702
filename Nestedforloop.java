public class Nestedforloop {
    public static void main(String[] args) {
        for (char outer = 'A'; outer <= 'D'; outer++) {
            for (char inner = 'A'; inner <= 'D'; inner++) {
                // Print a combination of the 'outer' and 'inner' characters
                System.out.println(outer + "" + inner + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
