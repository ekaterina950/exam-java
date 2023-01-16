public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.filled = false;
        this.color = "blue";
        radius = 1;
    }



    @Override
    public String toString()
    {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;
    }
}
