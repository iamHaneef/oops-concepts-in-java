package Oops.Other_Oops_practise;

interface student{
    void sound();
}

interface teacher{
    void sound();
}
class home implements student{

    public void sound()
    {
        System.out.println("home sound");
    }

}

class school implements teacher{

    public void sound()
    {
        System.out.println("school sound");
    }

}

public class Interfaces_ex {
    public static void main(String[] args)
    {
        teacher s = new school();
        student h = new home();

        s.sound();
        h.sound();
    }
}
