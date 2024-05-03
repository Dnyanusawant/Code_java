class Computer {
    String brand;
    double price;
    String model;
    Cpu cpu;
    Monitor monitor;

    Computer(String brand, double price, String model) {
        this.brand = brand;
        this.price = price;
        this.model = model;
    }

    public void displayComputer() {
        System.out.println("******COMPUTER DETAILS******");
        System.out.println("Computer Brand: " + this.brand);
        System.out.println("Computer Price: " + this.price);
        System.out.println("Computer Model: " + this.model);
        System.out.println();
    }

    public void createInstanceOfCpu(String ram, String rom, String processor) {
        cpu = new Cpu(ram, rom, processor);
    }

    public void createInstanceOfMonitor(String displayType, double size, String resolution) {
        monitor = new Monitor(displayType, size, resolution);
    }
}

class Cpu {
    String ram;
    String rom;
    String processor;

    Cpu(String ram, String rom, String processor) {
        this.ram = ram;
        this.rom = rom;
        this.processor = processor;
    }

    void displayCpu() {
        System.out.println("******CPU DETAILS******");
        System.out.println("RAM: " + this.ram);
        System.out.println("ROM: " + this.rom);
        System.out.println("Processor: " + this.processor);
        System.out.println();
    }
}

class Monitor {
    String displayType;
    double size;
    String resolution;

    Monitor(String displayType, double size, String resolution) {
        this.displayType = displayType;
        this.size = size;
        this.resolution = resolution;
    }

    void displayMonitor() {
        System.out.println("******MONITOR DETAILS******");
        System.out.println("Monitor Display Type: " + this.displayType);
        System.out.println("Monitor Size: " + this.size + " inches");
        System.out.println("Monitor Resolution: " + this.resolution);
        System.out.println();
    }
}
class Mouse {
    String brand;
    String type;
    int button;
    boolean scroll;

    Mouse(String brand, String type, int button, boolean scroll) {
        this.brand = brand;
        this.type = type;
        this.button = button;
        this.scroll = scroll;
    }

    void displayMouse() {
        System.out.println("******MOUSE DETAILS******");
        System.out.println("Mouse Brand: " + this.brand);
        System.out.println("Mouse Type: " + this.type);
        System.out.println("Number of Buttons: " + this.button);
        System.out.println("Scroll Functionality: " + (this.scroll ? "Yes" : "No"));
        System.out.println();
    }
}
class Keyboard {
    String brand;
    boolean backlight;
    String type;

    Keyboard(String brand, boolean backlight, String type) {
        this.brand = brand;
        this.backlight = backlight;
        this.type = type;
    }

    void displayKeyboard() {
        System.out.println("******KEYBOARD DETAILS******");
        System.out.println("Keyboard Brand: " + this.brand);
        System.out.println("Backlight: " + (this.backlight ? "Yes" : "No"));
        System.out.println("Keyboard Type: " + this.type);
        System.out.println();
    }
}
class Printer {
    String brand;
    String type;
    int printCapacity;

    Printer(String brand, String type, int printCapacity) {
        this.brand = brand;
        this.type = type;
        this.printCapacity = printCapacity;
    }

    void displayPrinter() {
        System.out.println("******PRINTER DETAILS******");
        System.out.println("Printer Brand: " + this.brand);
        System.out.println("Printer Type: " + this.type);
        System.out.println("Print Capacity: " + this.printCapacity);
        System.out.println();
    }
}
class Speaker {
    String brand;
    String type;
    int numberOfSpeakers;
    int watt;

    Speaker(String brand, String type, int numberOfSpeakers, int watt) {
        this.brand = brand;
        this.type = type;
        this.numberOfSpeakers = numberOfSpeakers;
        this.watt = watt;
    }

    void displaySpeaker() {
        System.out.println("******SPEAKER DETAILS******");
        System.out.println("Speaker Brand: " + this.brand);
        System.out.println("Speaker Type: " + this.type);
        System.out.println("Number of Speakers: " + this.numberOfSpeakers);
        System.out.println("Watt: " + this.watt);
        System.out.println();
    }
}

public class ComputerAggregation {
    public static void main(String[] args) {
        Computer obj = new Computer("Dell", 150000, "Dell XPS 15");
        obj.displayComputer();
        obj.createInstanceOfCpu("8GB", "4MB", "CORE i3");
        obj.cpu.displayCpu();
        obj.createInstanceOfMonitor("IPS Panel", 15.6, "4K UHD (3840*2400)");
        obj.monitor.displayMonitor();

        Mouse mouse = new Mouse("Logitech", "Wireless", 3, true);
        mouse.displayMouse();

        Keyboard keyboard = new Keyboard("Razer", true, "Mechanical");
        keyboard.displayKeyboard();

        Printer printer = new Printer("HP", "Inkjet", 100);
        printer.displayPrinter();

        Speaker speaker = new Speaker("Bose", "Bluetooth", 2, 50);
        speaker.displaySpeaker();
    }
}
