public class MonsterMash{
  public static void main(String[] args){
    //Monster monster = new Monster(); //NOT ALLOWED
    //Because Monster has a modified constructor but not a default constructor, Monster does not INHERIT a default constructor
    Monster dracula = new Monster("Dracula");

    System.out.println(dracula);

    System.out.println(dracula.kill());

    Monster sally = new Witch("Sally");

    System.out.println(sally);

    System.out.println(sally.kill());

    System.out.println(((Witch)sally).fly());

    //Declare a Monster of your new Type
    //Declare your new Type of Monster
    //Bonus challenge: Add an instance field
    
    Karen karen = new Karen("Karen");

    System.out.println(karen);

    System.out.println(karen.kill());

    System.out.println(karen.getManager());
  }
}
