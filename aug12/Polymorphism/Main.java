import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Polymorphism obj = new Polymorphism();
        // System.out.println(obj.add(1,2));
        // System.out.println(obj.add(5,6,7)); 

        //we can create object and by accessing object we can call methods but here
        //  if we use 'static' we don't need to create objects directly by using class name.methodname we can acess it.
        //before doing this remove static from the 'Polymorphism' class methods begin

        System.out.println("Enter the numbers :");
        Scanner sc = new Scanner(System.in);

        int a ,b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(Polymorphism.add(a,b));
        System.out.println(Polymorphism.add(20,25,5));
    }
}