package kn222gn_assign1_ArrayAssignment;

public class ArrayMain {
	
	private static Arrays1 arr = new Arrays1();
	
	public static void main(String args[]){
		
		int[] arrayReverseOrder = {1,2,3,4,5,6};
		int[] arrayNotInOrder = {5,1,2,6,3,4};
		
		int[] toStringArray = {1,2,3,4,5,6,7,8,9,10};
		
		int[] addNumberArray = {1,2,3,4,5};
		
		int[] replaceAllArray = {1,2,3,4,5};
		
		int oldNumber = 5;
		
		int newNumber = 97;
		
		int addedNumber = 5;
		
		int[] arrSum = {1,1,3};
		
		int[] sring;
		
		int[] string2;
		
		int[] string3;
		
		int[] string4;
		
		int[] string5;
		
		int[] arraySub1 = {1,2,3,4,5};
		int[] arraySub2 = {2,3,4,5,6};
		
		int[] arrayABS1 = {1,2,3,4,5};
		int[] arrayABS2 = {1,1,1,1,1};
		
		sring = arr.reverse(arrayReverseOrder);
		
		string2 = arr.sort(arrayNotInOrder);
		
		string3 = arr.absdif(arrayABS1, arrayABS2);
		
		string4 = arr.addN(addNumberArray, addedNumber);
		
		string5 = arr.replaceAll(replaceAllArray, oldNumber, newNumber);
		
		System.out.println("sum array: ");
		System.out.print(arr.sum(arrSum));
		
		System.out.println("\nto String array: ");
		System.out.print(arr.toString(toStringArray));
		
		System.out.println("\nadd number array: ");
		System.out.print(arr.toString(string4));
		
		System.out.println("\nin order array: ");
		System.out.print(arr.toString(string2));
		
		System.out.println("\nreverse order array: ");
		System.out.print(arr.toString(sring));
		
		System.out.println("\nreplace all array: ");
		System.out.print(arr.toString(string5));
		
		System.out.println("\nsubsequense array: ");
		System.out.print(arr.hasSubsequense(arraySub1, arraySub2));
		
		System.out.println("\nABS array: ");
		System.out.print(arr.toString(string3));
		
		
	}

}
