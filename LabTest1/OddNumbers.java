package LabTest1;

public class OddNumbers {

	public static void main(String[] args) {

		int n=20;
		oddNumbers(n);

	}
	public static void oddNumbers(int n)
	{
		System.out.println("The odd numbers are :");
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
				System.out.println(i);
		}		

	}

}
