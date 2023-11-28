/*
 * Objetivo: Serie = (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N) 
 * Autor: Rafhael Silva de Brito
 */
import javax.swing.JOptionPane;
public class Ex_04 {
	public static void main(String args[]) {
		double num, x=1;
		num = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
		System.out.println("Serie = " +Fserie(num,x));
	}
	
	static double Fserie(double n, double x) {
		double serie = 0;
		if(n<1) {
			return n/x;
		}else {
			serie = (n / x) +Fserie(n - 1, x + 1);
			return serie;
			}
		
	}

}
