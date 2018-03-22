import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		Rectangle a= new Rectangle(13, 4);
		Rectangle b= new Rectangle(10);
		Rectangle c= a;
		
		System.out.println(a + "\n" + b + "\n" + c);
		
		a.setSidesCube(10);
		
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a.sameSides(b));
		*/
		Random rand = new Random();
		
		Rectangle[] rectangleArray= new Rectangle[10];
		for (int i = 0; i < rectangleArray.length; i++) {
			rectangleArray[i]= new Rectangle(rand.nextInt(9)+2,rand.nextInt(9)+2);
			System.out.println(rectangleArray[i]);
		}
		
		Rectangle min= new Rectangle(11,11);
		for (int i = 0; i < rectangleArray.length; i++) {
			if (min.isBigger(rectangleArray[i])) {
				min = rectangleArray[i];
			}	
		}
		System.out.println("min: "+ min);
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a and b");
		int aSide= scanner.nextInt();
		int bSide= scanner.nextInt();
		scanner.close();
		Rectangle userR= new Rectangle(aSide, bSide);
		
		int counterSmaller= 0;
		for (int i = 0; i < rectangleArray.length; i++) {
			if (userR.isBigger(rectangleArray[i])) {
				counterSmaller++;
			}
		}
		System.out.println("smaller rectangles: "+ counterSmaller);
		
		int counterSame= 0;
		for (int i = 0; i < rectangleArray.length; i++) {
			if (userR.sameSides(rectangleArray[i])) {
				counterSame++;
			}
		}
		if (counterSame>0){
			System.out.println("matching rectangles: "+ counterSame);
		} else System.out.println("no matching rectangles");
	}
}
