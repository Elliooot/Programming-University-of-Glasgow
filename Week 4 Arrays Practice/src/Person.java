public class Person {
    private String name;
    private int age;
    private Person[] dependents = new Person[3];
    private int childrenCnt = 0;
    public Person (String s, int a){
        name = s;
        age = a;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age = a;
    }
    public void setName(String n){
        name = n;
    }

    public int addChild(String name, int age){
        for(int i = 0; i < 3; i++){
            if(dependents[i] == null){
                dependents[i] = new Person(name, age);
//                dependents[i].setName(name);
//                dependents[i].setAge(age);
                childrenCnt++;
                return childrenCnt;
            }
        }
        return childrenCnt;
    }
//    @Override
    public String toString(int childrenCnt) {
        if(childrenCnt == 0){
            return "I am " + name + " and I am " + age + " years old. I don't have child.";
        }else if(childrenCnt == 1){
            return "I am " + name + " and I am " + age + " years old. I have "
                    + childrenCnt + " children,\n" + "the first one is "
                    + dependents[0].getName() + ", " + dependents[0].getAge() + " years old.";
        }else if(childrenCnt == 2){
            return "I am " + name + " and I am " + age + " years old. I have "
                    + childrenCnt + " children,\n" + "the first one is "
                    + dependents[0].getName() + ", " + dependents[0].getAge() + " years old,\n"
                    + "the second one is " + dependents[1].getName() + ", " + dependents[1].getAge() + " years old.";
        }else{
            return "I am " + name + " and I am " + age + " years old. I have "
                    + childrenCnt + " children,\n" + "the first one is "
                    + dependents[0].getName() + ", " + dependents[0].getAge() + " years old,\n"
                    + "the second one is " + dependents[1].getName() + ", " + dependents[1].getAge() + " years old,\n"
                    + "the third one is " + dependents[2].getName() + ", " + dependents[2].getAge() + " years old.";
        }
    }
}
