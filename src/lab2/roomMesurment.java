package lab2;
import java.util.Scanner;
public class roomMesurment {

	
	public static void main(String[] args) {

		System.out.println("what is the length of the room?");
		Scanner length = new Scanner(System.in);
		float newLength = length.nextFloat();
		System.out.println("what is the width of the room?");
		Scanner width = new Scanner(System.in);
		float newWidth = width.nextFloat();
		Scanner height = new Scanner(System.in);
		System.out.println("what is the height of the room?");
		float newHeight = height.nextFloat();
		Scanner areYouDone = new Scanner(System.in);
		System.out.println("the area of your room is " + newLength * newWidth);
		System.out.println("the perimeter of yor room is " + (newHeight * newWidth) *2 );
		System.out.println("The volume of your room is  " + newLength * newWidth * newHeight );
		System.out.println("do you want to measure another room?");
		Scanner newRoom = new Scanner(System.in);
	}

}
