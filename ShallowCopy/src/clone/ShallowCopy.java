package clone;

public class ShallowCopy implements Cloneable{
	
	int a;
	ClassA classA;
	public ShallowCopy(int a, ClassA classA) {
		this.a = a;
		this.classA = classA;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

}
