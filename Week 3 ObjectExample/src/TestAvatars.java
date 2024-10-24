public class TestAvatars {
    public static int numberActive(Avatar c1, Avatar c2, Avatar c3, Avatar c4){
        int number = 0;
        if(c1.isActive()) number++;
        if(c2.isActive()) number++;
        if(c3.isActive()) number++;
        if(c4.isActive()) number++;
        return number;
    }

    public static String printtAvatars(Avatar c1, Avatar c2, Avatar c3, Avatar c4){
        String s = "";
        s += c1 + "\n";
        s += c2 + "\n";
        s += c3 + "\n";
        s += c4 + "\n";
        return s;
    }

    public static void main(String[] args){
        Avatar av1 = new Avatar("Binky");
        Avatar av2 = new Avatar("Flo");
        Wizard wiz1 = new Wizard("Merlina");
        Advanturer adv1 = new Advanturer("Skyhawk");
        System.out.println("The Avatars are originally:");
        System.out.println(printtAvatars(av1, av2, wiz1, adv1));

        int counter = 0;
        while(counter < 4 & numberActive(av1, av2, wiz1, adv1) > 1){
            if(av1.isActive()) av1.castSpell(av2);
            if(av1.isActive()) av1.dig();
            if(av2.isActive()) av2.castSpell(adv1);
            if(av2.isActive()) av2.dig();
            if(wiz1.isActive()) wiz1.castSpell(adv1);
            if(adv1.isActive()) adv1.takeAChance();
            System.out.println("The Avatars are now:\n" + printtAvatars(av1, av2, wiz1, adv1));
            counter++;
        }
    }
}
