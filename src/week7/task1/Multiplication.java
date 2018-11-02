package week7.task1;

public class Multiplication extends BinaryExpression{
	private Expression left;
	private Expression right;
	
	public Multiplication(Expression E1,Expression E2) {
		this.left = E1;
		this.right = E2;
	}

	@Override
	public Expression left() {
		return this.left;
	}

	@Override
	public Expression right() {
		return this.right;
	}

	@Override
	public String toString() {
		return (left.toString()+" * "+right.toString());
	}

	@Override
	public int evaluate() {
		return left.evaluate() * right.evaluate();
	}
}
