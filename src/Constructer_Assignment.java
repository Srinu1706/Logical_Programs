public class Constructer_Assignment {
    int id;
    String name;
    String branch;
    double percentage;
    public static void main(String[] args) {
        Constructer_Assignment constructerAssignment= new Constructer_Assignment(01,"john");
        Constructer_Assignment constructerAssignment1= new Constructer_Assignment(02,"Alice","CSE");
        Constructer_Assignment constructerAssignment2= new Constructer_Assignment(03,"BOB","ECE",  82.5);
    }

    Constructer_Assignment(int id,String name){
            this.id=id;
            this.name=name;
            this.branch="Not assigned";
            this.percentage=0.00;
        System.out.println("Student 1");
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Branch : "+branch);
        System.out.println("Percentage : "+percentage);
    }
    Constructer_Assignment(int id,String name,String branch){
        this.id=id;
        this.name=name;
        this.branch=branch;
        this.percentage=0.00;
        System.out.println("Student 2");
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Branch : "+branch);
        System.out.println("Percentage : "+percentage);
    }
    Constructer_Assignment(int id,String name,String branch,double percentage){
        this.id=id;
        this.name=name;
        this.branch=branch;
        this.percentage=percentage;
        System.out.println("Student 3");
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Branch : "+branch);
        System.out.println("Percentage : "+percentage);
    }
}
