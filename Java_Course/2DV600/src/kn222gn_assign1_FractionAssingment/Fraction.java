package kn222gn_assign1_FractionAssingment;

public class Fraction {
	
	public int denominator; // had these static, had an error for HOURS! Static strikes again!
	public int numerator;
	
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
	
	public String toString(){
		
		return getNumerator() + "/" + getDenominator();
	}
	public Fraction add(Fraction newFraction){
		
		Fraction addedFraction;
		
		//adds the fraction
		addedFraction = new Fraction(getNumerator() * newFraction.getDenominator() + newFraction.getNumerator() * getDenominator(), 
				getDenominator() * newFraction.getDenominator());
		
		return addedFraction;
	}
	public Fraction subtract(Fraction newFraction){
		
		Fraction subtractedFraction;
		
		//subtracts the fraction
		subtractedFraction = new Fraction(getNumerator() * newFraction.getDenominator() - newFraction.getNumerator() * getDenominator(), 
				getDenominator() * newFraction.getDenominator());
		
		return subtractedFraction;
	}
	public Fraction multiply(Fraction newFraction){
		
		numerator = getNumerator() * newFraction.getNumerator();
		denominator = getDenominator() * newFraction.getDenominator();
		
		return new Fraction(numerator, denominator);
	}
	public Fraction divide(Fraction newFraction){
		
		Fraction frac;
		
		int newDenominator = getDenominator();
		int newNumerator = getNumerator();
		
		//creates a new fraction with the new values
		frac = new Fraction((newNumerator * newFraction.getDenominator()), 
				(newDenominator * newFraction.getNumerator()));
		
		return frac;
	}
	public boolean isEqualTo(Fraction newFraction){
		
		boolean equalFraction;
		
		equalFraction = getDenominator() * newFraction.getNumerator() == getNumerator() * newFraction.getDenominator();
		
		return equalFraction;
	}
	public boolean isNegative(){
		
		if((double)getNumerator() / (double)getDenominator() < 0){
			return true;
		}
		else{
			return false;
		}
	}
}
