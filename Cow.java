/**
 * Inheritance and Polymorphism
 ***********************************************************
 * This file is an object that will inherit all of the
 * properties and abilities of the original Animal object.
 * However, it will have it own unique properties and
 * methods while overriding some of the existing methods
 * it inherits.
 ***********************************************************
 * @author  Mr. Leohr, February 7th, 2016
 */
import java.util.Random;

public class Cow extends Animal
{
    private double milkProduced = 0.0;
    public Cow()
    {
        super();
        soundType("moo");
        this.milkProduced = Math.random() * 100;
        Random rand = new Random();
        ageYears(rand.nextInt(61));
        super.kill();
    }

    public String toString()
    {
        return super.toString() + "This cow has produced " + milkProduced + " buckets of milk!\n";
    }


}