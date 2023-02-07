package sintaxe_variaveis_fluxo;

public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 17;
		int acompanhante = 3;
		boolean pessoa = true; //false
		
		if(idade >= 18 || pessoa) { //&&
			System.out.println("bem vindo");
		}
		
		else {
				System.out.println("Infelizmente, sua idade não é compatível com o parâmetro pré estabelecido");
			}
		}



	}
