//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Angle {
    public Angle() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input;
        do {
            do {
                System.out.println("Calculates Angle from (x0,y0 to x1,y1)");
                System.out.println("type x0:");
                int x1 = scan.nextInt();
                System.out.println("type y0:");
                int y1 = scan.nextInt();
                System.out.println("type x1:");
                int x2 = scan.nextInt();
                System.out.println("type y1:");
                int y2 = scan.nextInt();
                System.out.println("Angle is: " + PointsToAngle(x1, y1, x2, y2));
                System.out.println("Run again (Y/N)?");
                input = scan.next();
            } while(input.equals("y"));
        } while(input.equals("Y"));

        scan.close();
    }

    public static double PointsToAngle(int x1, int y1, int x2, int y2) {
        return Math.toDegrees(Math.atan((double)((y2 - y1) / (x2 - x1))));
    }
}
