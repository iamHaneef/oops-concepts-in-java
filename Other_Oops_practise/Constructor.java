package Oops.Other_Oops_practise;

class check
{
    int age;
    String name;
    int id ;


    // parameterized constructor
    check(String n , int a , int i)
    {
        age = a;
        name = n;
        id = i;
    }

    // copy constructor
    check(check c)
    {
        age = c.age;
        name = c.name;
        id = c.id;
    }

    public void display()
    {
        System.out.println("age is : " + age + " name is " + name + " id is " + id);
    }

}

public class Constructor {

    public static void main(String[] args)
    {
        check c = new check("haneef" , 22 , 2);
        c.display();
        check c2 = new check(c);
        c2.display();
    }

}