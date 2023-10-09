package fI;

public class MainFI {

	public static void main(String[] args) {

		ClassFunctional classFunctional = ()->System.out.println("cool joe");
		
		classFunctional.test();
		
		LambdaInt<Integer> li = (a, b) -> a+b;
		
		System.out.println(li.operation(4, 6));
	}

}
