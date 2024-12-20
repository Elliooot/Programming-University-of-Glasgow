public class Avatar {
    private String name;
    private int strength;
    protected int gold;

    public Avatar(String n, int s, int g){
        name = n;
        strength = s;
        gold = g;
    }

    public Avatar(String n){
        this(n, 8, 8);
    }

    public Avatar(){
        this("A");
    }

    public void dig(){
        gold = gold + 1;
        strength = strength - 1;
    }

    public void castSpell(Avatar c){
        if(c.isActive()){
            c.strength = c.strength - 1;
            gold -= 2;
        }else
            strength -= 1;
    }

    public boolean isActive(){
        if((strength <= 0) || (gold <= 0)){
            return false;
        }
        return true;
    }

    public String compareTo(Object o){
        if(o instanceof Avatar){
            Avatar a = (Avatar) o;
            if(this.getGold() > a.getGold()){
                return "av1 > av2";
            }else if(this.getGold() < a.getGold()){
                return "av1 < av2";
            }else if(this.getGold() == a.getGold()){
                if(this.getStrength() > a.getStrength()){
                    return "av1 > av2";
                }else if(this.getStrength() < a.getStrength()){
                    return "av1 < av2";
                }else if(this.getStrength() == a.getStrength()){
                    if(this.getName().compareTo(a.getName()) > 0){
                        return "av1 > av2";
                    }else if(this.getName().compareTo(a.getName()) < 0){
                        return "av1 < av2";
                    }
                }
            }
        }
        return "av1 == av2";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getStrength(){
        return strength;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public String toString(){
        return name + ", strength = " + strength + ", gold = " + gold;
    }
}


