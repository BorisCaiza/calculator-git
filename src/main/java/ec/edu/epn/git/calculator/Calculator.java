package ec.edu.epn.git.calculator;

public class Calculator {

    private int ans;

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int division(int a, int b) {
        if (b == 0)
            throw new ArithmeticException();
        return a / b;
    }

    public int multiplication(int a, int b) {

        return a * b;
    }

    public int squared(int a){
        return a*a;
    }
    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }
}
