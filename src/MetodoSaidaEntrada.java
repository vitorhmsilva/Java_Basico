import java.util.Scanner; //Chamando a biblioteca do Scanner
import java.util.logging.Logger;

public class MetodoSaidaEntrada {

	public static final Logger LOGGER = Logger.getLogger(MetodoSaidaEntrada.class.getName());

	public static void main(String[] args) {

		//M�todos de Sa�da de dados
		System.out.println("Primeiro Programa!"); //exibe uma linha e realiza a quebra de linha automaticamente
		
		System.out.print("Primeiro ");
		System.out.print("Programa!"); //n�o realiza a quebra de linha 
		
		String p = "Primeiro Programa!";
		System.out.printf("%n %s\n", p); //exibe dados formatados

		System.out.print(p);;

		/* %d = n�meros inteiros, 
		 * %c = caracteres individuais(%C para caracteres em mai�sculo), 
		 * %s = strings(%S para stings em mai�sculo), 
		 * %f = float, 
		 * %e = nota��o cient�fica
		 * 
		 * Caracteres de escape
		 * \n = quebra de linha, 
		 * \t = tabula��o, 
		 * \' = mostra aspas simples, 
		 * \" = mostra aspas duplas, 
		 * \\ = mostra barra invertida
		 */
		
		
		//M�todos de Entrada de dados
		Scanner x = new Scanner(System.in);
		
		//Lendo uma String
		String j;
		j = x.nextLine();
		System.out.printf("%s\n", j);
		
		//Lendo um Inteiro
		int k;
		k = x.nextInt();
		System.out.printf("%d\n", k);
		
		//Lendo um Float
		float l;
		l = x.nextFloat();
		System.out.printf("%f\n", l);
		
		//Lendo um Double
		double h;
		h = x.nextDouble();
		System.out.printf("%f\n", h);
	}
}
