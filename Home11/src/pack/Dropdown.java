package pack;

import java.util.List;

public class Dropdown {
	List<String> options;
	boolean isSelected;
	String name;
	public Dropdown(String name) {
		this.name = name;
	}
	public Dropdown(boolean isSelected) {
		this.isSelected = isSelected;
	}
	public Dropdown(List<String> options) {
		this.options = options;
	}
	
	
	
	
	public String toString() {
		return getClass() + " " + this.name;
	}



}
