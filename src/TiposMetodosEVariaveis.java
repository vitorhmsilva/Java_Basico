public class TiposMetodosEVariaveis {
	
	public String publica; //permite acesso a qualquer código externo a classe
	private String privada; //permite acesso às classes filhas, mas proíbe a qualquer outro acesso externo
	protected String protegida; //proíbe qualquer acesso externo à propria classe
	
	public static void main() {
		//o método static não depende de nenhuma variavel de instancia para serem executados
		//void são métodos que não recebem nenhum tipo de valor retornado
	}
}
