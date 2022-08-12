class Testing extends Constructorsuper{
    Testing()
    {
        super(); // this is not necessary automatically when we inherit parent class constructor get work
        System.out.println("This is child class constructor.");
    }

    public static void main(String args[])
    {
        Testing obj1 = new Testing();
    }
}