public class GenericClass <E> {

    E firstAttribute;
    E secondAttribute;

    public GenericClass(E firstAttribute, E secondAttribute) {
        this.firstAttribute = firstAttribute;
        this.secondAttribute = secondAttribute;

    }

    public String toString() {
        return (firstAttribute + "\n" + secondAttribute);
    }


}