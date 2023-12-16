package Triangle;

public enum TriangleTypes {
    EQUILATERAL("equilateral"),
    ISOSCELES("isosceles"),
    SCALENE("scalene");
    public final String label;

    private TriangleTypes(String label) {
        this.label = label;
    }

}
