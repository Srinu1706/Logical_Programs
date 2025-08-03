public class Reverse_a_number {
    public static void main(String[] args) {
        int number=123;
        int reverse=0;
        while (number!=0){
            int digit=number%10;
            reverse=reverse*10+digit;
            number= number/10;
        }
        System.out.println("Reversed Number :"+reverse);
    }
}
