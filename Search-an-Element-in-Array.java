class Main {
    public static void main(String[] args) {
        System.out.println("Search an Element in Array:");
        int[] a = {10, 20, 30, 40, 50};
        int key = 30;
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                System.out.println("Element " + key + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element " + key + " not found");
        }
    }
}

/*
Output:
Element 30 found at index 2
*/
