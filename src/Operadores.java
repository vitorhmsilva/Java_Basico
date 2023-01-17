public class Operadores {
	public static void main(String args[]) {
		//Operadores Aritm�ticos
		int x = 4, y = 2;
		System.out.printf("%d\n", x + y); //Soma
		System.out.printf("%d\n", x - y); //Subtra��o
		System.out.printf("%d\n", x * y); //Multiplica��o
		System.out.printf("%d\n", x / y); //Divis�o
		System.out.printf("%d\n", x % y); //Resto da divis�o
		System.out.printf("%d\n", ++x); //Incremento
		System.out.printf("%d\n", --y); //Decremento
		
		/*Operadores Relacionais
		 * 
		 * ==: valores iguais,
		 * !=: valores diferentes,
		 * >: maior que,
		 * >+: maior ou igual a,
		 * <: menor que,
		 * <+: menor ou igual a
		*/
		
		/*Operadores L�gicos
		 * &&: as duas express�es sejam verdadeiras,
		 * ||: uma das express�es seja verdadeira
		 * Ordem de Preced�ncia: 1�(), 2�*ou/, 3�+ou-
		*/
		
		//Uso de uma condicional
		int z = 2, c = 3;
		if(z == 2 && c != 4) {
			System.out.println("Valores Correspondidos!");
		} else {
			System.out.println("Valores N�o Correspondidos!");
		}
	}

}
