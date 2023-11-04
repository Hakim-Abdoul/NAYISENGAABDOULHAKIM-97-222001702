public class BreakStatementwithLoop {
    public static void main(String[] args) {
        for (char letter = 'A'; letter <= 'E'; letter++) {
            System.out.println(letter + " ");  // Output the current letter followed by a space
            
            if (letter == 'D') {
                break;  // If the current letter is 'D', exit the loop immediately
            }
        }
    }
}
