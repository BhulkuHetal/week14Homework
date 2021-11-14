package homeworkweek14;

public class OverLoading {
    static int plusMethodInt(int x, int y) {
        return x + y;

    }

        static int plusMethod (int a, int b){
        return a - b;

    }

    static double plusMethod( double x, double y){
        return x - y;
    }

    public static void main(String[] args) {
      int a = plusMethodInt(4, 9);
      double myNum2 = plusMethod(20.41, 10.12);
        System.out.println("int: " + a);
        System.out.println("double: " + myNum2);



    }
}


