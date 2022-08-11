class Sample{
    int id;
    String name;
    public static void main(String args[]){
        Sample s1 = new Sample();
        Sample s2 = new Sample();

        s1.id = 1;
        s1.name = "Aswin";
        s2.id = 2;
        s2.name = "Kannan";
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s2.id);
        System.out.println(s2.name);

    }
}