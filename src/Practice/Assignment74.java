/*Assignment - 74 : 8th Jan
Rotate all the numbers of an array to the right by one position. 
input : {10,20,30,40,50}
output : {50,10,20,30,40};
         {40,50,10,20,30}    */
package Practice;

import java.util.Arrays;

public class Assignment74 {
	
	int[] revArray(int[] arr)
	{
		int last=arr[arr.length-1];
		
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=last;
		return arr;
	}
	public static void main(String[] args)
	{
		int[] arr= {10,20,30,40,50};
		Assignment74 A=new Assignment74();
		System.out.println("1st Iteration==>>"+Arrays.toString(A.revArray(arr)));
		System.out.println("2nd Iteration==>>"+Arrays.toString(A.revArray(arr)));

		
	}

}
