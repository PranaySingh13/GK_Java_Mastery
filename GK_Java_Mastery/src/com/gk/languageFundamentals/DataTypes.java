package com.gk.languageFundamentals;

public class DataTypes {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/*
		 * Ever variable has a type, every expression has a type and all types are
		 * strictly defined.
		 * 
		 * Java is pure object oriented programming or not? Java is not considered as
		 * pure object oriented programming language because several oops features (like
		 * multiple inheritance, operator overloading) are not supported by java
		 * moreover we are depending on primitive data types which are non objects.
		 */

		/*
		 * Except Boolean and char all remaining data types are considered as signed
		 * data types because we can represent both "+ve" and"-ve" numbers.
		 */

		/*
		 * Integral data types : Byte:
		 * 
		 * Size: 1byte (8bits) Maxvalue: +127 Minvalue:-128 Range:-128to 127[-27 to
		 * 27-1]
		 * 
		 * The most significant bit acts as sign bit. "0" means "+ve" number and "1"
		 * means "–ve" number.  "+ve" numbers will be represented directly in the
		 * memory whereas "–ve" numbers will be represented in 2's complement form.
		 */

		byte b1 = 10;

		// C.E:possible loss of precision cases
		// byte b2=130;
		// byte b3=10.4;
		// byte b4="abc";
		// byte b5=true;

		/*
		 * byte data type is best suitable if we are handling data in terms of streams
		 * either from the file or from the network.
		 */

		/*
		 * Short: The most rarely used data type in java is short.
		 * 
		 * Size: 2 bytes(16 bits) Range: -32768 to 32767(-2^15 to 2^15-1)
		 */
		short s1 = 100;

		// C.E:possible loss of precision cases
		// short s2=32768;
		// short s3=true;
		// short s4=10.56;
		// short s5="abc";

		/*
		 * Int: This is most commonly used data type in java. Size: 4 bytes(32 bits)
		 * Range:-2147483648 to 2147483647 (-2^31 to 2^31-1)
		 */
		int i1 = 100;

		// C.E:possible loss of precision cases
		// int i2=10.5;
		// int i3=true;

		/*
		 * long: Whenever int is not enough to hold big values then we should go for
		 * long data type. Size: 8 bytes(64 bits) Range:-2^63 to 2^63-1
		 * 
		 * Long numbers are suffix with l or L but it is recommended to use L.
		 */
		long l1 = 123_456_789L;
		System.out.println(l1);

		/*
		 * Note: All the above data types (byte, short, int and long) can be used to
		 * represent whole numbers. If we want to represent real numbers then we should
		 * go for floating point data types.
		 */

		/*
		 * Floating Point Data types:
		 * 
		 * Floating point literal is by default double type but we can specify
		 * explicitly as float type by suffixing with f or F.
		 * 
		 * Float: If we want to 5 to 6 decimal places of accuracy then we should go for
		 * float.Size:4 bytes.Range:-3.4e38 to 3.4e38.float follows single precision.
		 * 
		 * double: If we want to 14 to 15 decimal places of accuracy then we should go
		 * for double.Size:8 bytes.Range:-1.7e308 to1.7e308.double follows double
		 * precision.
		 */

		float f1 = 123.456f;
		float f2 = 123.456_789_123_456_789f;// we can see it will get round off.
		System.out.println(f1 + " " + f2);// 123.456 123.45679

		double d = 123.456_789_123_456_789;
		System.out.println(d);// 123.45678912345679

		/*
		 * boolean data type: Size: Not applicable (virtual machine dependent) Range:
		 * Not applicable but allowed values are true or false.
		 */

		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println(isTrue + " " + isFalse);

		// C.E:incompatible types
		// boolean num=10;

		/*
		 * Char data type: In java we are allowed to use any worldwide alphabets
		 * character and java is Unicode based and no.Of unicode characters are > 256
		 * and <= 65536 to represent all these characters one byte is not enough
		 * compulsory we should go for 2 bytes. Size: 2 bytes Range: 0 to 65535
		 */
		char c1 = 96;
		System.out.println(c1);// `
		// C.E:possible loss of precision
		// char c2 = 65536;

		/* The default value for the object references is "null". */

	}

}
