package com.lpnu;

public class Refrigerator {
    private static int refrigeratorCount = 0;

    private String manufacturer = "None";
    private String model = "None";
    private double price = 0;
    private double weight = 0;
    private double volume = 0;

    protected double powerConsumption = 0;
    protected int modelYear = 0;

    Refrigerator() {
        refrigeratorCount++;
    }

    Refrigerator(String manufacturer, String model, double price, double weight) {
        this();
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.weight = weight;
    }

    public Refrigerator(String manufacturer, String model, double price, double weight, double volume, double powerConsumption, int modelYear) {
        this(manufacturer, model, price, weight);
        this.volume = volume;
        this.powerConsumption = powerConsumption;
        this.modelYear = modelYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public static int getRefrigeratorCount() {
        return refrigeratorCount;
    }

    public void resetValues(String manufacturer, String model, double price, double weight, double volume, double powerConsumption, int modelYear) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.volume = volume;
        this.powerConsumption = powerConsumption;
        this.modelYear = modelYear;
    }

    @Override
    public String toString() {
        return "Refrigerator:\n" +
                "Manufacturer: '" + manufacturer + '\'' +
                "\nModel: '" + model + '\'' +
                "\nPrice: " + price + "$" +
                "\nWeight: " + weight + " Kg" +
                "\nVolume: " + volume + " l^3" +
                "\nPower Consumption: " + powerConsumption + " V" +
                "\nModel Year: " + modelYear + "\n";
    }

    static void printRefrigeratorCount() {
        System.out.println("Amount of refrigerators: " + refrigeratorCount + "\n");
    }


    public static void main(String[] args) {
	Refrigerator refrigerator1 = new Refrigerator("LIEBHERR", "IKB 3560", 1000, 70.3, 344, 1925, 2021);
	Refrigerator refrigerator2 = new Refrigerator("BOSCH", "KGN36XI35", 1300, 90.4);
	Refrigerator refrigerator3 = new Refrigerator();

	Refrigerator.printRefrigeratorCount();
	System.out.println(refrigerator1);
	System.out.println(refrigerator2);
	System.out.println(refrigerator3);
    }
}
