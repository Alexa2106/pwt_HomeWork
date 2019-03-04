package pack;

public class Field {
	int id;
	String value;
	public Field(int id,String value) {
		this.id = id;
		this.value = value;
	}
	
	public String toString() {
		return getClass() + " " + this.id + " " + this.value;
	}

}
