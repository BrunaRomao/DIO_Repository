
public class Exercicio1 {
	
	public static void main (String args[]) {
		
		totalMensal(12500, 0.01 , 24);
		totalGeral(12500, 0.01 , 24);		
		
		
	}
	
	
// É possivel chamar um método não void (return) dentro da chamada de um método void
// Usar static para chamar um método a partir do nome da classe para passar argumentos na classe main (Exercicio1.totalMensal(...))
	
	private static void totalGeral(double emprestimo, double jurosMensal, int parcelas) {
		
		double total = emprestimo*(jurosMensal*parcelas);
		System.out.println("Total a ser pago ao final dos 2 anos de financiamento: " + total);
	}
	
	
	 
	 private static void totalMensal (double emprestimo, double jurosMensal, int parcelas) {
		 
			double total = emprestimo*(jurosMensal*parcelas)/parcelas;
			System.out.println("Total a ser pago mensalmente: " + total);
				
		}
		 

}
