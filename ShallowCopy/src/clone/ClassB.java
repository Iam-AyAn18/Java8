package clone;

public class ClassB implements Cloneable{
	int abc;
	String str;
	public ClassB(int abc, String str) {
		this.abc = abc;
		this.str = str;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}
