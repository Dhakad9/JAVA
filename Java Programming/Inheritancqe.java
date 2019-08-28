import java.util.*;
class Inheritancqe

{

public static void main(String[] args)

{

Scanner sc = new Scanner(System.in);

System.out.println("Enter the name of car");

String name = sc.nextLine();

Car obj = new Car();

System.out.println("The name of car:" +name);

System.out.println("Mileage is:" +obj.mileage);

System.out.println("Fuel Type:" +obj.f_type);

System.out.println("Fuel Capacity:" +obj.f_capacity);

System.out.println("Boot Space:" +obj.b_space);

System.out.println("Seating Capacity:" +obj.s_capacity);

System.out.println("Gear Box:" +obj.g_box);

System.out.println("Minimum Turning Radius:" +obj.radius);

}}