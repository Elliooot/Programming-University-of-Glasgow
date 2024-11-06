public class Advanturer extends Avatar{
    public Advanturer(String n, int s, int g){
        super(n, s, g);
    }

    public Advanturer(String n){
        super(n);
    }

    public void takeAChance(){
        double random = Math.random();
        if(random < 0.5){
            System.out.println("Random number < 0.5");
            setGold(getGold() / 2);
        }else{
            System.out.println("Random number > 0.5");
            setGold(getGold() * 2);
        }
    }
}