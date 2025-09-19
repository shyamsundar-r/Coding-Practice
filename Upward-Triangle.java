import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Upward Triangle");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of rows:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
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
