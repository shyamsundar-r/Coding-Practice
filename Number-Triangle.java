import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Number Triangle");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
