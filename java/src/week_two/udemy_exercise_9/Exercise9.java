class Calc {
    public int division(int num1, int num2) {
        return num1 / num2;
    };
}



public class Exercise9 {
    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 0;

        // TODO: Handle division using try-catch
        try {
            Calc calc = new Calc();
            int result  =  calc.division(numerator, denominator);
            //  division(numerator, denominator);
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        finally {
            System.out.println("Program completed");
        }
    }
}
