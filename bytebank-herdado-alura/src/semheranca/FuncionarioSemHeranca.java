package semheranca;

public class FuncionarioSemHeranca {

	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0; // 0 - Funcionario comum, 1- Gerente, 2- Diretor
	private int senha;

	/*
	 * Esse m�todo abaixo � espec�fico somente para o gerente e n�o deveria estar
	 * junto. Ou seja, ha caracteristicas e funcionalidades que s�o especificos para
	 * aquele tipo e que n�o s�o iguais para todos os funcion�rios. Ent�o essa
	 * abordagem, jogar tudo em um lugar s�, n�o vai muito longe pq a complexidade
	 * vai crescer e resultar� em enfrentar problemas maiores
	 */

	public boolean autentica(int senha) {

		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public double getBonificacao() { // 0 - Funcionario comum

		if (this.tipo == 0) {
			return this.salario * 0.1;
		} else if (this.tipo == 1) { // 1- Gerente
			return this.salario; // 2- Diretor
		} else {
			return this.salario + 1000.0;
		}

	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
