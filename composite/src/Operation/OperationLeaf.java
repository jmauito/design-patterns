package Operation;


public final class OperationLeaf implements Operation{

	private Integer value;
	
	public OperationLeaf(Integer value) {
		this.value = value;
	}
	
	@Override
	public boolean isComposite() {
		return false;
	}
	
	@Override
	public void add(Operation operation) {
		// Nothing to do
	}

	@Override
	public void remove(Operation operation) {
		// Nothing to do
	}

	@Override
	public double calculate() {
		return value;
	}
	

}
