package calculator;

public class Calculation<fun> {
	
	public static double sum(double a, double b) {
		return a + b;
	}
	
	public static double subtraction(double a, double b) {
		return a - b;
	}
	
	public static double multiplication(double a, double b) {
		return a * b;
	}
	
	public static double division(double a, double b) throws ErrorException {
		if (b == 0) {
			throw new ErrorException("Impossible to divide for zero!");
		} else return a / b;
	}
}
