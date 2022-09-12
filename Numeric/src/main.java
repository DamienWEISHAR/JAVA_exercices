import java.util.ArrayList;
import java.util.List;

import operations.Addition;
import operations.Multiplication;
import operations.Operation;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add = new Addition(5, 5);
		Multiplication mult = new Multiplication(5, 5);
		List<Operation> lst = new ArrayList<Operation>();
		
		lst.add(add);
		lst.add(mult);
		
		for (Operation operation : lst) {
			System.out.println(operation.calcul());
		}
	}

}
