class Main extends FInalmethod{
    void myfun()
    {
        System.out.println("This is my another funtion.");
    }
    public static void main(String args[])
    {
        // new Main().myfun();        if only one time we create object and need to call methods or use variables use this short form. for multiple object creation use old method.

        Main s1 = new Main();
        s1.myfun();
    }
}