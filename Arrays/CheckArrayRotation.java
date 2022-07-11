package object_oriented;

public class CheckArrayRotation 
{
	// Function to find the total number of times the array is rotated
    public static int arrayRotateCheck(int[] arr)
    {
        if(arr.length==0)
        {
        	return 0;
        }
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
        	if(arr[i]>arr[i+1]&&arr.length>=2)
        	{
        		return i+1;
        	}
        	i++;
        }
        return 0;
    }
 
    public static void main(String[] args)
    {
        int[] nums = {5,6,7,2,3,4 };
 
        System.out.println("Array is rotated " + arrayRotateCheck(nums) + " times");
    }
}
