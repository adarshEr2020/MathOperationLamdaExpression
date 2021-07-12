package com.bridgelabz.mathoperation;

// creating functional interface
@FunctionalInterface
interface IMathFunction {
	int calculate(int a, int b);
	
	static void printResult(int a, int b, String function, IMathFunction fobj){
		System.out.println("Result of" +function+"is"+fobj.calculate(a,b));
	}
}

public class MathOperation {

	public static void main(String[] args) {
		System.out.println("Welcome to Math Operation App Using Lamda Expression: ");
		// Using Method Reference instead of Lambda Expression
		// This expression implements 'IMathFunction' interface
		IMathFunction add = Integer::sum;
		
		// Lambda expression fir multiplication & division for two parameter
		// this expression implements 'IMathFunction'
		
		//IMathFunction add = (x,y) -> x + y;
		IMathFunction multiply = (x,y) -> x * y;
		IMathFunction divide = (int x, int y) -> x /y;
		
		// Add Multiply two numbers using lambda expression
		System.out.println("Addition is " + add.calculate(5,6));
		System.out.println("Multiplication is " +multiply.calculate(20,2));
		System.out.println("Division is	" +divide.calculate(20, 10));
		
		// Passing Lambda Expression as function Parameter to Print Result using Static Function
		IMathFunction.printResult(6,3, "Addition", add);
		IMathFunction.printResult(6,3,"Multiplication", multiply);
		IMathFunction.printResult(6,3,"Division",divide);
	}
}
