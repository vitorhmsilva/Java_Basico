public class Encapsulamento {
	
	private String nomePessoa; //Primeiro uma vari�vel privada deve ser criada
	//Ap�s isso, deve-se criar um m�todo getNomeDoAtributo() e um setNomeAtributo(tipodoatributo nomeDoAtributo)
	
	public String getNomePessoa() {
		//pega o valor atual do atributo
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		//modifica o valor do atributo
		this.nomePessoa = nomePessoa; //"this" � utilizado para declarar que o atributo ter� o mesmo valor da vari�vel de inst�ncia
	}
	
}
