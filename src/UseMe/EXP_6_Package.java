package UseMe; // ✅ Package declaration must be first

class UseMe {
    public void area(int x, int y) {
        System.out.println("Area = " + (x * y));
    }

    public void percent(int input) {
        System.out.println("Percent = " + (input * 100) / 100);
    }
}

public class EXP_6_Package {
    public static void main(String[] args) {
        UseMe obj = new UseMe();
        obj.area(5, 4);
        obj.percent(85);
    }
}