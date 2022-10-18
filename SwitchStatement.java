package javaBasic;
import java.util.*;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();
		switch(button) {
		case 1:
			System.out.println("pizza");
			break;
		case 2:
			System.out.println("Speed");
			break;
		case 3:
			System.out.println("Pasta");
			break;
		default:
			System.out.println("wake up !");
		}

	}

}
