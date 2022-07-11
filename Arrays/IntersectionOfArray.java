
package object_oriented;
import java.util.Arrays;
public class IntersectionOfArray 
{
       public static void intersection(int[] arr1, int[] arr2) 
       {
    	   Arrays.sort(arr1);
    	 
    	   Arrays.sort(arr2);
    	
    	  int i=0;
    	  int j=0;
    	  while(i<arr1.length &&j<arr2.length)
    			if(arr1[i]<arr2[j])
    			{
    				i++;
    			}
    			else if(arr1[i]==arr2[j])
    			{
    				System.out.print(arr1[i]+" ");
    				i++;
    				j++;
    			}
    			else
    			{
    			j++;
    		}
    	
    		}
    	  
       
    public static void main(String[] args) 
   	{
    int arr1[]= {6,1,9,10,8,2,7};
    int arr2[]= {1,2,10,3,4,2,8,9};
     intersection(arr1,arr2);
	}

}
