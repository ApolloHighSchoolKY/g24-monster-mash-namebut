/**
 * @(#)Farm.java
 *
 *
 * @author
 * @version 1.00 2023/3/8
 */
import java.util.ArrayList;

public class Farm{
public static void main(String[] args) {
        ArrayList<Animal> farm = new ArrayList<>();
        farm.add(new Cow());
        farm.add(new Pig());
        farm.add(new Cow());
        farm.add(new Pig());

        for(Animal animal: farm)
        {
            System.out.print(animal.toString());
        }
    }
}