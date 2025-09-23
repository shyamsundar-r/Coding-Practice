import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Subarray");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int s=0;s<n;s++){
            for(int e=s;e<n;e++){
                for(int k=s;k<=e;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
