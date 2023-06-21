package clone;

public class MainClass {

	public static void main(String[] args) {
		
		ClassA classA = new ClassA(10, "String");
		ShallowCopy shallowCopy = new ShallowCopy(123,classA);
		try {
			ShallowCopy shallowCopyClone = (ShallowCopy) shallowCopy.clone();
			
			System.out.println(shallowCopy.classA.abc);
			shallowCopyClone.classA.abc=11;
			System.out.println(shallowCopy.classA.abc);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		ClassB classB = new ClassB(10,"String");
		DeepCopy deepCopy = new DeepCopy(11, classB);
		
		try {
			DeepCopy deepCopyClone = (DeepCopy) deepCopy.clone();
			
			System.out.println(deepCopy.classB.abc);
			deepCopyClone.classB.abc=11;
			System.out.println(deepCopy.classB.abc);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
