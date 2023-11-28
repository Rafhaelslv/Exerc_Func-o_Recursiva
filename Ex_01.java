/*
 * Objetivo: Serie = (1+2+3+...+100)
 * Autor: Rafhael Silva de Brito
 */
public class Ex_01 {
	public static void main (String args[]) {
		int num = 0;
		System.out.println("serie " +Fserie(num));
		}
		
		static int Fserie(int n){
		int serie=0;
		if (n <= 100) {
			serie = n + Fserie(n+1);
			return serie;
		}else {
			return 0;
			
		}

	}
	}
