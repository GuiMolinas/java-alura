package sintaxe_variaveis_fluxo;

public class TestaEscopo {

	public static void main(String[] args) {
		int pessoas = 1;
		boolean teste;
		
		if(pessoas >= 2) {
			teste = true;
		}
		else {
			teste = false;
		}
		
		System.out.println(teste);

	}

}
