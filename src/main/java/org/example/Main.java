
package org.example;

import org.example.model.*;
import org.example.model.enums.*;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("West");
        Ceiling ceiling = new Ceiling(10, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 2, 30, 1, 1);
        Lamp lamp = new Lamp(LampType.NEON, false, 5);
        Wardrobe wardrobe = new Wardrobe(100, 200, 75.5);
        Carpet carpet = new Carpet(200, 300, PaintColor.RED);

        Bedroom bedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);


        System.out.println("Bedroom Name: " + bedroom.getName());
        System.out.println("Wall 1 Direction: " + bedroom.getWall1().getDirection());
        System.out.println("Ceiling Height: " + bedroom.getCeiling().getHeight());
        System.out.println("Bed Pillows: " + bedroom.getBed().getPillows());
        System.out.println("Lamp Style: " + bedroom.getLamp().getStyle());
        System.out.println("Wardrobe Width: " + bedroom.getWardrobe().getWidth());
        System.out.println("Carpet Color: " + bedroom.getCarpet().getColor());

        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
        bedroom.getCeiling().create();
        bedroom.getWall1().create();
    }
}
