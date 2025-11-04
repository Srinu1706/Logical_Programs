public class Binary {

    public static String binary(int num){
        String binary="";
        int N= num;
        while (N!=0){
            int reaminder=N%2;
            binary=reaminder+binary;
            N=N/2;
        }
        return binary;

    }
    public static void main(String[] args) {
        int num=36;
        String result = binary(num);

        System.out.println("Decimal: " + num);
        System.out.println("Binary: " + result);
    }
}
