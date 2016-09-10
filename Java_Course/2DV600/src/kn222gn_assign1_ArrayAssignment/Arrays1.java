package kn222gn_assign1_ArrayAssignment;

import java.util.Arrays;

public class Arrays1 {

	//sums the array number together
	public int sum(int[] arr){
		//sum is 0
		int sum = 0;
		//For everything in the array add to the sum
		for(int add : arr)
			sum += add;
		
		return sum;
	}
	//makes the array readable as a string
	public static String toString (int[] arr){

		String arrayHandle = "";
		
		for(int x : arr){
			
			arrayHandle += " " + x;
		}
		
		return arrayHandle;
		
	}
	//adds the number to all the array elements
	public static int[] addN(int[] arr, int n){
		
		int newValue = n;
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] += newValue;
		}
		return arr;
		
	}
	//reverses all the elements in the array
	public static int[] reverse(int[] arr){
		
		int[] arrayNew = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++){
			arrayNew[i] = arr[arr.length - i - 1];
		}
		
		return arrayNew;
		
	}
	//replaces all the numbers with the new ones
	public static int[] replaceAll(int[] arr, int old, int nw){
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == old)
			{
				arr[i] = nw;
			}
		}
		return arr;
	}
	//sorts all the elements in the array
	public int[] sort(int[] arr){
		
		int[] arrayNew = new int[arr.length];
		arrayNew = arr.clone();

		Arrays.sort(arrayNew);
		
		return arrayNew;
	}
	//checks the subsequance of the arrays
	public boolean hasSubsequense(int[] arr, int[] sub){
		
		boolean boo = false;
		
		int i;
		int a;
		
		for(i = 0; i < arr.length - sub.length + 1; i++)
		{
			
			if(arr.length < sub.length){
				boo = false;
				break;
	        }
			for(a = 0; a < sub.length; a++){
				
				if(arr[i+a] != sub[a]){
					
					break;
				}
				else{
					
					if(a == sub.length - 1){
						
						boo = true;
						return boo;
					}
				}
			}
		}
		return boo;
	}
	// adds the difference to the array in a new array
	public static int[] absdif(int[] arr1, int[] arr2){
		
		int[] arrayNew = new int[arr1.length];
		
		if(arr1.length == arr2.length){
		
			try{
				
				for(int i = 1; i < arr1.length; i++){
					
					arrayNew[i] = Math.abs(arr1[i] - arr2[i]);
					
				}
			}
			catch(Exception e)
			{
				System.out.print("Wrong");
			}
		}
		else{
			System.out.print("Wrong");
		}
		return arrayNew;
		
		
	}
}
