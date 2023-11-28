import javax.swing.JOptionPane;
public class teste {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro: ",
				"Serie = (N)! + (N-1)! + (N-2)! + ... + (1)!", JOptionPane.QUESTION_MESSAGE));

		JOptionPane.showMessageDialog(null, String.format("Resutado da série = %d", calcularSerie(number)),
				"Serie = (N)! + (N-1)! + (N-2)! + ... + (1)!", JOptionPane.INFORMATION_MESSAGE);
	}

	public static int calcularSerie(int number) {
		return number == 1 ? 1 : fatorial(number) + calcularSerie(number - 1);
	}

	public static int fatorial(int number) throws IllegalArgumentException {
		if (number < 0)
			throw new IllegalArgumentException("Não existe fatorial de número negativo");

		return number == 0 ? 1 : number * fatorial(number - 1);
	}

}