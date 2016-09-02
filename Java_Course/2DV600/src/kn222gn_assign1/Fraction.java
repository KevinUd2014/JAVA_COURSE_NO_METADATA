package kn222gn_assign1;

public class Fraction {
	
	public static int denominator;
	public static int numerator;
	
	public Fraction(int numerator2, int denominator2) {
		
		numerator = numerator2;
		denominator = denominator2;
	}
	public int getDenominator(){
		
		return denominator;
	}
	public int getNumerator(){
		
		return numerator;
	}
	
	public static boolean isNegative(){
		
		boolean boo = false;
		
		return boo;
	}
	public Fraction add(Fraction newFraction){
		
		denominator = this.getDenominator() * newFraction.getDenominator();
		numerator = this.getNumerator() * newFraction.getDenominator() + newFraction.getNumerator() * this.getDenominator();
		//and check if simplification is possible.
		return new Fraction(numerator,denominator);
	}
	/*public static int subtract(){
		
		
	}
	public static int multiply(){
		
	}
	public static int divide(){
		
	}
	public static int isEqualTo(){
		
		
	}
	public static int toString(){
		
		
	}*/

}
