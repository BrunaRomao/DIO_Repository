
// Controle de fluxo - Switch e If
//n�o usar efeito flecha.
public class ControleDeFluxo {

	public static void main (String [] args) {
		System.out.println("***CONTROLE DE FLUXO***");
		meses();
		ferias();
		switchSemana();
	}
	
	public static void meses() {
		//Usar else if
		
		int mes = 9 ; // numero pr� estabelecido (podemos usar Scanner).
		if (mes == 1) {
			System.out.println("Janeiro");
		}else if (mes == 2) {
			System.out.println("Fevereiro");
		}else if (mes == 3) {
			System.out.println("Mar�o");
		}else if(mes == 4) {
			System.out.println("Abril");
		}else if (mes == 5) {
			System.out.println("Maio");
		}else if (mes == 6) {
			System.out.println("Junho");
		}else if (mes == 7) {
			System.out.println("Julho");
		}else if (mes == 8) {
			System.out.println("Agosto");
		}else if (mes == 9) {
			System.out.println("Setembro");
		}else if (mes == 10) {
			System.out.println("Outubro");
		}else if (mes == 11) {
			System.out.println("Novembro");
		}else if (mes == 12) {
			System.out.println("Dezembro");
		}	
		
	}
	
	public static void ferias() {
		//Julho , dezembro e janeiro.
		
		int mes = 1;
	
		if(mes == 1 || mes == 12 || mes == 7) {
			System.out.println("F�rias");
		}
		
}

	public static void switchSemana() {
		//printar um numero com base no dia da semana descrito.
		
		String dia = "Ter�a";
		switch (dia) {
		case "Segunda":
			System.out.println(2);
			break;
		case "Ter�a":
			System.out.println(3);
			break;
		case "Quarta":
			System.out.println(4);
			break;
		case "Quinta" :
			System.out.println(5);
			break;
		case "Sexta" :
			System.out.println(6);
			break;
		case "Sab�do" :
			System.out.println(7);
			break;
		case "Domingo" :
			System.out.println(1);
			break;
		default:
			System.out.println(1);
			break;
		}
	
	
}
}
