package Skillbuilders;

public class FriendslList 
{

	public static void main(String[] args) 
	{
		
		//Declare and then allocate space
		//String[] squares = new String[5]; //(if you don't know values)
		int[] squares = new int[11];
		
		//To fill the array
		for(int i = 0; i < squares.length; i++)
		{
			squares[i] = i * i;
		}
		
		
		//To display values from the array
		for(int val: squares)
		{
			System.out.println(val);
		}
		
		//Initialize with values
		//String[] friends = {"Kermit", "Vlad", "Ahmed", "Lisa", "Gurshaan"};
	} 

}
