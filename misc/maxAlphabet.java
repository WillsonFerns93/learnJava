/**
 * program that accepts an array of strings as input, and outputs the alphabet 
 * that appears the most number of times
 */
package misc;
import java.util.Scanner;

class maxAlphabet{
	public static void main(String args[])
	{
		//take input from the user
		@SuppressWarnings("resource")
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a string");
		String user_input=s1.nextLine();
		
		String caps_input = user_input.toUpperCase();//capitalize the input to ignore case of text used
		
		System.out.println(user_input);
		int len = caps_input.length();
        int[] arr=new int[len];
        int count=1;
     // char[] c=caps_input.toCharArray();
        char[] c= new char[len];
        for(int i = 0; i <len; i ++)
        {
            c[i] = caps_input.charAt(i);
        }
        System.out.println("try printing from char array");
        for(int i=0;i<len;i++)
        {
        	System.out.print(c[i]);
        }
        for(int i=0;i<len;i++)
        {	arr[i]=0;
        }
        
		for(int j= 0;j<len;j++){
	        for(int k=0;k<len;k++){
	            if(c[j]==c[k]){
	                arr[j]= count++;
	            }
	        }  
	        count=1;
	    }
		int max=0;
	    for(int z=0;z<len;z++){
	        if(arr[z]>arr[max])
	            max=z;
	    }
        System.out.println("\n"+arr[max]);
        System.out.println("The character that appears the most number of times is "  +c[max]);

	}
}



