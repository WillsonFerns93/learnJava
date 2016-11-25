package misc;
class fromDecimal_CF{
	public static void main(String arg[])
	{
		System.out.println("base=2, n=13 : "+fromDecimal(2, 13)); //Expected Output : "1101"
		System.out.println("base=3, n=66 : "+fromDecimal(3, 66)); //Expected Output : "2110"
	}
	
	static String fromDecimal(int base, int n) {
		String sum="";
		    while(n>0)
		    {
		        int s=n%base;
		        sum+=String.valueOf(s);
		        n/=base;
		    }
		  //using StringBuffer
		  //String reverse = new StringBuffer(sum).reverse().toString();
		    String reverse = new StringBuilder(sum).reverse().toString();
		   
		   /** Using for loop
		    String reverse = "";
	        for(int i = sum.length() -1; i>=0; i--){
	            reverse = reverse + sum.charAt(i);
	        }
			*/
		    return reverse;
		}
}