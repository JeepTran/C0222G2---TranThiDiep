package ss6_inheritance.bai_tap.bai_tap_2_lop_2d_va_lop_3d;

import com.sun.java.browser.net.ProxyServiceProvider;

import java.util.Arrays;

public class TestPoint2DAnd3D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,3);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(point2D.toString());

        Point3D point3D = new Point3D();
        point3D.setXYZ(4.5f,7,9.1f);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D.toString());
    }
}
