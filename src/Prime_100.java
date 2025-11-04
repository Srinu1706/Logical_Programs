public class Prime_100 {
    public static void main(String[] args) {
        int num=2;
        int count = 0;
        
        while (num<100){
            boolean isprime=true;
            for (int i=2;i<=num/2;i++){
                if (num%i==0){
                    count++;
                    isprime=false;
                     break;
                }
            }
            if (isprime){
                System.out.print(num+" ");
            }
            num++;
        }
        System.out.println();
        System.out.println(count +" prime numbers are here ");

    }
}
