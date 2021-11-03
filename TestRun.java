package inheritancewk14;

public class TestRun {
    public static void main(String[] args) {

        Apple apple = new Apple();
        apple.taste();
        apple.texture();
        apple.colour();


        System.out.println();
        Banana banana = new Banana();
        banana.colour();
        banana.taste();
        banana.texture();

        System.out.println();
        Orange orange = new Orange();
        orange.colour();
        orange.taste();
        orange.texture();

    }
}
