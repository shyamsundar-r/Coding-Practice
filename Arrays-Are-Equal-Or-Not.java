class Main {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,10};
        int[] b = {1,3,5,7,9};
        boolean res = true;
        if(a.length != b.length){
            res = false;
        }
        else{
            for(int i=0;i<a.length;i++){
                if(a[i] != b[i]){
                    res = false;
                    break;
                }
            }
        }
        if(res){
            System.out.print("Arrays are Equal");
        }
        else{
            System.out.print("Arrays are not Equal");
        }
    }
}

/*
OUTPUT
Arrays are not Equal
*/
