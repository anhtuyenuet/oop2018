package week7.task1;

public class ExpressionTest {

    public static void main(String args[]) {
        Expression n10 = new Numeral(10);
        Expression n2 = new Numeral(2);
        Expression n1 = new Numeral(1);
        Expression n3 = new Numeral(3);
        Expression result = new Square(
                new Addition(
                        new Subtraction(new Square(n10), n1), //10^2 - 1
                        new Multiplication(n2, n3) //2*3
                )
        );
        System.out.println(result + " = " + result.evaluate());
        //Chia cho 0
        System.out.println("10 / 0 = ?");
        Expression n0 = new Numeral(0);
        Expression d0 = new Division(n10, n0);
        try {
            if (n0.evaluate() == 0) {
                throw new ArithmeticException();
            } else {
                System.out.println(d0 + " = " + d0.evaluate());
            }
        } catch (ArithmeticException e) {
            System.out.println("Loi chia cho so 0");
        }
    }
}
