package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO2 {
	public static void main(String[] args) {
		for(int i = 0; i < 5 ; i++) {
			int poeng;
			do{
				poeng = Integer.parseInt(showInputDialog("Poeng :"));
				if(poeng < 0 || poeng > 100) {
					System.out.println("Poengsum er ugyldig");
				}
				
			}while(poeng < 0 || poeng > 100); 
				
				
				if(40>poeng) {
					System.out.println("F");
				}else if(50>poeng) {
					System.out.println("E");
				}else if(60>poeng) {
					System.out.println("D");
				}else if(80>poeng) {
					System.out.println("C");
				}else if(90>poeng) {
					System.out.println("B");
				}else if(100>=poeng) {
					System.out.println("A");
				}else {
					System.out.println("Ugyldig verdi");
				}
			
			
		}
		
	}

}
