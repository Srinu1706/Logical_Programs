public class Count_Numbers {
    public static void main(String[] args) {
        long number =738669213;
        int count=0;
        while (number!=0){
            count++;
            number=number/10;
        }
        System.out.println(count);
    }
}
