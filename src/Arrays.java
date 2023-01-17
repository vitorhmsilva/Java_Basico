public class Arrays {

	public static void main(String[] args) {
		
		//Criando Arrays
		int[] array = new int[10];
		
		//Criando vários Arrays na mesma declaração
		String[] b = new String[100], x = new String[20];
		
		//Criando multiplas variáveis array na mesma declaração
		double[] valor1, valor2;
		
		//Inicializando um array
		int[] n = {1,2,3,4,5,6};
		int tamanho;
		tamanho = n.length; //quantidade de elementos de um array
		 
		//Inicializando com uma constante
		final int tam = 10; //declara a constante
		int[] valor = new int[tam]; //cria o array
		
		
		//Passando o Array como argumento de um método
		int[] ar = {3,5,7,9};
		ArraysMetodo y = new ArraysMetodo();
		y.mostraArray(ar);
		
		//Passando um elemento do array para um método
		y.mostraInt(ar[3]);
		
	}
}
