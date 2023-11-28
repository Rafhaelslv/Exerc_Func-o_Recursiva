/*
 * Objetivo: Serie = (N) + (N-1) + (N-2) + ... + (1) 
 * Autor: Rafhael Silva de Brito
 */
import javax.swing.JOptionPane;
public class Ex_02 {
	public static void main(String args[]) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		System.out.println("A serie = " +Fserie(num));
	}
	static int Fserie(int n) {
	int serie=0, x=0;
	if (x<n) {
		serie = n + Fserie(n-1);
		return serie;
	}else {
		return 0;
	}
	}

}
