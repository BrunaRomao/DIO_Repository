// Tipos de operadores l�gicos.

public class OperadoresLogicos {
	
	public static void main (String [] args) {
		
		System.out.println("***OPERADORES L�GICOS***");
		System.out.println("Conjun��o: " + conjuncao(8));
		System.out.println("Disjun��o: " + disjuncao(8,5));
		System.out.println("Disjun��o Exclusiva: " + disjuncao(8,5));
		System.out.println("Nega��o: " + negacao(5));
	
	 }
	
	public static boolean conjuncao(int i) {
		
		if(i<10 && i >7) return true;
		else return false;	
		
	   }
	
	public static boolean disjuncao(int i, int b) {
	
		if (i<10 || b<=5)return true;
		else return false;
		
	}
	
	public static boolean disjuncaoExclusiva(int i , int b) {
	 
		if(i>=9 ^ b >=5)return true;
		else return false;
	}
	
	public static boolean negacao(int b) {
	
		if(b!=2) return true;
		else return false;
				
	}
	
	
	
	}
		
	