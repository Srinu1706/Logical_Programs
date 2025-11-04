public class unique {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,1,2,4,};
        for (int i=0;i<arr.length;i++){
            boolean uniqe=true;
            for (int j=0;j<arr.length;j++){
                if (i!=j&&arr[i]==arr[j]){
                     uniqe=false;
                     break;
                }

            }
            if (uniqe){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
