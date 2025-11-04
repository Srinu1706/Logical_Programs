public class Remove_Duplicates
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,3,2,1,4,};
        int unique[]=new int [arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            boolean duplicate=false;
            for (int j=0;j<index;j++){
                if (arr[i]==arr[j]){
                     duplicate=true;
                }
            }
            if (!duplicate){
                unique[index++] =arr[i];
            }
        }
        for (int i=0;i<index;i++){
            System.out.println(unique[i]);
        }
    }
}
