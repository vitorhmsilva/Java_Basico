public class MetodoConstrutor {

	public MetodoConstrutor() {
		/* Um objeto deve ser constru�do toda vez que chamamos uma classe, sendo responsabilidade do m�todo construtor.
		 * Por padr�o, o Java j� cria esse construtor sem par�metros para todas as classes, ent�o voc� n�o precisa fazer
		 * isso se utilizar apenas construtores sem par�metros.
		 * Isso parte do princ�pio que podemos ter dois objetos com a mesma caracter�stica, mas que n�o s�o os mesmos objetos.
		 */
	}
	
	//Exemplo: v� para "InstanciaMetodoConstrutor.java" para ver o resultado
	private int numero;
	public MetodoConstrutor(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return numero; 
	}
}

