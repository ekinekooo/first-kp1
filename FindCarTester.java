package yenideneme;

import java.util.Iterator;
import java.util.List;

public class FindCarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        CarSpec whatErinLikes =
                new CarSpec(Builder.OPEL, "Astra",
                        Engine.ELECTRIC, 6, Color.BLACK);
        List matchingCars = inventory.search(whatErinLikes);
        if (!matchingCars.isEmpty()) {
            System.out.println("Erin, you might like these cars:");
            for (Iterator i = matchingCars.iterator(); i.hasNext(); ) {
                Car car = (Car)i.next();
                CarSpec spec = car.getSpec();
                System.out.println("  We have a " +
                        spec.getBuilder() + " " + spec.getModel() + " " +
                        spec.getColor() + "\n You can have it for only $" +
                        car.getPrice() + "!\n  ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addCar("11277", 3999.95,
                new CarSpec(Builder.TOGG, "T10X", Engine.GASOLINE, 6,Color.WHITE));
        inventory.addCar("V95693", 50200,
                new CarSpec(Builder.OPEL, "ASTRA", Engine.ELECTRIC, 6, Color.CYAN));
        inventory.addCar("V9512", 35695,
                new CarSpec(Builder.OPEL, "ASTRA", Engine.ELECTRIC, 6,Color.BLACK));
        inventory.addCar("122784", 29695,
                new CarSpec(Builder.MERCEDES, "G63", Engine.GASOLINE, 6,Color.GREY));
        inventory.addCar("76531", 271259,
                new CarSpec(Builder.MERCEDES, "G63", Engine.GASOLINE, 6,Color.YELLOW));
        inventory.addCar("70108276", 227949,
                new CarSpec(Builder.FERRARI, "812", Engine.ELECTRIC, 6,Color.BLACK));
        inventory.addCar("82765501", 305000,
                new CarSpec(Builder.FERRARI, "PORTOFINO", Engine.ELECTRIC, 6,Color.BLACK));
        inventory.addCar("77023", 240000,
                new CarSpec(Builder.MERCEDES, "G63", Engine.GASOLINE, 6,Color.WHITE));
        inventory.addCar("1092", 290000,
                new CarSpec(Builder.TOYOTA, "COROLLA", Engine.GASOLINE, 12,Color.PURPLE));
        inventory.addCar("566-62", 24950,
                new CarSpec(Builder.PEUGEOT, "3008", Engine.GASOLINE, 12,Color.PURPLE));
        inventory.addCar("6 29584", 17900,
                new CarSpec(Builder.BENTLEY, "BENTAYGA", Engine.ELECTRIC,
                        6,Color.CYAN));
    }
}

