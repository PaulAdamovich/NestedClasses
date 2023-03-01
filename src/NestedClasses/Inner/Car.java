package NestedClasses.Inner;

public class Car {
    int doorCount;
    String color;
    Engine engine;

    public Car(int doorCount, String color) {
        this.doorCount = doorCount;
        this.color = color;
        //   this.engine = this.new Engine(horsePower);
    }

    @Override
    public String toString() {
        return "Car{" +
                "doorCount=" + doorCount +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }

    void setEngine(Engine engine){
        this.engine = engine;
    }

    class Engine{
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test1 {
    public static void main(String[] args) {
     //   Car car = new Car(2, "Red" , 256);
        Car car = new Car(2,"Red");
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(car);
    }
}
