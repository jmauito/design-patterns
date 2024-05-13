package Operation;

public interface Operation {
	
	boolean isComposite();
	
	void add(Operation operation);
	
	void remove(Operation operation);
	
	public double calculate();
	

}
