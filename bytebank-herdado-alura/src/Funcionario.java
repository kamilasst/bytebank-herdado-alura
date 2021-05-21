//abstract - n�o posso mais instanciar objetos dessa classe
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	/*
	 * M�todo sem corpo - N�o h� implementa��o nesse m�todo aqui, a implementa��o
	 * ter� que ser implementada nos filhos
	 */
	public abstract double getBonificacao();

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
