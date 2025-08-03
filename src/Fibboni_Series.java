public class Fibboni_Series {
    public static void main(String[] args) {
        int number=10,fisrtterm=0,Secondterm=1;
        int neexterm;                            // 0 1 1
        for (int i=1;i<=number;i++){
            System.out.print(fisrtterm+",");
            neexterm=fisrtterm+Secondterm;
            fisrtterm=Secondterm;
            Secondterm=neexterm;
        }
    }
}
