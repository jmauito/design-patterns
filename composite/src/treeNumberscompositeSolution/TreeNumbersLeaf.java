package treeNumberscompositeSolution;

public class TreeNumbersLeaf implements TreeNumbers{
	private int value;
	
	public TreeNumbersLeaf(int value) {
		this.value = value;
	}

	@Override
	public void add(TreeNumbers node) {
		// Nada que hacer porque es un nodo hoja
		
	}

	@Override
	public void remove(TreeNumbers node) {
		// Nada que hacer porque es un nodo hoja
		
	}

	@Override
	public boolean isComposite() {
		return false;
	}

	@Override
	public int getNumberOfNodes() {
		return 0;
	}

	@Override
	public int sum() {
		return value;
	}

	@Override
	public int getHigher() {
		return value;
	}
	
	@Override
	public int getValue() {
		return value;
	}

	@Override
	public String getName() {
		return null;
	}
	
	
			
}
