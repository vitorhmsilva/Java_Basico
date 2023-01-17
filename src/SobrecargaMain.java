public class SobrecargaMain {
	public static void main(String args[]) {
		SobrecargaMetodo x = new SobrecargaMetodo();
		x.calcula(2.5);//chama o método calcula( ) e passa 1 par�metro
		x.calcula(2,5);//chama o método calcula( ) e passa 2 par�metros
	}
}
