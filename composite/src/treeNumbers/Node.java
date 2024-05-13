package treeNumbers;

import java.util.ArrayList;
import java.util.List;

public class Node {
	private NodeType type;
	private int value;
	private List<Node> childs;
	
	public Node() {
		type = NodeType.BRANCH;
		value = 0;
		childs = new ArrayList<>();
	}
	
	public Node(int value) {
		type = NodeType.LEAF;
		this.value = value;
	}
	
	public NodeType getType() {
		return type;
	}
	
	public int getValue() {
		if (type.equals(NodeType.LEAF)) {
			return value;
		}
		
		return 0;
	}
	
	public int sum() {
		if(type.equals(NodeType.LEAF)) {
			return value;
		}
		int accum = 0;
		for(int i = 0; i < childs.size(); i++) {
			accum += childs.get(i).sum();
		}
		return accum;
	}
	
	public int getHigherValue() {
		if( type.equals(NodeType.LEAF) ) {
			return value;
		}
		int higher = 0;
		for(int i=0; i < childs.size(); i++) {
			if(i == 0) {
				higher = childs.get(i).getValue();
			}
			if (childs.get(i).getValue() > higher) {
				higher = childs.get(i).value;
			}
		}
		return higher;
		
	}
	
	public void add(Node node) {
		childs.add(node);
	}
	
	public void remove(Node node) {
		childs.remove(node);
	}
}
