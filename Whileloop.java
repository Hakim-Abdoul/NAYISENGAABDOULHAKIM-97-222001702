public class Whileloop {
    public static void main(String[] args) {
        char letter = 'A'; // Initialize the character 'letter' with 'A'
        while (letter <= 'K') { // Continue the loop as long as 'letter' is less than or equal to 'K'
            System.out.println(letter + " "); // Print the current letter followed by a space
            letter++; // Increment the character to the next one in the ASCII sequence
        }
    }
}
