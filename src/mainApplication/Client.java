package mainApplication;

import java.util.Scanner;

import MainEngine.MainEngine;


public class Client
{
	public static void main(String[] args)
	{
		MainEngine program = new MainEngine();
		Scanner input = new Scanner(System.in);
		int loadOption;
		int ID;
		int printOption;
		String onomaArxeiou;
		System.out.println("Gia na fortosei plhrofories tainion, pata 1");
		System.out.println("Gia na kaneis exit apo to program, pata 2");
		loadOption = input.nextInt();
		if(loadOption == 2){System.out.println("Bye Bye");System.exit(0);}
		else{
			System.out.println("Gia na anazitisei tainia dwse ID");
			ID= input.nextInt();
			System.out.println("Gia arxeio TXT, pata 1");
			System.out.println("Gia arxeio HTML, pata 2");
			System.out.println("Gia arxeio PDF, pata 3");
			System.out.println("Gia na kaneis exit apo to program, pata 4");
			printOption= input.nextInt();
			if(printOption == 4){System.out.println("Bye Bye");System.exit(0);}
			else{
				System.out.println("Dwse onoma arxeiou:");
				onomaArxeiou = input.next();
				program.userOption(ID,onomaArxeiou,printOption);
			}
			
			}
		
	}
}
