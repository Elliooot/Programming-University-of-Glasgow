public class Wizard extends Avatar {
    private int magicStars;
    public Wizard(String n, int s, int g, int m) {
        super(n, s, g);
        magicStars = m;
    }

    public Wizard(String n){
        super(n);
        magicStars = 10;
    }

    public void castSpell(Avatar c){
        if(c.isActive()){
            c.setStrength(c.getStrength() - 2);
            setGold(getGold() - 2);
            magicStars -= 2;
        }else
            setStrength(getStrength() - 1);
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s +
                ", magic stars = " + magicStars;
    }
}
