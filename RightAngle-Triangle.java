import java.util.Scanner;
import java.io.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Right Angle Triangle Triangle");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
