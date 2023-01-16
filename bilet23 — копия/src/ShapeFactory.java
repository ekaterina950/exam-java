public class ShapeFactory {
    public enum Shapes {
        CIRCLE,
        RECTANGLE
    }
    public Shape getShape(Shapes type) {
        Shape shape1 = null;

        switch (type) {
            case CIRCLE:
                shape1 =  new Circle();
                break;
            case RECTANGLE:
                shape1 = new Rectangle();
                break;
        }

        return shape1;
    }
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape(Shapes.CIRCLE);
        Shape rectangle = factory.getShape(Shapes.RECTANGLE);
        System.out.println(circle);

    }
}
