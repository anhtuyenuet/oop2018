package week5_6;

class main {
    public static void main(String[] agrs) {
        Layer layer1 = new Layer();
        Layer layer2 = new Layer();
        Shape circle1 = new Circle(5, "red", true);
        Shape circle2 = new Circle(10, "blue", false);
        Shape triangle1 = new Triangle(5, 6, 7, "green");
        Shape triangle2 = new Triangle(10, 6, 5, "black");
        Shape rect = new Rectangle(5, 5, "grey", true);
        layer1.addShape(circle1);
        layer1.addShape(circle2);
        layer1.addShape(rect);
        layer1.addShape(triangle1);
        layer1.addShape(triangle2);
        layer2.addShape(rect);
        layer2.addShape(circle1);
        Diagram.diagram.add(layer1);
        Diagram.diagram.add(layer2);
        System.out.println("Layer 1: ");
        layer1.printShape();
        System.out.println("Layer 2: ");
        layer2.printShape();
        System.out.println("layer1.deleteTriangle() \r\nLayer1:");
        layer1.deleteTriangle();
        layer1.printShape();
        System.out.println("Diagram.deleteCircle() ");
        Diagram.deleteCircle();
        System.out.println("Layer 1: ");
        layer1.printShape();
        System.out.println("Layer 2: ");
        layer2.printShape();
    }
}