import java.util.*;

public class pinGuesser {

	public static void main(String args[]) {
		
		String pin="";
		Scanner scan = new Scanner(System.in);
        	pinGenerator Generatore= new pinGenerator("0000");
        	long startTime,endTime;

        	//fine variabili
		
		System.out.println("****4 digits pin guesser****");
		do {
			System.out.print("inserisci un pin di 4 cifre da indovinare:");
			pin = scan.next();
		}while(pin.length()!=4);
		
		scan.close();
		

		startTime = System.currentTimeMillis();
		
		while( ! Generatore.equals(pin)) {

			Generatore.computePin(Generatore.getPinPrec());
		
		}
		
		endTime = System.currentTimeMillis();
		
		System.out.println("pin indovinato! = "+Generatore.getPinPrec());

		System.out.println("Tempo impiegato:" + (endTime - startTime) + " millisecondi");
		

	}//fine main
	
}//fine della classe
