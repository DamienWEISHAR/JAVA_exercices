package operations;

public class Multiplication extends Operation {
	public Multiplication(int numberOne, int numberTwo) {
		super(numberOne, numberTwo);
	}
	
	@Override
	public int calcul() {
		return this.getNumA() * this.getNumB();
	}
}
