package misc;
class centuryFromYear_CF{
	public static void main(String arg[])
	{
		int yr=2010,res=-1;

		res=centuryFromYear(yr);		
		if(res==-1)
			System.out.println("Enter valid year eg.1200");
		else
			System.out.println("This year belongs to "+res+" century.");
	}

	static int centuryFromYear(int year) {
		return (year - 1) / 100+1;
		//return Math.floor(year - 1) / 100+1; //more accurate
	}
}