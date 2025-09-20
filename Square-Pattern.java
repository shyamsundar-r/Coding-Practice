import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Square Pattern");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if(i==1 || i==n || j==1 || j==n){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
}
