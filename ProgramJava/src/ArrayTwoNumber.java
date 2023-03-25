import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayTwoNumber {

	public static void main(String[] args) {
		
		// Get the Array of numbers between two numbers in Java....
		// a = 1,  b = 4 ==> [1,2,3,4]
		
		// 1 to 4 --> [1,2,3,4]
		// 1 to 10 --> [1,2,3,4,5,6,7,8,9,10]
		
		System.out.println(Arrays.toString(between(1,4)));
		System.out.println(Arrays.toString(between(1,10)));
	}
	
	public static int[] between(int a, int b)
	{
		return IntStream.rangeClosed(a, b).toArray();
		
	}

}
