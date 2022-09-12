package operations;

public class Addition extends Operation {
	public Addition(int numberOne, int numberTwo) {
		super(numberOne, numberTwo);
	}
	
	@Override
	public int calcul() {
		return this.getNumA() + this.getNumB();
	}
}
