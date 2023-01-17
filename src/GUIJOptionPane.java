import javax.swing.JOptionPane;

public class GUIJOptionPane {
	public static void main(String args[]) {
		
		String mensagem = "Bem vindo ao JOptionPane!", pergunta = "Você se acha bonito(a)?", inteiro = null, decimal = null, decimal2 = null;
		
		//Utilizando a interface gr�fica do pacote JOptionPane
		JOptionPane.showMessageDialog(null, mensagem); //Mostra uma string no centro da tela
		JOptionPane.showInputDialog("Qual é o adjetivo que mais te descreve?"); //L� uma string e retorna uma string
		JOptionPane.showConfirmDialog(null, pergunta); //Faz uma pergunta e obter uma das seguintes respostas: retorna 0 se a resposta � pergunta do string for sim, retorna 1 se a resposta for n�o, e retorna 2 se for cancel
		
		//Convers�o de String para n�meros, e de n�meros para String
		String saida1, saida2, saida3;
		inteiro = JOptionPane.showInputDialog("Coloque um número inteiro:");
		int x = Integer.parseInt(inteiro); //String para int
		saida1 = String.format("Seu número é: %d", x); //int para String
		JOptionPane.showMessageDialog(null, saida1);
		
		decimal = JOptionPane.showInputDialog("Coloque um número decimal:");
		float y = Float.parseFloat(decimal); //String para float
		saida2 = String.format("Seu número é: %.2f", y); //float para String
		JOptionPane.showMessageDialog(null, saida2);
		
		decimal2 = JOptionPane.showInputDialog("Coloque um número decimal:");
		double z = Double.parseDouble(decimal2); //String para double
		saida3 = String.format("Seu número é: %.2f", z); //double para String
		JOptionPane.showMessageDialog(null, saida3);
	}
}
