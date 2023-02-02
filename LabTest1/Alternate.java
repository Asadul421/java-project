package LabTest1;

public class Alternate {
	
	public static void main(String[] args) {
		int arr1[]= {2,3,4,5,6,7,8,9,10};
		System.out.println("The sum of alternative numbers are :"+alternate(arr1));
		
	}
	
	public static int alternate(int arr1[])
	{
		int j=0,sum=0;
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i+=2)
		{
			arr2[j]=arr1[i];
			System.out.println(arr1[j]);
			sum+=arr2[j];
			j++;	
		}
		return sum;
	}

}
