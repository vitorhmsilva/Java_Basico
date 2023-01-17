public class InstanciaMetodoConstrutor {
	
	public static void main(String[] args) {
		MetodoConstrutor x = new MetodoConstrutor(3);
		MetodoConstrutor y = new MetodoConstrutor(5);
		System.out.println(x.getNumero());
		System.out.println(y.getNumero());
		System.out.println(x.getNumero());
		//Nesse exemplo eu instanciei o metodo construtor mas com parametros diferentes, que os tornam objetos diferentes 
		//com as mesmas características
	}
}
