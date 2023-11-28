/*
 * Objetivo: Função recursiva de fatorial
 * Autor: Rafhael Silva de Brito
 */
import javax.swing.JOptionPane;
public class Ex_00 {
	public static void main (String args[]) {
	int num;
	num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
	System.out.println("Fatorial desse numero = " +Ffat(num));
	}
	
	static int Ffat(int n){
	int fat;
	if (n != 1) {
		fat = n * Ffat(n-1);
		return fat;
	}else {
		return 1;
		
	}

}
}