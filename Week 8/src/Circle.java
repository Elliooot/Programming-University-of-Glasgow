public class Circle implements Shape{
    private int x,y;
    private int radius;

    public Circle(int r) {
        this.radius = r;
    }

    public Circle(int x,int y,int r) {
        this.x = x;
        this.y = y;
        this.radius = r;
    }
    public void move(int changeX, int changeY) {
        x += changeX;
        y += changeY;
    }
    public void grow(int factor) {
        radius *= factor;
    }

    public String toString() {
        return "I am a circle with a radius of " + this.radius;
    }
}