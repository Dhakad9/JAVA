public class Student
{
    private String uid;
    private String name;
    private String dept;
    private double fee;
    
    public Student()
    {
        uid="18BCS1950";
        name="Anshu Singh";
        dept="CSE";
        fee=50000;
    }
    public Student(String uid,String name,String dept,double fee)
    {
        this.uid=uid;
        this.name=name;
        this.dept=dept;
        this.fee=fee;
    }
    public void display()
    {
        System.out.println(name);
        System.out.println(uid);
        System.out.println(dept);
        System.out.println(fee);
    }
    public static void main(String[] args)
    {
        System.out.println("Default Constructor");
        Student ob=new Student();
        ob.display();
        System.out.println("Parameterized Constructor");
        Student obj=new Student("18BCS3465","Shreyans","CSE",75000);
        obj.display();
    }
}