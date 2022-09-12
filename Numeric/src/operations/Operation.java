package operations;

public abstract class Operation {
	private int numA;
	private int numB;
	
	public Operation(int numOne, int numTwo) {
		this.setNumA(numOne);
		this.setNumB(numTwo);
	}

	public int getNumA() {
		return numA;
	}

	public void setNumA(int numA) {
		this.numA = numA;
	}

	public int getNumB() {
		return numB;
	}

	public void setNumB(int numB) {
		this.numB = numB;
	}
	
	public int calcul() {
		return 0;
	}
}
