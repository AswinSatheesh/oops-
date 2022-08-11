class Main{
    public static void main(String args[]){
        Student stud1 = new Student();
        Student stud2 = new Student();
        stud1.id = 01;
        stud1.age = 20;
        stud1.name  ="Aswin";

        stud2.id = 02;
        stud2.age = 21;
        stud2.name = "Kannan";

        stud1.fun();
        System.out.println(stud1.id + " my name is : " + stud1.name +" and my age is  : " + stud1.age  );
        System.out.println(stud2.id + " my name is : " + stud2.name +" and my age is  : " + stud2.age  );
    }
}