public Main2{
    public static void main(String args[])
    {
        Main s1 = new Main();
        Main s2 = new Main();

        s1.a = 10;
        s1.b = 50;
        s2.a = 45;
        s2.b = 46;

        System.out.println("S1 : a = "+s1.a + "s2 : a ="+ s2.a);
        System.out.println("S1 : b = "+s1.b + "s2 : b ="+ s2.b);
    }
}