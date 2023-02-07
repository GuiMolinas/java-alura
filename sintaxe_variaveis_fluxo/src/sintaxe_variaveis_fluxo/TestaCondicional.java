package sintaxe_variaveis_fluxo;

public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 17;
		int acompanhante = 3;
		
		if(idade >= 18) {
			System.out.println("Vc tem mais de 18 anos");
		}
		
		else {
			if(acompanhante > 1) {
				System.out.println("Você está acompanhado");
			}
			else {
				System.out.println("Infelizmente, sua idade não é compatível com o parâmetro pré estabelecido");
			}
		}

	}

}
