public class Perimeter {
    private float perimeter;
    public float findSquareOrRectanglePerimeter(float sideOne, float sideTwo) {
        perimeter = 2 * (sideOne + sideTwo);
        return perimeter;
    }
    public float findCirclePerimeter(float radius) {
        perimeter = (float)Math.PI * 2 * radius;
        return perimeter;
    }
}
