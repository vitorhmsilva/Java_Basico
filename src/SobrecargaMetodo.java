import javax.swing.*;

public class SobrecargaMetodo {
	
	/* Sobrecarga de m�todos ocorre quando, diferentes m�todos com o mesmo nome podem ser declarados na mesma classe, 
	 * contanto que tenham diferentes conjuntos de par�metros (determinados pelo n�mero, tipos e ordem dos par�metros). 
	 * Quando um m�todo sobrecarregado � chamado o compilador chama o m�todo adequado, de acordo com os par�metros passados.
	 */

	public void calcula (double valor) {
		//define o m�todo calcula que recebe 1 par�metro
		double dobro = valor*2;
	 	String x = String.format("Dobro = "+dobro);
	 	JOptionPane.showMessageDialog(null,x);
	}
	
	public void calcula (int valor1, int valor2) {
		//define o m�todo calcula que recebe 2 par�metros
		int soma = valor1 + valor2;
		String x = String.format("Soma = "+soma); 
		JOptionPane.showMessageDialog(null,x);
	}
	//V� at� SobrecargaMain.java para ver como funciona uma sobrecarga
}
