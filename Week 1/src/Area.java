public class Area {
    public static double computeArea(double radius){
        double pi = 3.14152;
        double myArea = pi * radius * radius;
        radius *= 5;
        return myArea;
    }

    public static void main(String[] args){
        double radius = 5.4;
        double area = computeArea(radius);
        System.out.println("This area of a circle with raidus " + radius + " equals " + area);
        System.out.println(radius);
    }
}
