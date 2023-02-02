package sintaxe_variaveis_fluxo;

public class Coversão {

	public static void main(String[] args) {
		double salario = 1240.60;
		//comentario - casting
		int valor = (int)salario;
		System.out.println(valor);
		
		long numeroGrande = 5646426022892l;
		short numeroMenor = 2131;
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
		
		float pontoFlutuante = (float) 3.14;

	}

}
