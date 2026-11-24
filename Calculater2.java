class Calculater2 {
    void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }

    void add(float a, float b) {
        System.out.println("Sum of two floats: " + (a + b));
    }
}

class Calculater2Main {
    public static void main(String[] args) {
        Calculater2 calc = new Calculater2();

        calc.add(5, 10);
        calc.add(5, 10, 15);
        calc.add(5.5f, 10.5f);
    }
}