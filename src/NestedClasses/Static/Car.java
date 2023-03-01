package NestedClasses.Static;

public class Car {
    int doorCount;
    String color;
    Engine engine;

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
                ", engine=" + engine +
                '}';
    }

    public static class Engine{
        int horsePower;
        int weight;

        public Engine(int horsePower, int weight) {
            this.horsePower = horsePower;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "My Engine : {" +
                    "horsePower=" + horsePower +
                    ", weight=" + weight +
                    '}';
        }
    }
}
