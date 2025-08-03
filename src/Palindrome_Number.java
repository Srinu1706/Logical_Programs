public class Palindrome_Number {
    public static void main(String[] args) {
        int num=323;
        int temp=num;
        int reversed=0;
        int digit;
        while (num!=0){
            digit=num%10;
            reversed=reversed*10+digit;
            num=num/10;
        }
        System.out.println(temp==reversed?"Palindrome":"Not a palindrome");

    }
}
