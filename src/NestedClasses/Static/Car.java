package NestedClasses.Static;

public class Car {
    int doorCount;
    String color;
    Engine engine;
    private static int countOfObject;

    public Car(int doorCount, String color, Engine engine) {
        this.doorCount = doorCount;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My Car : {" +
                "doorCount=" + doorCount +
                ", color='" + color + '\'' +
                ", engine => " + engine +
                '}';
    }

    void method(){
        System.out.println(Engine.owner);
    }
    // Or Abstract
    public final static class Engine extends Example {
        int horsePower;
        int weight;
        private static String owner;

        public Engine(int horsePower, int weight) {
            System.out.println(countOfObject);
            this.horsePower = horsePower;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "My Engine : {" +
                    " horsePower = " + horsePower +
                    ", weight = " + weight + "  " +
                    '}';
        }
    }
}

class Test{
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(356, 120);
        Car car = new Car(2, "Red", engine);
        System.out.println(car);
    }
}
class Example{}
