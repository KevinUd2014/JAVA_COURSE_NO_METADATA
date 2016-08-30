package kn222gn_assign1;

public class ArrayMain {
	
	private static Arrays1 arr = new Arrays1();
	
	public static void main(String args[]){
		
		int[] arrayReverseOrder = {1,2,3,4,5,6};
		int[] arrayNotInOrder = {5,1,2,6,3,4};
		
		int[] sring;
		
		int[] string2;
		
		int[] arraySub1 = {1,2,3,4,5};
		int[] arraySub2 = {1,2,3,4,6};
		
		sring = arr.reverse(arrayReverseOrder);
		
		string2 = arr.sort(arrayNotInOrder);
		
		
		System.out.println("in order array: ");
		System.out.print(arr.toString(string2));
		
		System.out.println("\nreverse order array: ");
		System.out.print(arr.toString(sring));
		
		System.out.println("\nsubsequense array: ");
		System.out.print(arr.hasSubsequense(arraySub1, arraySub2));
		
		
	}

}
