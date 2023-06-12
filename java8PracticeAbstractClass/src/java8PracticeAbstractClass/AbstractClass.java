package java8PracticeAbstractClass;

abstract public class AbstractClass {
	
	public void execute()
	{
		getReady();
		doTheDish();
		cleanUp();
	}
	abstract void getReady();
	abstract void doTheDish();
	abstract void cleanUp();

}
