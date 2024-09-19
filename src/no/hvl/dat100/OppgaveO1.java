package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv inn bruttoinntekt: ");
        double bruttoinntekt = scanner.nextDouble();
        double trinnskatt = beregnTrinnskatt(bruttoinntekt);
        System.out.printf("Trinnskatt å betale: %.2f kroner%n ", trinnskatt);
    }

    public static double beregnTrinnskatt(double bruttoinntekt) {
        double trinnskatt = 0;
        double[][] trinn = {
            {208050, 0.017},
            {292850, 0.04},
            {670000, 0.136},
            {937900, 0.166},
            {1350000, 0.176}
        };

        if (bruttoinntekt <= trinn[0][0]) {
            return trinnskatt;
        }

        for (int i = 0; i < trinn.length; i++) {
            if (i == 0) {
                if (bruttoinntekt > trinn[i][0]) {
                    trinnskatt += (Math.min(bruttoinntekt, trinn[i + 1][0]) - trinn[i][0]) * trinn[i][1];
                }
            } else if (i == trinn.length - 1) {
                if (bruttoinntekt > trinn[i][0]) {
                    trinnskatt += (bruttoinntekt - trinn[i][0]) * trinn[i][1];
                }
            } else {
                if (bruttoinntekt > trinn[i][0]) {
                    trinnskatt += (Math.min(bruttoinntekt, trinn[i + 1][0]) - trinn[i][0]) * trinn[i][1];
                }
            }
        }

        return trinnskatt;
    }

}
