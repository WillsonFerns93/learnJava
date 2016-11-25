/**
 * program that accepts an array of strings as input, and outputs the alphabet 
 * that appears the most number of times
 */

import java.util.Scanner;

class frequentAlphabet{
	public static void main(String args[])
	{
		//take input from the user
		@SuppressWarnings("resource")
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a string");
		String user_input=s1.nextLine();
		System.out.println(user_input);
		
		String caps_input = user_input.toUpperCase();//capitalize the input to ignore case of text used
		
		int len = caps_input.length();
        int[] arr=new int[len]; //array to store the alphabets count
        int count=1;
     // char[] c=caps_input.toCharArray(); 
        char[] c= new char[len];
        
        //Initialize the char array c with user input
        for(int i = 0; i <len; i ++)
            c[i] = caps_input.charAt(i);
        
        for(int i=0;i<len;i++)	//initialze the array with 0
        	arr[i]=0;
        
		for(int i= 0;i<len;i++){
	        for(int j=0;j<len;j++){
	            if(c[i]==c[j]){
	                arr[i]= count++; //incremented count of each alphabet stored in arr[] array
	            }
	        }  
	        count=1;
	    }
		//compare counts to find the largest count
		int max=0;
	    for(int k=0;k<len;k++){
	        if(arr[k]>arr[max])
	            max=k;
	    }
        System.out.println("The character that appears the most number of times is " +c[max]+ " and appears " +arr[max]+ " times");
	}
}



