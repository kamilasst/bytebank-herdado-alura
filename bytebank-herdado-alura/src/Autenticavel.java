/* A interface por default � abstract (Se quiser n�o precisa colocar)
 * Todos os m�todos por default � abstract
 * Contrato Autenticavel:
		Quem assinar esse contrato precisa implementar:
			metodo setSenha
			metodo autentica */

public abstract interface Autenticavel {

//	public static final double valor1 = 1.0;

	public void setSenha(int senha);

	public boolean autentica(int senha);
}
