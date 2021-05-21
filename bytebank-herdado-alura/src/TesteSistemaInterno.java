
public class TesteSistemaInterno {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setSenha(2222);

		Administrador administrador = new Administrador();
		administrador.setSenha(3333);

//		EditorVideo editorVideo = new EditorVideo();

		SistemaInterno sistema = new SistemaInterno();
		sistema.autentica(gerente);
		sistema.autentica(administrador);
//		sistema.autentica(editorVideo); D� erro de compila��o pois editor de v�deo n�o � autenticavel.
	}
}
