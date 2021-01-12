package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static  void  main(String [] args){
        System.out.println("Calculator Execute");
        Calculator c = new Calculator();
        int addition  = c.addition(3,4);
        System.out.println("c.addition(3,4): " + addition);
        int substraction = c.subtraction(4 ,2);
        System.out.println("c.subtraction(4 ,2); " + substraction);
        int multiplication = c.multiplication(2,4);
        System.out.println("c.multiplication(2,4); " + multiplication);
        int division = c.division(4,2);
        System.out.println("c.division(4,2);" + division);

        System.out.println("It is a change, whe have a new operation");
        System.out.println("c.c.squared(2)"+c.squared(2));




    }
}
