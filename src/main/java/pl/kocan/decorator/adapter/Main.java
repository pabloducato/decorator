package pl.kocan.decorator.adapter;

public class Main {

    public static void main(String[] args) {

        generateMap();
    }

    private static void generateMap() {

        Terrain terrain1 = new Plain();
        Terrain terrain2 = new Hill();
        Terrain terrain3 = new SwampDecorator(new Hill());
        Terrain terrain4 = new SwampDecorator(new ForestDecorator(new Plain()));
        Terrain terrain5 = new RoadDecorator(new Hill());

        System.out.println("Plain cost " + terrain1.fuelCost());
        System.out.println("Hill cost " + terrain2.fuelCost());
        System.out.println("Swamp hill cost " + terrain3.fuelCost());
        System.out.println("Swamp forest plain cost " + terrain4.fuelCost());
        System.out.println(terrain5.getDescription() + " " + terrain5.fuelCost());
    }
}
