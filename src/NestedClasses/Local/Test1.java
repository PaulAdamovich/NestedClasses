package NestedClasses.Local;

public class Test1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math{
    public void getResult() {
        class Delenie {
            private int delitel;
            private int delimoe;

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int chastnoe() {
                return delimoe / delitel;
            }

            public int ostatok() {
                return delimoe % delitel;
            }
        }
        Delenie del = new Delenie();
        del.setDelimoe(34);
        del.setDelitel(4);
        del.chastnoe();
        del.ostatok();

        System.out.println("First number => " + del.getDelimoe());
        System.out.println("Second number => " + del.getDelitel());
        System.out.println("Chastnoe => " + del.chastnoe());
        System.out.println("Ostatok => " + del.ostatok());
    }
}
