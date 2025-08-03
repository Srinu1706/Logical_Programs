public class Count_2s {
    public static void main(String[] args) {
        int n=30;
        int total_count=0;
        for (int i=0;i<=n;i++){
         total_count=total_count+TwosCount(i);
        }
        System.out.println(total_count);
    }
    public  static int TwosCount(int n){
        int count=0;
        for(int i=0;i<=n;i++){
            int digit=n%10;
            if(digit==2){
                count++;
            }
            n=n/10;
        }
        return count;
    }
}
