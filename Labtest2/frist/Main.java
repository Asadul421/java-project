package Labtest2.frist;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        Area area = new Area();
        Scanner in = new Scanner(System.in);

        System.out.print("Entrer length for rectangle: ");
        double len = in.nextDouble();
        System.out.print("Entrer breadth for rectangle: ");
        double bre = in.nextDouble();
        area.RectangleArea(len, bre);

        System.out.print("Entrer breadth for square: ");
        double sid = in.nextDouble();
        area.SquareArea(sid);

        System.out.print("Entrer breadth for circle: ");
        double rad = in.nextDouble();
        area.CircleArea(rad);
    }

}
