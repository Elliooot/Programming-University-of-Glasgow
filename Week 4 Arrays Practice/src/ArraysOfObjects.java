public class ArraysOfObjects {
    public static void main(String[] args){
        Person[] people = new Person[4];
//        System.out.println(people[0].toString()); //Error: null
        people[0] = new Person("Billy", 12);
        people[1] = new Person("Edwards", 24);
        people[2] = new Person("Cigar", 48);
        people[3] = new Person("Gary", 96);

        int ageCnt = 0;
        for(int i = 0; i < people.length; i++){
            ageCnt += people[i].getAge();
        }
        System.out.println("The total age is: " + ageCnt);

        int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0;

        people[0].addChild("Paul", 28);
        people[0].addChild("Roy", 23);
        cnt1 = people[0].addChild("Chloe", 19);
        cnt2 = people[1].addChild("Sharon", 15);
        people[2].addChild("Floyd", 21);
        cnt3 = people[2].addChild("Tom", 17);

        System.out.println(people[0].toString(cnt1) + "\n");
        System.out.println(people[1].toString(cnt2) + "\n");
        System.out.println(people[2].toString(cnt3) + "\n");
        System.out.println(people[3].toString(cnt4));
    }
}
