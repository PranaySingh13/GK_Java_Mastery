package com.gk.languageFundamentals;

public class Arrays {

	public static void main(String[] args) {
		/*
		 * Introduction
		 * 
		 * An array is an indexed collection of fixed number of homogeneous data
		 * elements.
		 * 
		 * The main advantage of arrays is we can represent multiple values with the
		 * same name so that readability of the code will be improved.
		 * 
		 * But the main disadvantage of arrays is: Fixed in size that is once we created
		 * an array there is no chance of increasing or decreasing the size based on our
		 * requirement that is to use arrays concept compulsory we should know the size
		 * in advance which may not possible always.
		 * 
		 * We can resolve this problem by using collections.
		 */

		/*
		 * Array declarations: Single dimensional array declaration:
		 * 
		 * int[] a;//recommended to use because name is clearly separated from the type
		 * 
		 * At the time of declaration we can't specify the size otherwise we will get
		 * compile time error.
		 */
		
		//All are valid.(3 ways)
		int[] arr1;
		int []arr2;
		int arr3[];
		
		//int[4] arr4;
		
		/* Two dimensional array declaration: */
		
		//All are valid.(6 ways)
		int[][] arr5;
		int [][]arr6;
		int[] []arr7;
		int[] arr8[];
		int []arr9[];
		int arr10[][];
		
		/* Three dimensional array declaration: */
		//All are valid.(10 ways)
		int[][][] arr11;
		int [][][]arr12;
		int[] [][]arr13;
		int[] []arr14[];
		int[] arr15[][];
		int [][]arr16[];
		int []arr17[][];
		int [][]arr18[];
		int[][] []arr19;
		int arr20[][][];
		
		/*
		 * Note : If we want to specify the dimension before the variable that rule is
		 * applicable only for the 1st variable. Second variable onwards we can't apply
		 * in the same declaration.
		 */	
		//int []a,[]b;
		
		/*
		 * Array construction: Every array in java is an object hence we can create by
		 * using new operator.
		 * 
		 * Rule 1: At the time of array creation compulsory we should specify the size
		 * otherwise we will get compile time error.
		 * 
		 */
		int[] arr21=new int[4];
		
		//int[] arr22=new int[]; //C.E:array dimension missing
		
		/*
		 * Rule 2: It is legal to have an array with size zero in java.
		 */
		int[] arr23=new int[0];
		
		/*
		 * Rule 3: If we are taking array size with -ve int value then we will get
		 * runtime exception saying NegativeArraySizeException.
		 */
		//int[] arr24=new int[-4];
		//System.out.println(arr24.length);//R.E:NegativeArraySizeException
		
		/*
		 * Rule 4: The allowed data types to specify array size are byte, short, char,
		 * int. By mistake if we are using any other type we will get compile time
		 * error.
		 */
		
		int[] arr25=new int[10];
		int[] arr26=new int['A'];
		byte b=20;
		int[] arr27=new int[b];
		short s=20;
		int[] arr28=new int[s];
		
		//int[] arr29=new int[10L];
		//int[] arr30=new int[12.3];
		
		/*
		 * Rule 5: The maximum allowed array size in java is maximum value of int size
		 * [2147483647].
		 */
		int[] arr31=new int[Integer.MAX_VALUE];
		//int[] arr32=new int[Integer.MAX_VALUE+1];
		System.out.println(arr31.length);
		//System.out.println(arr32.length);//RE : OutOfMemoryError.
		
		/*
		 * Multi dimensional array creation: In java multidimensional arrays are
		 * implemented as array of arrays approach but not matrix form. The main
		 * advantage of this approach is to improve memory utilization.
		 */
		int[][] arr33=new int[2][];
		arr33[0]=new int[3];
		arr33[1]=new int[2];
		
		int[][][] arr34=new int[2][][];
		arr34[0]=new int[3][];
		arr34[0][0]=new int[1];
		arr34[0][1]=new int[2];
		arr34[0][2]=new int[3];
		
		arr34[1]=new int[2][2];
		
		String[] str = { "A", "B" };
		for (int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		
	}

}
