import java.util.Scanner;
public class ChessPiece{
	int x, y;
	String color, type;
	Scanner inputDevice = new Scanner(system.in);
	
	public static void getPosition(){
		System.out.println("the x position is; " + x + ". The y position is: "+ y);
		}
	public setPosition(int x, int y){
		//x = inputDevice.nextLine();
		System.out.println ("Set the x position: " + x);	
		//y = inputDevice.nextLine();
		System.out.println ("Set the y position: " + y);
		return x, y;
	}
	 public static void getColor(){
		 System.out.println("the piece's color is: " + color);
	 }
	 public setColor(String color){
		 //color = inputDevice.nextLine();
		 System.out.println("Set thee color: " + color);
		 return color;
	 }
	 public static void getType (){
		System.out.println ("The selected Piece type is: " + type);
	 }
	 public setType (String type){
		//type = inputDevice.nextLine();
		System.out.println("The piece type is: " + type);
		return type;
	}
	public static void pieceInfo(){
		getPosition();
		getColor();
		getType();
	}
}
