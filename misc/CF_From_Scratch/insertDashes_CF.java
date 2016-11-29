/**
 * 
 */
package misc.CF_From_Scratch;

/**
 * @author Willson
 *
 */
public class insertDashes_CF {
	public static void main(String[] args) {
		String res="";
		res=insertDashes("aba caba");
		System.out.println(res);
		
		res=insertDashes("what is your name");
		System.out.println(res);
	}
	
	static String insertDashes(String inputString) {

	    String[] s=inputString.split(" ");
	    String s1="",temp="";
	   // temp=String.valueOf(s[0]);
	 //   /**
	    for(int i=0;i<s.length;i++)
	    {
	        temp=String.valueOf(s[i]);
	        char[] c=temp.toCharArray();
	        int len=temp.length();
	        temp=String.valueOf(c[0]);
	        for(int j=1;j<len;j++){
	            temp+="-";
	            temp+=String.valueOf(c[j]);
	        }
	        if(i!=0)
	            s1+=" ";
	        s1+=temp;
	        
	    }
	 //   */
	 //temp =String.valueOf(s.length);
	    return s1;
	}


}
