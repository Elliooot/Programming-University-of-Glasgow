public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Circle c = new Circle((2.5));
        c.describe();
        doubleArea(c);
        c.describe();

        Ellipse e = new Ellipse(3.0, 5.0);
        Ellipse ec = new Ellipse(4.0);
    }
    public static void doubleArea(Circle d){
        double radius = d.getRadius();
        radius *= Math.sqrt(2.0);
        d.setRadius(radius);
    }
}