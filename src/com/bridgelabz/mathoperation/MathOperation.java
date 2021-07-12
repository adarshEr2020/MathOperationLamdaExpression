package com.bridgelabz.mathoperation;

// creating functional interface
@FunctionalInterface
interface IMathFunction {
	int calculate(int a, int b);
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
		System.out.println("Dividion is	" +divide.calculate(20, 10));
	}
}
