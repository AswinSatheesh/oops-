public class Main{
    public static void main(String args[])
    {
        int numberofthread = 6;
        for(int i =0; i<numberofthread; i++)
        {
            Multithread obj = new Multithread();
            obj.start();
        }
        

    }
}