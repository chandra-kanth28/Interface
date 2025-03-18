
// Defining an interface
interface Car {
    void start();  // Abstract method
    void stop();
}

// Implementing the interface in BMW class
class BMW implements Car {
    public void start() {
        System.out.println("BMW is starting with a roar!");
    }

    public void stop() {
        System.out.println("BMW is stopping smoothly.");
    }
}

// Implementing the interface in RollsRoyce class
class RollsRoyce implements Car {
    public void start() {
        System.out.println("Rolls-Royce is starting in luxury mode!");
    }

    public void stop() {
        System.out.println("Rolls-Royce is stopping gracefully.");
    }
}

// Main class to run the program
public class InterfaceCar {
    public static void main(String[] args) {
        Car bmw = new BMW();  // Creating an object of BMW
        Car rr = new RollsRoyce();  // Creating an object of Rolls-Royce
        
        bmw.start();
        bmw.stop();

        rr.start();
        rr.stop();
    }
}
