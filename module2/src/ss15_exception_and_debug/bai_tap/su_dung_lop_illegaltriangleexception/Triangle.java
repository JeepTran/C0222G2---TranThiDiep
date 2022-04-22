package ss15_exception_and_debug.bai_tap.su_dung_lop_illegaltriangleexception;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Exception: Triangle size(s) is less than or equal to 0!");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Exception: Sum of 2 triangle sizes is less than the other!");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public int getPerimeter() {
        return a + b + c;
    }
}
