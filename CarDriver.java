public class CarDriver {
    public static void main(String[] args) {
        Engine engine = new Engine(120, 1.2, "petrol", 16, 4);
        Cars carObj = new Cars("TATA", "NEXON", "SUV", 900000, 5, engine);

        carObj.displayCar();
        engine.display(); 
    }
}
