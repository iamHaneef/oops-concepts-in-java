package Oops.Four_Pillars;

// compile time polymorphism

/*public class Polymorphism {

    public int add(int a , int b)
    {
        return a+b;
    }

    public float add(float a , float b)
    {
        return a+b;
    }

    public String add(String a , String b)
    {
        return a+b;
    }

    public static void main(String[] args)
    {
        Polymorphism poly = new Polymorphism();
        System.out.println("int : " + poly.add(5,5));
        System.out.println("float : " + poly.add(5.0f,5.0f));
        System.out.println("string : " + poly.add("5","6"));


    }

}*/

// runtime time polymorphism

class first {
    public void add()
    {
        int a = 5 , b = 5;
        System.out.println("int : " + (a+b));
    }
}

class second extends first{
    @Override
    public void add()
    {
        float a = 5f , b = 5f;
        System.out.println("float : " + (a+b));
    }
}

class third extends first{
    @Override
    public void add()
    {
        String  a = "5" , b = "5";
        System.out.println("String : " + (a+b));
    }
}

public class Polymorphism {
    public static void main(String [] args)
    {
        first f = new first();
        first s= new second();
        first t = new third();
        f.add();
        s.add();
        t.add();
    }
}