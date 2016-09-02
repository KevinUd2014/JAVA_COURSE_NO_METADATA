package kn222gn_assign1;

public class FractionMain {
	
	
	public static void main(String args[]){
		
		Fraction frac = new Fraction(2,6);
		Fraction fracTwo = new Fraction(3,4);
		
		Fraction fracEqual = new Fraction(5,6);
		Fraction fracEqualTwo = new Fraction(5,6);
		
		System.out.print("Add function: \n\n");
		System.out.print("");
		
		System.out.println("Fraction 1: " + frac.toString());
		System.out.println("Fraction 2: " + fracTwo.toString());
		
		System.out.println("Fraction equal 3: " + fracEqual.toString());
		System.out.println("Fraction equal 4: " + fracEqualTwo.toString());
		
		Fraction addFraction = frac.add(fracTwo); // adds the fraction 1 to the fraction 2
		Fraction subFraction = frac.subtract(fracTwo);//subtracts the fraction 1 to the fraction 2
		Fraction multiplyFraction = frac.multiply(fracTwo); // multiply the fraction 1 to the fraction 2
		Fraction dividedFraction = frac.divide(fracTwo);//divides the fractions to eachother
		
		System.out.println("\nAdded fractions: ");
		System.out.println("answer = ");
		System.out.print("Add: ");
		System.out.print(addFraction.toString());
		
		System.out.println("\n\nNegative added fractions: ");
		System.out.println("answer = fraction 1(2,6), fraction 2(3,4) = false not negative");
		System.out.print("Negative: ");
		System.out.print(addFraction.isNegative());
		
		System.out.println("\n\nSubtracted fractions: ");
		System.out.println("answer = Subtracion between 2 fractions = -something");
		System.out.print("Subtracted: ");
		System.out.print(subFraction.toString());
		
		System.out.println("\n\nNegative subtraction fractions: ");
		System.out.println("answer = is negative = true");
		System.out.print("Subtracted: ");
		System.out.print(subFraction.isNegative());
		
		System.out.println("\n\nMulti fractions: ");
		System.out.println("answer = multiplied fractions, fraction 1(2,6), fraction 2(3,4) = fraction new(6,24)");
		System.out.print("multi: ");
		System.out.print(multiplyFraction.toString());
		
		System.out.println("\n\ndivided fractions: ");
		System.out.println("answer = divided fractions");
		System.out.print("Divided: ");
		System.out.print(dividedFraction.toString());
		
		System.out.println("\n\nisEqual fractions: ");
		System.out.println("answer = Fraction 1(5,6), Fraction 2(5,6) = isEqual = true");
		System.out.print("isEqual: ");
		System.out.print(fracEqual.isEqualTo(fracEqualTwo));//true
	}
}
