import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Sum Of Array");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        System.out.println("Sum of Array:"+sum);
    }
}
