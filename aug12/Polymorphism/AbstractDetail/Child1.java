class Child1 extends Abstract1{
    void myfunc()
    {
        System.out.println("working fine");
    }

    public static void main(String args[])
    {
        Abstract1 s1 = new Child1();
        s1.myfunc();
        Abstract1 s2 = new Child2();
        s2.myfunc();
    }
}