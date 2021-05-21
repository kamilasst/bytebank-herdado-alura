/* Ou seja, Gerente É UM Funcionario ou Gerente herda da class Funcionario.
 * Implements - Assina o contrato Autenticável ou tbm chamado que É UM Autenticavel */

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

// Isso é uma sobrescrita (assinatura) mesma visibilidade(modificador de acesso), mesmo retorno, mesmo nome, mesmos parâmetros
	@Override // anotação que indica que o método esta sendo sobrescrito
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Gerente");
		return super.getSalario(); // super - indica que o atributo está na classe mãe
	}

//	public double getBonnificacao(double salario) {
//		return super.getBonificacao() + salario;
//	}
//
//	public boolean getBonnificacao(double salario, boolean falso) {
//		return false;
//	}

}
