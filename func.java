import java.util.Scanner;
public class func{
    
    public static void main(String args[])
    {
        System.out.println("Enter two number : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = fun(num1,num2);
    }

    static int fun(int a , int b)
    {
        int res = a + b;
        return res;
    }
}