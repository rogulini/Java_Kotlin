package main;
import java.util.Scanner;

public class main {
	
	
	private static String inputST() {
		String InputSomethings = "";
		Scanner ins = new Scanner(System.in);
		InputSomethings = ins.nextLine();
		return InputSomethings;
	}
	
	public static void main(String[] args) {
		String ReadVar = "";
		System.out.println("����� ���-������ � ����������...");
		ReadVar = inputST();
		System.out.println("�� ����:"+ReadVar);
	}

}
