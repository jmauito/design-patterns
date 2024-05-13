package application;

import Operation.Operation;
import Operation.OperationComposite;
import Operation.OperationLeaf;

public class OperationMain {

	public static void main(String[] args) {
		Operation simpleOperation = new OperationLeaf(5);
		System.out.println("simpleOperation - Resultado final: " + simpleOperation.calculate() );
		
		Operation mediumOperation = new OperationComposite('+');
		Operation m1 = new OperationLeaf(1);
		Operation m2 = new OperationComposite('*');
		m2.add(new OperationLeaf(8));
		m2.add(new OperationLeaf(3));
		mediumOperation.add(m1);
		mediumOperation.add(m2);
		System.out.println("mediumOperation - Resultado final: " + mediumOperation.calculate() );
		
		Operation largeOperation = new OperationComposite('*');
		Operation l1 = new OperationComposite('+');
		Operation l2 = new OperationComposite('+');
		largeOperation.add(l1);
		largeOperation.add(l2);
		l1.add(new OperationLeaf(7));
		l1.add(new OperationLeaf(3));
		l2.add(new OperationLeaf(1));
		l2.add(new OperationLeaf(5));
		System.out.println("largeOperation - Resultado final: " + largeOperation.calculate() );
		
	}

}
