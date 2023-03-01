package NestedClasses.Anonymous;

public class Test1 {
    private int x = 5;
    public static void main(String[] args) {

        Math m1 = new Math() {
             @Override
             public int doOperation(int a, int b) {
                 Test1 test1 = new Test1();
                 return a+b+ test1.x;
             }
         };

        Math m2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a*b;
            }
        };

        System.out.println(m1.doOperation(5,7));
        System.out.println(m2.doOperation(5,7));
    }
}

interface Math{
   int doOperation(int a, int b);
}
