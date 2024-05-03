class Cars {
    String brand;
    String model;
    String type;
    double price;
    int seatingCapacity;
    Engine engine;

    Cars(String brand, String model, String type, double price, int seatingCapacity, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
        this.seatingCapacity = seatingCapacity;
        this.engine = engine;
    }

    public void displayCar() {
        System.out.println("*** Car Details ***");
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Type: " + this.type);
        System.out.println("Price: " + this.price);
        System.out.println("Seating Capacity: " + this.seatingCapacity);
        this.engine.display(); 
    }
}


