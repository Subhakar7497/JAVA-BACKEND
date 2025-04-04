public class MethodOverloading {
 
    static int myMethod(int x, int y) {
        return x + y;
    }
 
    static double myMethod(double x, double y)
    {
        return x+y;
    }
 
    public static void main(String[] args) {
        int Num1=myMethod(5,5);
        double Num2=myMethod(5,5);
 
        System.out.println(Num1);
        System.out.println(Num2);
    }
}
 