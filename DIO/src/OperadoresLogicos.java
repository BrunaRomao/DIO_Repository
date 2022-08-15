// Tipos de operadores lógicos.

public class OperadoresLogicos {
	
	public static void main (String [] args) {
		
		System.out.println("***OPERADORES LÓGICOS***");
		System.out.println("Conjunção: " + conjuncao(8));
		System.out.println("Disjunção: " + disjuncao(8,5));
		System.out.println("Disjunção Exclusiva: " + disjuncao(8,5));
		System.out.println("Negação: " + negacao(5));
	
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
		
	