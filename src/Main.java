import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String outputChatbox = "Insert selection: 1. Area | 2. Perimeter";
        System.out.println(outputChatbox);
        try (Scanner parser = new Scanner(System.in)) {
            int selection = parser.nextInt();
            if (selection == 1) {
                outputChatbox = "Insert selection: 1. Square | 2. Rectangle | 3. Circle";
                System.out.println(outputChatbox);
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
                        rectangleArea.findSquareOrRectangleArea(side1, side2);
                        break;
                    case 3:
                        float radius;
                        outputChatbox = "Insert radius:";
                        System.out.println(outputChatbox);
                        radius = parser.nextFloat();
                        Areas circleArea = new Areas();
                        circleArea.findCircleArea(radius);
                        break;
                    default:
                        System.exit(-1);
                        break;
                }
            } else {
                outputChatbox = "Insert selection: 1. Square | 2. Rectangle | 3. Circle";
                System.out.println(outputChatbox);
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
                        rectangleArea.findSquareOrRectanglePerimeter(side1, side2);
                        break;
                    case 3:
                        float radius;
                        outputChatbox = "Insert radius:";
                        System.out.println(outputChatbox);
                        radius = parser.nextFloat();
                        Perimeter circleArea = new Perimeter();
                        circleArea.findCirclePerimeter(radius);
                    default:
                        System.exit(-1);
                        break;
                }
            }
        }
    }
}