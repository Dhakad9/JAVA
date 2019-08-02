class X
{
    private int num=13;
    private X(){}
    private void output()
    {
        System.out.println("num="+num);
    }
}

class Private_Inheritance
{
    public static void main()
    {
        X ob=new X();
    }
}