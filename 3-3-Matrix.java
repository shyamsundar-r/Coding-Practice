import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("MATRIX");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows:");
        int r = sc.nextInt();
        System.out.print("Enter the no of columns:");
        int c = sc.nextInt();
        int[][] m = new int[r][c];
        System.out.println("Enter the Values:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}
