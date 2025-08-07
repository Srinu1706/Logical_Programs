public class Amstrong_Number {
    public static void main(String[] args) {
        int number=370;
        int temp=number;
        int sum=0;
        while (number!=0){
           int digit=number%10;
            sum+=Math.pow(digit,3);
           number=number/10;
        }
        System.out.println(temp==sum?"Yes its Amstrong":"no its not amstrong");
    }

}
