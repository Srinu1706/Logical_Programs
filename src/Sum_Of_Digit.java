public class Sum_Of_Digit {
    public static void main(String[] args) {
        int number=12345;//12
        int sum=0;//0
        while (number!=0){
            int digit =number%10;//3
            sum=sum+digit;//3+2+1
            number=number/10;
        }
        System.out.println(sum);
    }
}
//10)12(1
//   10
//3
//
//
