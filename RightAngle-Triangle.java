class Main {
    public static void main(String[] args) {
        System.out.println("Upward Triangle");
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
