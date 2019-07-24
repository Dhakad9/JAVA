class D extends A
{
    public void print()
    {
        System.out.println("I am D");
        System.out.println("x="+x);
    }
    public static void main()
    {
        D ob=new D();
        ob.display();
        ob.print();
    }
}