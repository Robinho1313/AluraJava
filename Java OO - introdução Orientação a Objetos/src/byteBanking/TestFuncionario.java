package byteBanking;

public class TestFuncionario {

	public static void main(String[] args) {

		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("12345612345");
		nico.setSalario(2000.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}
}
