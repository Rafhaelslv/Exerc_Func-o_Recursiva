/*
 * Objetivo: Serie = (1/1) + (1/2) + (1/3) + ....+ (1/N)
 * Autor: Rafhael Silva de Brito
 */

import javax.swing.JOptionPane;
public class Ex_03 {
	public static void main (String args[]) {
	double num;
	num = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
	System.out.println("A serie = "+Fserie(num));
	}
	
	static double Fserie(double n) {
		double serie=0, x=0;
		if (x<n) {
			serie = (1 / n) +  Fserie (n-1);
			return serie;
		}else {
			return 0;
			
		}
	 
	}

}
