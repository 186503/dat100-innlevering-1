package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO3 {
	public static void main(String[] args) {
		int a = Integer.parseInt(showInputDialog("Skriv et heltall :"));
		int n = 1;
		int x = a;
		
		while(a>1) {
			
			n *= a;
			a--;
		}
		System.out.println(x + " != " + n);

	}
}
