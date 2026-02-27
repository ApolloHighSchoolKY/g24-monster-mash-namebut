public class Karen extends Monster {
    public Karen(String name){
        super(name);
    }
        
    //Override kill
    public String kill(){
        return getName() + " nagged another victim to death.\n";
    }

    public String getManager(){
        return getName() + " got another poor worker fired (with real fire).\n";
    }

}
