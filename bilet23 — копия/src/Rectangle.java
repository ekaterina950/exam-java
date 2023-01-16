public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.filled = false;
        this.color = "green";
        width = 20.5;
        length = 10.0;
    }


    @Override
    public String toString() {
        return "Shape: Rectangle, length:" + this.length + ",width:" + this.width + ",colour:" + this.color + ",filled:" + this.filled;
    }
}
