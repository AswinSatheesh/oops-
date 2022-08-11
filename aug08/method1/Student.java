class Student{
    int id;
    String name;
    int age;
    Student(){
        System.out.println("Just calling from Constructor, this works when object create");
    }
    void fun()
    {
        System.out.println("Just calling function from another file ! ");
    }
}