
public class Instantiate {

	public static void main(String[] args) {
		// 1. Create myArray here using an initializer list

		
		
		
		// Uncomment below when you have created the array
		//print(myArray);
		
		
		// 2. Create myArray2 here using row and column numbers


	
		// Uncomment below when you have created the array
		//print2(myArray2);

	}
	
    //Do not make alterations to this method!
    public static void print(int[][] array)
    {
        for(int[] row: array)
        {
            for(int num: row)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
    public static void print2(String[][] array)
    {
        for(String[] row: array)
        {
            for(String s: row)
            {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

}
