package com.gk.languageFundamentals;

public class ReservedWords {

	enum Level {
		LOW, MEDIUM, HIGH
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/*
		 * In java some identifiers are reserved to associate some functionality or
		 * meaning.
		 */

		/*
		 * Reserved words for data types: (8) 1) byte 2) short 3) int 4) long 5) float
		 * 6) double 7) char 8) boolean
		 * 
		 * Reserved words for flow control:(11) 1) if 2) else 3) switch 4) case 5)
		 * default 6) for 7) do 8) while 9) break 10) continue 11) return
		 * 
		 * Keywords for modifiers:(11) 1) public 2) private 3) protected 4) static 5)
		 * final 6) abstract 7) synchronized 8) native 9) strictfp(1.2 version) 10)
		 * transient 11) volatile
		 * 
		 * Keywords for exception handling:(6) 1) try 2) catch 3) finally 4) throw 5)
		 * throws 6) assert(1.4 version)
		 * 
		 * Class related keywords:(6) 1) class 2) package 3) import 4) extends 5)
		 * implements 6) interface
		 * 
		 * Object related keywords:(4) 1) new 2) instanceof 3) super 4) this
		 */

		/*
		 * Void return type keyword: If a method won't return anything compulsory that
		 * method should be declared with the void return type in java but it is
		 * optional in C++.
		 */

		/*
		 * Unused keywords: goto: Create several problems in old languages and hence it
		 * is banned in java. Const: Use final instead of this. By mistake if we are
		 * using these keywords in our program we will get compile time error.
		 */

		/*
		 * Reserved literals: 1) true values for boolean data type. 2) false 3)
		 * null----------------- default value for object reference.
		 */

		/*
		 * Enums An enum is a special "class" that represents a group of constants
		 * (unchangeable variables, like final variables).
		 * 
		 * The member enum Level can only be defined inside a top-level class or
		 * interface or in a static context
		 * 
		 * You can access enum constants with the dot syntax: Enum is short for
		 * "enumerations", which means "specifically listed".
		 */
		Level myLevel = Level.HIGH;

		/*
		 * Conclusions :
		 * 
		 * 1. All reserved words in java contain only lowercase alphabet symbols.
		 * 
		 * 2. New keywords in java are: 3. strictfp-----------1.2v 4.
		 * assert-------------1.4v 5. enum--------------1.5v
		 * 
		 * 6. In java we have only new keyword but not delete because destruction of
		 * useless objects is the responsibility of Garbage Collection.
		 * 
		 * 7. instanceof but not instanceOf
		 * 
		 * 8. strictfp but not strictFp
		 * 
		 * 9. const but not Constant
		 * 
		 * 10. syncronized but not syncronize
		 * 
		 * 11. extends but not extend
		 * 
		 * 12. implements but not implement
		 * 
		 * 13. import but not imports
		 * 
		 * 14. int but not Int
		 */

	}

}
