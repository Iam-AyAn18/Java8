package recusionPractice;

public class RecursionFibbo {

	static int Fibbo(int n)
	{
		//System.out.println(n);
		if(n==1)
			return 1;
		if(n==0)
			return 0;
		int res =  Fibbo(n-1)+Fibbo(n-2);
		System.out.println(res);
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(Fibbo(6));

	}

}
