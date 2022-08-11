class Main{
    public static void main(String args[])
    {
        Cpywithoutc s1 = new Cpywithoutc(10,"Aswin");
        Cpywithoutc s2 = new Cpywithoutc();
        s2.id = s1.id;
        s2.name = s1.name;
        System.out.println("s2 id : " + s2.id);
        System.out.println("s2 name : " + s2.name);
    }
}

//just open one new constructor and while creating object s2 also make parameters null and cop s1 to s2