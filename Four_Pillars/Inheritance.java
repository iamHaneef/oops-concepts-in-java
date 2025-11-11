package Oops.Four_Pillars;

class parent
{
    int parent_age = 33;

    public void first_display() {

        System.out.println("parents");

    }

}

class child extends parent{

    public void sec_display()
    {
        System.out.println("child");
    }

}

public class Inheritance {

    public static void main(String[] args)
    {
        child child = new child();
        child.sec_display();
        child.first_display();
    }

}
