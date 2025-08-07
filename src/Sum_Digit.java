public class Sum_Digit {
    public static void main(String[] args) {
        int Number=12345;
        int sum=0;
        int digit;
        while (Number!=0){
            digit=Number%10;
            sum=sum+digit;
            Number=Number/10;
        }

        System.out.println(sum);
       int temp=sum;
       int fsum=0;
       int fdigit;
       while (temp!=0){
           fdigit=temp%10;
           fsum=fdigit+fsum;
           temp=temp/10;
       }
        System.out.println(fsum);

    }
}