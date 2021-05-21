/* Ou seja, Gerente � UM Funcionario ou Gerente herda da class Funcionario.
 * Implements - Assina o contrato Autentic�vel ou tbm chamado que � UM Autenticavel */

public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

// Isso � uma sobrescrita (assinatura) mesma visibilidade(modificador de acesso), mesmo retorno, mesmo nome, mesmos par�metros
	@Override // anota��o que indica que o m�todo esta sendo sobrescrito
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do Gerente");
		return super.getSalario(); // super - indica que o atributo est� na classe m�e
	}

//	public double getBonnificacao(double salario) {
//		return super.getBonificacao() + salario;
//	}
//
//	public boolean getBonnificacao(double salario, boolean falso) {
//		return false;
//	}

}
