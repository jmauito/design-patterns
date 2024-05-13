package Operation;

import java.util.ArrayList;
import java.util.List;

public class OperationComposite implements Operation{
	
	
	private Character operator;
	private List<Operation> operations;

	public OperationComposite(Character operator) {
		this.operator = operator;
		this.operations = new ArrayList<Operation>();
	}
	
	@Override
	public boolean isComposite() {
		return true;
	}

	@Override
	public void add(Operation operation) {
		operations.add(operation);
	}

	@Override
	public void remove(Operation operation) {
		operations.remove(operation);
		
	}

	@Override
	public double calculate() {
		
		switch (operator) {
		case '+': {
			return sum(); 
		}
		case '-': {
			return substract();
		}
		case '*': {
			return multiply();
		}
		case '/': {
			return divide();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operator);
		}
		
	}
	
	private double sum() {
		return operations.stream().mapToDouble(Operation::calculate).sum();
	}
	
	private double substract() {
		double result = 0;
		for(int i=0; i < operations.size(); i++) {
			result -= operations.get(i).calculate();
		}
		return result;
	}
	
	private double multiply() {
		double result = 1;
		for(int i=0; i < operations.size(); i++) {
			result *= operations.get(i).calculate();
		}
		return result;
	}
	
	private double divide() {
		double result = 1;
		for(int i=0; i < operations.size(); i++) {
			result /= operations.get(i).calculate();
		}
		return result;
	}

}
