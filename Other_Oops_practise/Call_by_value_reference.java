package Oops.Other_Oops_practise;

// call by value

/*
public class Call_by_value_reference {

    public void fun(int a)
    {
        a = 100;
        System.out.println("x : " +a);
    }

    public static void main(String[] args)
    {
        int a = 50;

        //obj refernce
        Call_by_value_reference call = new Call_by_value_reference();
        call.fun(a);

        System.out.println("a : " + a);

    }

}
*/

// call by refernce

class box
{
    int size = 10;
    int num = 0;

}
public class Call_by_value_reference {

    public void change(box b)
    {
        b.num = 99;
        System.out.println("changed");
    }
    public static void main(String[] args)
    {
        //obj reference
        box b = new box();
        System.out.println(b.size);
        System.out.println(b.num);

        Call_by_value_reference  call = new Call_by_value_reference();
        call.change(b);
        System.out.println(b.num);
        System.out.println(b.size);
    }
}



// tail recursion

//public class Call_by_value_reference {
//
//    public int tail_recursion(int n , int result)
//    {
//        if(n == 1)
//        {
//            return result;
//        }
//
//        return tail_recursion(n-1 , n*result);
//    }
//
//    public static void main(String[] args)
//    {
//        int n = 5;
//        int result = 1;
//        Call_by_value_reference call = new Call_by_value_reference();
//        System.out.println(call.tail_recursion(n,result));
//    }
//
//}