import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Enter a number");
        Scanner scanner= new Scanner(System.in);
        int number=scanner.nextInt();
        for(int i=1;i<=number;i++){
            if(number%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("is prime");
        }
        else {
            System.out.println("not a prime");
        }
    }
}
