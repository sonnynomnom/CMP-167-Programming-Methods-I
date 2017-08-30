// Granit Dedushi
// CMP 167
// BWT

import java.util.Scanner;	
import java.util.Arrays;
import java.util.List;

public class BWT 
{	
	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		
        System.out.println("Encrypt (Press 1) or Decrypt (Press 2) ");
		int startTest = in.nextInt();
		
		in.nextLine();      // this is to offset empty entry when pulling next input
        
		//********************* START OF ENCRYPTION CODE **************************************
		
        if (startTest == 1)
		{
            
			System.out.println("Enter something you would like to encrypt: ");
			String inString = in.nextLine();
			System.out.println("Hello");

			// creating a size value to use in array
            // SIZE will be the amount of characters in the original input
			final int SIZE = inString.length();
			
			// creates an array of strings, for every letter in input, there is a row in array
			String[] rotations = new String[SIZE];
            
			// this is to take result from lastChars
			String result = "";

			// generate the transfromation process and print first stage of transform
			genRotations(inString, rotations);
            
			System.out.println("Encryption process initializing:\n ");
			printStringArray(rotations, SIZE);
			
			// sorts the array of strings lexicographically and print the sorted array
			Arrays.sort(rotations);
			
            System.out.println("Initializing Mixer:\n");
			printStringArray(rotations, SIZE);
			
			// take last character of each sorted string to get the final transformed string
			result = lastChars(rotations, SIZE);
			
            System.out.println("COPY DOWN EVERYTHING THAT IS IMMEDIATELY AFTER AND " +
			"BEFORE ARROWS (INCLUDING SPACES) \nDO NOT LOSE THE STRING OR KEY OR YOU WONT BE ABLE TO DECODE!");
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("YOUR FINAL STRING IS:----->" + result + "<-----");			
			//getting the key to original input
			findKey(inString, rotations);
        
        }

		//*********************** START OF DECRYPTION CODE ************************************
        
		else if (startTest == 2) 
		{
			System.out.println("Enter encrypted string: ");
			String encString = in.nextLine();
			System.out.println("Enter key value: ");
			int encKey = in.nextInt();
            
			// Input Validation, index key must be equal to or greater than 0
			while (encKey < 0)
			{
				System.out.println("Your index value must be positive, Enter Index Again.");
				encKey = in.nextInt();
			}
			
			final int SIZE = encString.length();
			
			// creates a new array of strings same size as encString
			String[] revRotations = new String[SIZE];
			String result;
			
			// placeholder to remove null from decrypted string
			// this will make the sorted array into list which I will then print
			List<String> remNull;
			
			// Runs once for each stage
			for (int cycles = 0; cycles < encString.length(); cycles++)
			{
				moveFront(encString, revRotations);
				Arrays.sort(revRotations);
				remNull = Arrays.asList(revRotations);
				System.out.println("Stage " + (cycles+1) + "\n");
				for (int i = 0; i < SIZE; i++) 
				{
					String temporary = remNull.get(i);
					int temporaryInt = temporary.length()-4;
					temporary = temporary.substring(0, temporaryInt);
					System.out.println(temporary);
				}
				System.out.println();
			}
			
			System.out.println("DECRYPTION COMPLETE! \n \nCHECK RESULTS BELOW");
			System.out.println("| | | | | | | | | | \nV V V V V V V V V V");
			// converting to list and then printing a certain item from list
			List<String> decrypt = Arrays.asList(revRotations);
			String temp = decrypt.get(encKey);
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("AT INDEX NUMBER: " + encKey + "");
			System.out.println("THE DECRYPTED STRING: " + temp.substring(0, SIZE));				
			System.out.println("-----------------------------------------------------------------------------");
			
		}
		else 
		{
			System.out.println("Start me up again when you are ready to encrypt or decrypt.");
		}
	}
    
	//***************START OF ENCRYPTION METHODS***************

	/*Move first letter of previous string to end. Do this i(length of word) times.		
	@param - source is the input string to start transform
	@param - s is string array that will store new transformed strings
	*/
	public static void genRotations(String source, String[] s) 
	{
		s[0] = source;
		for (int i=1; i < source.length(); i++)
		{
			s[i] = s[i-1].substring(1) + s[i-1].charAt(0);
		}
	}
    
	/*print the string array to see transformation
	@param - s is string array that will be printed
	@param - SIZE is the number of rows you would like array to be
	*/
	public static void printStringArray(String[] s, int SIZE) 
	{
	//start at 0 index to print all rows
		for (int i=0; i < SIZE; i++)
		{
			System.out.println(s[i]);
		}
		System.out.println();
	}
    
	/*find the row that matches to original input so we can decode
	@param - s is the string you would like to find
	@param - a is the string array to search through
	*/
	public static void findKey(String s, String[] a) 
	{
		int key;
		for (int i=0; i < s.length(); i++)
		{
			String match = a[i];
				while (match == s)
				{
					key = i;
					System.out.println("YOUR INDEX KEY IS:----->" + key + "<-----");
					System.out.println("----------------------------------"
					+ "-------------------------------------------");
					return;
				}
		}
	}
    
	/*takes last character of each row in final sorted array and creates a word with them	
	@param - s is string array to search through
	@param - SIZE is the length of original string
	@return - result, which is a word made from last letter of each subsequent row
	*/
	public static String lastChars(String[] s, int SIZE) 
	{
		String result = "";
		for (int i=0; i < SIZE; i++)
		{
			result = result + s[i].charAt(SIZE-1);
		}
		return result;
	}
    
	//***************START OF DECRYPTION METHODS***************
	
	/*inputs the column letter of encString as the corresponding row in array
	@param - s is the encrypted string
	@param - a is the string array to form which will lead back to original transform
	*/
	public static void moveFront(String s, String[] a) 
	{
		for (int i = 0; i < s.length(); i++)
		{
			a[i] = s.substring(i, i+1) + a[i];
		}
	}
}