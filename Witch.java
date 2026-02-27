public class Witch extends Monster {
    public Witch(String name){
        super(name);
    }

    //Override kill
    public String kill(){
        return getName() + " drowned a victim. Splish Splash.\n";
    }

    public String fly(){
        return getName() + " went flying away, cackling.\n";
    }
}
