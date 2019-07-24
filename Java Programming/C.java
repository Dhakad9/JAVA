class C extends A
{
    public void out()
    {
        System.out.println("I am C");
        System.out.println("x="+x);
    }
    public static void main()
    {
        C ob=new C();
        ob.display();
        ob.out();
    }
}