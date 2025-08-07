public class Emplyoee_Constructer {
    int id;
    String name;
    String department;
    double salary;
    public static void main(String[] args) {
        Emplyoee_Constructer emplyoeeConstructer=new Emplyoee_Constructer(101,"John");
        Emplyoee_Constructer emplyoeeConstructer2=new Emplyoee_Constructer(102,"Alice","Hr");
        Emplyoee_Constructer emplyoeeConstructer3= new Emplyoee_Constructer(103,"Bob","It",75000.0);
        emplyoeeConstructer.displayEmployee("Employee 1");
        emplyoeeConstructer2.displayEmployee("Employee 2");
        emplyoeeConstructer3.displayEmployee("Employee 3");

    }
    Emplyoee_Constructer(int id,String name){
        this.id=id;
        this.name=name;
        this.department="Not Assigned";
        this.salary=0.00;
        System.out.println("Emplyoee 1");

    }

    Emplyoee_Constructer(int id,String name,String department){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=0.0;
        System.out.println("Emplyoee 2");

    }
    Emplyoee_Constructer(int id,String name,String department,double salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
        System.out.println("Emplyoee 3");
    }
    void displayEmployee(String label) {
        System.out.println(label + ":");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}
