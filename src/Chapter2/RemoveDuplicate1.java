package Chapter2;

public class RemoveDuplicate1 {
	public static void main(String args[])
	{
		char[] input = {1,1,2};
		
		char[] output = removeDuplicate(input);
		
		for(int i=0;i<output.length;++i)
		{
			System.out.print("  " + i);
		}
		
	}
	public static char[] removeDuplicate(char[] input)
	{
		int index = 0;
		int inputLength = input.length;
		
		for(int i=1; i<inputLength;++i)
		{
			if(input[index] != input[i])
			{
				index++;
				input[index] = input[i];
			}
		}
		char[] output = new char[index+1];
		for(int i=0; i<index; ++i)
		{
			output[i] = input[i];
		}
		
		return output;
	}
}
