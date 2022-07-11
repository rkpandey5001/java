package object_oriented;

public class Rotate_Array 
{
	public static void rotate(int[] arr, int d)
	{
		int j=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			if(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j--;
			}
		}
		
		//Swap array  from 0 to n-d 
		int t=arr.length-d-1;
		for(int i=0;i<t;i++)
		{
			if(i<t)
			{
				int temp=arr[i];
				arr[i]=arr[t];
				arr[t]=temp;
				t--;
			}
		}
		
		//swap from arr.length-d+1 to arr.length
		int g=arr.length-1;
		for(int i=arr.length-d;i<g;i++)
		{
			if(i<g)
			{
				int temp=arr[i];
				arr[i]=arr[g];
				arr[g]=temp;
				g--;
			}
		}
		for(int n=0;n<arr.length;n++)
		{
			System.out.print(arr[n]+" ");
		}
		
	}
	public static void main(String[] args) 
	{
     int arr[]= {1,2,3,4,5,6,7};
     int d=2;
     rotate(arr,d);
	}

}
