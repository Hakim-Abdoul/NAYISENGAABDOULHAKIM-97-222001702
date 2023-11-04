public class Dowhileloop {
public static void main(String[] args) {
    char letter = 'A'; // Initialize the character 'letter' with 'A'
    do {
        System.out.println(letter + " "); // Print the current character followed by a space
        letter++; // Increment the character to the next one in the ASCII sequence
    } while (letter <= 'K'); // Continue the loop as long as 'letter' is less than or equal to 'K'
}}