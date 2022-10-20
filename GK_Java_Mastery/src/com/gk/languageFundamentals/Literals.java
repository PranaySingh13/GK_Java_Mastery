package com.gk.languageFundamentals;

public class Literals {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/*
		 * Any constant value which can be assigned to the variable is called literal.
		 */

		int x = 10;

		/*
		 * Integral Literals: For the integral data types (byte, short, int and long) we
		 * can specify literal value in the following ways.
		 */

		/* 1) Decimal literals: Allowed digits are 0 to 9. */

		int x1 = 10;
		System.out.println(x1);// 10
		/*
		 * 2) Octal literals: Allowed digits are 0 to 7. Literal value should be
		 * prefixed with zero.
		 */
		int x2 = 0777;
		System.out.println(x2);// 511
		// int x4 = 0778; //out of range

		/*
		 * 3) Hexa Decimal literals:  The allowed digits are 0 to 9, A to Z.  For the
		 * extra digits we can use both upper case and lower case characters.  This is
		 * one of very few areas where java is not case sensitive.  Literal value
		 * should be prefixed with 0x(or)0X.
		 */

		int x3 = 0X10;
		System.out.println(x3);// 16

		int x5 = 0XFACE;
		int x7 = 0Xface;
		System.out.println(x5 + " " + x7);// 64206 64206

		int x6 = 0XFFFF;
		System.out.println(x6);// 65535

		// C.E: (invalid
		// int x7 = 0XFFFG;

		/*
		 * Floating Point Literals:
		 * 
		 * Floating point literal is by default double type but we can specify
		 * explicitly as float type by suffixing with f or F.
		 * 
		 * We can specify explicitly floating point literal as double type by suffixing
		 * with d or D.
		 */

		double d = 123.456;
		float f1 = 123.456f;

		// C.E:possible loss of precision(invalid)
		// float f2=123.456;

		/*
		 * We can specify floating point literal only in decimal form and we can't
		 * specify in octal and hexadecimal forms.
		 */
		double d1 = 123.456;

		// it is treated as decimal value but not octal
		double d2 = 0123.456;

		// C.E:malformed floating point literal(invalid
		// double d3=0X123.456;

		/*
		 * We can assign integral literal directly to the floating point data types and
		 * that integral literal can be specified in decimal , octal and Hexa decimal
		 * form also.
		 */
		double d3 = 0Xface;
		System.out.println(d3);// 64206.0

		/*
		 * But we can't assign floating point literal directly to the integral types.
		 */
		// int x8=10.34;

		/*
		 * We can specify floating point literal even in exponential form
		 * also(significant notation).
		 */
		double d4 = 10e2;
		System.out.println(d4);// 1000.0
		float f3 = 10e2f;
		System.out.println(f3);// 1000.0

		/*
		 * Boolean literals: The only allowed values for the boolean type are true (or)
		 * false where case is important. i.e., lower case
		 */

		boolean b1 = true;
		boolean b2 = false;

		// C.E:incompatible types(invalid)
		// boolean b3=10;
		// boolean b4=10.23;

		/*
		 * Char literals: 1) A char literal can be represented as single character
		 * within single quotes.
		 * 
		 * 2) We can specify a char literal as integral literal which represents Unicode
		 * of that character. We can specify that integral literal either in decimal or
		 * octal or hexadecimal form but allowed values range is 0 to 65535.
		 * 
		 * 3) We can represent a char literal by Unicode representation which is nothing
		 * but (4 digit hexa-decimal number) .
		 */
		char c1 = 'a';

		// C.E:incompatible types(invalid)
		// char c2=a;
		// char c3="a";
		// char c4='Abc';

		char c5 = 96;
		char c6 = 0XAABB;
		char c7 = 0111;

		System.out.println(c5 + " " + c6 + " " + c7);// ` ? I

		char c8 = '\uaabb';
		System.out.println(c8);// ?

		/*
		 * String literals: Any sequence of characters with in double quotes is treated
		 * as String literal.
		 */

		String s1 = "General Knowledge";

		/*
		 * 1.7 Version enhansements with respect to Literals : The following 2 are
		 * enhansements 1. Binary Literals 2. Usage of '_' in Numeric Literals
		 */

		/*
		 * Binary Literals : For the integral data types untill 1.6v we can specified
		 * literal value in the following ways 1. Decimal 2. Octal 3. Hexa decimal But
		 * from 1.7v onwards we can specified literal value in binary form also. The
		 * allowed digits are 0 to 1. Literal value should be prefixed with Ob or OB .
		 */
		int x9 = 0b1111;
		System.out.println(x9);// 15

		/*
		 * Usage of _ symbol in numeric literals :
		 * 
		 * From 1.7v onwards we can use underscore(_) symbol in numeric literals.
		 * 
		 * The main advantage of this approach is readability of the code will be
		 * improved At the time of compilation ' _ ' symbols will be removed
		 * automatically.We can use more than one underscore symbol also between the
		 * digits.We should use underscore symbol only between the digits
		 */

		float f2 = 123.45__6_789_123_456_789f;// we can see it will get round off.
		System.out.println(f2);// 123.45679

		double d5 = 1__23.456_789_123_456_789;
		System.out.println(d5);// 123.45678912345679

		// invalid
		// double d6=123_.456;
	}

}
