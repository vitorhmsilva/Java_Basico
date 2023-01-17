import java.util.*; //Chamando todas as classes do pacote java.util

public class NumerosAleatorios {
	
	public static void main (String args[]) {
		
		//Gerando n�meros aleat�rios com a classe Random
		Random x = new Random();
		boolean v1 = x.nextBoolean();
		int v2 = x.nextInt();
		float v3 = x.nextFloat();
		double v4 = x.nextDouble();
		long v5 = x.nextLong();
		double gauss = x.nextGaussian();
		System.out.println("boolean = "+v1);
		System.out.println("int= "+v2);
		System.out.println("float = "+v3);
		System.out.println("double = "+v4);
		System.out.println("long = "+v5);
		System.out.println("gaussiano = "+gauss);

		
	}
}
