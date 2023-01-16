public class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "BLUE";
        this.filled = true;
    }



    public String toString() {
        return this.color + " " + this.filled;
    }
}
