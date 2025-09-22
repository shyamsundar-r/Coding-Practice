public class WordPattern {
    public static void main(String[] args) {
        String word = "PROGRAM";
        int n = word.length();

        for (int i = 0; i < n; i++) {       // Loop rows
            for (int j = 0; j < n; j++) {   // Loop columns
                if (j == i || j == n - i - 1) { 
                    // Print letter if it's on diagonal
                    System.out.print(word.charAt(i));
                } else {
                    // Otherwise, print space
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to next line
        }
    }
}
