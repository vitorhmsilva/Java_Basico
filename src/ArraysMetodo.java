import java.util.logging.*;

public class ArraysMetodo {

	public static final Logger LOGGER = Logger.getLogger(ArraysMetodo.class.getName());

	public void mostraArray(int[] valor) {

		for (int i = 0; i < valor.length; i++){
			String value = String.valueOf(valor[i]);
			System.out.println(value);
		}
		// ou
		System.out.print("Ou ainda");
		for (int n : valor)
			System.out.print(n);
		//Caso você altere algo do array no método, o array original também será alterado
	}

	public void mostraInt(int valor) {
		System.out.println(valor);
	}

}
