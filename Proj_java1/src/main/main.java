package main;
import java.util.Scanner;

public class main {
	
	
	private static String inputST() {
		String InputSomethings = "";
		Scanner ins = new Scanner(System.in);
		try {
			InputSomethings = ins.nextLine();
			return InputSomethings;
		} finally {
			ins.close();
		}
	}
	
	public static void main(String[] args) {
		String ReadVar = "";
		System.out.println("Введи что-нибудь с клавиатуры...");
		ReadVar = inputST();
		System.out.println("Ты ввел:"+ReadVar);
	}

}
