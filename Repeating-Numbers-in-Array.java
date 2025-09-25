class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 4, 9, 2, 5};

        System.out.print("Repeating Numbers: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}

/*
Output:
Repeating Numbers: 4 2
*/
