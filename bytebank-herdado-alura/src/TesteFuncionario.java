
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("222.222.222-33");
		nico.setSalario(2600.00);

		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

//		nico.salario = 300.0;
	}
}
