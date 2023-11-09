    public class Main {
        public static void main(String[] args) {
            Car car = new Car();
            car.go();
            car.stop();
        }
    }

    class Vehicle {
        double speed;

        void go() {
            System.out.println("This vehicle is moving");
        }

        void stop() {
            System.out.println("This vehicle is stopped");
        }
    }

    class Car extends Vehicle {
        // You can add specific properties and methods for the Car class here if needed.
    }

    class Motor extends Vehicle {
        // You can add specific properties and methods for the Motor class here if needed.
    }
