class Main extends Static
{
    void fun(){
        System.out.println("THis is inside child");
    }
    void barking()
    {
        System.out.println("Barking...");
    }
    void display()
    {
        super.fun();
        fun();
        barking();
    }
    public static void main(String args[]){
        Main obj = new Main();
        obj.display();
    }
}