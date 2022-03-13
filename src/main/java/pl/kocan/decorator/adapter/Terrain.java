package pl.kocan.decorator.adapter;

public abstract class Terrain {

    private String description;
    private int fuelCost;

    public Terrain(String description, int fuelCost) {
        this.description = description;
        this.fuelCost = fuelCost;
    }

    public int fuelCost() {
        return fuelCost;
    }

    public String getDescription() {
        return description;
    }
}
