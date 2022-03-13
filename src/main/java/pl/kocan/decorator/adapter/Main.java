package pl.kocan.decorator.adapter;

public class Main {

    public static void main(String[] args) {

        generateMap();
    }

    private static void generateMap() {

        Terrain terrain1 = new Plain();
        Terrain terrain2 = new ForestHill();
        Terrain terrain3 = new SwampPlain();
        Terrain terrain4 = new SwampForestPlain();
    }
}
