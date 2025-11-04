public class leap_Year {
    public static void main(String[] args) {
        int year=2024;
        if (year%400==0){
            System.out.println("Leap year");
        } else if (year%4==0) {
            System.out.println("Leap year");
        } else if (year%10!=0) {
            System.out.println("not leap year");
        }
        else {
            System.out.println("enter perfect year");
        }
    }
}
