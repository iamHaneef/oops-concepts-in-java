package Oops.Four_Pillars;

// Abstact cls and methods

abstract class music{

    abstract void play();
    abstract void stop();

}

class violin extends music
{
    public void stop()
    {
        System.out.println("stop");
    }

    public void play()
    {
        System.out.println("play");
    }
}

public class Abstraction {

    public static void main(String[] args)
    {
        music v = new violin();
        //violin v = new violin();
        v.play();
        v.stop();
    }

}
