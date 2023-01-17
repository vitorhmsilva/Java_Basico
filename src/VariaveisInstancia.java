import java.util.Scanner;

public class VariaveisInstancia { //nome da classe
	
	public static void main(String args[]) {
		//Instanciando a classe BoasVindas
		BoasVindas x = new BoasVindas(); //A palavra new cria um novo objeto da classe especificada
		x.mostraMensagem(); //chama o m�todo mostraMensagem da classe BoasVindas
		
		//Instanciando a classe MetodosParametros
		MetodosParametros j = new MetodosParametros();
		int k;
		Scanner num = new Scanner(System.in);
		
		System.out.println("Insira um valor inteiro:\n");
		k = num.nextInt();
		j.pegaNumero(k); 
		//Após definir um valor para a variável "k", esta variável é utilizada como o parâmetro necessário para a chamada do método "pegaNumero"
		
		//Instanciando a classe MetodosRetorno
		MetodosRetorno r = new MetodosRetorno();
		int valorA, valorB;
		System.out.println("Insira um valor inteiro:\n");
		valorA = num.nextInt();
		System.out.println("Insira outro valor inteiro:\n");
		valorB = num.nextInt();
		System.out.println("Resultado da Soma = " + r.somaInteiros(valorA, valorB));
		//Após definir os valores dos parâmetros, o método chamado realiza a soma e retorna o resultado para o ele mesmo,que é imprimido na tela.
	}
}
