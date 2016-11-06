package ch04_Types_Values_and_Variables;

class p1_integerOp
{
	public static void main(String args[])
	{
		int i = 1000000, a=10, b=20;
		
		//Numerical comparison <, <=, >, >= 
		if (a<b)
			System.out.println("Numerical comparison : b is greater");
		
		//numerical equity ==,  !=
		System.out.println("\nNumerical equity");
		if(a==b)
			System.out.println("both numbers are equal");
		else
			System.out.println("not equal");
		
		//Multiplicative operators *, /, %
		System.out.println("\nMultiplicative operators : a ="+a+"\t b = "+b);
		System.out.println("* = "+ (a*b) );
		System.out.println("/ = "+ ((float)a/(float)b)); //type casting int -> float
		System.out.println("% = "+ (a%b));
		
		//Additive operators +, -
		System.out.println("\nAdditive operators : a ="+a+"\t b = "+b);
		System.out.println("+ = "+ (a+b));
		System.out.println("- = "+ (a-b));
		
		//Increment operators ++ prefix, postfix
		System.out.println("\nIncrement operators : a ="+a+"\t b = "+b);
		System.out.println("Prefix Increment "+ (++a));
		System.out.println("Postfix Increment "+ (a++));
		//above operation can be used with decrement operator --

		//Signed and unsigned shift operators <<, >>, >>> (not working)
		System.out.println("\nShift operators : a ="+a+"\t b = "+b);
		System.out.println(">> = "+ (a>>32));
		System.out.println("<< = "+ (a<<32));
		
		//concatenate String type with a integer type, resulting in a String value
		System.out.println("String concatenation : ");
		String s1="hello Mr.";
		int id=11002;
		System.out.print(s1+" + "+id+" : ");
		s1=s1+id;
		System.out.println(s1);
	}
}