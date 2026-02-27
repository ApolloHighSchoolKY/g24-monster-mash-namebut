import java.util.Random;

public class Pig extends Animal{
    
    public Pig()
    {    
    super();
    soundType("oink");
    Random rand = new Random();
    ageYears(rand.nextInt(61));
    super.kill();
    }
}
