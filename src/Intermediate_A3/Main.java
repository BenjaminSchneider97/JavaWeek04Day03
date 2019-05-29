package Intermediate_A3;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){

        Rectangle r1 = new Rectangle(5, 9);
        Rectangle r2 = new Rectangle(6, 4);
        Rectangle r3 = new Rectangle(9, 6);
        Rectangle r4 = new Rectangle(2, 1);
        Rectangle r5 = new Rectangle(8, 7);

        Rectangle[] allRectangles = {r1, r2, r3, r4, r5};

        Arrays.sort(allRectangles, new Comparator<Rectangle>() {
            @Override
            public int compare(Rectangle r1, Rectangle r2) {
                return r1.area - r2.area;
            }
        });

        System.out.println("ASCENDING");
        for(int i = 0; i < allRectangles.length; i++){
            System.out.println("Area: " + allRectangles[i].area + "cm²");
        }

        System.out.println("DESCENDING");
        for(int i = allRectangles.length - 1; i >= 0; i--){
            System.out.println("Area: " + allRectangles[i].area + "cm²");
        }

        /*
        int[] areas = new int[5];

        for(int i = 0; i < allRectangles.length; i++){
            areas[i] = allRectangles[i].calcArea();
        }

        Arrays.sort(areas);

        System.out.println("ASCENDING ORDER");
        for(int i = 0; i < areas.length; i++){
            System.out.println("The area of the rectangle is: " + areas[i] + "cm²");
        }

        System.out.println("DESCENDING ORDER");
        for(int i = areas.length - 1; i >= 0; i--){
            System.out.println("The area of the rectangle is: " + areas[i] + "cm²");
        }
         */
    }
}
