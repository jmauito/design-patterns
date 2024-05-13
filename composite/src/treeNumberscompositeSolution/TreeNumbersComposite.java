package treeNumberscompositeSolution;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class TreeNumbersComposite implements TreeNumbers{

	private String name;
	private List<TreeNumbers> childs;
	
	public TreeNumbersComposite(String name) {
		this.name = name;
		this.childs = new ArrayList<TreeNumbers>();
	}
	
	@Override
	public void add(TreeNumbers node) {
		childs.add(node);
	}

	@Override
	public void remove(TreeNumbers node) {
		childs.remove(node);
	}

	@Override
	public boolean isComposite() {
		return true;
	}

	@Override
	public int getNumberOfNodes() {
		return childs.size();
	}

	@Override
	public int sum() {
		return childs.stream().mapToInt(TreeNumbers::sum).sum();
	}

	@Override
	public int getHigher() {
		return childs.stream().mapToInt(TreeNumbers::getHigher).max().orElseThrow(NoSuchElementException::new);
	}

	@Override
	public int getValue() {
		return sum();
	}

	@Override
	public String getName() {
		return name;
	}
	

}
