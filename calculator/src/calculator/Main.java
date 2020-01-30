package calculator;

public class Main {

	public static void main(String[] args) {
		System.out.println("The result of sum is: " + (int) Calculation.sum(5, 5));
		System.out.println("the result of subtraction is: " + (int) Calculation.subtraction(7, 3));
		System.out.println("The result of multiplication is: " + (int) Calculation.multiplication(6, 7));
		System.out.println("The result of division is: " + (int) Calculation.division(5, 0));
	}

}
