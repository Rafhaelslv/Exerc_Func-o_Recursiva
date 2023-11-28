/*
 * Objetivo: Serie = (N)! + (N-1)! + (N-2)! + ... + (1)!
 * Autor: Rafhael Silva de Brito
 */
import javax.swing.JOptionPane;
public class Ex_05 {
public static void main(String args) {
	int num;
	num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
	System.out.println("Serie = " +Fserie(num));
}
}
