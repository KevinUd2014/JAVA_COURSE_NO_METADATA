package kn222gn_assign1;

import java.util.Arrays;

public class Arrays1 {

	public int sum(int[] arr){
		//sum is 0
		int sum = 0;
		//For everything in the array add to the sum
		for(int add : arr)
			sum += add;
		
		return sum;
	}
	public static String toString (int[] arr){

		String arrayHandle = "";
		
		for(int x : arr){
			
			arrayHandle += " " + x;
		}
		
		return arrayHandle;
		
	}
	public static int[] addN(int[] arr, int n){
		
		int newValue = n;
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] += newValue;
		}
		return arr;
		
	}
	public static int[] reverse(int[] arr){
		
		int[] arrayNew = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++){
			arrayNew[i] = arr[arr.length - i - 1];
		}
		
		return arrayNew;
		
	}
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
	public int[] sort(int[] arr){
		
		int[] arrayNew = new int[arr.length];
		arrayNew = arr.clone();

		Arrays.sort(arrayNew);
		
		return arrayNew;
	}
	/*
	public boolean hasSubsequense(int[] arr, int[] sub){
		
	}
	public int absdif(int[] arr1, int[] arr2){
		
	}*/
}
