class Main {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,10};
        int[] b = {1,3,5,7,9};
        int n = a.length;
        System.out.print("Addition:");
        for(int i=0;i<n;i++){
            System.out.print((a[i]+b[i])+" ");
        }
        System.out.println();
        System.out.print("Subtraction:");
        for(int i=0;i<n;i++){
            System.out.print((a[i]-b[i])+" ");
        }
        System.out.println();
        System.out.print("Multiplication:");
        for(int i=0;i<n;i++){
            System.out.print((a[i]*b[i])+" ");
        }
        System.out.println();
        System.out.print("Divison:");
        for(int i=0;i<n;i++){
            System.out.print((a[i]/b[i])+" ");
        }
        System.out.println();
    }
}

/*
OUTPUT
Addition:3 7 11 15 19 
Subtraction:1 1 1 1 1 
Multiplication:2 12 30 56 90 
Divison:2 1 1 1 1
*/
