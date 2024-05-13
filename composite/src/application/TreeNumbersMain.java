package application;

import treeNumbers.Node;

public class TreeNumbersMain {
	public static void main(String[] args) {
		System.out.println("Composite");
		
		Node sub12 = new Node();
		sub12.add(new Node(-5));
		sub12.add(new Node(6));
		
		Node sub11 = new Node();
		sub11.add(new Node(2));
		sub11.add(new Node(3));
		
		Node sub1 = new Node();
		sub1.add(sub11);
		sub1.add(new Node(4));
		sub1.add(sub12);
		
		Node root = new Node();
		root.add(new Node(1));
		root.add(sub1);
		root.add(new Node(7));
		
		System.out.println("La suma de la raíz: " + root.sum() );
		System.out.println("La suma del nodo sub1: " + sub1.sum() );
		System.out.println("La suma del nodo sub11: " + sub11.sum() );
		System.out.println("La suma del nodo sub12: " + sub12.sum() );
		
		System.out.println("El valor más alto de la raíz: " + root.getHigherValue());
		System.out.println("El valor más alto del nodo sub1: " + sub1.getHigherValue());
		System.out.println("El valor más alto del nodo sub11: " + sub11.getHigherValue());
		System.out.println("El valor más alto del nodo sub12: " + sub12.getHigherValue());
	}

}
