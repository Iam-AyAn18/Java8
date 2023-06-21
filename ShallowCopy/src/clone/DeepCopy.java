package clone;

public class DeepCopy implements Cloneable{
	int abc;
	ClassB classB;
	public DeepCopy(int abc, ClassB classB) {
		this.abc = abc;
		this.classB = classB;
	}
	
	public Object clone() throws CloneNotSupportedException {
		DeepCopy deepCopy = (DeepCopy) super.clone();
		deepCopy.classB = (ClassB) classB.clone();
		
		return deepCopy;
	}

}
