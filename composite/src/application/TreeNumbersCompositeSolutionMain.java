package application;

import treeNumberscompositeSolution.TreeNumbers;
import treeNumberscompositeSolution.TreeNumbersComposite;
import treeNumberscompositeSolution.TreeNumbersLeaf;

public final class TreeNumbersCompositeSolutionMain {

	public static void main(String[] args) {
		System.out.println("Composite resuelto: ");
		
		TreeNumbers sub12 = new TreeNumbersComposite("sub12");
		sub12.add(new TreeNumbersLeaf(-5));
		sub12.add(new TreeNumbersLeaf(6));
		
		TreeNumbers sub11 = new TreeNumbersComposite("sub11");
		sub11.add(new TreeNumbersLeaf(2));
		sub11.add(new TreeNumbersLeaf(3));
		
		TreeNumbers sub1 = new TreeNumbersComposite("sub1");
		sub1.add(sub11);
		sub1.add(new TreeNumbersLeaf(4));
		sub1.add(sub12);
		
		TreeNumbers root = new TreeNumbersComposite("root");
		root.add(new TreeNumbersLeaf(1));
		root.add(sub1);
		root.add(new TreeNumbersLeaf(7));
		
		System.out.println("La suma de la raíz: " + root.sum() );
		System.out.println("La suma del nodo sub1: " + sub1.sum() );
		System.out.println("La suma del nodo sub11: " + sub11.sum() );
		System.out.println("La suma del nodo sub12: " + sub12.sum() );
		
		System.out.println("El valor más alto de la raíz: " + root.getHigher());
		System.out.println("El valor más alto del nodo sub1: " + sub1.getHigher());
		System.out.println("El valor más alto del nodo sub11: " + sub11.getHigher());
		System.out.println("El valor más alto del nodo sub12: " + sub12.getHigher());
		

	}

}
