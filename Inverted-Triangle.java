import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Inverted Triangle");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows:");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
