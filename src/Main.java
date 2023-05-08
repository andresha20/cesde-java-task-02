import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String outputChatbox = "Insert selection: 1. Area | 2. Perimeter";
        System.out.println(outputChatbox);
        try (Scanner parser = new Scanner(System.in)) {
            int selection = parser.nextInt();
            float result;
            if (selection == 1) {
                outputChatbox = "Insert selection: 1. Square | 2. Rectangle | 3. Circle";
                System.out.println(outputChatbox);
                selection = parser.nextInt();
                switch(selection) {
                    case 1:
                    case 2:
                        float side1, side2;
                        outputChatbox = "Insert side 1:";
                        System.out.println(outputChatbox);
                        side1 = parser.nextFloat();
                        outputChatbox = "Insert side 2:";
                        System.out.println(outputChatbox);
                        side2 = parser.nextFloat();
                        Areas rectangleArea = new Areas();
                        result = rectangleArea.findSquareOrRectangleArea(side1, side2);
                        outputChatbox = "El área del rectángulo o cuadrado es: " + String.valueOf(result);
                        break;
                    case 3:
                        float radius;
                        outputChatbox = "Insert radius:";
                        System.out.println(outputChatbox);
                        radius = parser.nextFloat();
                        Areas circleArea = new Areas();
                        result = circleArea.findCircleArea(radius);
                        outputChatbox = "El área del circulo es: " + String.valueOf(result);
                        break;
                    default:
                        System.exit(-1);
                        break;
                }
            } else {
                outputChatbox = "Insert selection: 1. Square | 2. Rectangle | 3. Circle";
                System.out.println(outputChatbox);
                selection = parser.nextInt();
                switch(selection) {
                    case 1:
                    case 2:
                        float side1, side2;
                        outputChatbox = "Insert side 1:";
                        System.out.println(outputChatbox);
                        side1 = parser.nextFloat();
                        outputChatbox = "Insert side 2:";
                        System.out.println(outputChatbox);
                        side2 = parser.nextFloat();
                        Perimeter rectangleArea = new Perimeter();
                        result = rectangleArea.findSquareOrRectanglePerimeter(side1, side2);
                        outputChatbox = "El perimetro del rectángulo o cuadrado es: " + String.valueOf(result);
                        break;
                    case 3:
                        float radius;
                        outputChatbox = "Insert radius:";
                        System.out.println(outputChatbox);
                        radius = parser.nextFloat();
                        Perimeter circleArea = new Perimeter();
                        result = circleArea.findCirclePerimeter(radius);
                        outputChatbox = "El perimetro del circulo es: " + String.valueOf(result);
                    default:
                        System.exit(-1);
                        break;
                }
            }
            System.out.println(outputChatbox);
            System.exit(1);
        }
    }
}