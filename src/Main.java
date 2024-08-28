import java.util.Scanner;

public class Main {

    public static void getSphereSurfaceArea(double radius) {
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        System.out.println("The surface area of the sphere is: " + surfaceArea);
    }

    public static void getSphereVolume(double radius) {
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("The volume of the sphere is: " + volume);
    }

    public static void getInput() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the sphere: ");

        double radius = input.nextDouble();

        getSphereSurfaceArea(radius);
        getSphereVolume(radius);

        input.close();
    }

    public static void main(String[] args) {
        getInput();
    }
}