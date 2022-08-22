import static java.lang.Math.PI;    // single-static import for static variable
import static java.lang.Math.sqrt;  // single-static import for static method
//import static java.lang.Math.*;       // on-demand-static import

public class TestImportStatic {
    public static void main(String[] args) {
        int radius = 2;

        // Using static class variable to get value of constant Pi.
        double circumference = 2 * PI * radius;
        System.out.println("circumference = " + circumference);

        // Using static class method to obtain square root of a number.
        double sqrt81 = sqrt(81);
        System.out.println("sqrt81 = " + sqrt81);
    }
}
