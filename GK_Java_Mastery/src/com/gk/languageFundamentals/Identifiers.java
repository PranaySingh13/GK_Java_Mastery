package com.gk.languageFundamentals;

public class Identifiers {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/*
		 * A name in java program is called identifier. It may be class name, method
		 * name, variable name or label name.
		 */

		/* Rules to define the java identifiers */

		/*
		 * 1. The only allowed characters in java identifiers are a to z, A to Z, 0 to
		 * 9, _(underscore), @.
		 * 
		 * 2. if we are using any other character we will get compile time error.
		 */

		int total_NUMBER1;// valid
		// int total#; //invalid

		/*
		 * 3. Identifiers are not allowed to starts with the digits.
		 * 
		 * 4. Java identifiers are case sensitive up course java language itself treated
		 * as case sensitive language.
		 */

		int ABC123;// valid
		// int 123ABc;//invalid

		int number = 10;
		int NUMBER = 20;
		int NumbeR = 30;

		/*
		 * 5. There is no length limit for java identifiers but it is not recommended to
		 * take more than 15 lengths.
		 * 
		 * 6. We can't use reserved words as identifiers.
		 * 
		 */

		// int if=10;//invalid

		/*
		 * 7. All predefined java class names and interfaces names we use as
		 * identifiers.
		 */

		int String = 10;
		System.out.println(String);// 10

		/*
		 * Even though it is legal to use class names and interface names as identifiers
		 * but it is not good programming practice.
		 */
	}

}
