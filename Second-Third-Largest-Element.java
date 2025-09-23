public class SecondThirdLargest {
    public static void main(String[] args) {
        int arr[] = {10, 4, 8, 15, 20, 9};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {  
                // shift down
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != second && num != first) {
                third = num;
            }
        }

        System.out.println("Largest: " + first);
        System.out.println("Second Largest: " + second);
        System.out.println("Third Largest: " + third);
    }
}

// We keep track of first, second, third largest numbers while scanning the array once.
// When a bigger number comes:
// Shift previous values down (largest → second, second → third).
// Update new largest.
// This avoids sorting the whole array.

// Example Dry Run:
// Array = {10, 4, 8, 15, 20, 9}
// Start → first = 10, second = -∞, third = -∞
// See 15 → shift (first=15, second=10)
// See 20 → shift (first=20, second=15, third=10)
// Done → Answer: 20, 15, 10
