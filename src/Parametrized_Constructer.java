public class Parametrized_Constructer {
    public static void main(String[] args) {
        Parametrized_Constructer  parametrizedConstructer= new Parametrized_Constructer(1,"john");
        Parametrized_Constructer  parametrizedConstructer1= new Parametrized_Constructer(2,"Alice");
        Parametrized_Constructer  parametrizedConstructer2= new Parametrized_Constructer("Minning");
        Parametrized_Constructer  parametrizedConstructer3= new Parametrized_Constructer(3,"Alice","CSE");
    }
    int rollno;
    String name;
    String branch;
    Parametrized_Constructer(int x,String y){
        rollno=x;
         name=y;
        System.out.println("Name :"+name);
        System.out.println("Rollno "+rollno);
    }
    Parametrized_Constructer(String b){
        branch=b;
        System.out.println("Branch---> "+branch);
    }
    Parametrized_Constructer(int rollno,String name,String branch){
       this.branch =branch;
        this.rollno=rollno;
        this.name=name;
        System.out.println("Name :"+name+" Rollno "+rollno+" Branch "+branch);
        System.out.println();
    }

}
