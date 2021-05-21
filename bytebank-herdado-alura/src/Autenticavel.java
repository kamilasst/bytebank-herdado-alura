/* A interface por default é abstract (Se quiser não precisa colocar)
 * Todos os métodos por default é abstract
 * Contrato Autenticavel:
		Quem assinar esse contrato precisa implementar:
			metodo setSenha
			metodo autentica */

public abstract interface Autenticavel {

//	public static final double valor1 = 1.0;

	public void setSenha(int senha);

	public boolean autentica(int senha);
}
