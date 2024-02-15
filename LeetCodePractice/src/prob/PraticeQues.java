package prob;

class Solution {

	public int[] twoSum(int[] numbers, int target) {
		
		int flag=0;
		int[]  solution = {0,0} ;
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]>target)
				break;
			else
			{
				for(int j=i+1;j<numbers.length;j++)
				{
					if(numbers[i]+numbers[j]>target)
						break;
					else if(numbers[i]+numbers[j]==target)
					{
						flag =1;
						solution[0]=i;
						solution[1]=j;
						break;
					}
				}
			}
		}
		
		System.out.println(flag);
		
		return solution;
		

	}

	/*
	 * public static void main(String[] args) { isPalindrome("@@@Aasdd"); }
	 */
}