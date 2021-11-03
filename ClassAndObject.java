package homeworkweek14;

public class ClassAndObject {
    int std = 10;
    int group = 2;

    public static void main (String[] args) {
        ClassAndObject a = new ClassAndObject();
        ClassAndObject b = new ClassAndObject();

        a.std = 10;
        a.group = 2;

        System.out.println("std " + a.std);
        System.out.println("group " + a.group);

        System.out.println("std " + b.std);
        System.out.println("group " + b.group);


    }
}
