package semheranca;
public class TesteFuncionarioSemHeranca {

	public static void main(String[] args) {

		FuncionarioSemHeranca funcionario1 = new FuncionarioSemHeranca();
		funcionario1.setSalario(3000.0);

		System.out.println(funcionario1.getTipo());
		System.out.println(funcionario1.getBonificacao());

		FuncionarioSemHeranca funcionario2 = new FuncionarioSemHeranca();

		funcionario2.setTipo(1);
		funcionario2.setSalario(5000.0);

		System.out.println(funcionario2.getTipo());
		System.out.println(funcionario2.getBonificacao());
	}
}
