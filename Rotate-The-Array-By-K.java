class Main {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,10};
        int n = a.length;
        int k = 2;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[(i+k)%n]=a[i];
        }
        System.out.print("Rotated Array:");
        for(int x:res){
            System.out.print(x+" ");
        }
    }
}

/*
Rotated Array:8 10 2 4 6 
*/
