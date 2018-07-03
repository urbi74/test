package abfrage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bitte Zahl oder e=Abbruch eingeben:" );
        Scanner scanner = new Scanner(System.in);
        while (true){
            String eingabe = scanner.next();  //Zeile 12-14 kann für jede Case Abfrage verwendet werden
            if(eingabe.equals("e")) break;
			int zahl = Integer.parseInt(eingabe);			
			
			System.out.println("Hier gehts mit der Zahl weiter: " + zahl);
			
        }
        
        System.out.println("Bye...");
        scanner.close(); 
		
	}

}
