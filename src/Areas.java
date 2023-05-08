public class Areas {
    private float area;
    public float findSquareOrRectangleArea(float sideOne, float sideTwo) {
        area = sideOne * sideTwo;
        return area;
    }
    public float findCircleArea(float radius) {
        area = (float)Math.PI * (float)Math.pow(radius, 2);
        return area;
    }
}
